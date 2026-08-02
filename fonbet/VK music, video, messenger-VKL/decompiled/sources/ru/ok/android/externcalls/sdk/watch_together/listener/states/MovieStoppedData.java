package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MovieSourceType;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* compiled from: MovieStoppedData.kt */
/* loaded from: classes9.dex */
public final class MovieStoppedData {
    private final MovieId movieId;
    private final ParticipantId participant;
    private final SessionRoomId roomId;
    private final MovieSourceType sourceType;

    public MovieStoppedData(ParticipantId participantId, SessionRoomId sessionRoomId, MovieId movieId, MovieSourceType movieSourceType) {
        this.participant = participantId;
        this.roomId = sessionRoomId;
        this.movieId = movieId;
        this.sourceType = movieSourceType;
    }

    public static /* synthetic */ MovieStoppedData copy$default(MovieStoppedData movieStoppedData, ParticipantId participantId, SessionRoomId sessionRoomId, MovieId movieId, MovieSourceType movieSourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStoppedData.participant;
        }
        if ((i & 2) != 0) {
            sessionRoomId = movieStoppedData.roomId;
        }
        if ((i & 4) != 0) {
            movieId = movieStoppedData.movieId;
        }
        if ((i & 8) != 0) {
            movieSourceType = movieStoppedData.sourceType;
        }
        return movieStoppedData.copy(participantId, sessionRoomId, movieId, movieSourceType);
    }

    public final ParticipantId component1() {
        return this.participant;
    }

    public final SessionRoomId component2() {
        return this.roomId;
    }

    public final MovieId component3() {
        return this.movieId;
    }

    public final MovieSourceType component4() {
        return this.sourceType;
    }

    public final MovieStoppedData copy(ParticipantId participantId, SessionRoomId sessionRoomId, MovieId movieId, MovieSourceType movieSourceType) {
        return new MovieStoppedData(participantId, sessionRoomId, movieId, movieSourceType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStoppedData)) {
            return false;
        }
        MovieStoppedData movieStoppedData = (MovieStoppedData) obj;
        return epx.f(this.participant, movieStoppedData.participant) && epx.f(this.roomId, movieStoppedData.roomId) && epx.f(this.movieId, movieStoppedData.movieId) && this.sourceType == movieStoppedData.sourceType;
    }

    public final MovieId getMovieId() {
        return this.movieId;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final SessionRoomId getRoomId() {
        return this.roomId;
    }

    public final MovieSourceType getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + ((this.movieId.hashCode() + ((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MovieStoppedData(participant=" + this.participant + ", roomId=" + this.roomId + ", movieId=" + this.movieId + ", sourceType=" + this.sourceType + ")";
    }
}
