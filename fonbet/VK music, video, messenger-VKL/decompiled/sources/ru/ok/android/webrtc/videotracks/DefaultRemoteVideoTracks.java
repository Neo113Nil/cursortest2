package ru.ok.android.webrtc.videotracks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.task.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.VideoRendererProxy;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.DefaultRemoteVideoTracks;
import ru.ok.android.webrtc.videotracks.RemoteVideoTracks;
import xsna.bjn0;
import xsna.p31;

/* loaded from: classes9.dex */
public final class DefaultRemoteVideoTracks extends RemoteVideoTracks {
    public static final VideoTrackType[] j = {VideoTrackType.VIDEO, VideoTrackType.SCREEN_CAPTURE};
    public final ConcurrentHashMap f;
    public final HashMap g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;

    public DefaultRemoteVideoTracks(@NonNull RemoteVideoTracks.Executor executor, @NonNull RTCLog rTCLog, @NonNull RemoteVideoTracks.Listener listener, @NonNull MappingProcessor mappingProcessor, @NonNull CallParams callParams) {
        super(executor, rTCLog, listener, mappingProcessor, callParams);
        this.f = new ConcurrentHashMap();
        this.g = new HashMap();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
    }

    public final /* synthetic */ void a(String str, CallVideoTrackParticipantKey callVideoTrackParticipantKey, List list, PeerConnection peerConnection) {
        a(str, callVideoTrackParticipantKey, list);
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void clearRemoteVideoRenderers() {
        this.a.executeWithPeerConnection("DefaultRemoteVideoTracks.clearRemoteVideoRenderers", new Consumer() { // from class: xsna.oll
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                DefaultRemoteVideoTracks.this.a((PeerConnection) obj);
            }
        });
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void clearRemoteVideoRenderersForParticipant(@NonNull String str, @NonNull CallParticipant.ParticipantId participantId) {
        for (VideoTrackType videoTrackType : j) {
            setRemoteVideoRenderers(str, new CallVideoTrackParticipantKey.Builder().setType(videoTrackType).setParticipantId(participantId).build(), null);
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void close() {
        super.close();
        synchronized (this.f) {
            try {
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((VideoRendererProxy) it2.next()).setDelegate(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.execute("DefaultRemoteVideoTracks.closeOnExecutor", new p31(this, 9));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.recv.ParticipantRendererCollection
    public void deliverScreenCaptureFrame(CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        List list = (List) this.f.get(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(VideoTrackType.SCREEN_CAPTURE).build());
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((VideoRendererProxy) it.next()).onFrameForced(videoFrame);
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void handleVideoTracks(final RtpReceiver rtpReceiver, final MediaStream[] mediaStreamArr) {
        this.a.executeWithPeerConnection("DefaultRemoteVideoTracks.handleVideoTracksOnExecutor", new Consumer() { // from class: xsna.nll
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                DefaultRemoteVideoTracks.this.a(rtpReceiver, mediaStreamArr, (PeerConnection) obj);
            }
        });
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        return (CallVideoTrackParticipantKey) this.h.get(str);
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void setRemoteVideoRenderers(@NonNull final String str, @NonNull final CallVideoTrackParticipantKey callVideoTrackParticipantKey, final List<VideoSink> list) {
        this.a.executeWithPeerConnection("DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor", new Consumer() { // from class: xsna.mll
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                DefaultRemoteVideoTracks.this.a(str, callVideoTrackParticipantKey, list, (PeerConnection) obj);
            }
        });
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        return (String) this.i.get(callVideoTrackParticipantKey);
    }

    public final void a(PeerConnection peerConnection) {
        synchronized (this.f) {
            try {
                for (String str : this.h.keySet()) {
                    a(str, (CallVideoTrackParticipantKey) this.h.get(str), (List) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, CallVideoTrackParticipantKey callVideoTrackParticipantKey, List list) {
        synchronized (this.f) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.g.get(str);
                if (videoTrack == null) {
                    this.b.log("DefaultRemoteVideoTracks", "no " + callVideoTrackParticipantKey + " track");
                    return;
                }
                List<VideoRendererProxy> list2 = (List) this.f.get(callVideoTrackParticipantKey);
                if (list2 == null) {
                    this.b.log("DefaultRemoteVideoTracks", "no renderers for " + callVideoTrackParticipantKey + " track");
                } else {
                    for (VideoRendererProxy videoRendererProxy : list2) {
                        videoRendererProxy.setDelegate(null);
                        videoRendererProxy.safelyRemoveSelf(videoTrack);
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        VideoSink videoSink = (VideoSink) it.next();
                        VideoRendererProxy videoRendererProxy2 = new VideoRendererProxy();
                        videoRendererProxy2.setDelegate(videoSink);
                        arrayList.add(videoRendererProxy2);
                        if (callVideoTrackParticipantKey.getType() == VideoTrackType.VIDEO && !videoTrack.isDisposed()) {
                            videoTrack.addSink(videoRendererProxy2);
                        }
                    }
                }
                CallVideoTrackParticipantKey callVideoTrackParticipantKey2 = (CallVideoTrackParticipantKey) this.h.get(str);
                if (callVideoTrackParticipantKey2 != null) {
                    this.h.remove(str);
                    this.i.remove(callVideoTrackParticipantKey2);
                }
                this.h.put(str, callVideoTrackParticipantKey);
                this.i.put(callVideoTrackParticipantKey, str);
                this.f.put(callVideoTrackParticipantKey, Collections.unmodifiableList(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr, PeerConnection peerConnection) {
        String str;
        MediaStreamTrack track = rtpReceiver.track();
        for (VideoTrack videoTrack : mediaStreamArr[0].videoTracks) {
            String id = videoTrack.id();
            bjn0.b("remote video track ", id, this.b, "DefaultRemoteVideoTracks");
            if (track != null && id.equals(track.id())) {
                this.b.log("DefaultRemoteVideoTracks", "add remote video track ".concat(id));
                if (id.startsWith(SignalingProtocol.VIDEO_TRACK_ID_PREFIX)) {
                    String substring = id.substring(6);
                    if (!substring.startsWith("u") && !substring.startsWith(g.e)) {
                        str = "video-u".concat(substring);
                        this.g.put(str, videoTrack);
                        videoTrack.setEnabled(true);
                        this.d.onPeerConnectionRemoteVideoTrackAdded(id);
                    }
                }
                str = id;
                this.g.put(str, videoTrack);
                videoTrack.setEnabled(true);
                this.d.onPeerConnectionRemoteVideoTrackAdded(id);
            }
        }
    }

    public final void a() {
        synchronized (this.f) {
            try {
                this.b.log("DefaultRemoteVideoTracks", this + ": remove remote video renderers");
                for (Map.Entry entry : this.f.entrySet()) {
                    if (((CallVideoTrackParticipantKey) entry.getKey()).getType() == VideoTrackType.VIDEO) {
                        VideoTrack videoTrack = (VideoTrack) this.g.get((String) this.i.get(entry.getKey()));
                        for (VideoRendererProxy videoRendererProxy : (List) entry.getValue()) {
                            videoRendererProxy.setDelegate(null);
                            if (videoTrack != null) {
                                videoRendererProxy.safelyRemoveSelf(videoTrack);
                            }
                        }
                    }
                }
                this.f.clear();
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
