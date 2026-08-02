package ru.ok.android.webrtc.topology.direct;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.StatsReport;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.DelayedVideoRendererSource;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener;
import ru.ok.android.webrtc.listeners.collection.CallListenersCollection;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationController;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.Peer;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.notifications.NetworkStatusNotification;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.ice.IceCandidateAddFailedEvent;
import ru.ok.android.webrtc.stat.ice.IceCandidateGatheringFailedEvent;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.ExtendedStatsCallback;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;
import ru.ok.android.webrtc.topology.TopologyUpgradeRequestHistory;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.b04;
import xsna.bin0;
import xsna.cvh;
import xsna.ef2;
import xsna.ezm;
import xsna.gav;
import xsna.ho8;
import xsna.idz0;
import xsna.o93;
import xsna.qs90;
import xsna.rs90;
import xsna.s3q0;
import xsna.v53;

/* loaded from: classes9.dex */
public final class DirectCallTopology extends CallTopology implements Signaling.Listener, PeerConnectionClient.EventListener, NetworkMonitor.NetworkObserver, Call.PeerConnectionEventListener {
    public static final /* synthetic */ boolean a0 = true;
    public final DelayedVideoRendererSource A;
    public final SharedPeerConnectionFactory B;
    public final ExecutorService C;
    public final HashMap D;
    public final HashMap E;
    public final HashMap F;
    public final idz0 G;
    public final HashMap H;
    public final HashMap I;
    public final MappingProcessor J;
    public final TopologyUpgradeRequestHistory K;
    public final RtcNotificationReceiver.Listener L;
    public final TopologyUpgradeStatEventListener M;
    public P2PNetworkStatusReporter N;
    public boolean O;
    public final Call.PeerConnectionEventListener P;
    public boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public final WebRTCToInternalStatsMapper U;
    public final qs90 V;
    public final Runnable W;
    public final Runnable X;
    public final boolean Y;
    public boolean Z;
    public final AnimojiCore y;
    public final Context z;

    public static final class Builder {
        public bin0 A;
        public qs90 B;
        public boolean C;
        public SharedPeerConnectionFactory a;
        public LocalMediaStreamSource b;
        public DelayedVideoRendererSource c;
        public ExecutorService d;
        public Context e;
        public EglBase f;
        public MutableMediaSettings g;
        public CallParticipants h;
        public Signaling i;
        public CallParams j;
        public RTCLog k;
        public FirstDataStat l;
        public boolean m = false;
        public MappingProcessor n;
        public AnimojiCore o;
        public CallListenersCollection p;
        public MediaAdaptationController q;
        public RtcNotificationReceiver.Listener r;
        public TimeProvider s;
        public ScreenCapturePermissionProvider t;
        public CallTopology.EventListener u;
        public TopologyUpgradeStatEventListener v;
        public Call.PeerConnectionEventListener w;
        public WebRTCToInternalStatsMapper x;
        public CallTimings y;
        public CropAndScaleParamsProvider z;

        public DirectCallTopology build() {
            if (this.a == null || this.e == null || this.h == null || this.g == null || this.i == null || this.j == null || this.k == null || this.f == null || this.c == null || this.b == null || this.n == null || this.p == null || this.s == null || this.v == null || this.y == null || this.x == null) {
                throw new IllegalStateException();
            }
            return new DirectCallTopology(this);
        }

        public Builder setAnimojiCore(AnimojiCore animojiCore) {
            this.o = animojiCore;
            return this;
        }

        public Builder setCallListenersCollection(CallListenersCollection callListenersCollection) {
            this.p = callListenersCollection;
            return this;
        }

        public Builder setCallParams(@NonNull CallParams callParams) {
            this.j = callParams;
            return this;
        }

        public Builder setCallParticipants(@NonNull CallParticipants callParticipants) {
            this.h = callParticipants;
            return this;
        }

        public Builder setCallTimings(CallTimings callTimings) {
            this.y = callTimings;
            return this;
        }

        public Builder setContext(@NonNull Context context) {
            this.e = context;
            return this;
        }

        public Builder setCropAndScaleParamsProvider(CropAndScaleParamsProvider cropAndScaleParamsProvider) {
            this.z = cropAndScaleParamsProvider;
            return this;
        }

        public Builder setEglBase(@NonNull EglBase eglBase) {
            this.f = eglBase;
            return this;
        }

        public Builder setEventListener(CallTopology.EventListener eventListener) {
            this.u = eventListener;
            return this;
        }

        public Builder setExecuterService(ExecutorService executorService) {
            this.d = executorService;
            return this;
        }

        public Builder setFirstDataStat(@NonNull FirstDataStat firstDataStat) {
            this.l = firstDataStat;
            return this;
        }

        public Builder setForceRelayPolicy(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setIsMaster(boolean z) {
            this.C = z;
            return this;
        }

        public Builder setIsMeInWaitingRoom(bin0<Boolean> bin0Var) {
            this.A = bin0Var;
            return this;
        }

        public Builder setLocalMediaStreamSource(@NonNull LocalMediaStreamSource localMediaStreamSource) {
            this.b = localMediaStreamSource;
            return this;
        }

        public Builder setMappingProcessor(MappingProcessor mappingProcessor) {
            this.n = mappingProcessor;
            return this;
        }

        public Builder setMediaAdaptationController(MediaAdaptationController mediaAdaptationController) {
            this.q = mediaAdaptationController;
            return this;
        }

        public Builder setMediaSettings(@NonNull MutableMediaSettings mutableMediaSettings) {
            this.g = mutableMediaSettings;
            return this;
        }

        public Builder setNotificationsListener(@NonNull RtcNotificationReceiver.Listener listener) {
            this.r = listener;
            return this;
        }

        public Builder setPcapLabelProvider(qs90 qs90Var) {
            this.B = qs90Var;
            return this;
        }

        public Builder setPeerConnectionEventListener(Call.PeerConnectionEventListener peerConnectionEventListener) {
            this.w = peerConnectionEventListener;
            return this;
        }

        public Builder setRtcLogger(@NonNull RTCLog rTCLog) {
            this.k = rTCLog;
            return this;
        }

        public Builder setScreenCapturePermissionProvider(@Nullable ScreenCapturePermissionProvider screenCapturePermissionProvider) {
            this.t = screenCapturePermissionProvider;
            return this;
        }

        public Builder setSharedPeerConnectionFactory(SharedPeerConnectionFactory sharedPeerConnectionFactory) {
            this.a = sharedPeerConnectionFactory;
            return this;
        }

        public Builder setSignaling(@NonNull Signaling signaling) {
            this.i = signaling;
            return this;
        }

        public Builder setTimeProvider(@NonNull TimeProvider timeProvider) {
            this.s = timeProvider;
            return this;
        }

        public Builder setTopologyUpgradeStatEventListener(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
            this.v = topologyUpgradeStatEventListener;
            return this;
        }

        public Builder setVideoRendererSource(@NonNull DelayedVideoRendererSource delayedVideoRendererSource) {
            this.c = delayedVideoRendererSource;
            return this;
        }

        public Builder setWebRTCToInternalStatsMapper(WebRTCToInternalStatsMapper webRTCToInternalStatsMapper) {
            this.x = webRTCToInternalStatsMapper;
            return this;
        }
    }

