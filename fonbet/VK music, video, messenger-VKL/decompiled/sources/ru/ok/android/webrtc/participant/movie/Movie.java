package ru.ok.android.webrtc.participant.movie;

import xsna.epx;
import xsna.urd0;

/* loaded from: classes9.dex */
public final class Movie {
    public final MovieId a;
    public final String b;
    public final String c;
    public final MovieSourceType d;
    public final MovieDuration e;
    public final MovieThumbnail f;

    public Movie(MovieId movieId, String str, String str2, MovieSourceType movieSourceType, MovieDuration movieDuration, MovieThumbnail movieThumbnail) {
        this.a = movieId;
        this.b = str;
        this.c = str2;
        this.d = movieSourceType;
        this.e = movieDuration;
        this.f = movieThumbnail;
    }

    public static /* synthetic */ Movie copy$default(Movie movie, MovieId movieId, String str, String str2, MovieSourceType movieSourceType, MovieDuration movieDuration, MovieThumbnail movieThumbnail, int i, Object obj) {
        if ((i & 1) != 0) {
            movieId = movie.a;
        }
        if ((i & 2) != 0) {
            str = movie.b;
        }
        if ((i & 4) != 0) {
            str2 = movie.c;
        }
        if ((i & 8) != 0) {
            movieSourceType = movie.d;
        }
        if ((i & 16) != 0) {
            movieDuration = movie.e;
        }
        if ((i & 32) != 0) {
            movieThumbnail = movie.f;
        }
        MovieDuration movieDuration2 = movieDuration;
        MovieThumbnail movieThumbnail2 = movieThumbnail;
        return movie.copy(movieId, str, str2, movieSourceType, movieDuration2, movieThumbnail2);
    }

    public final MovieId component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final MovieSourceType component4() {
        return this.d;
    }

    public final MovieDuration component5() {
        return this.e;
    }

    public final MovieThumbnail component6() {
        return this.f;
    }

    public final Movie copy(MovieId movieId, String str, String str2, MovieSourceType movieSourceType, MovieDuration movieDuration, MovieThumbnail movieThumbnail) {
        return new Movie(movieId, str, str2, movieSourceType, movieDuration, movieThumbnail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) obj;
        return epx.f(this.a, movie.a) && epx.f(this.b, movie.b) && epx.f(this.c, movie.c) && this.d == movie.d && epx.f(this.e, movie.e) && epx.f(this.f, movie.f);
    }

    public final MovieDuration getDuration() {
        return this.e;
    }

    public final String getExternalMovieId() {
        return this.b;
    }

    public final MovieId getMovieId() {
        return this.a;
    }

    public final MovieSourceType getSourceType() {
        return this.d;
    }

    public final MovieThumbnail getThumbnail() {
        return this.f;
    }

    public final String getTitle() {
        return this.c;
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
