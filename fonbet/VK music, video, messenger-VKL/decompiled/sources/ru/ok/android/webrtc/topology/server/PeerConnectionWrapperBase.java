package ru.ok.android.webrtc.topology.server;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.signaling.api.ServerCallCapabilities;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;

/* loaded from: classes9.dex */
public abstract class PeerConnectionWrapperBase implements PeerConnectionWrapper, PeerConnectionClient.EventListener {
    public static final Pattern m = Pattern.compile("a=ssrc:(\\d+)");
    public final CallParams a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final RTCLog e;
    public final Signaling f;
    public final SharedPeerConnectionFactory g;
    public final HashSet h = new HashSet();
    public final ServerCallTopology i;
    public PeerVideoSettings j;
    public final boolean k;
    public final ServerCallCapabilities l;

    public PeerConnectionWrapperBase(ServerCallTopology.Builder builder, ServerCallTopology serverCallTopology, ServerCallCapabilities serverCallCapabilities) {
        this.a = builder.m;
        this.b = builder.j;
        this.c = builder.k;
        this.d = builder.l;
        this.i = serverCallTopology;
        this.e = builder.o;
        this.f = builder.i;
        this.g = builder.a;
        this.k = builder.skipRequestReallocEnabled();
        this.l = serverCallCapabilities;
    }

    public final void debug(String str) {
        this.e.log(getTag(), str);
    }

    public final void error(String str) {
        this.e.log(getTag(), str);
    }

    public void extractSsrcs(String str) {
        Matcher matcher = m.matcher(str);
        this.h.clear();
        while (matcher.find()) {
            this.h.add(matcher.group(1));
        }
    }

    public abstract String getTag();

    public final void info(String str) {
        this.e.log(getTag(), str);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionAudioTrackAddEvent(PeerConnectionClient peerConnectionClient, String str) {
        debug("audio-mix enabled");
        this.i.dispatchPeerConnectionAudioTrackAddEvent(peerConnectionClient, str);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionClientFirstDataReceived(PeerConnectionClient peerConnectionClient) {
        this.i.onFirstDataReceived();
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRemoteVideoTrackAdded(PeerConnectionClient peerConnectionClient, String str) {
        this.i.dispatchPeerConnectionRemoteVideoTrackAdded(peerConnectionClient, str);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRenegotiationNeeded(PeerConnectionClient peerConnectionClient) {
        warn("onPeerConnectionRenegotiationNeeded, " + peerConnectionClient);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void onPeerVideoSettingsChange(PeerVideoSettings peerVideoSettings) {
        this.j = peerVideoSettings;
        updatePeerVideoSettings();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void onVideoQualityUpdate(VideoQualityUpdate videoQualityUpdate) {
        updateVideoQuality(videoQualityUpdate);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void reallocProducer() {
        allocProducer();
    }

    public void sendRequestAcceptProducer(SessionDescription sessionDescription, String str) {
        trace("sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
        try {
            this.f.send(SignalingProtocol.createRequestAcceptProducer(sessionDescription, this.h, str));
        } catch (JSONException unused) {
            this.e.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
        }
    }

    public void sendRequestAllocConsumer(@Nullable SessionDescription sessionDescription) {
        trace("sendRequestAllocConsumer," + this + ", sdp=" + (sessionDescription == null ? null : sessionDescription.type.canonicalForm()));
        try {
            this.f.send(SignalingProtocol.createRequestAllocConsumer(sessionDescription, this.l));
        } catch (JSONException unused) {
            this.e.reportException("PeerConnectionWrapperBase", "server.topology.send.alloc.consumer", new Exception("server.topology.send.alloc.consumer"));
        }
    }

    public void sendRequestRealloc() {
        if (this.k) {
            return;
        }
        this.f.send(SignalingProtocol.createRequestRealloc());
    }

    public final void trace(String str) {
        this.e.log(getTag(), str);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public abstract void updatePeerVideoSettings();

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public abstract void updateVideoQuality(VideoQualityUpdate videoQualityUpdate);

    public final void warn(String str) {
        this.e.log(getTag(), str);
    }

    public final void debug(String str, String str2) {
        this.e.log(str, str2);
    }

    public final void error(String str, String str2) {
        this.e.log(str, str2);
    }

    public final void warn(String str, String str2) {
        this.e.log(str, str2);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceCandidate(PeerConnectionClient peerConnectionClient, IceCandidate iceCandidate) {
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceCandidatesRemoved(PeerConnectionClient peerConnectionClient, IceCandidate[] iceCandidateArr) {
    }
}
