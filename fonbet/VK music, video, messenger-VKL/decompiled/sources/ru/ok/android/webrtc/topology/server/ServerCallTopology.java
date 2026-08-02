package ru.ok.android.webrtc.topology.server;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.EglBase;
import org.webrtc.PeerConnection;
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
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver;
import ru.ok.android.webrtc.codecs.CodecListEstimator;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener;
import ru.ok.android.webrtc.listeners.collection.CallListenersCollection;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationController;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.visible.VisibleParticipantsFactory;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.commands.ReportNetworkStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatResponse;
import ru.ok.android.webrtc.protocol.commands.RequestAsrCommand;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.ServerCallCapabilities;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.ExtendedStatsCallback;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import ru.ok.android.webrtc.topology.server.layout.DiffDisplayLayouts;
import ru.ok.android.webrtc.topology.server.layout.DisplayLayouts;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.adz;
import xsna.bin0;
import xsna.fc9;
import xsna.gav;
import xsna.wc2;
import xsna.xm8;

/* loaded from: classes9.dex */
public final class ServerCallTopology extends CallTopology implements Signaling.Listener {
    public long A;
    public long B;
    public final UnifiedPeerConnection C;
    public final VisibleParticipantsFactory D;
    public final DiffDisplayLayouts E;
    public final WebRTCToInternalStatsMapper F;
    public final ServerCallCapabilities G;
    public final PreferencesHelper y;
    public final DelayedVideoRendererSource z;

    public static final class Builder {
        public Call.PeerConnectionEventListener A;
        public CallTimings C;
        public WebRTCToInternalStatsMapper D;
        public CropAndScaleParamsProvider E;
        public bin0 F;
        public SharedPeerConnectionFactory a;
        public LocalMediaStreamSource b;
        public DelayedVideoRendererSource c;
        public ExecutorService d;
        public Context e;
        public EglBase f;
        public MutableMediaSettings g;
        public CallParticipants h;
        public Signaling i;
        public CallParams m;
        public CodecListEstimator n;
        public RTCLog o;
        public FirstDataStat p;
        public PreferencesHelper q;
        public MappingProcessor s;
        public AnimojiCore t;
        public CallListenersCollection u;
        public MediaAdaptationController v;
        public ScreenshareFirstFrameStat w;
        public TimeProvider x;
        public ScreenCapturePermissionProvider y;
        public CallTopology.EventListener z;
        public final ArrayList j = new ArrayList();
        public final ArrayList k = new ArrayList();
        public final ArrayList l = new ArrayList();
        public boolean r = false;
        public boolean B = false;

        public Builder addAsrPackageListener(@NonNull AsrOnlineReceiver.Listener listener) {
            this.l.add(listener);
            return this;
        }

        public Builder addCommandsListener(@NonNull RtcCommandExecutor.Listener listener) {
            this.j.add(listener);
            return this;
        }

        public Builder addNotificationsListener(@NonNull RtcNotificationReceiver.Listener listener) {
            this.k.add(listener);
            return this;
        }

        @NonNull
        public ServerCallTopology build() {
            if (this.e == null || this.h == null || this.g == null || this.i == null || this.m == null || this.o == null || this.f == null || this.c == null || this.b == null || this.s == null || this.u == null || this.x == null || this.C == null || this.D == null) {
                throw new IllegalStateException();
            }
            return new ServerCallTopology(this);
        }

        public Builder setAnimojiCore(AnimojiCore animojiCore) {
            this.t = animojiCore;
            return this;
        }

        public Builder setCallListenersCollection(CallListenersCollection callListenersCollection) {
            this.u = callListenersCollection;
            return this;
        }

        public Builder setCallParams(@NonNull CallParams callParams) {
            this.m = callParams;
            return this;
        }

        public Builder setCallParticipants(@NonNull CallParticipants callParticipants) {
            this.h = callParticipants;
            return this;
        }

        public Builder setCallTimings(CallTimings callTimings) {
            this.C = callTimings;
            return this;
        }

        public Builder setCodecListEstimator(@NonNull CodecListEstimator codecListEstimator) {
            this.n = codecListEstimator;
            return this;
        }

        public Builder setContext(@NonNull Context context) {
            this.e = context;
            return this;
        }