    public DirectCallTopology(Builder builder) {
        super(builder.h, builder.g, builder.j, builder.k, builder.l, builder.b, builder.p, builder.q, builder.t, builder.s, builder.y, builder.z, builder.i, builder.A);
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new HashMap();
        this.H = new HashMap();
        this.I = new HashMap();
        boolean z = true;
        this.O = true;
        this.W = new o93(this, 11);
        this.X = new b04(this, 3);
        trace(this + " ctor");
        this.U = builder.x;
        this.J = builder.n;
        this.m = builder.u;
        this.V = builder.B;
        TopologyUpgradeStatEventListener topologyUpgradeStatEventListener = builder.v;
        this.M = topologyUpgradeStatEventListener;
        this.Z = builder.C;
        this.K = new TopologyUpgradeRequestHistory(topologyUpgradeStatEventListener);
        this.P = builder.w;
        this.G = new idz0(builder.k);
        this.z = builder.e;
        this.B = builder.a;
        this.C = builder.d;
        this.A = builder.c;
        this.Y = builder.m;
        this.y = builder.o;
        this.w.addNotificationListener(this);
        this.L = builder.r;
        boolean a02 = this.d.getExperiments().a0();
        this.S = a02;
        if (!a02 && !this.d.getExperiments().g()) {
            z = false;
        }
        this.R = z;
        for (CallParticipant callParticipant : getParticipants()) {
            if (!callParticipant.isOnHold) {
                this.D.put(callParticipant.getParticipantId(), a());
            }
        }
        a(this.d.getBadNetworkIndicatorConfig());
        NetworkMonitor.getInstance().addObserver(this);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, org.webrtc.StatsReport[]] */
    public final /* synthetic */ void a(CallParticipant.ParticipantId participantId, StatsObserver statsObserver, StatsReport[] statsReportArr) {
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        this.a.post(new ezm(this, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), participantId, statsObserver, 0));
    }

