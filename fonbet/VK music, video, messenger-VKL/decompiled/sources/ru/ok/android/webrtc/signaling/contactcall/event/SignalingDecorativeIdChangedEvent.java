package ru.ok.android.webrtc.signaling.contactcall.event;

import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class SignalingDecorativeIdChangedEvent {
    public final CallParticipant.ParticipantId a;
    public final CallParticipant.ParticipantId b;
    public final CallExternalId c;

    public SignalingDecorativeIdChangedEvent(CallParticipant.ParticipantId participantId, CallParticipant.ParticipantId participantId2, CallExternalId callExternalId) {
        this.a = participantId;
        this.b = participantId2;
        this.c = callExternalId;
    }

    public final CallExternalId getDecorativeExternalParticipantId() {
        return this.c;
    }

    public final CallParticipant.ParticipantId getDecorativeParticipantId() {
        return this.b;
    }

    public final CallParticipant.ParticipantId getParticipantId() {
        return this.a;
    }
}
