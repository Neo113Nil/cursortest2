package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MoviePosition;
import ru.ok.android.webrtc.participant.movie.MovieVolume;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MovieState.kt */
/* loaded from: classes9.dex */
public final class MovieState {
    private final boolean isMuted;
    private final boolean isPlaying;
    private final Movie movie;
    private final ParticipantId participantId;
    private final MoviePosition position;
    private final float volume;

    public /* synthetic */ MovieState(ParticipantId participantId, MoviePosition moviePosition, boolean z, float f, boolean z2, Movie movie, zcl zclVar) {
        this(participantId, moviePosition, z, f, z2, movie);
    }

    /* renamed from: copy-brw6TxU$default, reason: not valid java name */
    public static /* synthetic */ MovieState m357copybrw6TxU$default(MovieState movieState, ParticipantId participantId, MoviePosition moviePosition, boolean z, float f, boolean z2, Movie movie, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieState.participantId;
        }
        if ((i & 2) != 0) {
            moviePosition = movieState.position;
        }
        if ((i & 4) != 0) {
            z = movieState.isPlaying;
        }
        if ((i & 8) != 0) {
            f = movieState.volume;
        }
        if ((i & 16) != 0) {
            z2 = movieState.isMuted;
        }
        if ((i & 32) != 0) {
            movie = movieState.movie;
        }
        boolean z3 = z2;
        Movie movie2 = movie;
        return movieState.m359copybrw6TxU(participantId, moviePosition, z, f, z3, movie2);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final MoviePosition component2() {
        return this.position;
    }

    public final boolean component3() {
        return this.isPlaying;
    }

    /* renamed from: component4-_pGdNCs, reason: not valid java name */
    public final float m358component4_pGdNCs() {
        return this.volume;
    }

    public final boolean component5() {
        return this.isMuted;
    }

    public final Movie component6() {
        return this.movie;
    }

    /* renamed from: copy-brw6TxU, reason: not valid java name */
    public final MovieState m359copybrw6TxU(ParticipantId participantId, MoviePosition moviePosition, boolean z, float f, boolean z2, Movie movie) {
        return new MovieState(participantId, moviePosition, z, f, z2, movie, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieState)) {
            return false;
        }
        MovieState movieState = (MovieState) obj;
        return epx.f(this.participantId, movieState.participantId) && epx.f(this.position, movieState.position) && this.isPlaying == movieState.isPlaying && MovieVolume.m367equalsimpl0(this.volume, movieState.volume) && this.isMuted == movieState.isMuted && epx.f(this.movie, movieState.movie);
    }

    public final Movie getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final MoviePosition getPosition() {
        return this.position;
    }

    /* renamed from: getVolume-_pGdNCs, reason: not valid java name */
    public final float m360getVolume_pGdNCs() {
        return this.volume;
    }

    public int hashCode() {
        int b = qoy.b((MovieVolume.m370hashCodeimpl(this.volume) + qoy.b((this.position.hashCode() + (this.participantId.hashCode() * 31)) * 31, 31, this.isPlaying)) * 31, 31, this.isMuted);
        Movie movie = this.movie;
        return b + (movie == null ? 0 : movie.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        return "MovieState(participantId=" + this.participantId + ", position=" + this.position + ", isPlaying=" + this.isPlaying + ", volume=" + MovieVolume.m371toStringimpl(this.volume) + ", isMuted=" + this.isMuted + ", movie=" + this.movie + ")";
    }

    private MovieState(ParticipantId participantId, MoviePosition moviePosition, boolean z, float f, boolean z2, Movie movie) {
        this.participantId = participantId;
        this.position = moviePosition;
        this.isPlaying = z;
        this.volume = f;
        this.isMuted = z2;
        this.movie = movie;
    }
}
