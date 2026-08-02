package ru.ok.android.webrtc.sessionroom.admin;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class SwitchRoomParams {
    public final SessionRoomId a;
    public final CallParticipant.ParticipantId b;

    public static final class Builder {
        public SessionRoomId a;
        public CallParticipant.ParticipantId b;

        public final SwitchRoomParams build() {
            SessionRoomId sessionRoomId = this.a;
            if (sessionRoomId != null) {
                return new SwitchRoomParams(sessionRoomId, this.b, null);
            }
            throw new IllegalArgumentException("Session room id is required");
        }

        public final Builder setParticipantId(CallParticipant.ParticipantId participantId) {
            this.b = participantId;
            return this;
        }

        public final Builder setToRoomId(SessionRoomId sessionRoomId) {
            this.a = sessionRoomId;
            return this;
        }
    }

    public SwitchRoomParams(SessionRoomId sessionRoomId, CallParticipant.ParticipantId participantId, zcl zclVar) {
        this.a = sessionRoomId;
        this.b = participantId;
    }

    public final CallParticipant.ParticipantId getParticipantId() {
        return this.b;
    }

    public final SessionRoomId getToRoomId() {
        return this.a;
    }
}
