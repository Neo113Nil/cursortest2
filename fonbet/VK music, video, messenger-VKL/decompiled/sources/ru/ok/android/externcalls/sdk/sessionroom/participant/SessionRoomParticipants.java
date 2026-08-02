package ru.ok.android.externcalls.sdk.sessionroom.participant;

import java.util.Collection;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomParticipants.kt */
/* loaded from: classes9.dex */
public final class SessionRoomParticipants {
    private final Collection<Participant> participants;
    private final SessionRoomId roomId;

    /* compiled from: SessionRoomParticipants.kt */
    public static final class Participant {
        private final SessionRoomId actualRoomId;
        private final ParticipantId id;
        private final ConversationParticipant participant;

        public Participant(ParticipantId participantId, SessionRoomId sessionRoomId, ConversationParticipant conversationParticipant) {
            this.id = participantId;
            this.actualRoomId = sessionRoomId;
            this.participant = conversationParticipant;
        }

        public final SessionRoomId getActualRoomId() {
            return this.actualRoomId;
        }

        public final ParticipantId getId() {
            return this.id;
        }

        public final ConversationParticipant getParticipant() {
            return this.participant;
        }
    }

    public SessionRoomParticipants(SessionRoomId sessionRoomId, Collection<Participant> collection) {
        this.roomId = sessionRoomId;
        this.participants = collection;
    }

    public final Collection<Participant> getParticipants() {
        return this.participants;
    }

    public final SessionRoomId getRoomId() {
        return this.roomId;
    }
}
