package ru.ok.android.webrtc.videotracks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.List;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.screenshare.recv.ParticipantRendererCollection;
import ru.ok.android.webrtc.utils.Consumer;

/* loaded from: classes9.dex */
public abstract class RemoteVideoTracks implements ParticipantRendererCollection, TrackVideoKeyMapper {
    public final Executor a;
    public final RTCLog b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Listener d;
    public final MappingProcessor e;

    public interface Executor {
        void execute(String str, Runnable runnable);

        void executeWithPeerConnection(String str, Consumer<PeerConnection> consumer);
    }

    public interface Listener {
        void onPeerConnectionRemoteVideoTrackAdded(String str);
    }

    public RemoteVideoTracks(@NonNull Executor executor, @NonNull RTCLog rTCLog, @NonNull Listener listener, @NonNull MappingProcessor mappingProcessor, @NonNull CallParams callParams) {
        this.a = executor;
        this.b = rTCLog;
        this.d = listener;
        this.e = mappingProcessor;
    }

    public abstract void clearRemoteVideoRenderers();

    public abstract void clearRemoteVideoRenderersForParticipant(@NonNull String str, @NonNull CallParticipant.ParticipantId participantId);

    public void close() {
        this.c.removeCallbacksAndMessages(null);
    }

    public abstract void handleVideoTracks(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public abstract void setRemoteVideoRenderers(@NonNull String str, @NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list);
}
