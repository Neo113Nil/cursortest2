package ru.ok.android.webrtc.signaling.urlsharing;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class UrlSharingInfoUpdate {
    public final SessionRoomId a;
    public final CallParticipant.ParticipantId b;
    public final String c;

    public UrlSharingInfoUpdate(SessionRoomId sessionRoomId, CallParticipant.ParticipantId participantId, String str) {
        this.a = sessionRoomId;
        this.b = participantId;
        this.c = str;
    }

    public final CallParticipant.ParticipantId getInitiatorId() {
        return this.b;
    }

    public final SessionRoomId getRoomId() {
        return this.a;
    }

    public final String getUrl() {
        return this.c;
    }
}
