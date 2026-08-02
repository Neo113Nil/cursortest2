package ru.ok.android.webrtc.topology.server;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.StatsObserver;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.visible.VisibleParticipants;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper;

/* loaded from: classes9.dex */
public interface PeerConnectionWrapper extends TrackVideoKeyMapper {
    void allocProducer();

    void clearRemoteVideoRenderersForParticipantId(@NonNull CallParticipant.ParticipantId participantId);

    void deallocProducer();

    RtcCommandExecutor getCommandExecutor();

    @Nullable
    default Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStats() {
        return null;
    }

    void getStats(StatsObserver statsObserver);

    void getStats(StatsCallback statsCallback);

    void handleConnectivityControlTimeout();

    void handleConsumerAnsweredNotify(JSONObject jSONObject) throws JSONException;

    void handleProducerUpdatedNotify(JSONObject jSONObject) throws JSONException;

    void handleTopologyStateChanged(int i);

    void onCallParticipantAdded(@NonNull CallParticipant callParticipant);

    void onCallParticipantRemoved(@NonNull CallParticipant callParticipant);

    void onPeerVideoSettingsChange(PeerVideoSettings peerVideoSettings);

    void onVideoQualityUpdate(VideoQualityUpdate videoQualityUpdate);

    void onVisibleSetChanged(VisibleParticipants visibleParticipants);

    void reallocProducer();

    void release();

    void setAsrEnabled(boolean z);

    void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list);

    void updatePeerVideoSettings();

    void updateVideoQuality(VideoQualityUpdate videoQualityUpdate);

    default void handleMediaSettingsChanged(MutableMediaSettings mutableMediaSettings) {
    }
}
