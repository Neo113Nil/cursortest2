package ru.ok.android.webrtc.protocol.notifications;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.cjl0;

/* loaded from: classes9.dex */
public class IdMappingNotification implements RtcNotification {

    @NonNull
    public final Map<Integer, CallVideoTrackParticipantKey> mapping;

    public IdMappingNotification(@NonNull Map<Integer, CallVideoTrackParticipantKey> map) {
        if (map == null) {
            throw new IllegalArgumentException("Illegal 'mapping' value: null");
        }
        this.mapping = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mapping.equals(((IdMappingNotification) obj).mapping);
    }

    public int hashCode() {
        return Objects.hash(this.mapping);
    }

    public String toString() {
        return cjl0.a(new StringBuilder("IdMappingsNotification{mapping="), this.mapping, '}');
    }
}