        public Builder setCropAndScaleParamsProvider(CropAndScaleParamsProvider cropAndScaleParamsProvider) {
            this.E = cropAndScaleParamsProvider;
            return this;
        }

        public Builder setEglBase(@NonNull EglBase eglBase) {
            this.f = eglBase;
            return this;
        }

        public Builder setEventListener(CallTopology.EventListener eventListener) {
            this.z = eventListener;
            return this;
        }

        public Builder setExecuterService(ExecutorService executorService) {
            this.d = executorService;
            return this;
        }

        public Builder setFirstDataStat(@NonNull FirstDataStat firstDataStat) {
            this.p = firstDataStat;
            return this;
        }

        public Builder setIsMeInWaitingRoom(bin0<Boolean> bin0Var) {
            this.F = bin0Var;
            return this;
        }

        public Builder setLocalMediaStreamSource(@NonNull LocalMediaStreamSource localMediaStreamSource) {
            this.b = localMediaStreamSource;
            return this;
        }

        public Builder setMappingProcessor(MappingProcessor mappingProcessor) {
            this.s = mappingProcessor;
            return this;
        }

        public Builder setMediaAdaptationController(MediaAdaptationController mediaAdaptationController) {
            this.v = mediaAdaptationController;
            return this;
        }

        public Builder setMediaSettings(@NonNull MutableMediaSettings mutableMediaSettings) {
            this.g = mutableMediaSettings;
            return this;
        }

        public Builder setPeerConnectionEventListener(Call.PeerConnectionEventListener peerConnectionEventListener) {
            this.A = peerConnectionEventListener;
            return this;
        }

        public Builder setPreferencesHelper(PreferencesHelper preferencesHelper) {
            this.q = preferencesHelper;
            return this;
        }

        public Builder setRestart(boolean z) {
            this.r = z;
            return this;
        }

        public Builder setRtcLogger(@NonNull RTCLog rTCLog) {
            this.o = rTCLog;
            return this;
        }

        public Builder setScreenCapturePermissionProvider(@Nullable ScreenCapturePermissionProvider screenCapturePermissionProvider) {
            this.y = screenCapturePermissionProvider;
            return this;
        }

        public Builder setScreenshareFirstFrameStat(ScreenshareFirstFrameStat screenshareFirstFrameStat) {
            this.w = screenshareFirstFrameStat;
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

        public Builder setSkipRequestReallocEnabled(boolean z) {
            this.B = z;
            return this;
        }

        public Builder setTimeProvider(@NonNull TimeProvider timeProvider) {
            this.x = timeProvider;
            return this;
        }

        public Builder setVideoRendererSource(@NonNull DelayedVideoRendererSource delayedVideoRendererSource) {
            this.c = delayedVideoRendererSource;
            return this;
        }

        public Builder setWebRTCToInternalStatsMapper(WebRTCToInternalStatsMapper webRTCToInternalStatsMapper) {
            this.D = webRTCToInternalStatsMapper;
            return this;
        }

        public boolean skipRequestReallocEnabled() {
            return this.B;
        }
    }

