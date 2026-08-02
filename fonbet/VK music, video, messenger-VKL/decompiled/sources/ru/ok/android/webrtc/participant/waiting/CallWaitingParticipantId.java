package ru.ok.android.webrtc.participant.waiting;

import androidx.annotation.NonNull;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class CallWaitingParticipantId {
    public final long a;
    public final CallParticipant.ParticipantId b;

    public CallWaitingParticipantId(@NonNull CallParticipant.ParticipantId participantId, long j) {
        this.a = j;
        this.b = participantId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CallWaitingParticipantId.class == obj.getClass()) {
            CallWaitingParticipantId callWaitingParticipantId = (CallWaitingParticipantId) obj;
            if (this.a == callWaitingParticipantId.a && Objects.equals(this.b, callWaitingParticipantId.b)) {
                return true;
            }
        }
        return false;
    }

    public long getAddedTs() {
        return this.a;
    }

    @NonNull
    public CallParticipant.ParticipantId getParticipantId() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
