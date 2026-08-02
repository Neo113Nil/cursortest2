package ru.ok.android.webrtc.signaling.record.event;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class SignalingRecordStopEvent {
    public final SessionRoomId a;
    public final CallParticipant.ParticipantId b;
    public final Long c;

    public SignalingRecordStopEvent(SessionRoomId sessionRoomId, CallParticipant.ParticipantId participantId, Long l) {
        this.a = sessionRoomId;
        this.b = participantId;
        this.c = l;
    }

    public final CallParticipant.ParticipantId getParticipant() {
        return this.b;
    }

    public final Long getRecordMovieId() {
        return this.c;
    }

    public final SessionRoomId getSessionRoomId() {
        return this.a;
    }
}
