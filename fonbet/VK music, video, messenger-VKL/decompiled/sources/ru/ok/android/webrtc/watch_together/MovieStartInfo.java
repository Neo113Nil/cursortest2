package ru.ok.android.webrtc.watch_together;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class MovieStartInfo {
    public final CallParticipant.ParticipantId a;
    public final SessionRoomId b;
    public final Movie c;

    public MovieStartInfo(CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId, Movie movie) {
        this.a = participantId;
        this.b = sessionRoomId;
        this.c = movie;
    }

    public final CallParticipant.ParticipantId getInitiatorId() {
        return this.a;
    }

    public final Movie getMovie() {
        return this.c;
    }

    public final SessionRoomId getRoomId() {
        return this.b;
    }
}
