package ru.ok.android.externcalls.sdk.waiting_room;

import androidx.annotation.NonNull;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.vu5;

/* loaded from: classes9.dex */
public final class ConversationWaitingParticipantId {
    public final long addedTs;

    @NonNull
    private final ParticipantId participantId;

    public ConversationWaitingParticipantId(@NonNull ParticipantId participantId, long j) {
        this.participantId = participantId;
        this.addedTs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConversationWaitingParticipantId.class == obj.getClass()) {
            ConversationWaitingParticipantId conversationWaitingParticipantId = (ConversationWaitingParticipantId) obj;
            if (this.addedTs == conversationWaitingParticipantId.addedTs && this.participantId.equals(conversationWaitingParticipantId.participantId)) {
                return true;
            }
        }
        return false;
    }

    public long getAddedTs() {
        return this.addedTs;
    }

    @NonNull
    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, Long.valueOf(this.addedTs));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationWaitingParticipantId{participantId=");
        sb.append(this.participantId);
        sb.append(", addedTs=");
        return vu5.a('}', this.addedTs, sb);
    }
}
