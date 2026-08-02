package ru.ok.android.webrtc.watch_together;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MovieSourceType;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class MovieStopInfo {
    public final CallParticipant.ParticipantId a;
    public final SessionRoomId b;
    public final MovieId c;
    public final MovieSourceType d;

    public MovieStopInfo(CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId, MovieId movieId, MovieSourceType movieSourceType) {
        this.a = participantId;
        this.b = sessionRoomId;
        this.c = movieId;
        this.d = movieSourceType;
    }

    public final CallParticipant.ParticipantId getInitiatorId() {
        return this.a;
    }

    public final MovieId getMovieId() {
        return this.c;
    }

    public final SessionRoomId getRoomId() {
        return this.b;
    }

    public final MovieSourceType getSourceType() {
        return this.d;
    }
}