    public final /* synthetic */ void b() {
        if (isActive()) {
            for (Map.Entry entry : this.E.entrySet()) {
                CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) entry.getKey();
                if (((PeerConnectionClient) entry.getValue()).getIceConnectionState() != PeerConnection.IceConnectionState.CONNECTED) {
                    getParticipant(participantId);
                    this.b = true;
                    CallTopology.EventListener eventListener = this.m;
                    if (eventListener != null) {
                        eventListener.onTopologyUpgradeProposed(this);
                    }
                    this.K.maybeNotifyTopologyUpgradeStatEvent(new TopologyChangedEvent.Timeouted.NoConnection(this.t));
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void c() {
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyUpgradeProposed(this);
        }
        this.K.maybeNotifyTopologyUpgradeStatEvent(new TopologyChangedEvent.Timeouted.NoData(this.s));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void clearRemoteVideoRenderers() {
        trace("clearRemoteVideoRenderers");
        MiscHelper.throwIfNotMainThread();
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((PeerConnectionClient) it.next()).clearRemoteVideoRenderers();
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void createAnswerFor(CallParticipant.ParticipantId participantId, @NonNull SessionDescription sessionDescription) {
        debug("createAnswerFor, " + this + ", participant=" + participantId + ", " + sessionDescription.type);
        MiscHelper.throwIfNotMainThread();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type != type2) {
            throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
        }
        CallParticipant participant = getParticipant(participantId);
        if (participant == null) {
            throw new IllegalStateException("Participant(" + participantId + ") not found");
        }
        a aVar = (a) this.I.get(participantId);
        if (aVar != null) {
            if (!aVar.e) {
                error(this + ": unexpected offer (is concurrent call?) from " + participant);
                return;
            }
            this.e.log(getTag(), "Opponent " + participantId + " is requesting for renegotiation, let us accept the request, ");
            this.I.remove(participantId);
        }
        a aVar2 = (a) this.H.get(participantId);
        if (aVar2 != null) {
            SessionDescription sessionDescription2 = aVar2.b;
            if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                this.e.reportException(getTag(), "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                return;
            }
            if (aVar2.d) {
                this.e.reportException(getTag(), "repeated.answer", new Exception("repeated.answer.creation"));
                return;
            }
            warn(this + ": re-schedule answer creation for " + participant);
            this.H.remove(participantId);
        }
        this.H.put(participantId, new a(sessionDescription, false));
        if (this.R) {
            e();
        } else {
            f();
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void createOfferFor(@NonNull CallParticipant callParticipant, boolean z) {
        trace("createOfferFor, " + this + ", " + callParticipant);
        MiscHelper.throwIfNotMainThread();
        if (!has(callParticipant)) {
            throw new IllegalStateException("Participant not found");
        }
        a aVar = (a) this.I.get(callParticipant.getParticipantId());
        if (aVar == null) {
            this.I.put(callParticipant.getParticipantId(), new a(null, false));
        } else if (aVar.d) {
            if (!aVar.f) {
                this.e.reportException(getTag(), "offer.scheduled", new Exception("offer.creation.already.scheduled"));
            }
        } else if (z) {
            warn(this + ": re-schedule offer creation for " + callParticipant);
            aVar.e = false;
        } else {
            warn(this + ": offer already created for " + callParticipant);
        }
        g();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void createOffers(boolean z) {
        Iterator<CallParticipant> it = getParticipants().iterator();
        while (it.hasNext()) {
            createOfferFor(it.next(), z);
        }
    }

    public final /* synthetic */ void d() {
        for (PeerConnectionClient peerConnectionClient : this.E.values()) {
            a(peerConnectionClient, peerConnectionClient.getIceConnectionState());
        }
    }

    public final void e() {
        trace("maybeCreateConnection, " + this);
        if (!isActive() && !this.R) {
            error(this + ": is not active yet");
            return;
        }
        List<PeerConnection.IceServer> iceServers = getIceServers();
        for (PeerConnectionClient peerConnectionClient : this.D.values()) {
            if (!peerConnectionClient.isReady() && !peerConnectionClient.isCreationScheduled()) {
                peerConnectionClient.createPeerConnection(iceServers);
            }
        }
        g();
        f();
    }

    public final void f() {
        PeerConnectionClient peerConnectionClient;
        trace("maybeProcessSelfAnswers");
        if (!isActive() && !this.R) {
            warn(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.H.entrySet()) {
            CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + participantId);
            }
            if (!aVar.d && !aVar.e && (peerConnectionClient = (PeerConnectionClient) this.E.get(participantId)) != null) {
                info(this + ": start processing scheduled answer for participant=" + participantId);
                aVar.d = true;
                peerConnectionClient.setRemoteDescription(aVar.b);
            }
        }
    }

    public final void g() {
        PeerConnectionClient peerConnectionClient;
        trace("maybeProcessSelfOffers");
        if (!isActive() && !this.S) {
            warn(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.I.entrySet()) {
            CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) entry.getKey();
            a aVar = (a) entry.getValue();
            if (!aVar.d && !aVar.e && (peerConnectionClient = (PeerConnectionClient) this.E.get(participantId)) != null) {
                info(this + ": start processing scheduled offer for participant=" + participantId);
                aVar.d = true;
                aVar.a.clear();
                aVar.c = null;
                peerConnectionClient.createOffer(false);
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public Runnable getConnectivityControlRunnable() {
        return this.W;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public long getIceGatheringStartTime() {
        MiscHelper.throwIfNotMainThread();
        Iterator it = this.E.values().iterator();
        return it.hasNext() ? ((PeerConnectionClient) it.next()).getIceGatheringStartTime() : super.getIceGatheringStartTime();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public Topology getIdentity() {
        return Topology.DIRECT;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void getStats(@NonNull final StatsObserver statsObserver) {
        MiscHelper.throwIfNotMainThread();
        for (Map.Entry entry : this.E.entrySet()) {
            final CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) entry.getKey();
            ((PeerConnectionClient) entry.getValue()).getStats(new org.webrtc.StatsObserver() { // from class: xsna.hzm
                @Override // org.webrtc.StatsObserver
                public final void onComplete(StatsReport[] statsReportArr) {
                    DirectCallTopology.this.a(participantId, statsObserver, statsReportArr);
                }
            });
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public String getTag() {
        return "DirectCallTopology";
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void grantRoles(@NonNull CallParticipant.ParticipantId participantId, @NonNull List<CallParticipant.Role> list, boolean z, Signaling.Listener listener) {
        try {
            this.w.send(SignalingProtocol.createRequestGrantRoles(participantId, list, z), listener);
        } catch (JSONException unused) {
            this.e.logException(getTag(), "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void handleIceApplyPermissionChanged(boolean z) {
        debug("handleIceApplyPermissionChanged, " + this + ", isPermitted=" + z);
        this.G.c = z;
        if (z && isActive()) {
            for (Map.Entry entry : this.E.entrySet()) {
                CallParticipant participant = getParticipant((CallParticipant.ParticipantId) entry.getKey());
                if (participant != null) {
                    this.G.a(participant, (PeerConnectionClient) entry.getValue());
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void handleRemoteHold(CallParticipant callParticipant) {
        setState(2);
        PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.D.get(callParticipant.getParticipantId());
        if (peerConnectionClient != null) {
            peerConnectionClient.release();
        }
        PeerConnectionClient peerConnectionClient2 = (PeerConnectionClient) this.E.get(callParticipant.getParticipantId());
        if (peerConnectionClient2 != null) {
            peerConnectionClient2.release();
        }
        this.D.remove(callParticipant.getParticipantId());
        this.E.remove(callParticipant.getParticipantId());
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void handleRemoteUnhold(CallParticipant callParticipant) {
        this.D.put(callParticipant.getParticipantId(), a());
        List<PeerConnection.IceServer> iceServers = getIceServers();
        for (PeerConnectionClient peerConnectionClient : this.D.values()) {
            if (!peerConnectionClient.isReady() && !peerConnectionClient.isCreationScheduled()) {
                peerConnectionClient.createPeerConnection(iceServers);
            }
        }
        if (this.Z) {
            createOffers(true);
        }
        setState(1);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void handleStateChanged(int i) {
        trace("handleStateChanged, " + this + ", state=" + CallTopology.getStateAsString(i));
        if (isActive()) {
            info("enable processing signaling replies in " + CallTopology.getStateAsString(i) + " state");
            this.w.addNotificationListener(this);
            updatePeerVideoSettings(this.q);
        } else {
            warn("disable processing signaling replies in " + CallTopology.getStateAsString(i) + " state");
            this.w.removeNotificationListener(this);
        }
        e();
        if (this.R && this.G.c && isActive()) {
            for (Map.Entry entry : this.E.entrySet()) {
                CallParticipant participant = getParticipant((CallParticipant.ParticipantId) entry.getKey());
                if (participant != null) {
                    this.G.a(participant, (PeerConnectionClient) entry.getValue());
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void hold(Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            ((PeerConnectionClient) it.next()).release();
        }
        Iterator it2 = this.E.values().iterator();
        while (it2.hasNext()) {
            ((PeerConnectionClient) it2.next()).release();
        }
        this.D.clear();
        this.E.clear();
        sendHoldRequest(true, null, consumer, consumer2);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public boolean isP2PRelayEnabled() {
        return this.Q;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        for (Map.Entry entry : this.F.entrySet()) {
            if (str.equals(entry.getValue())) {
                PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.D.get(entry.getKey());
                if (peerConnectionClient == null) {
                    peerConnectionClient = (PeerConnectionClient) this.E.get(entry.getKey());
                }
                if (peerConnectionClient == null) {
                    return null;
                }
                return peerConnectionClient.getTrackVideoKeyMapper().keyByWebrtcTrackId(str);
            }
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(@NonNull CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
        onActiveParticipantsRemoved(new CallActiveSessionRoomParticipantsListener.RemovedParams(updatedParams.getOldParticipants(), Collections.EMPTY_LIST, updatedParams.getMe()));
        onActiveParticipantsAdded(new CallActiveSessionRoomParticipantsListener.AddedParams(updatedParams.getNewParticipants(), updatedParams.getNewParticipants(), updatedParams.getMe()));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(@NonNull CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
        trace("onCallParticipantsAdded, " + this + ", " + addedParams.getAddedParticipants().size());
        for (CallParticipant callParticipant : addedParams.getAddedParticipants()) {
            if (this.D.get(callParticipant.getParticipantId()) != null || this.E.get(callParticipant.getParticipantId()) != null) {
                throw new IllegalStateException("Peer connection is already created for " + callParticipant);
            }
            this.D.put(callParticipant.getParticipantId(), a());
        }
        e();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(@NonNull CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
        trace("onCallParticipantsChanged, " + changedParams.getChangedParticipants().size());
        for (CallParticipant callParticipant : changedParams.getChangedParticipants()) {
            PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.E.get(callParticipant.getParticipantId());
            if (peerConnectionClient != null) {
                a(callParticipant);
                this.G.a(callParticipant, peerConnectionClient);
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(@NonNull CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
        trace("onCallParticipantsRemoved, " + this + ", " + removedParams.getRemovedParticipants().size());
        for (CallParticipant callParticipant : removedParams.getRemovedParticipants()) {
            PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.D.remove(callParticipant.getParticipantId());
            if (peerConnectionClient == null) {
                peerConnectionClient = (PeerConnectionClient) this.E.remove(callParticipant.getParticipantId());
            }
            if (peerConnectionClient != null) {
                peerConnectionClient.setEventListener(null);
                peerConnectionClient.release();
            }
            this.F.remove(callParticipant.getParticipantId());
            this.H.remove(callParticipant.getParticipantId());
            this.I.remove(callParticipant.getParticipantId());
            this.G.a.remove(callParticipant);
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        trace("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
            this.a.post(new ef2(this, 8));
            return;
        }
        this.e.log(getTag(), "Don't even try to restart ICE when connection type is " + connectionType);
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceCandidateAddFailed(IceCandidateAddFailedEvent iceCandidateAddFailedEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceCandidateAddFailed(iceCandidateAddFailedEvent);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceCandidateGatheringFailed(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceCandidateGatheringFailed(iceCandidateGatheringFailedEvent);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onIceRestart() {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onIceRestart();
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onLocalCandidateCreated(String str) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onLocalCandidateCreated(str);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onLocalSdpCreated(SessionDescription.Type type) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onLocalSdpCreated(type);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onNegotiationError(NegotiationError negotiationError) {
        String str = (negotiationError.getType() == NegotiationError.Type.CREATE_ANSWER || negotiationError.getType() == NegotiationError.Type.CREATE_OFFER) ? "direct.topology.create.sdp.failed" : "direct.topology.set.sdp.failed";
        RTCLog rTCLog = this.e;
        String tag = getTag();
        StringBuilder b = ho8.b(str, ", ");
        b.append(negotiationError.getMessage());
        rTCLog.reportException(tag, str, new Exception(b.toString()));
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onNegotiationError(negotiationError);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionClientFirstDataReceived(PeerConnectionClient peerConnectionClient) {
        onFirstDataReceived();
        this.K.maybeNotifyTopologyUpgradeStatEvent(new TopologyChangedEvent.Timeouted.SuccessAudio(this.s));
        this.a.removeCallbacks(this.X);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionCreated(@NonNull PeerConnectionClient peerConnectionClient) {
        CallTopology.EventListener eventListener;
        trace("onPeerConnectionCreated, " + this + ", " + peerConnectionClient);
        Iterator it = this.D.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == peerConnectionClient) {
                this.D.remove(entry.getKey());
                if (this.q != null) {
                    ((PeerConnectionClient) entry.getValue()).setPeerVideoSettings(this.q);
                }
                this.E.put((CallParticipant.ParticipantId) entry.getKey(), (PeerConnectionClient) entry.getValue());
                if (this.T && !this.I.containsKey(entry.getKey())) {
                    this.I.put((CallParticipant.ParticipantId) entry.getKey(), new a(null, true));
                    g();
                }
            }
        }
        onMediaSettingsChanged(getMediaSettings());
        e();
        if (this.D.size() != 0 || (eventListener = this.m) == null) {
            return;
        }
        eventListener.onTopologyCreated(this);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionFingerprintChanged(PeerConnectionClient peerConnectionClient, long j) {
        CallParticipant.ParticipantId a = a(peerConnectionClient, this.D);
        if (a == null) {
            a = a(peerConnectionClient, this.E);
        }
        if (a != null) {
            CallParticipant participant = getParticipant(a);
            CallTopology.EventListener eventListener = this.m;
            if (eventListener == null || participant == null) {
                return;
            }
            eventListener.onFingerprintChanged(this, participant, j);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceCandidate(@NonNull PeerConnectionClient peerConnectionClient, @NonNull IceCandidate iceCandidate) {
        if (this.Q) {
            return;
        }
        trace("onPeerConnectionIceCandidate, " + this + ", " + peerConnectionClient);
        CallParticipant.ParticipantId a = a(peerConnectionClient, this.E);
        trace("sendIceCandidateRequest, participant=" + a + ", candidate=" + iceCandidate);
        try {
            this.w.send(SignalingProtocol.createRequestTransmitData(a, iceCandidate));
        } catch (JSONException unused) {
            this.e.logException(getTag(), "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceCandidatesRemoved(@NonNull PeerConnectionClient peerConnectionClient, @NonNull IceCandidate[] iceCandidateArr) {
        trace("onPeerConnectionIceCandidatesRemoved, " + this + ", " + peerConnectionClient);
        CallParticipant.ParticipantId a = a(peerConnectionClient, this.E);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(a);
        trace(sb.toString());
        try {
            this.w.send(SignalingProtocol.createRequestTransmitData(a, iceCandidateArr));
        } catch (JSONException unused) {
            this.e.logException(getTag(), "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionIceConnectionChange(@NonNull PeerConnectionClient peerConnectionClient, @NonNull PeerConnection.IceConnectionState iceConnectionState) {
        trace("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + peerConnectionClient);
        a(peerConnectionClient, iceConnectionState);
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyIceConnectionChange(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            stopConnectivityControl();
            this.a.removeCallbacks(this.X);
            if (this.O) {
                this.K.maybeNotifyTopologyUpgradeStatEvent(new TopologyChangedEvent.Timeouted.SuccessConnection(this.t));
                this.a.postDelayed(this.X, this.d.getTimeouts().getNoDataTimeout());
            }
            this.s = this.n.getMsSinceBoot();
            this.O = false;
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionLocalDescription(@NonNull PeerConnectionClient peerConnectionClient, @NonNull SessionDescription sessionDescription) {
        CallTopology.EventListener eventListener;
        trace("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + peerConnectionClient);
        CallParticipant.ParticipantId a = a(peerConnectionClient, this.E);
        CallParticipant participant = getParticipant(a);
        if (participant == null) {
            this.e.logException(getTag(), "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            a aVar = (a) this.I.get(a);
            if (aVar == null) {
                throw new IllegalStateException();
            }
            aVar.d = false;
            aVar.e = true;
        } else {
            a aVar2 = (a) this.H.get(a);
            if (aVar2 == null) {
                throw new IllegalStateException();
            }
            aVar2.d = false;
            aVar2.e = true;
        }
        trace("sendOfferAnswerRequest, participant=" + a + ", sdp type=" + sessionDescription.type.canonicalForm());
        boolean e0 = this.d.getExperiments().e0();
        PcapLabelConfig a2 = ((rs90) this.V).a();
        this.w.send(SignalingProtocol.createRequestTransmitData(a, sessionDescription, this.Q, a2 == null ? null : a2.a, e0 ? 1 : 0));
        if (sessionDescription.type != type2 || (eventListener = this.m) == null) {
            return;
        }
        eventListener.onTopologyOfferCreated(this, participant, sessionDescription);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRemoteDescription(@NonNull PeerConnectionClient peerConnectionClient, @NonNull SessionDescription sessionDescription) {
        trace("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + peerConnectionClient);
        CallParticipant.ParticipantId a = a(peerConnectionClient, this.E);
        if (sessionDescription.type != SessionDescription.Type.OFFER || this.H.get(a) == null) {
            return;
        }
        peerConnectionClient.createAnswer();
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRemoteVideoTrackAdded(@NonNull PeerConnectionClient peerConnectionClient, @NonNull String str) {
        trace("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + peerConnectionClient);
        CallParticipant participant = getParticipant(a(peerConnectionClient, this.E));
        if (participant == null || participant.getParticipantId() == null) {
            warn(this + ": participant not found for " + MiscHelper.identity2(peerConnectionClient));
            return;
        }
        this.F.put(participant.getParticipantId(), str);
        CallParticipant.ParticipantId participantId = participant.getParticipantId();
        if (this.A.isEnabled()) {
            Map<CallVideoTrackParticipantKey, List<VideoSink>> remoteVideoRenderers = this.A.getRemoteVideoRenderers(participantId);
            for (CallVideoTrackParticipantKey callVideoTrackParticipantKey : remoteVideoRenderers.keySet()) {
                List<VideoSink> list = remoteVideoRenderers.get(callVideoTrackParticipantKey);
                if (list != null) {
                    peerConnectionClient.setRemoteVideoRenderers(str, callVideoTrackParticipantKey, list);
                }
            }
        }
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyRemoteVideoTrackAdded(this, participant, str);
        }
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionRenegotiationNeeded(@NonNull PeerConnectionClient peerConnectionClient) {
        trace("onPeerConnectionRenegotiationNeeded, " + this + ", " + peerConnectionClient);
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionSignalingState(@NonNull PeerConnectionClient peerConnectionClient, @NonNull PeerConnection.SignalingState signalingState) {
        trace("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + peerConnectionClient);
        CallParticipant participant = getParticipant(a(peerConnectionClient, this.E));
        if (participant != null) {
            this.G.a(participant, peerConnectionClient);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionSignalingStateChanged(signalingState);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, boolean z) {
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyPeerConnectionChange(this, peerConnectionState);
        }
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onPeerConnectionStateChanged(peerConnectionState, z);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onRemoteCandidateReceived(String str) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onRemoteCandidateReceived(str);
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onRemoteSdpReceived(SessionDescription.Type type) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onRemoteSdpReceived(type);
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public void onResponse(@NonNull JSONObject jSONObject) throws JSONException {
        String sb;
        String string = jSONObject.getString("notification");
        string.getClass();
        switch (string) {
            case "custom-data":
                BadNetworkIndicatorConfig badNetworkIndicatorConfig = this.d.getBadNetworkIndicatorConfig();
                BadNetworkIndicatorConfig.DebugLoggingConfig debugLoggingConfig = badNetworkIndicatorConfig.getDebugLoggingConfig();
                boolean dcReportNetworkStatEnabled = badNetworkIndicatorConfig.getSignalingConfig().getDcReportNetworkStatEnabled();
                P2PNetworkStatusReporter p2PNetworkStatusReporter = this.N;
                if (!dcReportNetworkStatEnabled || p2PNetworkStatusReporter == null) {
                    StringBuilder sb2 = new StringBuilder("enabled && reporter != null = ");
                    sb2.append(dcReportNetworkStatEnabled);
                    sb2.append(" && ");
                    sb2.append(p2PNetworkStatusReporter != null);
                    sb = sb2.toString();
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk");
                        if (optJSONObject2 == null) {
                            sb = "no sdk";
                        } else if (optJSONObject2.optString("type").equals(BadConnectionSignaling.TYPE_BAD_NET)) {
                            p2PNetworkStatusReporter.submitBitrate(optJSONObject2.optDouble(BadConnectionSignaling.KEY_BAD_NET_BITRATE));
                            sb = "received bad-net: " + optJSONObject2;
                        } else {
                            sb = "type != bad-net";
                        }
                    } else {
                        sb = "no data";
                    }
                }
                debugLoggingConfig.log(this.e, getTag(), "handleCustomDataNotification: " + sb);
                break;
            case "transmitted-data":
                a(jSONObject);
                break;
            case "participant-joined":
                this.Z = true;
                break;
        }
    }

    @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        Call.PeerConnectionEventListener peerConnectionEventListener = this.P;
        if (peerConnectionEventListener != null) {
            peerConnectionEventListener.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void pinParticipant(@NonNull CallParticipant.ParticipantId participantId, @NonNull SessionRoomId sessionRoomId, boolean z, Signaling.Listener listener) {
        try {
            this.w.send(SignalingProtocol.createRequestPinParticipant(participantId, sessionRoomId, z), listener);
        } catch (JSONException unused) {
            this.e.logException(getTag(), "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void prepareOffer() {
        if (this.S) {
            this.T = true;
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void release() {
        warn(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages(null);
        this.w.removeNotificationListener(this);
        for (PeerConnectionClient peerConnectionClient : this.D.values()) {
            peerConnectionClient.setEventListener(null);
            peerConnectionClient.release();
        }
        for (PeerConnectionClient peerConnectionClient2 : this.E.values()) {
            peerConnectionClient2.setEventListener(null);
            peerConnectionClient2.release();
        }
        this.D.clear();
        this.E.clear();
        this.F.clear();
        this.G.a.clear();
        this.H.clear();
        this.I.clear();
        P2PNetworkStatusReporter p2PNetworkStatusReporter = this.N;
        if (p2PNetworkStatusReporter != null) {
            p2PNetworkStatusReporter.stop();
        }
        super.release();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void requestStats(@NonNull StatsCallback statsCallback) {
        MiscHelper.throwIfNotMainThread();
        for (Map.Entry entry : this.E.entrySet()) {
            PeerConnectionClient peerConnectionClient = (PeerConnectionClient) entry.getValue();
            final CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) entry.getKey();
            if (statsCallback instanceof ExtendedStatsCallback) {
                final ExtendedStatsCallback extendedStatsCallback = (ExtendedStatsCallback) statsCallback;
                peerConnectionClient.getStats(new StatsCallback() { // from class: xsna.gzm
                    @Override // ru.ok.android.webrtc.topology.StatsCallback
                    public final void onStatsReady(StatsCallback.Stats stats) {
                        DirectCallTopology.this.a(participantId, extendedStatsCallback, stats);
                    }
                });
            } else {
                peerConnectionClient.getStats(statsCallback);
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public boolean setIceServers(List<PeerConnection.IceServer> list) {
        trace("setIceServers, " + this);
        if (!super.setIceServers(list)) {
            return false;
        }
        this.u.trace("dct.setIceServers");
        List<PeerConnection.IceServer> iceServers = getIceServers();
        if (!this.S) {
            Iterator it = this.E.values().iterator();
            while (it.hasNext()) {
                ((PeerConnectionClient) it.next()).setConfig(iceServers);
            }
            return true;
        }
        for (PeerConnectionClient peerConnectionClient : this.D.values()) {
            if (!peerConnectionClient.isReady() && !peerConnectionClient.isCreationScheduled()) {
                this.u.trace("dct.pc.requested");
                peerConnectionClient.createPeerConnection(iceServers);
            }
        }
        return true;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        trace("setRemoteVideoRenderers, " + this + ", " + callVideoTrackParticipantKey);
        MiscHelper.throwIfNotMainThread();
        PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.E.get(callVideoTrackParticipantKey.getParticipantId());
        if (peerConnectionClient == null) {
            warn("peer connection not found for " + callVideoTrackParticipantKey);
            return;
        }
        String str = (String) this.F.get(callVideoTrackParticipantKey.getParticipantId());
        if (!TextUtils.isEmpty(str)) {
            if (!a0 && str == null) {
                throw new AssertionError();
            }
            peerConnectionClient.setRemoteVideoRenderers(str, callVideoTrackParticipantKey, list);
            return;
        }
        warn(this + ": video track not found for " + callVideoTrackParticipantKey);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void setUseP2PRelay(boolean z) {
        this.Q = z;
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            ((PeerConnectionClient) it.next()).setIsP2PRelayEnabled(z);
        }
        Iterator it2 = this.E.values().iterator();
        while (it2.hasNext()) {
            ((PeerConnectionClient) it2.next()).setIsP2PRelayEnabled(z);
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public String toString() {
        return super.toString() + ", p2p_relay=" + isP2PRelayEnabled();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void unhold(final Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
        sendHoldRequest(false, null, new Consumer() { // from class: xsna.fzm
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                DirectCallTopology.this.a(consumer, (Void) obj);
            }
        }, consumer2);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void updatePeerVideoSettings(PeerVideoSettings peerVideoSettings) {
        Iterator it = this.E.entrySet().iterator();
        while (it.hasNext()) {
            PeerConnectionClient peerConnectionClient = (PeerConnectionClient) ((Map.Entry) it.next()).getValue();
            if (peerConnectionClient != null) {
                peerConnectionClient.setPeerVideoSettings(peerVideoSettings);
                return;
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        CallParticipant.ParticipantId participantId = callVideoTrackParticipantKey.getParticipantId();
        PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.D.get(participantId);
        if (peerConnectionClient == null) {
            peerConnectionClient = (PeerConnectionClient) this.E.get(participantId);
        }
        if (peerConnectionClient == null) {
            return null;
        }
        return peerConnectionClient.getTrackVideoKeyMapper().webrtcTrackIdByKey(callVideoTrackParticipantKey);
    }

    public final /* synthetic */ void a(final CallParticipant.ParticipantId participantId, final StatsCallback statsCallback, final StatsCallback.Stats stats) {
        final RTCStat transform = this.U.transform(stats);
        this.a.post(new Runnable() { // from class: xsna.izm
            @Override // java.lang.Runnable
            public final void run() {
                DirectCallTopology.this.a(stats, transform, participantId, statsCallback);
            }
        });
    }

    public final void a(StatsCallback.Stats stats, RTCStat rTCStat, CallParticipant.ParticipantId participantId, StatsCallback statsCallback) {
        List<Ssrc> list;
        ExtendedStatsCallback extendedStatsCallback = (ExtendedStatsCallback) statsCallback;
        Ssrc[] ssrcArr = (rTCStat == null || (list = rTCStat.ssrcs) == null) ? new Ssrc[0] : (Ssrc[]) list.toArray(new Ssrc[0]);
        ExtendedStatsCallback.MediaTrackMapping[] mediaTrackMappingArr = new ExtendedStatsCallback.MediaTrackMapping[ssrcArr.length];
        CallParticipant participant = getParticipant(participantId);
        for (int i = 0; i < ssrcArr.length; i++) {
            mediaTrackMappingArr[i] = ExtendedStatsCallback.MediaTrackMapping.forCallParticipant(ssrcArr[i].direction == Ssrc.Direction.RECV ? participant : getCurrentUserParticipant());
        }
        extendedStatsCallback.onStatsReady(new ExtendedStatsCallback.ExtendedStats(stats, rTCStat, ssrcArr, mediaTrackMappingArr, Collections.EMPTY_MAP, this));
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, CallParticipant.ParticipantId participantId, StatsObserver statsObserver) {
        StatsObserver.MediaTrackMapping[] mediaTrackMappingArr = new StatsObserver.MediaTrackMapping[statsReportArr2.length];
        CallParticipant currentUserParticipant = getCurrentUserParticipant();
        CallParticipant participant = getParticipant(participantId);
        for (int i = 0; i < statsReportArr2.length; i++) {
            if (statsReportArr2[i].id.endsWith(StatsObserver.SUFFIX_RECEIVE)) {
                mediaTrackMappingArr[i] = StatsObserver.MediaTrackMapping.forCallParticipant(participant);
            } else {
                mediaTrackMappingArr[i] = StatsObserver.MediaTrackMapping.forCallParticipant(currentUserParticipant);
            }
        }
        statsObserver.onComplete(statsReportArr, statsReportArr2, mediaTrackMappingArr, Collections.EMPTY_MAP, this);
    }

    public final /* synthetic */ void a(Consumer consumer, Void r5) {
        for (CallParticipant callParticipant : getParticipants()) {
            if (!callParticipant.isOnHold) {
                this.D.put(callParticipant.getParticipantId(), a());
            }
        }
        if (this.Z) {
            createOffers(true);
        }
        consumer.accept(null);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(@NonNull CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
    }

    public final PeerConnectionClient a() {
        debug("> createPeerConnectionClient, " + this);
        PeerConnectionClient build = new PeerConnectionClient.Builder().setSharedPeerConnectionFactory(this.B).setLocalMediaStreamSource(this.g).setExecutor(this.C).setContext(this.z).setRtcLog(this.e).setCallParams(this.d).setForceRelayPolicy(this.Y).setMappingProcessor(this.J).setWebRTCCodecFilteringEnabled(this.d.isWebRTCCodecFilteringEnabled()).setWebRTCAudioCodecs(this.d.getWebRTCAudioCodecs()).setWebRTCVideoCodecs(this.d.getWebRTCVideoCodecs()).setH265Prioritized(this.d.getExperiments().e0()).setNonOpusRemovalEnabled(this.d.getExperiments().F()).setAnimojiReceiver(this.y.makeReceiver()).setAnimojiSender(this.y.makeSender(null)).setAnimojiChannelBehavior(this.y.getBehavior()).setTimeProvider(this.n).setIceTransportsType(PeerConnection.IceTransportsType.NOHOST).setIceCandidatesPoolSize(this.d.getExperiments().i()).setVpnPreference(this.d.getExperiments().t()).setScreenCapturePermissionProvider(this.r).setPeerConnectionEventListener(this).setSimulcastEnabled(false).setCallTimings(this.u).setCropAndScaleParamsProvider(this.v).build();
        build.setEventListener(this);
        build.createPeerConnectionFactory();
        debug("< createPeerConnectionClient, " + this);
        return build;
    }

    @Override // ru.ok.android.webrtc.PeerConnectionClient.EventListener
    public void onPeerConnectionAudioTrackAddEvent(PeerConnectionClient peerConnectionClient, String str) {
    }

    public final void a(JSONObject jSONObject) {
        CallParticipant.ParticipantId extractParticipantIdFromAny = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
        CallParticipant participant = getParticipant(extractParticipantIdFromAny);
        if (participant == null) {
            this.e.reportException(getTag(), "transmitted.data.npe", new Exception("td.unknown.participant.in.p2p"));
            return;
        }
        SessionDescription createSdp = SignalingProtocol.createSdp(jSONObject.getJSONObject("data").optJSONObject("sdp"));
        if (createSdp != null) {
            onRemoteSdpReceived(createSdp.type);
            if (createSdp.type == SessionDescription.Type.ANSWER) {
                a aVar = (a) this.I.get(extractParticipantIdFromAny);
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder("no.scheduled.offer.found");
                    if (this.H.get(extractParticipantIdFromAny) != null) {
                        sb.append(".but.answer.found");
                    }
                    this.e.logException(getTag(), "answer.invariant", new Exception(sb.toString()));
                    return;
                }
                if (!aVar.e) {
                    this.e.logException(getTag(), "direct.topology.no.offer.for.answer", new Exception("offer.is.not.ready.yet"));
                    return;
                }
                if (aVar.c == null) {
                    Peer createPeerFromParent = SignalingProtocol.createPeerFromParent(jSONObject);
                    if (createPeerFromParent != null) {
                        aVar.a.put(createPeerFromParent, createSdp);
                        a(participant);
                        return;
                    } else {
                        error("sdp=" + jSONObject);
                        this.e.logException(getTag(), "direct.topology.bad.sdp", new Exception("bad.sdp.answer.from.participant"));
                        return;
                    }
                }
                error("Answer was already applied from " + participant);
                return;
            }
            return;
        }
        idz0 idz0Var = this.G;
        PeerConnectionClient peerConnectionClient = (PeerConnectionClient) this.E.get(extractParticipantIdFromAny);
        RTCLog rTCLog = idz0Var.b;
        HashMap hashMap = idz0Var.a;
        rTCLog.log("IceCandidatesHandler", "handleTransmittedData, " + participant);
        Peer createPeerFromParent2 = SignalingProtocol.createPeerFromParent(jSONObject);
        if (createPeerFromParent2 == null) {
            idz0Var.b.log("IceCandidatesHandler", "No peer specified for " + participant);
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        IceCandidate createIceCandidate = SignalingProtocol.createIceCandidate(jSONObject2.optJSONObject("candidate"));
        List<IceCandidate> createIceCandidates = SignalingProtocol.createIceCandidates(jSONObject2.optJSONArray(SignalingProtocol.KEY_ICE_REMOVED_CANDIDATES));
        if (createIceCandidate == null && createIceCandidates == null) {
            return;
        }
        if (createIceCandidate != null) {
            a(createIceCandidate);
        }
        Map map = (Map) hashMap.get(participant);
        if (map == null) {
            map = new HashMap();
            hashMap.put(participant, map);
        }
        Pair pair = (Pair) map.get(createPeerFromParent2);
        if (pair == null) {
            pair = new Pair(new ArrayList(), new ArrayList());
            map.put(createPeerFromParent2, pair);
        }
        if (createIceCandidate != null) {
            ((List) pair.i()).add(createIceCandidate);
        }
        if (createIceCandidates != null) {
            ((List) pair.j()).addAll(createIceCandidates);
        }
        idz0Var.a(participant, peerConnectionClient);
    }

    public final /* synthetic */ void a(IceCandidate iceCandidate) {
        String str;
        if (iceCandidate == null || (str = iceCandidate.sdp) == null) {
            return;
        }
        onRemoteCandidateReceived(str);
    }

    public final void a(CallParticipant callParticipant) {
        SessionDescription sessionDescription;
        trace("maybeProcessRemoteAnswers, for " + callParticipant);
        if (!callParticipant.isCallAccepted()) {
            warn(callParticipant + " still not accepted call");
            return;
        }
        a aVar = (a) this.I.get(callParticipant.getParticipantId());
        if (aVar == null || !aVar.e || (sessionDescription = (SessionDescription) aVar.a.get(callParticipant.getAcceptedCallPeer())) == null) {
            return;
        }
        info("Found answer for " + callParticipant + ", peerid=" + callParticipant.getAcceptedCallPeer().getId() + ", apply it");
        aVar.c = sessionDescription;
        aVar.a.clear();
        ((PeerConnectionClient) this.E.get(callParticipant.getParticipantId())).setRemoteDescription(sessionDescription);
    }

    public final void a(PeerConnectionClient peerConnectionClient, PeerConnection.IceConnectionState iceConnectionState) {
        trace("maybeRestart, " + this);
        if (!isActive()) {
            warn(this + ": is not active yet");
            return;
        }
        if (!NetworkMonitor.isOnline()) {
            warn("No net connectivity");
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            debug(peerConnectionClient + " has " + iceConnectionState + " state");
            if (peerConnectionClient.isReady() && peerConnectionClient.isStable()) {
                a aVar = (a) this.I.get(a(peerConnectionClient, this.E));
                if (aVar == null || aVar.d) {
                    return;
                }
                if (this.d.getExperiments().d() && !isP2PRelayEnabled()) {
                    warn("Ice failed, wait until recover");
                    return;
                }
                if (this.d.getExperiments().e() && !isP2PRelayEnabled()) {
                    warn("Ice failed, restart " + peerConnectionClient);
                    peerConnectionClient.restartIce();
                    return;
                }
                warn("Ice failed, restart with offer" + peerConnectionClient);
                aVar.d = true;
                aVar.e = false;
                aVar.c = null;
                aVar.a.clear();
                peerConnectionClient.createOffer(true);
                return;
            }
            warn(peerConnectionClient + " not ready or not stable");
        }
    }

    public final void a(BadNetworkIndicatorConfig badNetworkIndicatorConfig) {
        BadNetworkIndicatorConfig.DebugLoggingConfig debugLoggingConfig = this.d.getBadNetworkIndicatorConfig().getDebugLoggingConfig();
        P2PNetworkStatusReporter p2PNetworkStatusReporter = this.N;
        if (p2PNetworkStatusReporter != null) {
            p2PNetworkStatusReporter.stop();
        }
        P2PNetworkStatusReporter create = P2PNetworkStatusReporter.create(badNetworkIndicatorConfig, this.e, new cvh(this, 3), new v53(11, this, debugLoggingConfig));
        this.N = create;
        if (create != null) {
            create.start(io.reactivex.rxjava3.android.schedulers.a.b());
        }
    }

    public final /* synthetic */ s3q0 a(StatsCallback statsCallback) {
        requestStats(statsCallback);
        return s3q0.a;
    }

    public final /* synthetic */ s3q0 a(BadNetworkIndicatorConfig.DebugLoggingConfig debugLoggingConfig, Double d) {
        Collection<CallParticipant> participants = getParticipants();
        HashMap hashMap = new HashMap(participants.size());
        Iterator<CallParticipant> it = participants.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next().getParticipantId(), Float.valueOf(d.floatValue()));
        }
        hashMap.put(getCurrentUserParticipant().getParticipantId(), Float.valueOf(d.floatValue()));
        NetworkStatusNotification networkStatusNotification = new NetworkStatusNotification(hashMap);
        debugLoggingConfig.log(this.e, getTag(), "send 'virtual' NetworkStatusNotification: " + networkStatusNotification);
        this.L.onNotificationReceived(networkStatusNotification);
        return s3q0.a;
    }

    public static CallParticipant.ParticipantId a(PeerConnectionClient peerConnectionClient, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() == peerConnectionClient) {
                return (CallParticipant.ParticipantId) entry.getKey();
            }
        }
        return null;
    }
}
