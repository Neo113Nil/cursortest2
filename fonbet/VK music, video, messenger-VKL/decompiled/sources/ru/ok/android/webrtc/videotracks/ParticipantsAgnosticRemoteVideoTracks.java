package ru.ok.android.webrtc.videotracks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.ParticipantsAgnosticRemoteVideoTracks;
import ru.ok.android.webrtc.videotracks.RemoteVideoTracks;
import xsna.tnf;

/* loaded from: classes9.dex */
public final class ParticipantsAgnosticRemoteVideoTracks extends RemoteVideoTracks {
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final HashMap i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;

    public class ParticipantMapReportingVideoSink implements VideoSink {
        public final String a;
        public long b = -1;

        public ParticipantMapReportingVideoSink(String str) {
            this.a = str;
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            CallVideoTrackParticipantKey queryKey;
            Long compactParticipantId = videoFrame.getCompactParticipantId();
            if (compactParticipantId == null) {
                compactParticipantId = -1L;
            }
            if (compactParticipantId.longValue() != this.b) {
                this.b = compactParticipantId.longValue();
                ParticipantsAgnosticRemoteVideoTracks participantsAgnosticRemoteVideoTracks = ParticipantsAgnosticRemoteVideoTracks.this;
                String str = this.a;
                if (compactParticipantId.longValue() == -1) {
                    compactParticipantId = null;
                }
                CallVideoTrackParticipantKey callVideoTrackParticipantKey = (CallVideoTrackParticipantKey) participantsAgnosticRemoteVideoTracks.k.get(str);
                if (callVideoTrackParticipantKey != null) {
                    participantsAgnosticRemoteVideoTracks.k.remove(str, callVideoTrackParticipantKey);
                    participantsAgnosticRemoteVideoTracks.l.remove(callVideoTrackParticipantKey, str);
                }
                if (compactParticipantId == null || (queryKey = participantsAgnosticRemoteVideoTracks.e.queryKey((int) compactParticipantId.longValue())) == null) {
                    return;
                }
                participantsAgnosticRemoteVideoTracks.k.put(str, queryKey);
                participantsAgnosticRemoteVideoTracks.l.put(queryKey, str);
            }
        }
    }

    public ParticipantsAgnosticRemoteVideoTracks(@NonNull RemoteVideoTracks.Executor executor, @NonNull RTCLog rTCLog, @NonNull RemoteVideoTracks.Listener listener, @NonNull MappingProcessor mappingProcessor, @NonNull CallParams callParams) {
        super(executor, rTCLog, listener, mappingProcessor, callParams);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
    }

    public final void a(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr, PeerConnection peerConnection) {
        synchronized (this) {
            try {
                MediaStreamTrack track = rtpReceiver.track();
                for (VideoTrack videoTrack : mediaStreamArr[0].videoTracks) {
                    String id = videoTrack.id();
                    this.b.log("ParticipantsAgnosticVideoTracks", "remote video track " + id);
                    if (track != null && id.equals(track.id())) {
                        this.b.log("ParticipantsAgnosticVideoTracks", "add remote video track ".concat(id));
                        ParticipantsAgnosticVideoSink participantsAgnosticVideoSink = new ParticipantsAgnosticVideoSink(this.j, this.e);
                        ParticipantMapReportingVideoSink participantMapReportingVideoSink = new ParticipantMapReportingVideoSink(id);
                        this.g.add(participantsAgnosticVideoSink);
                        this.h.add(participantMapReportingVideoSink);
                        this.f.add(videoTrack);
                        if (videoTrack.isDisposed()) {
                            this.b.log("ParticipantsAgnosticVideoTracks", "error: video track is disposed");
                        } else {
                            videoTrack.addSink(participantsAgnosticVideoSink);
                            videoTrack.addSink(participantMapReportingVideoSink);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void clearRemoteVideoRenderers() {
        MiscHelper.throwIfNotMainThread();
        this.j.clear();
        this.i.clear();
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void clearRemoteVideoRenderersForParticipant(@NonNull String str, @NonNull CallParticipant.ParticipantId participantId) {
        MiscHelper.throwIfNotMainThread();
        Set set = (Set) this.i.get(participantId);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.j.remove((CallVideoTrackParticipantKey) it.next());
        }
        this.i.remove(participantId);
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void close() {
        super.close();
        this.a.execute("ParticipantsAgnosticRemoteVideoTracks.closeInternal", new tnf(this, 6));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.recv.ParticipantRendererCollection
    public void deliverScreenCaptureFrame(CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        List list = (List) this.j.get(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(VideoTrackType.SCREEN_CAPTURE).build());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void handleVideoTracks(final RtpReceiver rtpReceiver, final MediaStream[] mediaStreamArr) {
        this.a.executeWithPeerConnection("DefaultRemoteVideoTracks.handleVideoTracksOnExecutor", new Consumer() { // from class: xsna.gl90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ParticipantsAgnosticRemoteVideoTracks.this.a(rtpReceiver, mediaStreamArr, (PeerConnection) obj);
            }
        });
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        return (CallVideoTrackParticipantKey) this.k.get(str);
    }

    @Override // ru.ok.android.webrtc.videotracks.RemoteVideoTracks
    public void setRemoteVideoRenderers(@NonNull String str, @NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        MiscHelper.throwIfNotMainThread();
        if (list == null) {
            this.j.remove(callVideoTrackParticipantKey);
            Set set = (Set) this.i.get(callVideoTrackParticipantKey.getParticipantId());
            if (set != null) {
                set.remove(callVideoTrackParticipantKey);
                return;
            }
            return;
        }
        this.j.put(callVideoTrackParticipantKey, list);
        Set set2 = (Set) this.i.get(callVideoTrackParticipantKey.getParticipantId());
        if (set2 == null) {
            set2 = new HashSet();
            this.i.put(callVideoTrackParticipantKey.getParticipantId(), set2);
        }
        set2.add(callVideoTrackParticipantKey);
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        return (String) this.l.get(callVideoTrackParticipantKey);
    }

    public final synchronized void a() {
        for (int i = 0; i < this.f.size(); i++) {
            try {
                ((VideoTrack) this.f.get(i)).removeSink((VideoSink) this.g.get(i));
                ((VideoTrack) this.f.get(i)).removeSink((VideoSink) this.h.get(i));
            } catch (Throwable th) {
                this.b.log("ParticipantsAgnosticVideoTracks", "close error: " + th.getMessage());
                return;
            }
        }
    }
}
