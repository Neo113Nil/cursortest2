package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import java.util.Map;
import ru.ok.android.webrtc.participant.movie.MovieId;
import xsna.epx;

/* compiled from: MovieStates.kt */
/* loaded from: classes9.dex */
public final class MovieStates {
    private final Map<MovieId, MovieState> states;

    public MovieStates(Map<MovieId, MovieState> map) {
        this.states = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MovieStates copy$default(MovieStates movieStates, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = movieStates.states;
        }
        return movieStates.copy(map);
    }

    public final Map<MovieId, MovieState> component1() {
        return this.states;
    }

    public final MovieStates copy(Map<MovieId, MovieState> map) {
        return new MovieStates(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieStates) && epx.f(this.states, ((MovieStates) obj).states);
    }

    public final Map<MovieId, MovieState> getStates() {
        return this.states;
    }

    public int hashCode() {
        return this.states.hashCode();
    }

    public String toString() {
        return "MovieStates(states=" + this.states + ")";
    }
}
