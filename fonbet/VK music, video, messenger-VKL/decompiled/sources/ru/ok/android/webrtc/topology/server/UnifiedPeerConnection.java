package ru.ok.android.webrtc.topology.server;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.StatsObserver;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior;
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.visible.VisibleParticipants;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.signaling.api.ServerCallCapabilities;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.ice.IceCandidateAddFailedEvent;
import ru.ok.android.webrtc.stat.ice.IceCandidateGatheringFailedEvent;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public class UnifiedPeerConnection extends PeerConnectionWrapperBase implements PeerConnectionWrapper, PeerConnectionClient.EventListener, Call.PeerConnectionEventListener {
    public final boolean n;
    public final PeerConnectionClient.Builder o;
    public volatile PeerConnectionClient p;
    public SessionDescription q;
    public boolean r;
    public String s;
    public final CopyOnWriteArraySet t;
    public MutableMediaSettings u;
    public final CallTopology.EventListener v;
    public final boolean w;
    public final Call.PeerConnectionEventListener x;
    public boolean y;

    public UnifiedPeerConnection(ServerCallTopology.Builder builder, ServerCallTopology serverCallTopology, ServerCallCapabilities serverCallCapabilities) {
        super(builder, serverCallTopology, serverCallCapabilities);
        this.t = new CopyOnWriteArraySet();
        this.v = builder.z;
        this.n = builder.r;
        this.w = builder.skipRequestReallocEnabled();
        this.x = builder.A;
        this.o = new PeerConnectionClient.Builder().setSharedPeerConnectionFactory(this.g).setLocalMediaStreamSource(builder.b).setExecutor(builder.d).setContext(builder.e).setRtcLog(this.e).setCommandExecutorEnabled(true).setNotificationsReceiverEnabled(true).setCallParams(this.a).setDataChannelScreenshareRecvEnabled(this.a.isDataChannelScreenshareRecvEnabled()).setDataChannelScreenshareSendEnabled(this.a.isDataChannelScreenshareSendEnabled()).setVideoTracksCountEnabled(this.a.isVideoTracksCountEnabled()).setMappingProcessor(builder.s).setWebRTCCodecFilteringEnabled(builder.m.isWebRTCCodecFilteringEnabled()).setWebRTCAudioCodecs(builder.m.getWebRTCAudioCodecs()).setWebRTCVideoCodecs(builder.m.getWebRTCVideoCodecs()).setAnimojiSender(builder.t.makeSender(Integer.valueOf(builder.m.getAnimojiDataChannelVersion()))).setAnimojiReceiver(builder.t.makeReceiver()).setAnimojiChannelBehavior(AnimojiChannelBehavior.CREATE_SENDRECV).setNonOpusRemovalEnabled(this.a.getExperiments().F()).setH265Prioritized(builder.m.getExperiments().e0()).setScreenshareFirstFrameStat(builder.w).setDataChannelAsrRecvEnabled(builder.m.isAsrOnlineEnabled()).setTimeProvider(builder.x).setIceCandidatesPoolSize(this.a.getExperiments().i()).setScreenCapturePermissionProvider(builder.y).setCallTimings(builder.C).setPeerConnectionEventListener(this).setSimulcastEnabled(builder.m.getExperiments().h().h()).setCropAndScaleParamsProvider(builder.E);
        allocProducer();
        updatePeerVideoSettings();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void allocProducer() {
        this.p = this.o.setAsrEnabled(this.r).build();
        this.p.setEventListener(this);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.p.getCommandExecutor().addListener((RtcCommandExecutor.Listener) obj);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            this.p.getNotificationReceiver().addListener((RtcNotificationReceiver.Listener) obj2);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            AsrOnlineReceiver.Listener listener = (AsrOnlineReceiver.Listener) obj3;
            if (this.p.getAsrOnlineReceiver() != null) {
                this.p.getAsrOnlineReceiver().addListener(listener);
            }
        }
        this.p.createPeerConnectionFactory();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void clearRemoteVideoRenderersForParticipantId(@NonNull CallParticipant.ParticipantId participantId) {
        if (this.p.isReady()) {
            this.p.clearRemoteVideoRenderersForParticipant(SignalingProtocol.trackIdFromParticipantId(participantId), participantId);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void deallocProducer() {
        this.p.setEventListener(null);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.p.getCommandExecutor().removeListener((RtcCommandExecutor.Listener) obj);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            this.p.getNotificationReceiver().removeListener((RtcNotificationReceiver.Listener) obj2);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            AsrOnlineReceiver.Listener listener = (AsrOnlineReceiver.Listener) obj3;
            if (this.p.getAsrOnlineReceiver() != null) {
                this.p.getAsrOnlineReceiver().removeListener(listener);
            }
        }
        this.p.close();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public RtcCommandExecutor getCommandExecutor() {
        return this.p.getCommandExecutor();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    @Nullable
    public Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStats() {
        return this.p.getScreenshareRecvStats();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void getStats(StatsObserver statsObserver) {
        if (this.p != null) {
            this.p.getStats(statsObserver);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapperBase
    public String getTag() {
        return "UnifiedPeerConnection";
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void handleConnectivityControlTimeout() {
        updatePeerVideoSettings();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void handleMediaSettingsChanged(MutableMediaSettings mutableMediaSettings) {
        this.p.applyMediaSettings(mutableMediaSettings);
        this.u = mutableMediaSettings;
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void handleProducerUpdatedNotify(JSONObject jSONObject) throws JSONException {
        trace("handleProducerUpdatedNotify, " + this + " " + jSONObject);
        String string = jSONObject.getString("sessionId");
        if (this.t.contains(string)) {
            warn("producer-updated contains expired sessionId: " + string);
            return;
        }
        String string2 = jSONObject.getString("description");
        SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string2);
        extractSsrcs(string2);
        String str = this.s;
        this.s = string;
        if (str != null && !str.equals(string)) {
            this.t.add(str);
            warn(this.p + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
            this.q = sessionDescription;
            deallocProducer();
            allocProducer();
            updatePeerVideoSettings();
            this.g.disableHWVPX();
            if (this.p.isReady()) {
                return;
            }
            this.p.createPeerConnection(this.a.getShouldCircumventCallBlock() ? this.i.getIceServers() : Collections.EMPTY_LIST);
            return;
        }
        if (this.p.isStable() && this.q != null) {
            warn("producer is stable but offerForProducer exists");
            this.q = null;
        }
        if (this.p.isStable()) {
            debug("set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + this.p);
            this.p.setRemoteDescription(sessionDescription);
            return;
        }
        warn(this.p + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
        this.q = sessionDescription;
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void handleTopologyStateChanged(int i) {
        if (i == 0) {
            return;
        }
        if (i == 2) {
            this.y = true;
            return;
        }
        if (this.n) {
            sendRequestRealloc();
        } else if (i == 1 && this.y) {
            this.y = false;
        } else {
            sendRequestAllocConsumer(null);
        }
        if (this.p.isAbleToCreatePeerConnection()) {
            this.g.disableHWVPX();
            if (this.p.isReady()) {
                return;
            }
            this.p.createPeerConnection(this.a.getShouldCircumventCallBlock() ? this.i.getIceServers() : Collections.EMPTY_LIST);
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        if (this.p == null) {
            return null;
        }
        return this.p.getTrackVideoKeyMapper().keyByWebrtcTrackId(str);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void onCallParticipantRemoved(@NonNull CallParticipant callParticipant) {
        trace("onCallParticipantRemoved, " + callParticipant);
        CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
        if (participantId == null) {
            return;
        }
        this.p.clearRemoteVideoRenderersForParticipant(SignalingProtocol.trackIdFromParticipantId(participantId), participantId);
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceCandidateAddFailed(IceCandidateAddFailedEvent iceCandidateAddFailedEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceCandidateAddFailed(iceCandidateAddFailedEvent);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceCandidateGatheringFailed(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceCandidateGatheringFailed(iceCandidateGatheringFailedEvent);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceRestart() {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceRestart();
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onLocalCandidateCreated(String str) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onLocalCandidateCreated(str);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onLocalSdpCreated(SessionDescription.Type type) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onLocalSdpCreated(type);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onNegotiationError(NegotiationError negotiationError) {
        String str = (negotiationError.getType() == NegotiationError.Type.CREATE_ANSWER || negotiationError.getType() == NegotiationError.Type.CREATE_OFFER) ? "server.topology.create.sdp.failed" : "server.topology.set.sdp.failed";
        this.e.reportException("UnifiedPeerConnection", str, new Exception(str));
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onNegotiationError(negotiationError);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionCreated(PeerConnectionClient peerConnectionClient) {
        if (this.p.isReady()) {
            this.i.onAllPeerConnectionsReady();
        }
        if (this.p.isStable() && this.q != null) {
            if (!this.w) {
                debug("apply postponed remote sdp=" + this.q.type.canonicalForm() + " to just created " + peerConnectionClient);
                this.p.setRemoteDescription(this.q);
                this.q = null;
            } else if (this.p.isSetRemoteDescriptionNeeded()) {
                debug("apply postponed remote sdp=" + this.q.type.canonicalForm() + " to just created " + peerConnectionClient);
                this.p.setRemoteDescription(this.q);
            }
        }
        this.p.applyMediaSettings(this.u);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceConnectionChange(PeerConnectionClient peerConnectionClient, PeerConnection.IceConnectionState iceConnectionState) {
        trace("onPeerConnectionIceConnectionChange, " + peerConnectionClient + " state=" + iceConnectionState);
        if (this.i.isActive()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                this.t.add(this.s);
                sendRequestRealloc();
            }
            this.i.dispatchTopologyIceConnectionChange(iceConnectionState);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionLocalDescription(PeerConnectionClient peerConnectionClient, SessionDescription sessionDescription) {
        if (sessionDescription.type == SessionDescription.Type.ANSWER) {
            sendRequestAcceptProducer(sessionDescription, this.s);
        } else {
            this.e.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRemoteDescription(PeerConnectionClient peerConnectionClient, SessionDescription sessionDescription) {
        if (sessionDescription.type == SessionDescription.Type.OFFER) {
            if (peerConnectionClient.isStable()) {
                throw new IllegalStateException();
            }
            this.p.createAnswer();
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionSignalingState(PeerConnectionClient peerConnectionClient, PeerConnection.SignalingState signalingState) {
        if (signalingState == PeerConnection.SignalingState.STABLE && this.q != null && this.p.isReady()) {
            if (!this.w) {
                debug("apply postponed remote sdp=" + this.q.type.canonicalForm() + " to " + peerConnectionClient);
                this.p.setRemoteDescription(this.q);
                this.q = null;
                return;
            }
            if (this.p.isSetRemoteDescriptionNeeded()) {
                debug("apply postponed remote sdp=" + this.q.type.canonicalForm() + " to " + peerConnectionClient);
                this.p.setRemoteDescription(this.q);
            }
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionSignalingStateChanged(signalingState);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, boolean z) {
        this.i.dispatchTopologyPeerConnectionChange(peerConnectionState);
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionStateChanged(peerConnectionState, z);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onRemoteCandidateReceived(String str) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onRemoteCandidateReceived(str);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onRemoteSdpReceived(SessionDescription.Type type) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onRemoteSdpReceived(type);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.x;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void onVisibleSetChanged(VisibleParticipants visibleParticipants) {
        this.p.onVisibleSetChanged(visibleParticipants);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void release() {
        deallocProducer();
        this.p.release();
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void setAsrEnabled(boolean z) {
        this.r = z;
        this.p.setAsrEnabled(this.r);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        if (this.p.isReady()) {
            this.p.setRemoteVideoRenderers(SignalingProtocol.trackIdFromParticipantId(callVideoTrackParticipantKey.getParticipantId()), callVideoTrackParticipantKey, list);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapperBase, ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void updatePeerVideoSettings() {
        if (this.p != null) {
            this.p.setPeerVideoSettings(this.j);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapperBase, ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void updateVideoQuality(VideoQualityUpdate videoQualityUpdate) {
        if (this.p != null) {
            this.p.updateVideoQuality(videoQualityUpdate);
        }
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        if (this.p == null) {
            return null;
        }
        return this.p.getTrackVideoKeyMapper().webrtcTrackIdByKey(callVideoTrackParticipantKey);
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void getStats(StatsCallback statsCallback) {
        if (this.p != null) {
            this.p.getStats(statsCallback);
        }
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void handleConsumerAnsweredNotify(JSONObject jSONObject) throws JSONException {
    }

    @Override // ru.ok.android.webrtc.topology.server.PeerConnectionWrapper
    public void onCallParticipantAdded(@NonNull CallParticipant callParticipant) {
    }
}
