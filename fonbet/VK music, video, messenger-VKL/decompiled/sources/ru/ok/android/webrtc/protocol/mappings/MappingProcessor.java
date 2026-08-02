package ru.ok.android.webrtc.protocol.mappings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public class MappingProcessor {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Nullable
    public CallParticipant.ParticipantId query(int i) {
        CallVideoTrackParticipantKey callVideoTrackParticipantKey = (CallVideoTrackParticipantKey) this.a.get(Integer.valueOf(i));
        if (callVideoTrackParticipantKey != null) {
            return callVideoTrackParticipantKey.getParticipantId();
        }
        return null;
    }

    @Nullable
    public CallVideoTrackParticipantKey queryKey(int i) {
        return (CallVideoTrackParticipantKey) this.a.get(Integer.valueOf(i));
    }

    public void update(@NonNull Map<Integer, CallVideoTrackParticipantKey> map) {
        this.a.putAll(map);
    }
}
