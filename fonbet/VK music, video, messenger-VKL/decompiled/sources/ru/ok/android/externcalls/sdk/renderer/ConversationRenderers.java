package ru.ok.android.externcalls.sdk.renderer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* compiled from: ConversationRenderers.kt */
/* loaded from: classes9.dex */
public final class ConversationRenderers {
    private final HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> renderersMap = new HashMap<>();

    public final Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        HashMap hashMap = new HashMap();
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> hashMap2 = this.renderersMap;
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map = hashMap2.get(participantId);
        if (map == null) {
            map = new HashMap<>();
            hashMap2.put(participantId, map);
        }
        for (Map.Entry<ConversationVideoTrackParticipantKey, List<VideoSink>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public final void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<? extends VideoSink> list) {
        HashMap<ParticipantId, Map<ConversationVideoTrackParticipantKey, List<VideoSink>>> hashMap = this.renderersMap;
        ParticipantId participantId = conversationVideoTrackParticipantKey.getParticipantId();
        Map<ConversationVideoTrackParticipantKey, List<VideoSink>> map = hashMap.get(participantId);
        if (map == null) {
            map = new HashMap<>();
            hashMap.put(participantId, map);
        }
        map.put(conversationVideoTrackParticipantKey, list);
    }
}
