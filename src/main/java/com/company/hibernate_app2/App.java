package com.company.hibernate_app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.models.Actor;
import com.company.models.Movie;

/**
 * Hello world!
 *
 */
public class App 	{
    public static void main( String[] args ) {
    	Configuration configuration  = new Configuration().addAnnotatedClass(Actor.class)
    			.addAnnotatedClass(Movie.class);
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	try(sessionFactory){
    		Session session = sessionFactory.getCurrentSession();
    		session.beginTransaction();
    		
// Create new movie and new actors and bind them  
//    		
//    		Movie movie = new Movie("Pulp fiction", 1994);
//    		Actor actor1 = new Actor("First actor", 30);
//    		Actor actor2 = new Actor("Second actor", 50);
//    		movie.setActors(new ArrayList<>(List.of(actor1,actor2)));
//    		actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//    		actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//    		session.save(movie);
//    		session.save(actor1);  // not using cascade 
//    		session.save(actor2);  // not using cascade
    		
// Get List<Actors> of movie
//    		
//    		Movie movie = session.get(Movie.class, 1);
//    		List<Actor> actors = movie.getActors();
//    		System.out.println(actors);
    		
// add new movie for existing actor		
//    		
//    		Movie movie = new Movie("Reservoir dogs",1992);
//    		Actor actor = session.get(Actor.class, 1);
//    		movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
//    		actor.getMovies().add(movie);
//    		session.save(movie);
    		
// Remove actor in movie
//    		
//    		Actor actor = session.get(Actor.class, 1);
//    	    Movie removeMovie = actor.getMovies().get(1);
//    	    actor.getMovies().remove(removeMovie);
//    	    removeMovie.getActors().remove(actor);
    		
    		session.getTransaction().commit();
    	}
    }
}
