package ru.ok.android.webrtc.protocol.notifications;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcNotification;
import xsna.cjl0;

/* loaded from: classes9.dex */
public class NetworkStatusNotification implements RtcNotification {

    @NonNull
    public final Map<CallParticipant.ParticipantId, Float> networkStatus;

    public NetworkStatusNotification(@NonNull Map<CallParticipant.ParticipantId, Float> map) {
        if (map == null) {
            throw new IllegalArgumentException("Illegal 'networkStatus' value: null");
        }
        this.networkStatus = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.networkStatus.equals(((NetworkStatusNotification) obj).networkStatus);
    }

    public int hashCode() {
        return Objects.hash(this.networkStatus);
    }

    public String toString() {
        return cjl0.a(new StringBuilder("NetworkStatusNotification{networkStatus="), this.networkStatus, '}');
    }
}