    public ServerCallTopology(Builder builder) {
        super(builder.h, builder.g, builder.m, builder.o, builder.p, builder.b, builder.u, builder.v, builder.y, builder.x, builder.C, builder.E, builder.i, builder.F);
        int i;
        trace(this + " ctor");
        this.z = builder.c;
        PreferencesHelper preferencesHelper = builder.q;
        this.y = preferencesHelper;
        this.m = builder.z;
        this.w.addNotificationListener(this);
        this.D = new VisibleParticipantsFactory();
        CodecListEstimator codecListEstimator = builder.n;
        AnimojiCore animojiCore = builder.t;
        int maxH264DecoderInstancesSupported = codecListEstimator.getMaxH264DecoderInstancesSupported();
        if (this.d.isVideoTracksCountEnabled()) {
            int videoTracksCount = this.d.getVideoTracksCount();
            this.e.log("ServerCallTopology", "video tracks count enabled: " + videoTracksCount);
            i = videoTracksCount;
        } else {
            this.e.log("ServerCallTopology", "video tracks count disabled");
            i = 0;
        }
        ServerCallCapabilities serverCallCapabilities = new ServerCallCapabilities(maxH264DecoderInstancesSupported, (this.d.getDisablePerfReport() || !preferencesHelper.containsEstimatedPerfIndex()) ? null : Integer.valueOf(preferencesHelper.getEstimatedPerfIndex()), this.d.getProducerCommandDataChannelVersion(), this.d.isConsumerReapplyEnabled(), this.d.isOnDemandTracksEnabled(), this.d.isDataChannelScreenshareRecvEnabled(), this.d.isDataChannelScreenshareSendEnabled(), animojiCore != null, this.d.getAnimojiDataChannelVersion(), this.d.getExperiments().v(), i, this.d.isAsrOnlineEnabled(), this.d.isFastScreenCaptureEnabled(), this.d.isDeviceAudioShareEnabled(), this.d.getExperiments().h().h());
        this.G = serverCallCapabilities;
        UnifiedPeerConnection unifiedPeerConnection = new UnifiedPeerConnection(builder, this, serverCallCapabilities);
        this.C = unifiedPeerConnection;
        this.F = builder.D;
        this.E = new DiffDisplayLayouts(builder.o, unifiedPeerConnection);
    }

    public final /* synthetic */ void a() {
        if (isActive()) {
            this.C.handleConnectivityControlTimeout();
        }
    }

    public void dispatchPeerConnectionAudioTrackAddEvent(PeerConnectionClient peerConnectionClient, String str) {
        if (str == null || !str.endsWith("audio-mix") || this.m == null) {
            return;
        }
        debug("audio-mix enabled");
    }

    public void dispatchPeerConnectionRemoteVideoTrackAdded(PeerConnectionClient peerConnectionClient, String str) {
        trace("onPeerConnectionRemoteVideoTrackAdded, " + this + ", client=" + peerConnectionClient + ", track=" + str);
        CallParticipant.ParticipantId participantIdFromVideoTrackId = SignalingProtocol.participantIdFromVideoTrackId(str);
        CallParticipant participant = participantIdFromVideoTrackId != null ? getParticipant(participantIdFromVideoTrackId) : null;
        if (participant == null || participant.getParticipantId() == null) {
            error("Cant find participant  for " + str + " video track, " + peerConnectionClient);
            return;
        }
        CallParticipant.ParticipantId participantId = participant.getParticipantId();
        if (this.z.isEnabled()) {
            Map<CallVideoTrackParticipantKey, List<VideoSink>> remoteVideoRenderers = this.z.getRemoteVideoRenderers(participantId);
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

    public void dispatchTopologyIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyIceConnectionChange(this, iceConnectionState);
        }
    }

