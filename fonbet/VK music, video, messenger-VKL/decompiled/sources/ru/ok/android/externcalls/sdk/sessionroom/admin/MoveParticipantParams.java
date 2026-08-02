package ru.ok.android.externcalls.sdk.sessionroom.admin;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.zcl;

/* compiled from: MoveParticipantParams.kt */
/* loaded from: classes9.dex */
public final class MoveParticipantParams {
    private final ParticipantId participantId;
    private final SessionRoomId toRoomId;

    /* compiled from: MoveParticipantParams.kt */
    public static final class Builder {
        private ParticipantId participantId;
        private final SessionRoomId toRoomId;

        public Builder(SessionRoomId sessionRoomId) {
            this.toRoomId = sessionRoomId;
        }

        public final MoveParticipantParams build() {
            return new MoveParticipantParams(this.participantId, this.toRoomId, null);
        }

        public final Builder setParticipantId(ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }
    }

    public /* synthetic */ MoveParticipantParams(ParticipantId participantId, SessionRoomId sessionRoomId, zcl zclVar) {
        this(participantId, sessionRoomId);
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final SessionRoomId getToRoomId() {
        return this.toRoomId;
    }

    private MoveParticipantParams(ParticipantId participantId, SessionRoomId sessionRoomId) {
        this.participantId = participantId;
        this.toRoomId = sessionRoomId;
    }
}
