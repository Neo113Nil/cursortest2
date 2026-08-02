package ru.ok.android.webrtc.participant.waiting;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallExternalId;

/* loaded from: classes9.dex */
public final class CallWaitingParticipant {
    public final CallWaitingParticipantId a;
    public final CallExternalId b;

    public CallWaitingParticipant(@NonNull CallWaitingParticipantId callWaitingParticipantId, @Nullable CallExternalId callExternalId) {
        this.a = callWaitingParticipantId;
        this.b = callExternalId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CallWaitingParticipant.class == obj.getClass()) {
            CallWaitingParticipant callWaitingParticipant = (CallWaitingParticipant) obj;
            if (this.a.equals(callWaitingParticipant.a) && Objects.equals(this.b, callWaitingParticipant.b)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public CallExternalId getExternalId() {
        return this.b;
    }

    @NonNull
    public CallWaitingParticipantId getWaitingParticipantId() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