    public void dispatchTopologyPeerConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyPeerConnectionChange(this, peerConnectionState);
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public Runnable getConnectivityControlRunnable() {
        if (this.d.getTimeouts().getNoPeerConnectionTimeoutMs() > 0) {
            return new wc2(this, 15);
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @Nullable
    public DisplayLayouts getDisplayLayouts() {
        return this.E;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public Topology getIdentity() {
        return Topology.SERVER;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @Nullable
    public Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStats() {
        return this.C.getScreenshareRecvStats();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void getStats(@NonNull StatsObserver statsObserver) {
        this.C.getStats(new xm8(this, statsObserver));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public String getTag() {
        return "ServerCallTopology";
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void grantRoles(@NonNull CallParticipant.ParticipantId participantId, @NonNull List<CallParticipant.Role> list, boolean z, Signaling.Listener listener) {
        try {
            this.w.send(SignalingProtocol.createRequestGrantRoles(participantId, list, z), listener);
        } catch (JSONException unused) {
            this.e.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void handleStateChanged(int i) {
        trace("handleStateChanged, " + this + ", state = " + CallTopology.getStateAsString(i));
        int state = getState();
        if (state == 0) {
            warn("disable processing signaling replies in " + CallTopology.getStateAsString(i) + " state");
            this.w.removeNotificationListener(this);
            return;
        }
        if (state == 1) {
            debug("enable processing signaling replies in " + CallTopology.getStateAsString(i) + " state");
            this.w.addNotificationListener(this);
            this.C.handleTopologyStateChanged(i);
            return;
        }
        if (state != 2) {
            return;
        }
        warn("disable processing signaling replies in " + CallTopology.getStateAsString(i) + " state");
        this.w.removeNotificationListener(this);
        this.C.handleTopologyStateChanged(i);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void hold(Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
        this.C.deallocProducer();
        sendHoldRequest(true, null, consumer, consumer2);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        return this.C.keyByWebrtcTrackId(str);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(@NonNull CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
        onActiveParticipantsRemoved(new CallActiveSessionRoomParticipantsListener.RemovedParams(updatedParams.getOldParticipants(), Collections.EMPTY_LIST, updatedParams.getMe()));
        onActiveParticipantsAdded(new CallActiveSessionRoomParticipantsListener.AddedParams(updatedParams.getNewParticipants(), updatedParams.getNewParticipants(), updatedParams.getMe()));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(@NonNull CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
        trace("onCallParticipantsRemoved, " + removedParams.getRemovedParticipants().size());
        for (CallParticipant callParticipant : removedParams.getRemovedParticipants()) {
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            if (participantId != null) {
                this.C.clearRemoteVideoRenderersForParticipantId(participantId);
            }
            CallParticipant.ParticipantId participantId2 = callParticipant.getParticipantId();
            if (participantId2 != null) {
                this.E.removeDisplayLayoutsForParticipant(participantId2);
            }
        }
    }

    public void onAllPeerConnectionsReady() {
        trace("resendDisplayLayouts, " + this);
        this.C.onVisibleSetChanged(this.D.createFromDisplayLayout(this.E.getLatestDisplayLayouts()));
        this.E.resendLatestDisplayLayouts();
        CallTopology.EventListener eventListener = this.m;
        if (eventListener != null) {
            eventListener.onTopologyCreated(this);
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.MutableMediaSettings.EventListener
    public void onMediaSettingsChanged(@NonNull MutableMediaSettings mutableMediaSettings) {
        this.C.handleMediaSettingsChanged(mutableMediaSettings);
    }

    public void onPeerConnectionCreated(PeerConnectionClient peerConnectionClient) {
        trace("handlePeerConnectionCreated, " + peerConnectionClient);
        onMediaSettingsChanged(getMediaSettings());
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public void onResponse(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("notification");
        if (!SignalingProtocol.isProducerUpdatedNotify(string)) {
            if (SignalingProtocol.isConsumerAnsweredNotify(string)) {
                this.C.handleConsumerAnsweredNotify(jSONObject);
                return;
            }
            return;
        }
        this.C.handleProducerUpdatedNotify(jSONObject);
        trace("resendDisplayLayouts, " + this);
        this.C.onVisibleSetChanged(this.D.createFromDisplayLayout(this.E.getLatestDisplayLayouts()));
        this.E.resendLatestDisplayLayouts();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener
    public void onVideoQualityUpdate(@NonNull CallVideoQualityUpdateListener.VideoQualityUpdateParams videoQualityUpdateParams) {
        this.C.onVideoQualityUpdate(videoQualityUpdateParams.getData());
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void pinParticipant(@NonNull CallParticipant.ParticipantId participantId, @NonNull SessionRoomId sessionRoomId, boolean z, Signaling.Listener listener) {
        try {
            this.w.send(SignalingProtocol.createRequestPinParticipant(participantId, sessionRoomId, z), listener);
        } catch (JSONException unused) {
            this.e.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    public void reallocProducer() {
        this.C.reallocProducer();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void release() {
        warn(this + " release");
        this.a.removeCallbacksAndMessages(null);
        this.w.removeNotificationListener(this);
        this.C.release();
        super.release();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void reportNetworkStat(long j, long j2) {
        ReportNetworkStatCommand reportNetworkStatCommand = new ReportNetworkStatCommand(j, j2);
        this.d.getBadNetworkIndicatorConfig().getDebugLoggingConfig().log(this.e, "ServerCallTopology", "send report-network-stat: " + reportNetworkStatCommand);
        this.C.getCommandExecutor().execute(reportNetworkStatCommand);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void reportStats(@NonNull RTCStat rTCStat) {
        List<Ssrc.VideoRecv> incomingVideo = SsrcUtils.incomingVideo(rTCStat.ssrcs);
        if (incomingVideo.isEmpty()) {
            return;
        }
        Ssrc.VideoRecv videoRecv = incomingVideo.get(0);
        CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
        if (firstActiveConnection != null) {
            List ssrcForConnection = SsrcUtils.ssrcForConnection(incomingVideo, firstActiveConnection);
            if (!ssrcForConnection.isEmpty()) {
                videoRecv = (Ssrc.VideoRecv) ssrcForConnection.get(0);
            }
        }
        if (this.d.getDisablePerfReport()) {
            return;
        }
        long j = videoRecv.framesDecoded;
        if (j == this.A && videoRecv.framesReceived == this.B) {
            return;
        }
        long j2 = videoRecv.framesReceived;
        if (j2 <= 0 || j <= 0) {
            return;
        }
        this.A = j;
        this.B = j2;
        this.C.getCommandExecutor().execute(new ReportPerfStatCommand(j2, j), new adz(this, 11));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void requestAsrDataChannel(boolean z) {
        this.C.getCommandExecutor().execute(new RequestAsrCommand(z));
        this.C.setAsrEnabled(z);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void requestStats(@NonNull StatsCallback statsCallback) {
        if (isActive()) {
            if (!(statsCallback instanceof ExtendedStatsCallback)) {
                this.C.getStats(statsCallback);
            } else {
                final ExtendedStatsCallback extendedStatsCallback = (ExtendedStatsCallback) statsCallback;
                this.C.getStats(new StatsCallback() { // from class: xsna.oni0
                    @Override // ru.ok.android.webrtc.topology.StatsCallback
                    public final void onStatsReady(StatsCallback.Stats stats) {
                        ServerCallTopology.this.a(extendedStatsCallback, stats);
                    }
                });
            }
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        this.C.setRemoteVideoRenderers(callVideoTrackParticipantKey, list);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void unhold(Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
        sendHoldRequest(false, this.G, consumer, consumer2);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void updateDisplayLayout(@NonNull List<CallDisplayLayoutItem> list) {
        trace("updateDisplayLayouts, " + this);
        this.E.updateDisplayLayouts(list);
        this.C.onVisibleSetChanged(this.D.createFromDisplayLayout(list));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void updatePeerVideoSettings(PeerVideoSettings peerVideoSettings) {
        this.C.onPeerVideoSettingsChange(peerVideoSettings);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        return this.C.webrtcTrackIdByKey(callVideoTrackParticipantKey);
    }

    public final void a(StatsObserver statsObserver, StatsReport[] statsReportArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type) && "ssrc".equals(statsReport.type)) {
                StatsReport.Value[] valueArr = statsReport.values;
                int length = valueArr.length;
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i < length) {
                        StatsReport.Value value = valueArr[i];
                        if (StatsObserver.KEY_TRACK_ID.equals(value.name)) {
                            String str = value.value;
                            if (str != null && str.endsWith("audio-mix")) {
                                arrayList2.add(new a(null, true, false));
                                arrayList.add(statsReport);
                                break;
                            }
                            CallParticipant.ParticipantId participantIdFromTrackId = SignalingProtocol.participantIdFromTrackId(value.value);
                            LocalMediaStreamSource localMediaStreamSource = this.g;
                            LocalMediaStreamSource.LocalMediaStream mediaStream = localMediaStreamSource != null ? localMediaStreamSource.getMediaStream() : null;
                            if (participantIdFromTrackId != null) {
                                arrayList2.add(new a(participantIdFromTrackId, false, false));
                                arrayList.add(statsReport);
                                break;
                            }
                            String str2 = value.value;
                            if (str2 != null && mediaStream != null && str2.startsWith(mediaStream.getStreamId())) {
                                arrayList2.add(new a(null, false, true));
                                arrayList.add(statsReport);
                                break;
                            }
                        } else if (StatsObserver.KEY_MEDIA_TYPE.equals(value.name) && "audio".equals(value.value)) {
                            z = true;
                        } else if ("packetsReceived".equals(value.name)) {
                            z2 = true;
                        }
                        if (z && z2) {
                            arrayList2.add(new a(null, true, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        this.a.post(new fc9(1, arrayList2, this, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), statsObserver));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(@NonNull CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(@NonNull CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology, ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(@NonNull CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, List list, StatsObserver statsObserver) {
        CallParticipant participant;
        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStats = getScreenshareRecvStats();
        StatsObserver.MediaTrackMapping[] mediaTrackMappingArr = new StatsObserver.MediaTrackMapping[statsReportArr2.length];
        for (int i = 0; i < statsReportArr2.length; i++) {
            a aVar = (a) list.get(i);
            if (aVar.b) {
                mediaTrackMappingArr[i] = StatsObserver.MediaTrackMapping.forAudioMix();
            } else {
                if (aVar.c) {
                    participant = getCurrentUserParticipant();
                } else {
                    participant = getParticipant(aVar.a);
                }
                mediaTrackMappingArr[i] = StatsObserver.MediaTrackMapping.forCallParticipant(participant);
            }
        }
        statsObserver.onComplete(statsReportArr, statsReportArr2, mediaTrackMappingArr, screenshareRecvStats, this);
    }

    public final void a(final StatsCallback statsCallback, final StatsCallback.Stats stats) {
        final ArrayList arrayList = new ArrayList();
        final RTCStat transform = this.F.transform(stats);
        if (transform != null || transform.ssrcs != null) {
            for (Ssrc ssrc : transform.ssrcs) {
                boolean z = ssrc.mediaType == Ssrc.MediaType.AUDIO;
                boolean z2 = ssrc.direction == Ssrc.Direction.RECV;
                if (!ssrc.trackId.endsWith("audio-mix") && (!z || !z2)) {
                    CallParticipant.ParticipantId participantIdFromTrackId = SignalingProtocol.participantIdFromTrackId(ssrc.trackId);
                    if (participantIdFromTrackId != null) {
                        arrayList.add(new Pair(ssrc, new a(participantIdFromTrackId, false, false)));
                    } else {
                        LocalMediaStreamSource localMediaStreamSource = this.g;
                        if (localMediaStreamSource != null && localMediaStreamSource.getMediaStream() != null && this.g.getMediaStream().getStreamId() != null && ssrc.trackId.startsWith(this.g.getMediaStream().getStreamId())) {
                            arrayList.add(new Pair(ssrc, new a(null, false, true)));
                        }
                    }
                } else {
                    arrayList.add(new Pair(ssrc, new a(null, true, false)));
                }
            }
        }
        this.a.post(new Runnable() { // from class: xsna.nni0
            @Override // java.lang.Runnable
            public final void run() {
                ServerCallTopology.this.a(stats, transform, arrayList, statsCallback);
            }
        });
    }

    public final void a(StatsCallback.Stats stats, RTCStat rTCStat, List list, StatsCallback statsCallback) {
        CallParticipant participant;
        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStats = getScreenshareRecvStats();
        ExtendedStatsCallback extendedStatsCallback = (ExtendedStatsCallback) statsCallback;
        ExtendedStatsCallback.MediaTrackMapping[] mediaTrackMappingArr = new ExtendedStatsCallback.MediaTrackMapping[list.size()];
        Ssrc[] ssrcArr = new Ssrc[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            Ssrc ssrc = (Ssrc) pair.i();
            a aVar = (a) pair.j();
            if (aVar.b) {
                mediaTrackMappingArr[i] = ExtendedStatsCallback.MediaTrackMapping.forAudioMix();
                ssrcArr[i] = ssrc;
            } else {
                if (aVar.c) {
                    participant = getCurrentUserParticipant();
                } else {
                    participant = getParticipant(aVar.a);
                }
                mediaTrackMappingArr[i] = ExtendedStatsCallback.MediaTrackMapping.forCallParticipant(participant);
                ssrcArr[i] = ssrc;
            }
        }
        extendedStatsCallback.onStatsReady(new ExtendedStatsCallback.ExtendedStats(stats, rTCStat, ssrcArr, mediaTrackMappingArr, screenshareRecvStats, this));
    }

    public final void a(ReportPerfStatCommand reportPerfStatCommand, ReportPerfStatResponse reportPerfStatResponse) {
        Integer num = reportPerfStatResponse.estimatedPerformanceIndex;
        if (num != null) {
            this.y.putEstimatedPerfIndex(num.intValue());
        }
    }
}
