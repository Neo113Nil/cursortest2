package ru.ok.android.externcalls.sdk.video;

import java.util.List;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;

/* compiled from: VideoRenderManager.kt */
/* loaded from: classes9.dex */
public interface VideoRenderManager {
    CallOpenGLRenderer getCallRenderer();

    EglBase.Context getEglBaseContext();

    Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId);

    void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<VideoSink> list);
}
