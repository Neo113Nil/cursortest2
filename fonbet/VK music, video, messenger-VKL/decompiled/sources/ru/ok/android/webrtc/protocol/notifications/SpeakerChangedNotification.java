package ru.ok.android.webrtc.protocol.notifications;

import androidx.annotation.NonNull;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcNotification;

/* loaded from: classes9.dex */
public class SpeakerChangedNotification implements RtcNotification {

    @NonNull
    public CallParticipant.ParticipantId speaker;

    public SpeakerChangedNotification(@NonNull CallParticipant.ParticipantId participantId) {
        if (participantId == null) {
            throw new IllegalArgumentException("Illegal 'speaker' value: null");
        }
        this.speaker = participantId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.speaker.equals(((SpeakerChangedNotification) obj).speaker);
    }

    public int hashCode() {
        return Objects.hash(this.speaker);
    }

    public String toString() {
        return "SpeakerChangedNotification{speaker=" + this.speaker + '}';
    }
}
