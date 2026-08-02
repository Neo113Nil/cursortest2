package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* compiled from: MovieStartedData.kt */
/* loaded from: classes9.dex */
public final class MovieStartedData {
    private final Movie movie;
    private final ParticipantId participant;
    private final SessionRoomId roomId;

    public MovieStartedData(ParticipantId participantId, SessionRoomId sessionRoomId, Movie movie) {
        this.participant = participantId;
        this.roomId = sessionRoomId;
        this.movie = movie;
    }

    public static /* synthetic */ MovieStartedData copy$default(MovieStartedData movieStartedData, ParticipantId participantId, SessionRoomId sessionRoomId, Movie movie, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStartedData.participant;
        }
        if ((i & 2) != 0) {
            sessionRoomId = movieStartedData.roomId;
        }
        if ((i & 4) != 0) {
            movie = movieStartedData.movie;
        }
        return movieStartedData.copy(participantId, sessionRoomId, movie);
    }

    public final ParticipantId component1() {
        return this.participant;
    }

    public final SessionRoomId component2() {
        return this.roomId;
    }

    public final Movie component3() {
        return this.movie;
    }

    public final MovieStartedData copy(ParticipantId participantId, SessionRoomId sessionRoomId, Movie movie) {
        return new MovieStartedData(participantId, sessionRoomId, movie);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStartedData)) {
            return false;
        }
        MovieStartedData movieStartedData = (MovieStartedData) obj;
        return epx.f(this.participant, movieStartedData.participant) && epx.f(this.roomId, movieStartedData.roomId) && epx.f(this.movie, movieStartedData.movie);
    }

    public final Movie getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final SessionRoomId getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return this.movie.hashCode() + ((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MovieStartedData(participant=" + this.participant + ", roomId=" + this.roomId + ", movie=" + this.movie + ")";
    }
}
