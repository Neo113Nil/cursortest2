package ru.ok.android.webrtc.protocol.notifications;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcNotification;
import xsna.ms9;

/* loaded from: classes9.dex */
public class StalledParticipantsNotification implements RtcNotification {

    @NonNull
    public List<CallParticipant.ParticipantId> participantIds;

    public StalledParticipantsNotification(@NonNull List<CallParticipant.ParticipantId> list) {
        if (list == null) {
            throw new IllegalArgumentException("Illegal 'participantIds' value: null");
        }
        this.participantIds = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.participantIds.equals(((StalledParticipantsNotification) obj).participantIds);
    }

    public int hashCode() {
        return Objects.hash(this.participantIds);
    }

    public String toString() {
        return ms9.a('}', new StringBuilder("StalledParticipantsNotification{participantIds="), this.participantIds);
    }
}
