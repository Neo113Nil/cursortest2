package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public interface DelayedVideoRendererSource {
    @NonNull
    Map<CallVideoTrackParticipantKey, List<VideoSink>> getRemoteVideoRenderers(CallParticipant.ParticipantId participantId);

    boolean isEnabled();
}
