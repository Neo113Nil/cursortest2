package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface CallContactCallListener {

    public static final class DecorativeParticipantIdChanged {
        public final CallParticipant.ParticipantId a;
        public final CallExternalId b;

        public DecorativeParticipantIdChanged(CallParticipant.ParticipantId participantId, CallExternalId callExternalId) {
            this.a = participantId;
            this.b = callExternalId;
        }

        public final CallExternalId getDecorativeExternalParticipantId() {
            return this.b;
        }

        public final CallParticipant.ParticipantId getOriginalParticipantId() {
            return this.a;
        }
    }

    void onDecorativeParticipantIdChanged(DecorativeParticipantIdChanged decorativeParticipantIdChanged);
}
