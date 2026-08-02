package ru.ok.android.webrtc;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.dto.common.ImageSizeKey;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.DumpCallback;
import org.webrtc.DumpSource;
import org.webrtc.EglBase;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SessionDescription;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import ru.ok.android.annotation.CallExperimentalApi;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.SignalingErrors;
import ru.ok.android.webrtc.SimpleVideoCaptureFactory;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;
import ru.ok.android.webrtc.api.CallApiService;
import ru.ok.android.webrtc.asr.CallAsrRecordManager;
import ru.ok.android.webrtc.asr_online.CallAsrOnlineManager;
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver;
import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.cid.CidExtKt;
import ru.ok.android.webrtc.codecs.CodecListEstimator;
import ru.ok.android.webrtc.connection.BadConnectionCallback;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.di.factory.AnimojiCoreFactory;
import ru.ok.android.webrtc.di.factory.CallSessionRoomsManagerFactory;
import ru.ok.android.webrtc.di.factory.SignalingNotificationHandlersFactory;
import ru.ok.android.webrtc.di.factory.StatListenerManagerFactory;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.android.webrtc.events.destroy.CallEndInfoHolder;
import ru.ok.android.webrtc.events.destroy.HangupReasonMapper;
import ru.ok.android.webrtc.events.destroy.SignalingCallEndMapper;
import ru.ok.android.webrtc.hangup.HangupParameters;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.listeners.CallListenersImpl;
import ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener;
import ru.ok.android.webrtc.listeners.collection.CallListenersCollection;
import ru.ok.android.webrtc.listeners.proxy.CallOptionChangedListenerProxy;
import ru.ok.android.webrtc.log.CallCodecLogger;
import ru.ok.android.webrtc.media_options.CallMediaOptionsChangeVerifier;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;
import ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender;
import ru.ok.android.webrtc.media_settings.ThrottledMediaSettingsSender;
import ru.ok.android.webrtc.mediaadaptation.DelegatingNetworkConditionProvider;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationController;
import ru.ok.android.webrtc.mediaadaptation.StatBasedNetworkStateProvider;
import ru.ok.android.webrtc.mediamodifiers.MediaModifiers;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.android.webrtc.notification.SignalingNotificationLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.Peer;
import ru.ok.android.webrtc.participant.current.CurrentParticipantMediaChangedReporter;
import ru.ok.android.webrtc.participant.talking.OwnTalkingReporter;
import ru.ok.android.webrtc.participant.talking.VoiceAudioLevelListener;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParams;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsPage;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsParser;
import ru.ok.android.webrtc.protocol.impl.utils.RtcCommandExecutorLogger;
import ru.ok.android.webrtc.protocol.impl.utils.RtcNotificationReceiverLogger;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.notifications.handlers.RtcNotificationHandlers;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.record.CallRecordManager;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.CallSessionRooms;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.GetRoomsCommand;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingBuilder;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.hangup.SignalingHangupReason;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettingsCreator;
import ru.ok.android.webrtc.signaling.notification.SignalingNotificationHandlers;
import ru.ok.android.webrtc.signaling.parser.SignalingParsers;
import ru.ok.android.webrtc.signaling.participant.GetParticipantListChunkCommand;
import ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor;
import ru.ok.android.webrtc.signaling.util.UtilsKt;
import ru.ok.android.webrtc.stat.MediaStat;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.StatsReportHandler;
import ru.ok.android.webrtc.stat.call.CallStatisticsLogger;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.data.FirstDataStatCallParticipantsListener;
import ru.ok.android.webrtc.stat.ice.IceCandidateAddFailedEvent;
import ru.ok.android.webrtc.stat.ice.IceCandidateGatheringFailedEvent;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;
import ru.ok.android.webrtc.stereo.CallStereoRoom;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.DummyCallTopology;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import ru.ok.android.webrtc.utils.BadConnectionProcessor;
import ru.ok.android.webrtc.utils.CallFeasibilityStatusExtKt;
import ru.ok.android.webrtc.utils.CodeBlockDurationLogger;
import ru.ok.android.webrtc.utils.Condition;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.HangupInfo;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.PeerVideoSettingsAdapter;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.utils.TopologyProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.TimeProviderExtKt;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.a19;
import xsna.a72;
import xsna.b8;
import xsna.bin0;
import xsna.cq;
import xsna.e8;
import xsna.gav;
import xsna.go9;
import xsna.gs2;
import xsna.h20;
import xsna.ht7;
import xsna.i09;
import xsna.iw3;
import xsna.izs;
import xsna.ls2;
import xsna.m09;
import xsna.m7;
import xsna.mm6;
import xsna.na;
import xsna.p09;
import xsna.p31;
import xsna.qq4;
import xsna.qs90;
import xsna.rc4;
import xsna.s3q0;
import xsna.s4;
import xsna.sb;
import xsna.vv4;
import xsna.w09;
import xsna.wv4;
import xsna.yi2;
import xsna.zr;
import xsna.zx;
import xsna.zy;

/* loaded from: classes9.dex */
public final class Call implements CallState, CallTopology.EventListener, LocalMediaStreamSource.EventListener, NetworkMonitor.NetworkObserver, TopologyUpgradeStatEventListener {
    public final ArrayList A;
    public final CallWaitingRoomParticipantsParser A0;
    public UserMediaSettingsChangeListener B;
    public final CodeBlockDurationLogger B0;
    public boolean C;
    public final ThrottledMediaSettingsSender C0;
    public boolean D;
    public final SignalingMediaSettingsCreator D0;
    public boolean E;
    public final StatListenerManager E0;
    public boolean F;
    public final CallStatisticsLogger F0;
    public final Condition G;
    public final SignalingParsers G0;
    public final Condition H;
    public final SignalingNotificationHandlers H0;
    public final BadConnectionProcessor I;
    public final RtcNotificationHandlers I0;
    public final boolean J;
    public final CallListenersImpl J0;
    public boolean K;
    public final CallSessionRooms K0;
    public boolean L;
    public final CallSessionRoomsManager L0;
    public boolean M;
    public final Lazy M0;
    public OnConnectedListener N;
    public final FirstDataStat N0;
    public final PeerVideoSettingsAdapter O;
    public final boolean O0;
    public PeerConnectionEventListener P;
    public final DelegatingNetworkConditionProvider P0;
    public boolean Q;
    public StatBasedNetworkStateProvider Q0;
    public Consumer R;
    public final CallStereoRoom R0;
    public final Lazy S;
    public final OwnTalkingReporter S0;
    public long T;
    public volatile boolean T0;
    public final c U;
    public final CallCodecLogger U0;
    public final d V;
    public volatile boolean V0;
    public final StatsReportHandler W;
    public final CallApiService W0;
    public final SharedPeerConnectionFactory X;
    public final CallTimings X0;
    public final SharedLocalMediaStreamSource Y;
    public final WebRTCToInternalStatsMapper Y0;
    public final SimpleVideoCaptureFactory Z;
    public final CropAndScaleParamsProvider Z0;
    public boolean a;
    public final LocalMediaPermissionProvider a0;
    public final qs90 a1;
    public final Lazy<CallAsrOnlineManager> asrOnlineManager;
    public final Lazy<CallAsrRecordManager> asrRecordManager;
    public NoiseSuppressorActiveState b;
    public final PreferencesHelper b0;
    public boolean b1;
    public final ExecutorService c;
    public final CallParticipants c0;
    public PeerVideoSettings c1;
    public final CallEndInfoHolder callEndInfoHolder;
    public CallTerminatingException callFinishReason;
    public final ExecutorService d;
    public final CopyOnWriteArraySet d0;
    public PeerVideoSettings d1;
    public final DelayedVideoRendererSource delayedVideoRendererSource;
    public final CallOpenGLRenderer displayRenderer;
    public final CopyOnWriteArraySet e0;
    public final a e1;
    public boolean f0;
    public Signaling.ConnectionListener g;
    public CallTopology g0;
    public final CallFlags h;
    public final TopologyProvider h0;
    public CallTopology i0;
    public final boolean initialVideoEnabled;
    public DelayedVideoRendererSource j0;

    @Nullable
    public String joinLink;
    public Signaling k;
    public volatile CustomDataListener k0;
    public final l l;
    public boolean l0;
    public final RTCLog logger;
    public final Context m;
    public final MutableMediaSettings m0;
    public final ExperimentsInterface n;
    public final MediaModifiers n0;
    public final int numberOfCameras;
    public String o;
    public boolean o0;
    public boolean p;
    public final MappingProcessor p0;
    public final CallParams params;
    public final EnumSet q;
    public final AnimojiCore q0;
    public boolean r;
    public final AnimojiDataSupplierInterface r0;
    public final Lazy<CallRecordManager> recordManager;
    public HangupReason rejectReason;
    public final EglBase rootEglBase;
    public boolean s;
    public final TimeProvider s0;
    public boolean shouldRate;
    public final boolean t;
    public final ScreenCapturePermissionProvider t0;
    public final ConversationIdProvider u;
    public int u0;
    public long v;
    public CallParticipant.ParticipantId v0;
    public long w;
    public List w0;
    public boolean x;
    public volatile boolean x0;
    public boolean y;
    public final CallMediaOptionsDelegate y0;
    public List z;
    public final Lazy z0;
    public final Signaling.Listener e = new Signaling.Listener() { // from class: xsna.e09
        @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
        public final void onResponse(JSONObject jSONObject) {
            Call.this.e(jSONObject);
        }
    };
    public final Signaling.Listener f = new Signaling.Listener() { // from class: xsna.f09
        @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
        public final void onResponse(JSONObject jSONObject) {
            Call.this.d(jSONObject);
        }
    };
    public final b i = new b(this);
    public final AsrOnlineReceiver.Listener j = new AsrOnlineReceiver.Listener() { // from class: xsna.g09
        @Override // ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver.Listener
        public final void onAsrDataReceived(AsrRecvDataPackage asrRecvDataPackage) {
            Call.this.a(asrRecvDataPackage);
        }
    };

    public interface CustomDataListener {
        void onCustomData(CallParticipant.ParticipantId participantId, JSONObject jSONObject);
    }

    public interface EventListener {
        void onEvent(@NonNull Call call, @NonNull CallEvents callEvents, @Nullable Object obj);
    }

    public enum HandleParticipantAddedResult {
        OK,
        ERROR_STATE_ACCEPTED
    }

    public interface OnConnectedListener {
        void onConnected(@NonNull Call call);
    }

    public enum Option {
        REQUIRE_AUTH_TO_JOIN,
        WAITING_HALL,
        RECURRING,
        FEEDBACK,
        AUDIENCE_MODE,
        ASR,
        WAIT_FOR_ADMIN,
        ADMIN_IS_HERE
    }

    public interface PeerConnectionEventListener {
        void onIceCandidateAddFailed(IceCandidateAddFailedEvent iceCandidateAddFailedEvent);

        void onIceCandidateGatheringFailed(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent);

        void onIceRestart();

        void onLocalCandidateCreated(String str);

        void onLocalSdpCreated(SessionDescription.Type type);

        void onNegotiationError(NegotiationError negotiationError);

        void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState);

        void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState);

        void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, boolean z);

        void onRemoteCandidateReceived(String str);

        void onRemoteSdpReceived(SessionDescription.Type type);

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);
    }

    public interface UserMediaSettingsChangeListener {
        void onMediaChange();
    }

    public Call(@NonNull Context context, @NonNull TimeProvider timeProvider, @NonNull CallListenersImpl callListenersImpl, @NonNull CallSessionRooms callSessionRooms, @NonNull CallParticipants callParticipants, @NonNull CallParams callParams, @NonNull Lazy<CodecListEstimator> lazy, boolean z, boolean z2, @NonNull MutableMediaSettings mutableMediaSettings, @NonNull MediaModifiers mediaModifiers, @NonNull ConversationIdProvider conversationIdProvider, @NonNull RTCLog rTCLog, PreferencesHelper preferencesHelper, boolean z3, @NonNull MappingProcessor mappingProcessor, @NonNull CallWaitingRoomParticipantsParser callWaitingRoomParticipantsParser, @NonNull BadConnectionProcessor badConnectionProcessor, @NonNull CodeBlockDurationLogger codeBlockDurationLogger, @NonNull StatListenerManagerFactory statListenerManagerFactory, @NonNull CallStatisticsLogger callStatisticsLogger, @NonNull DummyCallTopology dummyCallTopology, @NonNull TopologyProvider topologyProvider, @NonNull StatsReportHandler statsReportHandler, @NonNull CallCodecLogger callCodecLogger, @NonNull EglBase eglBase, @NonNull CallOpenGLRenderer callOpenGLRenderer, @NonNull ExecutorService executorService, @NonNull ExecutorService executorService2, @NonNull Condition condition, @NonNull Condition condition2, @NonNull DelegatingNetworkConditionProvider delegatingNetworkConditionProvider, @NonNull SharedPeerConnectionFactory sharedPeerConnectionFactory, @NonNull LocalMediaPermissionProvider localMediaPermissionProvider, @NonNull SimpleVideoCaptureFactory simpleVideoCaptureFactory, @NonNull SharedLocalMediaStreamSource.Builder builder, boolean z4, @NonNull Lazy<SignalingNotificationLogger> lazy2, @NonNull SignalingMediaSettingsCreator signalingMediaSettingsCreator, @NonNull AnimojiCoreFactory animojiCoreFactory, @NonNull AnimojiDataSupplierInterface animojiDataSupplierInterface, @NonNull CallMediaOptionsDelegate callMediaOptionsDelegate, @NonNull SignalingParsers signalingParsers, @NonNull CallSessionRoomsManagerFactory callSessionRoomsManagerFactory, @NonNull SignalingNotificationHandlersFactory signalingNotificationHandlersFactory, @NonNull RtcNotificationHandlers rtcNotificationHandlers, @NonNull Lazy<CallRecordManager> lazy3, @NonNull Lazy<CallAsrRecordManager> lazy4, @NonNull Lazy<CallAsrOnlineManager> lazy5, @NonNull Lazy<ScreenshareFirstFrameStat> lazy6, @NonNull FirstDataStat firstDataStat, @NonNull FirstDataStatCallParticipantsListener firstDataStatCallParticipantsListener, ScreenCapturePermissionProvider screenCapturePermissionProvider, @NonNull OwnTalkingReporter ownTalkingReporter, @NonNull CallEndInfoHolder callEndInfoHolder, int i, CallFlags callFlags, CallApiService callApiService, CallTimings callTimings, WebRTCToInternalStatsMapper webRTCToInternalStatsMapper, @NonNull PeerVideoSettingsAdapter peerVideoSettingsAdapter, @NonNull CropAndScaleParamsProvider cropAndScaleParamsProvider, @NonNull qs90 qs90Var, long j) {
        l lVar = new l(this);
        this.l = lVar;
        this.q = EnumSet.noneOf(Option.class);
        this.x = false;
        this.y = false;
        this.A = new ArrayList();
        this.F = false;
        this.K = true;
        this.L = true;
        this.U = new c(this);
        this.V = new d(this);
        this.delayedVideoRendererSource = new e(this);
        this.d0 = new CopyOnWriteArraySet();
        this.e0 = new CopyOnWriteArraySet();
        this.u0 = 0;
        this.V0 = false;
        this.b1 = false;
        this.e1 = new a(this);
        this.Y0 = webRTCToInternalStatsMapper;
        this.X0 = callTimings;
        this.m = context;
        this.s0 = timeProvider;
        this.J0 = callListenersImpl;
        this.K0 = callSessionRooms;
        this.c0 = callParticipants;
        this.params = callParams;
        this.n = callParams.getExperiments();
        this.S = lazy;
        this.s = z;
        this.t = z2;
        this.m0 = mutableMediaSettings;
        this.n0 = mediaModifiers;
        this.u = conversationIdProvider;
        this.initialVideoEnabled = callFlags.getInitialVideoEnabled();
        this.logger = rTCLog;
        this.b0 = preferencesHelper;
        this.O0 = z3;
        this.p0 = mappingProcessor;
        this.A0 = callWaitingRoomParticipantsParser;
        this.I = badConnectionProcessor;
        this.B0 = codeBlockDurationLogger;
        this.E0 = a(statListenerManagerFactory);
        this.F0 = callStatisticsLogger;
        this.g0 = dummyCallTopology;
        this.h0 = topologyProvider;
        this.W = statsReportHandler;
        this.U0 = callCodecLogger;
        this.rootEglBase = eglBase;
        this.displayRenderer = callOpenGLRenderer;
        this.c = executorService;
        this.d = executorService2;
        this.G = condition;
        this.H = condition2;
        this.P0 = delegatingNetworkConditionProvider;
        this.X = sharedPeerConnectionFactory;
        this.a0 = localMediaPermissionProvider;
        this.Z = simpleVideoCaptureFactory;
        this.Y = builder.setScreenCaptureStateListener(new j(this)).build();
        this.J = z4;
        this.z0 = lazy2;
        this.C0 = new ThrottledMediaSettingsSender(new DiffMediaSettingsSender(new i(this), new h(this), rTCLog, callParams));
        this.D0 = signalingMediaSettingsCreator;
        this.q0 = animojiCoreFactory.createAnimojiCore(this);
        this.r0 = animojiDataSupplierInterface;
        this.y0 = callMediaOptionsDelegate;
        callMediaOptionsDelegate.setSendEventCallback(new ht7(this, 1));
        this.G0 = signalingParsers;
        CallSessionRoomsManager a = a(callSessionRoomsManagerFactory);
        this.L0 = a;
        this.H0 = signalingNotificationHandlersFactory.create(a, new ht7(this, 1));
        this.I0 = rtcNotificationHandlers;
        this.recordManager = lazy3;
        this.asrRecordManager = lazy4;
        this.asrOnlineManager = lazy5;
        this.M0 = lazy6;
        this.N0 = firstDataStat;
        callListenersImpl.addParticipantsListener(firstDataStatCallParticipantsListener);
        this.R0 = new CallStereoRoom(this);
        this.t0 = screenCapturePermissionProvider;
        this.S0 = ownTalkingReporter;
        this.callEndInfoHolder = callEndInfoHolder;
        this.numberOfCameras = i;
        this.h = callFlags;
        this.W0 = callApiService;
        this.O = peerVideoSettingsAdapter;
        this.Z0 = cropAndScaleParamsProvider;
        this.a1 = qs90Var;
        callTimings.trace("call.allocated");
        c();
        callTimings.trace("call.post-allocated");
        if (j > 0) {
            lVar.sendMessageDelayed(Message.obtain(lVar, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE), j);
        }
    }

    public final void a(AsrRecvDataPackage asrRecvDataPackage) {
        this.J0.getAsrOnlineListenerProxy().onAsrDataPackage(asrRecvDataPackage);
    }

    public void addEventListener(EventListener eventListener) {
        this.A.add(eventListener);
    }

    public void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        if (this.d0.add(networkConnectivityListener)) {
            networkConnectivityListener.onNetworkConnectivityChanged(NetworkMonitor.isOnline());
        }
    }

    public void addOption(@NonNull Option option) {
        this.q.add(option);
        a(option);
    }

    @Deprecated
    public void addParticipant(final CallParticipant.ParticipantId participantId, @Nullable Boolean bool, Boolean bool2, final Signaling.Listener listener, final Signaling.Listener listener2) {
        this.logger.log("OKRTCCall", "addParticipant, participant=" + participantId);
        if (b()) {
            try {
                this.k.send(SignalingProtocol.createRequestAddParticipant(participantId, bool, bool2.booleanValue()), new Signaling.Listener() { // from class: xsna.l09
                    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                    public final void onResponse(JSONObject jSONObject) {
                        Call.this.a(participantId, listener, listener2, jSONObject);
                    }
                }, listener2);
            } catch (JSONException e) {
                this.logger.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public void addTopologyChangedListener(@NonNull TopologyChangedListener topologyChangedListener) {
        this.e0.add(topologyChangedListener);
    }

    public final boolean b() {
        if (!this.r) {
            return true;
        }
        this.logger.log("OKRTCCall", "Call is already destroyed, reason=" + this.o);
        return false;
    }

    public final void c() {
        NetworkMonitor.init(this.m);
        final CallStatisticsLogger callStatisticsLogger = this.F0;
        Objects.requireNonNull(callStatisticsLogger);
        this.g = new Signaling.ConnectionListener() { // from class: xsna.o09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.ConnectionListener
            public final void onConnectedStateChanged(boolean z) {
                CallStatisticsLogger.this.onSignalingConnected(z);
            }
        };
        addTopologyChangedListener(this.F0);
        this.F0.getActiveEncodersStats().onCallStarted();
        this.logger.log("OKRTCCall", "Call<init> caller = " + this.s + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        this.U0.logCodecs();
        StringBuilder sb = new StringBuilder();
        sb.append(MiscHelper.identity2(this.rootEglBase));
        sb.append(" was created");
        this.logger.log("OKRTCCall", sb.toString());
        this.logger.log("OKRTCCall", "number of cameras: " + this.numberOfCameras);
        this.Y.addEventListener(this);
        SharedLocalMediaStreamSource sharedLocalMediaStreamSource = this.Y;
        f fVar = new f(this);
        sharedLocalMediaStreamSource.x = fVar;
        if (sharedLocalMediaStreamSource.o != null) {
            sharedLocalMediaStreamSource.o.x = fVar;
        }
        if (this.n.c()) {
            a();
            this.Y.start();
        }
        this.m0.addEventListener(new MutableMediaSettings.EventListener() { // from class: xsna.q09
            @Override // ru.ok.android.webrtc.MutableMediaSettings.EventListener
            public final void onMediaSettingsChanged(MutableMediaSettings mutableMediaSettings) {
                Call.this.a(mutableMediaSettings);
            }
        });
        MutableMediaSettings mutableMediaSettings = this.m0;
        CallParticipants callParticipants = this.c0;
        Objects.requireNonNull(callParticipants);
        mutableMediaSettings.addEventListener(new CurrentParticipantMediaChangedReporter(new b8(callParticipants, 6)));
        AndroidVideoDecoder.errorCallback = new yi2(this, 5);
        NetworkMonitor.getInstance().addObserver(this);
        this.r0.addOnReadyCallback(new zy(this, 12));
        OwnTalkingReporter ownTalkingReporter = this.S0;
        CallParticipants callParticipants2 = this.c0;
        Objects.requireNonNull(callParticipants2);
        ownTalkingReporter.setListener(new mm6(callParticipants2, 4));
        OwnTalkingReporter ownTalkingReporter2 = this.S0;
        Objects.requireNonNull(ownTalkingReporter2);
        registerAudioSampleCallback(new VoiceAudioLevelListener(new e8(ownTalkingReporter2, 5)), 200L);
    }

    public void cancelLocalAudioDump() {
        this.c.execute(new a72(this, 3));
    }

    public void changeHoldState(boolean z, Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
        if (z) {
            a(consumer, consumer2);
        } else {
            b(consumer, consumer2);
        }
    }

    public void connectIfReady() {
        if (b() && !this.T0) {
            this.T0 = true;
            a();
            if (PeerConnectionClient.isEarlyAudioRecordingEnabled() && this.m0.isAudioEnabled()) {
                if (!this.a0.isMicrophonePermissionGranted() && this.a0.update() && this.a0.isMicrophonePermissionGranted()) {
                    this.X.e();
                } else if (PeerConnectionClient.isEarlyAudioRecordingEnabled()) {
                    this.X.e();
                }
                this.X.e(false);
            }
            this.logger.log("OKRTCCall", "createPeerConnectionIfReady");
            MiscHelper.throwIfNotMainThread();
            if (this.D) {
                this.logger.log("OKRTCCall", "   peerConnectionCreated");
            } else {
                if (this.z == null) {
                    throw new IllegalStateException("No ice servers");
                }
                this.logger.log("OKRTCCall", "createPeerConnectionIfReady impl");
                this.D = true;
                this.Q = true;
                a(this.g0, 1);
                if (this.a0.isCameraPermissionGranted()) {
                    b(CallEvents.CAMERA_CHANGED, (Object) null);
                }
            }
            this.logger.log("OKRTCCall", "apply local media settings once connection requested");
            if (!this.n.c()) {
                this.Y.start();
            }
            q();
        }
    }

    public boolean containsInOptions(@NonNull Option option) {
        return this.q.contains(option);
    }

    public void conversationEnded(String str, String str2) {
        a(str, (HangupInfo) null, (HangupReason) null, str2);
    }

    public final void d(JSONObject jSONObject) {
        this.logger.log("OKRTCCall", cq.c("handleSignalingError, ", jSONObject));
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("error");
        String optString3 = jSONObject.optString("reason");
        if ("error".equals(optString)) {
            if ("conversation-ended".equals(optString2) || "conversation-not-found".equals(optString2) || "illegal-conversation-state".equals(optString2) || "no-call".equals(optString2) || ("call-unfeasible".equals(optString2) && Arrays.asList(CallFeasibilityStatus.OLD_VERSION, CallFeasibilityStatus.UNKNOWN_ERROR, CallFeasibilityStatus.UNSUPPORTED).contains(CallFeasibilityStatusExtKt.safeValueOf(jSONObject.optString("status"))))) {
                if (optString3 != null) {
                    this.rejectReason = HangupReason.safeValueOf(optString3);
                    this.callEndInfoHolder.setReason(SignalingCallEndMapper.getCallEndReason(SignalingHangupReason.getFromSignalingKey(optString3), optString2, null));
                }
                conversationEnded("signaling.error." + optString2, optString2);
                return;
            }
            if ("call-unfeasible".equals(optString2)) {
                b(CallEvents.SIGNALING_ERROR, new SignalingErrors.CallIsUnfeasibleError(CallFeasibilityStatusExtKt.safeValueOf(jSONObject.optString("status")), jSONObject.optString("message"), jSONObject.getLong(SignalingProtocol.KEY_STAMP), jSONObject.getLong(SignalingProtocol.KEY_SEQUENCE)));
                return;
            }
            if ("participants-limit-reached".equals(optString2)) {
                a(go9.b("signaling.error.", optString2), (HangupInfo) null, HangupReason.PARTICIPANT_LIMIT_EXCEEDED, optString2);
                return;
            }
            if ("invalid-token".equals(optString2)) {
                this.k.dispose();
                b(CallEvents.INVALID_TOKEN, (Object) null);
                return;
            }
            if ("service-unavailable".equals(optString2)) {
                a(go9.b("signaling.error.", optString2), (HangupInfo) null, HangupReason.SERVICE_UNAVAILABLE, optString2);
                return;
            }
            if ("illegal-participant-state".equals(optString2)) {
                if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(jSONObject.optString("state"))) {
                    b(CallEvents.ACCEPTED_ON_OTHER_DEVICE, (Object) null);
                    destroy("accepted.on.other.device.error", null);
                    return;
                } else {
                    conversationEnded("signaling.error." + optString2, optString2);
                    return;
                }
            }
            if ("conversation-recording".equals(optString2)) {
                Consumer consumer = this.R;
                if (consumer != null) {
                    consumer.accept(jSONObject.optString("description"));
                    return;
                }
                return;
            }
            if ("invalid-request".equals(optString2)) {
                conversationEnded("invalid.request", optString2);
                return;
            }
            if (!SignalingProtocol.ERROR_OBSOLETE_CLIENT.equals(optString2)) {
                this.logger.log("OKRTCCall", go9.b("signaling.error.", optString2));
                return;
            }
            this.rejectReason = HangupReason.OBSOLETE_CLIENT;
            String optString4 = jSONObject.optString(SignalingProtocol.KEY_EXPLANATION_HTML, "");
            String optString5 = jSONObject.optString("code");
            if ("".equals(optString5)) {
                optString5 = jSONObject.optString("errorCode");
            }
            HangupInfo hangupInfo = (optString4.isEmpty() && optString5.isEmpty()) ? null : new HangupInfo(null, optString5, optString4);
            this.callEndInfoHolder.setReason(new ConversationEndReason.ObsoleteClient(optString4, optString5));
            a("signaling.error." + optString2, hangupInfo, (HangupReason) null, optString2);
        }
    }

    public void destroy(String str, @Nullable HangupReason hangupReason) {
        this.logger.log("OKRTCCall", go9.b("destroy.reason=", str));
        MiscHelper.throwIfNotMainThread();
        if (this.r) {
            this.logger.log("OKRTCCall", "   already destroyed, reason=" + this.o);
            return;
        }
        this.r = true;
        this.callEndInfoHolder.setReason(HangupReasonMapper.getCallEndReason(hangupReason, null));
        this.F0.getCallBatteryStatSender().onCallFinished();
        this.F0.getActiveEncodersStats().onCallEnded();
        removeTopologyChangedListener(this.F0);
        CallOpenGLRenderer callOpenGLRenderer = this.displayRenderer;
        if (callOpenGLRenderer != null) {
            callOpenGLRenderer.release();
        }
        this.q0.release();
        NetworkMonitor.getInstance().removeObserver(this);
        this.d0.clear();
        this.e0.clear();
        this.E0.release();
        this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        this.l.removeMessages(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        this.g0.release();
        DelegatingNetworkConditionProvider delegatingNetworkConditionProvider = this.P0;
        if (delegatingNetworkConditionProvider != null) {
            delegatingNetworkConditionProvider.removeEventListener(this.g0);
        }
        this.g0 = new DummyCallTopology(this.c0, this.params, this.logger, this.J0, this.s0, this.X0, this.Z0);
        this.h0.setTopology(new s4(this, 15));
        CallTopology callTopology = this.i0;
        if (callTopology != null) {
            callTopology.release();
            this.i0 = null;
        }
        StatBasedNetworkStateProvider statBasedNetworkStateProvider = this.Q0;
        if (statBasedNetworkStateProvider != null) {
            statBasedNetworkStateProvider.release();
        }
        this.o = str;
        if (this.y) {
            this.v = (SystemClock.elapsedRealtime() - this.w) + this.v;
            this.y = false;
        }
        long j = this.v;
        if (j == 0) {
            this.X0.trace("call.connected.time2.-1");
        } else {
            long j2 = j / 60000;
            this.v = j2;
            this.v = Math.min(j2, 10L);
            this.X0.trace("call.connected.time2." + this.v);
        }
        Signaling signaling = this.k;
        if (signaling != null && this.L) {
            signaling.removeNotificationListener(this.e);
            this.k.removeErrorListener(this.f);
            this.k.removeConnectionListener(this.g);
            this.k.dispose();
            this.k = null;
        }
        this.c0.clear();
        this.c0.release();
        this.Y.setVideoRenderer(null);
        this.Y.release();
        this.Z.release();
        this.X.release();
        this.c.execute(new sb(this, 3));
        b(CallEvents.DESTROYED, (Object) null);
        this.v0 = null;
        this.y0.release();
        this.C0.release();
        this.F0.release();
        this.S0.release();
        AndroidVideoDecoder.errorCallback = null;
        this.U0.release();
    }

    public void dumpLocalAudio(String str) {
        SharedPeerConnectionFactory sharedPeerConnectionFactory = this.X;
        if (sharedPeerConnectionFactory == null) {
            return;
        }
        this.c.execute(new m09(this, sharedPeerConnectionFactory, str));
    }

    public final /* synthetic */ Signaling e() {
        return this.k;
    }

    public final /* synthetic */ Signaling f() {
        return this.k;
    }

    public void fallbackToRtmp() {
        b(CallEvents.RTMP_FALLBACK, (Object) null);
        destroy("rtmp.fallback", null);
    }

    public s3q0 forceP2PRelay() {
        if (this.s && this.g0.is(Topology.DIRECT) && !this.V0) {
            this.V0 = true;
            this.l.post(new p31(this, 2));
        }
        return s3q0.a;
    }

    public void forceServerTopology() {
        this.k.send(SignalingProtocol.createSwitchTopology(SignalingProtocol.TOPOLOGY_SERVER, false));
        o();
    }

    public void forceTopology(String str) {
        this.k.send(SignalingProtocol.createSwitchTopology(str, true));
    }

    public final /* synthetic */ CallTopology g() {
        return this.g0;
    }

    @Override // ru.ok.android.webrtc.CallState
    @Nullable
    public CallRecordDescription getActiveRecording(SessionRoomId sessionRoomId) {
        return this.recordManager.getValue().getRecordInfoProvider().getActiveRecording(sessionRoomId);
    }

    @NonNull
    public Set<CallParticipant.ParticipantId> getAddedParticipantIds() {
        return this.c0.getActiveSessionRoomParticipantIds();
    }

    public AnimojiControl getAnimojiControl() {
        return this.e1;
    }

    public CallEventualStatSender getCallEventualStatSender() {
        return this.F0.getCallEventualStatSender();
    }

    public CallListenersCollection getCallListenersCollection() {
        return this.J0;
    }

    public VideoCapturer getCameraCapturer() {
        return this.Y.getCameraCapturer();
    }

    public CameraStatProvider getCameraStatProvider() {
        return this.Y.getCameraStatProvider();
    }

    @Override // ru.ok.android.webrtc.CallState
    @NonNull
    public CallParticipant getCurrentUserCallParticipant() {
        return this.c0.getCurrentUserParticipant();
    }

    public MutableMediaSettings getCurrentUserMediaSettings() {
        return this.m0;
    }

    @Nullable
    public String getDestroyReason() {
        return this.o;
    }

    @NonNull
    public CallMediaOptionsChangeVerifier getMediaOptionsChangeVerifier() {
        return this.y0;
    }

    @NonNull
    public MediaOptions getMediaOptionsForCall(@NonNull SessionRoomId sessionRoomId) {
        return this.y0.getMediaOptionsForCall(sessionRoomId).toMediaOptions();
    }

    @NonNull
    public MediaOptions getMediaOptionsForCurrentUser() {
        return this.y0.getMediaOptionsForCurrentUser().toMediaOptions();
    }

    public long getMultiPartyChatId() {
        return this.T;
    }

    @Nullable
    public NoiseSuppressorActiveState getNoiseSuppressorState() {
        return this.b;
    }

    @Nullable
    public CallParticipant getOpponent() {
        int size = this.c0.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return this.c0.getActiveSessionRoomParticipants().iterator().next();
        }
        throw new RuntimeException("group call");
    }

    @Nullable
    public CallParticipant.ParticipantId getOpponentIdSafe() {
        List<CallParticipant.ParticipantId> activeParticipantsIds = this.c0.getActiveParticipantsIds();
        if (activeParticipantsIds.size() == 1) {
            return activeParticipantsIds.get(0);
        }
        return null;
    }

    @NonNull
    public CallParams getParams() {
        return this.params;
    }

    public CallParticipant getParticipant(CallParticipant.ParticipantId participantId) {
        return this.c0.getParticipant(participantId);
    }

    public MediaStat getParticipantMediaStat(CallParticipant callParticipant) {
        if (this.r) {
            return null;
        }
        return this.W.getMediaStat(callParticipant);
    }

    @NonNull
    public Collection<CallParticipant> getParticipants() {
        return this.c0.getActiveSessionRoomParticipants();
    }

    @Nullable
    public CallParticipant.ParticipantId getPinnedParticipantId() {
        SessionRoomId activeRoomId = this.c0.getActiveRoomId();
        if (!(activeRoomId instanceof SessionRoomId.Room)) {
            return this.v0;
        }
        SessionRoom sessionRoom = this.K0.getSessionRoom((SessionRoomId.Room) activeRoomId);
        if (sessionRoom == null) {
            return null;
        }
        return sessionRoom.getPinnedParticipantId();
    }

    public Consumer<String> getRecordErrorConsumer() {
        return this.R;
    }

    @Nullable
    public List<CallParticipant.Role> getRoles(@NonNull CallParticipant.ParticipantId participantId) {
        CallParticipant participant = this.c0.getParticipant(participantId);
        if (participant != null) {
            return participant.getRoles();
        }
        return null;
    }

    @Nullable
    public Signaling getSignaling() {
        return this.k;
    }

    @NonNull
    public CallTopology getTopology() {
        return this.g0;
    }

    public int getVideoCaptureState() {
        return this.Y.getVideoCaptureState();
    }

    public void getWaitingRoomParticipants(@Nullable CallWaitingParticipantId callWaitingParticipantId, int i, boolean z, @NonNull final Consumer<CallWaitingRoomParticipantsPage> consumer, @NonNull final Runnable runnable) {
        this.k.send(SignalingProtocol.createWaitingRoomParticipantsList(callWaitingParticipantId, i, z), new Signaling.Listener() { // from class: xsna.z09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                Call.this.a(consumer, runnable, jSONObject);
            }
        }, new a19(runnable, 0));
    }

    public void grantRoles(@NonNull final CallParticipant.ParticipantId participantId, @NonNull final List<CallParticipant.Role> list, final boolean z, @Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        this.g0.grantRoles(participantId, list, z, new Signaling.Listener() { // from class: xsna.j09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                Call.this.a(participantId, z, list, runnable, runnable2, jSONObject);
            }
        });
    }

    public final /* synthetic */ void h() {
        this.l.post(new gs2(this, 3));
    }

    public void hangup(@NonNull HangupParameters hangupParameters) {
        HangupReason reason = hangupParameters.getReason();
        if (reason == null) {
            reason = this.s ? (isAnswered() || !this.h.getStartedAsP2P()) ? HangupReason.HUNGUP : HangupReason.CANCELED : isAnswered() ? HangupReason.HUNGUP : HangupReason.REJECTED;
        }
        a(reason, hangupParameters.isEndCallForAllThroughExternalApiCalled());
    }

    public boolean hasParticipants() {
        return !this.c0.isEmpty();
    }

    public boolean hasRegisteredParticipnats() {
        return this.c0.hasRegisteredPeers();
    }

    public final /* synthetic */ CallTopology i() {
        return this.g0;
    }

    public void init(@NonNull Signaling.Transport transport, @NonNull List<PeerConnection.IceServer> list, @NonNull String str) {
        this.X0.trace("call.init");
        this.logger.log("OKRTCCall", "init");
        MiscHelper.throwIfNotMainThread();
        if (this.C) {
            throw new IllegalStateException("Is already initialized");
        }
        this.C = true;
        SignalingBuilder isCommandMergeEnabled = new SignalingBuilder(transport, this.u).setLogger(this.logger).setMaxRetryCount(this.params.getTimeouts().getSignalingMaxRetryCount()).setMaxRetryTimeout(this.params.getTimeouts().getSignalingMaxRetryTimeout()).setIsFastRecoverEnabled(this.params.isFastRecoverEnabled()).setIsCommandMergeEnabled(this.n.c0());
        ExperimentsInterface experimentsInterface = this.n;
        Signaling build = isCommandMergeEnabled.setMessageInterceptor(experimentsInterface.E() == ExperimentsInterface.EmulatedSignalingError.NONE ? null : new iw3(experimentsInterface.E(), 10)).setSensor(this.n.J() ? new NetworkAvailabilitySensor(this.m, this.logger) : null).setSmartCommandsEnabled(this.n.n()).build();
        this.k = build;
        build.addErrorListener(this.f);
        this.k.addConnectionListener(this.g);
        this.z = list;
        this.logger.log("OKRTCCall", this.c0.size() + " participants");
        if (this.c0.size() > 1) {
            a(Topology.SERVER, false);
        } else if (this.c0.size() == 1) {
            a(Topology.DIRECT, false);
            if (this.s && !this.E) {
                this.g0.prepareOffer();
            }
        }
        this.k.addNotificationListener(this.e);
        if (this.F) {
            setMuted(true);
        }
        if (this.J) {
            this.I.registerCallback(new m(this));
        }
        this.F0.getCallBatteryStatSender().onCallStarted();
    }

    public boolean isAdminHere() {
        return containsInOptions(Option.ADMIN_IS_HERE);
    }

    public boolean isAnswered() {
        return this.s ? this.H.isFired() : this.o0;
    }

    public boolean isAsrAvailable() {
        return containsInOptions(Option.ASR);
    }

    public boolean isAudioMixEnabled() {
        return this.g0.is(Topology.SERVER);
    }

    public boolean isCaller() {
        return this.s;
    }

    public boolean isConcurrent() {
        return this.E;
    }

    public boolean isConditionAccepted() {
        return this.H.isFired();
    }

    public boolean isConnected() {
        return this.y;
    }

    public boolean isDestroyed() {
        return this.r;
    }

    public boolean isFeatureAddParticipantEnabled() {
        return this.l0;
    }

    public boolean isFeedbackEnabled() {
        return containsInOptions(Option.FEEDBACK);
    }

    public boolean isGroupCall() {
        return this.c0.size() > 1;
    }

    public boolean isMeCreatorOrAdmin() {
        return isParticipantCreatorOrAdmin(this.c0.getCurrentUserParticipant());
    }

    public boolean isMeInWaitingRoom() {
        return this.x0;
    }

    public boolean isMuteParticipantsPermitted() {
        return this.a;
    }

    public boolean isMuted() {
        return !this.m0.isAudioEnabled();
    }

    public boolean isMyScreenCaptureEnabled() {
        return this.m0.isScreenCaptureEnabled();
    }

    public boolean isParticipantAdmin(@NonNull CallParticipant callParticipant) {
        Iterator<CallParticipant.Role> it = callParticipant.getRoles().iterator();
        while (it.hasNext()) {
            if (it.next() == CallParticipant.Role.ADMIN) {
                return true;
            }
        }
        return false;
    }

    public boolean isParticipantCreator(@NonNull CallParticipant callParticipant) {
        Iterator<CallParticipant.Role> it = callParticipant.getRoles().iterator();
        while (it.hasNext()) {
            if (it.next() == CallParticipant.Role.CREATOR) {
                return true;
            }
        }
        return false;
    }

    public boolean isParticipantCreatorOrAdmin(@NonNull CallParticipant callParticipant) {
        for (CallParticipant.Role role : callParticipant.getRoles()) {
            if (role == CallParticipant.Role.ADMIN || role == CallParticipant.Role.CREATOR) {
                return true;
            }
        }
        return false;
    }

    public boolean isRecurring() {
        return containsInOptions(Option.RECURRING);
    }

    public boolean isVideoEnabled() {
        return this.m0.isVideoEnabled();
    }

    public boolean isVideoPermissionGranted() {
        if (this.a0.isCameraPermissionGranted()) {
            return true;
        }
        return this.a0.update() && this.a0.isCameraPermissionGranted();
    }

    public boolean isVideoPermittedForCall() {
        return this.y0.getMediaOptionsForCall(this.c0.getActiveRoomId()).getVideoState() == MediaOptionState.UNMUTED;
    }

    public boolean isVideoPermittedForParticipant() {
        return this.y0.getMediaOptionsForCurrentUser().getVideoState() == MediaOptionState.UNMUTED;
    }

    public boolean isWaitForAdminEnabled() {
        return containsInOptions(Option.WAIT_FOR_ADMIN);
    }

    public boolean isWaitingRoomEnabled() {
        return containsInOptions(Option.WAITING_HALL);
    }

    public final void j() {
        try {
            this.logger.log("OKRTCCall", "Releasing " + MiscHelper.identity2(this.rootEglBase));
            this.rootEglBase.release();
            this.logger.log("OKRTCCall", MiscHelper.identity2(this.rootEglBase) + " was released");
        } catch (Exception e) {
            this.logger.reportException("OKRTCCall", "release.egl", e);
        }
    }

    public final /* synthetic */ s3q0 k() {
        b(this.r0);
        return s3q0.a;
    }

    public final /* synthetic */ void l() {
        a(Topology.DIRECT, false);
        a(this.g0, 1);
        this.g0.createOffers(true);
    }

    public final void m() {
        if (this.r) {
            return;
        }
        int videoCaptureState = this.Y.getVideoCaptureState();
        boolean z = true;
        if (videoCaptureState != 2 && videoCaptureState != 1) {
            z = false;
        }
        if (z == this.m0.isVideoEnabled()) {
            return;
        }
        this.logger.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + this.m0.isVideoEnabled() + ") != camera video enabled state (" + z + "). Let us update media settings");
        setVideoEnabled(z);
    }

    public void notifyUpdatePeerVideoSettings() {
        if (this.g0 == null) {
            return;
        }
        PeerVideoSettings applyOverride = (!isMyScreenCaptureEnabled() || this.O0) ? this.O.applyOverride(this.d1) : this.c1;
        if (applyOverride == null) {
            return;
        }
        if (this.g0.isActive()) {
            this.g0.presetVideoSettings(applyOverride);
        } else {
            this.g0.onPeerVideoSettingsChange(applyOverride);
        }
    }

    public final void o() {
        this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        l lVar = this.l;
        lVar.sendMessageDelayed(Message.obtain(lVar, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), this.params.getTimeouts().getTimeoutIceReconnectMillis());
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.l.post(new p09(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onFingerprintChanged(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, long j) {
        this.J0.getFingerprintListenerProxy().onCallParticipantFingerprint(callParticipant, j);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.EventListener
    public void onLocalMediaStreamChanged(@NonNull LocalMediaStreamSource.LocalMediaStream localMediaStream) {
        this.logger.log("OKRTCCall", "onLocalMediaStreamChanged, " + MiscHelper.identity2(localMediaStream));
        this.l.post(new rc4(this, 2));
    }

    @NonNull
    public HandleParticipantAddedResult onParticipantAddedToCall(CallParticipant.ParticipantId participantId, JSONObject jSONObject) throws JSONException {
        CallParticipant addOrUpdate;
        if (jSONObject == null) {
            addOrUpdate = this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(participantId).build(), SessionRoomId.MainCall.INSTANCE);
        } else {
            if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(SignalingProtocol.getParticipantStateFromParticipant(jSONObject))) {
                return HandleParticipantAddedResult.ERROR_STATE_ACCEPTED;
            }
            CallMediaOptionsDelegate callMediaOptionsDelegate = this.y0;
            SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
            addOrUpdate = this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(participantId).setAcceptedCallPeer(SignalingProtocol.createPeerFromParent(jSONObject)).setMediaOptions(callMediaOptionsDelegate.createParticipantMediaOptions(jSONObject, participantId, "onParticipantAddedToCall", callMediaOptionsDelegate.getMediaOptionsForCall(mainCall).toMap(), true)).setMediaSettingsIfNotNull(SignalingProtocol.createMediaSettingsFromParent(jSONObject)).setRoles(SignalingProtocol.createRolesFromParent(jSONObject)).setExternalIdIfNotNull(SignalingProtocol.createExternalIdFromParent(jSONObject)).setMovies(this.G0.movieSharesInfoParser.parseMoviesFromParticipant(jSONObject, mainCall)).setSessionState(SignalingProtocol.getSessionStateFromParticipant(jSONObject)).build(), mainCall);
        }
        this.g0.createOfferFor(addOrUpdate, true);
        return HandleParticipantAddedResult.OK;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyCreated(@NonNull CallTopology callTopology) {
        this.logger.log("OKRTCCall", "handleTopologyCreated, " + callTopology);
        if (this.G.isFired()) {
            return;
        }
        this.G.fire();
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyIceConnectionChange(@NonNull CallTopology callTopology, @NonNull PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.logger.log("OKRTCCall", "handleTopologyIceConnectionChange, " + callTopology + ", state=" + iceConnectionState);
        CallTopology callTopology2 = this.g0;
        if (callTopology != callTopology2) {
            if (callTopology != this.i0) {
                this.logger.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
                return;
            }
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            this.y = true;
            this.K = false;
            this.w = SystemClock.elapsedRealtime();
            b(CallEvents.ICE_CONNECTED, (Object) null);
            this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            if (this.J) {
                this.I.notifyConnectionChanged();
            }
            this.u0 = 0;
            CallTopology callTopology3 = this.i0;
            if (callTopology3 != null) {
                callTopology3.release();
                this.i0 = null;
                return;
            }
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
            if (this.y) {
                this.v = (SystemClock.elapsedRealtime() - this.w) + this.v;
            }
            this.y = false;
            b(CallEvents.ICE_DISCONNECTED, (Object) null);
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            Topology topology = Topology.SERVER;
            if (callTopology2.is(topology) && NetworkMonitor.isOnline() && (i = this.u0) < 3) {
                this.u0 = i + 1;
                a(topology, true);
                a(this.g0, 1);
            }
            this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            boolean is = callTopology.is(Topology.DIRECT);
            if (!(this.joinLink == null && this.T == 0 && this.h.getStartedAsP2P()) && is) {
                return;
            }
            o();
        }
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyOfferCreated(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, @NonNull SessionDescription sessionDescription) {
        this.logger.log("OKRTCCall", "handleTopologyOfferCreated, " + callTopology + ", " + callParticipant + ", sdp=" + sessionDescription.type);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyPeerConnectionChange(@NonNull CallTopology callTopology, @NonNull PeerConnection.PeerConnectionState peerConnectionState) {
        boolean z = peerConnectionState == PeerConnection.PeerConnectionState.CONNECTED;
        this.F0.onPeerConnectionConnected(z);
        if (z) {
            this.F0.reset();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener
    public void onTopologyUpgradeEvent(@NonNull TopologyChangedEvent topologyChangedEvent) {
        this.J0.getTopologyUpgradeListenerProxy().onTopologyUpgradeEvent(topologyChangedEvent);
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyUpgradeProposed(@NonNull CallTopology callTopology) {
        if (callTopology.is(Topology.DIRECT)) {
            this.logger.log("OKRTCCall", "onTopologyUpgradeProposed");
            forceServerTopology();
        }
    }

    public void onUserAnswered() {
        this.logger.log("OKRTCCall", "onUserAnswered");
        if (!this.x0 || (this.R0.isActive() && this.R0.canAnswerRightNow())) {
            this.R0.onUserAnswered();
            boolean z = this.o0;
            this.o0 = true;
            if (b()) {
                this.f0 = true;
                CallParticipant currentUserParticipant = this.c0.getCurrentUserParticipant();
                boolean z2 = !z && currentUserParticipant.isCallAccepted();
                if (currentUserParticipant.isCallAccepted()) {
                    q();
                } else {
                    currentUserParticipant.setCallAccepted();
                    this.c0.notifyCurrentParticipantChanged();
                    p();
                }
                if (z2) {
                    a(this.g0, 1);
                    b(CallEvents.CALL_ACCEPTED, currentUserParticipant);
                }
            }
        }
    }

    public final void p() {
        SignalingMediaSettings create = this.D0.create(this.m0);
        this.C0.setActualSettings(create);
        this.k.send(SignalingProtocol.createAcceptCallCommand(create), new Signaling.Listener() { // from class: xsna.v09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                Call.this.g(jSONObject);
            }
        });
    }

    public boolean permissionsGranted() {
        return this.a0.isAnyPemissionGranted();
    }

    public void pinParticipant(@NonNull final CallParticipant.ParticipantId participantId, final boolean z) {
        final SessionRoomId activeRoomId = this.c0.getActiveRoomId();
        this.g0.pinParticipant(participantId, activeRoomId, z, new Signaling.Listener() { // from class: xsna.k09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                Call.this.a(z, participantId, activeRoomId, jSONObject);
            }
        });
    }

    public void promoteParticipant(final CallParticipant.ParticipantId participantId, boolean z) {
        this.k.send(SignalingProtocol.createPromoteParticipant(participantId, z), new Signaling.Listener() { // from class: xsna.x09
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                Call.this.b(participantId, jSONObject);
            }
        }, this.f);
    }

    public final void q() {
        this.logger.log("OKRTCCall", "sendMediaSettingsChange");
        this.C0.send(this.D0.create(this.m0));
    }

    public void registerAudioEventsListener(SharedPeerConnectionFactory.AudioEventsListener audioEventsListener) {
        this.X.c(audioEventsListener);
    }

    public void registerAudioSampleCallback(@NonNull MicSampleListener micSampleListener, long j) {
        this.X.b(micSampleListener, j);
    }

    public void registerBadConnectionCallback(BadConnectionCallback badConnectionCallback) {
        if (this.J) {
            this.I.registerCallback(badConnectionCallback);
        } else {
            this.logger.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    public void registerStatListener(@NonNull StatisticsListener statisticsListener, int i, TimeUnit timeUnit) {
        this.E0.addStatisticsListener(statisticsListener, i, timeUnit);
    }

    public void removeAudioEventsListener(SharedPeerConnectionFactory.AudioEventsListener audioEventsListener) {
        this.X.d(audioEventsListener);
    }

    public void removeAudioSampleCallback(@NonNull MicSampleListener micSampleListener) {
        this.X.b(micSampleListener);
    }

    public void removeEventListener(EventListener eventListener) {
        this.A.remove(eventListener);
    }

    public void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        this.d0.remove(networkConnectivityListener);
    }

    public void removeOption(@NonNull Option option) {
        this.q.remove(option);
        a(option);
    }

    public void removeParticipant(final CallParticipant.ParticipantId participantId, boolean z) {
        this.logger.log("OKRTCCall", "removeParticipant, participant=" + participantId);
        if (b()) {
            try {
                if (participantId.equals(this.v0)) {
                    this.v0 = null;
                    b(CallEvents.PIN_PARTICIPANT, (Object) null);
                }
                this.k.send(SignalingProtocol.createRequestRemoveParticipant(participantId, z), new Signaling.Listener() { // from class: xsna.r09
                    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                    public final void onResponse(JSONObject jSONObject) {
                        Call.this.c(participantId, jSONObject);
                    }
                });
            } catch (JSONException e) {
                throw new RuntimeException("Remove participant command failed", e);
            }
        }
    }

    public void removeStatListener(@NonNull StatisticsListener statisticsListener) {
        this.E0.removeStatisticsListener(statisticsListener);
    }

    public void removeTopologyChangedListener(@NonNull TopologyChangedListener topologyChangedListener) {
        this.e0.remove(topologyChangedListener);
    }

    public void requestAsr(boolean z) {
        this.g0.requestAsrDataChannel(z);
    }

    public void sendCustomData(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        this.k.send(SignalingProtocol.createCustomData(participantId, jSONObject));
    }

    public void setAudioCaptureEnabled(boolean z) {
        if (b() && this.g0.is(Topology.SERVER)) {
            MediaProjection screenShareMediaProjection = z ? this.Y.getScreenShareMediaProjection(this.m0.isFastScreenCaptureEnabled()) : null;
            if (screenShareMediaProjection != null) {
                this.X.b(this.Y, screenShareMediaProjection);
                if (this.m0.enableAudioSharing(true)) {
                    q();
                    b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
                    return;
                }
                return;
            }
            this.X.b(this.Y);
            if (this.m0.enableAudioSharing(false)) {
                q();
                b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
            }
        }
    }

    public void setAudioPlayoutMuted(boolean z) {
        this.X.d(z);
    }

    public void setConcurrent(boolean z) {
        this.E = z;
    }

    public void setConnectionListener(@Nullable OnConnectedListener onConnectedListener) {
        MiscHelper.throwIfNotMainThread();
        if (!this.p || onConnectedListener == null) {
            this.N = onConnectedListener;
        } else {
            onConnectedListener.onConnected(this);
        }
    }

    public void setCustomDataListener(@Nullable CustomDataListener customDataListener) {
        this.k0 = customDataListener;
        CallTimings callTimings = this.X0;
        StringBuilder sb = new StringBuilder("call.set_cdl(is_null=");
        sb.append(customDataListener == null);
        sb.append(")");
        callTimings.trace(sb.toString());
    }

    public void setDebugMode(boolean z) {
        this.F = z;
    }

    public void setLocalAnimojiRenderers(List<VideoSink> list) {
        CallParticipant.ParticipantId participantId = getCurrentUserCallParticipant().getParticipantId();
        if (participantId == null) {
            return;
        }
        this.q0.setRenderers(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(VideoTrackType.ANIMOJI).build(), list);
    }

    public void setLocalVideoRenderer(VideoSink videoSink) {
        if (b()) {
            this.Y.setVideoRenderer(videoSink);
        }
    }

    public void setLocalVideoRendererKeyed(List<VideoSink> list, VideoTrackType videoTrackType) {
        if (b()) {
            if (videoTrackType == VideoTrackType.VIDEO) {
                this.Y.setVideoRenderer(!list.isEmpty() ? list.get(0) : null);
                return;
            }
            VideoTrackType videoTrackType2 = VideoTrackType.ANIMOJI;
            if (videoTrackType == videoTrackType2) {
                this.q0.setRenderers(new CallVideoTrackParticipantKey.Builder().setParticipantId(getCurrentUserCallParticipant().getParticipantId()).setType(videoTrackType2).build(), list);
            }
        }
    }

    public void setMuted(boolean z) {
        if (b()) {
            if (!z) {
                if (!this.a0.isMicrophonePermissionGranted() && this.a0.update() && this.a0.isMicrophonePermissionGranted()) {
                    this.X.e();
                } else if (PeerConnectionClient.isEarlyAudioRecordingEnabled()) {
                    this.X.e();
                }
            }
            if (this.y0.handleMediaOptionsForSetMuted(z)) {
                this.X.e(z);
                this.m0.enableAudio(!z);
                q();
            }
        }
    }

    public void setNoiseSuppressorParams(@NonNull NoiseSuppressorActiveState noiseSuppressorActiveState) {
        boolean clientsidePlatform = noiseSuppressorActiveState.getClientsidePlatform();
        boolean clientsideAnn = noiseSuppressorActiveState.getClientsideAnn();
        boolean serversideAnn = noiseSuppressorActiveState.getServersideAnn();
        if (this.M) {
            clientsidePlatform |= clientsideAnn;
            serversideAnn |= clientsideAnn;
            clientsideAnn = false;
        }
        this.b = noiseSuppressorActiveState;
        this.logger.log("OKRTCCall", "new debug params " + noiseSuppressorActiveState);
        a(noiseSuppressorActiveState, clientsideAnn, clientsidePlatform);
        this.n0.setDenoise(noiseSuppressorActiveState.getServersideBasic());
        this.n0.setDenoiseAnn(serversideAnn);
        this.k.send(SignalingProtocol.createUpdateMediaModifiers(this.n0));
    }

    public void setPeerConnectionEventListener(@NonNull PeerConnectionEventListener peerConnectionEventListener) {
        this.P = peerConnectionEventListener;
    }

    public void setRecordErrorConsumer(Consumer<String> consumer) {
        this.R = consumer;
    }

    public void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        if (b()) {
            this.g0.setRemoteVideoRenderers(callVideoTrackParticipantKey, list);
            this.q0.setRenderers(callVideoTrackParticipantKey, list);
        }
    }

    public void setScreenCaptureEnabled(boolean z, boolean z2) {
        if (b() && b() && this.y0.handleMediaOptionsForSetScreenCapture(z)) {
            if (this.m0.enableScreenCapture(z, z2)) {
                q();
                b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
            }
            notifyUpdatePeerVideoSettings();
        }
    }

    public void setUserMediaSettingsChangeListener(UserMediaSettingsChangeListener userMediaSettingsChangeListener) {
        this.B = userMediaSettingsChangeListener;
    }

    public void setVideoEnabled(boolean z) {
        if (b()) {
            b(z);
            q();
        }
    }

    public void setVideoRendererSource(DelayedVideoRendererSource delayedVideoRendererSource) {
        if (b()) {
            this.j0 = delayedVideoRendererSource;
            if (delayedVideoRendererSource == null) {
                this.g0.clearRemoteVideoRenderers();
            }
        }
    }

    public void switchCamera(@Nullable CameraParams cameraParams) {
        if (b() && this.a0.isCameraPermissionGranted()) {
            this.logger.log("OKRTCCall", "switchCamera");
            this.Y.switchCamera(cameraParams);
        }
    }

    public Topology topologyIdentity() {
        return this.g0.getIdentity();
    }

    public void unregisterBadConnectionCallback(BadConnectionCallback badConnectionCallback) {
        if (this.J) {
            this.I.unregisterCallback(badConnectionCallback);
        } else {
            this.logger.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    @CallExperimentalApi
    public void updateCameraToggles(izs<CameraToggles, CameraToggles> izsVar) {
        SimpleVideoCaptureFactory.CameraConfigurationProvider cameraConfigurationProvider = this.Z.f;
        synchronized (cameraConfigurationProvider.b) {
            cameraConfigurationProvider.a = izsVar.invoke(cameraConfigurationProvider.a);
        }
    }

    public void updateDisplayLayout(@NonNull List<CallDisplayLayoutItem> list) {
        this.logger.log("OKRTCCall", go9.c("updateDisplayLayout ", list));
        if (b()) {
            this.g0.updateDisplayLayout(list);
            this.q0.updateDisplayLayout(list);
            ((ScreenshareFirstFrameStat) this.M0.getValue()).onDisplayLayouts(list);
        }
    }

    public void updateParticipantInfo(@NonNull CallParticipant.ParticipantId participantId) {
        this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(participantId).build(), SessionRoomId.MainCall.INSTANCE);
    }

    public void updateTalkingParticipants(@NonNull List<CallParticipant.ParticipantId> list) {
        this.c0.setTalkingParticipants(list);
    }

    public final /* synthetic */ void a(MutableMediaSettings mutableMediaSettings) {
        UserMediaSettingsChangeListener userMediaSettingsChangeListener = this.B;
        if (userMediaSettingsChangeListener != null) {
            userMediaSettingsChangeListener.onMediaChange();
        }
        this.F0.getActiveEncodersStats().onVideoEnabled(mutableMediaSettings.isVideoEnabled());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0a61, code lost:
    
        if (r16 != false) goto L199;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:243:0x060d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(JSONObject jSONObject) {
        boolean z;
        String str;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        h(jSONObject);
        this.B0.startMeasure();
        String string = jSONObject.getString("notification");
        string.getClass();
        char c = 65535;
        switch (string.hashCode()) {
            case -1970255734:
                if (string.equals(SignalingProtocol.NOTIFY_PARTICIPANT_ANIMOJI_CHANGED)) {
                    c = 0;
                    break;
                }
                break;
            case -1946759356:
                if (string.equals(SignalingProtocol.NOTIFY_CLOSED_CONVERSATION)) {
                    c = 1;
                    break;
                }
                break;
            case -1837281659:
                if (string.equals(SignalingProtocol.NOTIFY_OPTIONS_CHANGED)) {
                    c = 2;
                    break;
                }
                break;
            case -1824193402:
                if (string.equals(SignalingProtocol.NOTIFY_CUSTOM_DATA)) {
                    c = 3;
                    break;
                }
                break;
            case -1326342510:
                if (string.equals(SignalingProtocol.NOTIFY_CHAT_MESSAGE)) {
                    c = 4;
                    break;
                }
                break;
            case -1230859622:
                if (string.equals(SignalingProtocol.NOTIFY_SESSION_STATE)) {
                    c = 5;
                    break;
                }
                break;
            case -1206103903:
                if (string.equals(SignalingProtocol.NOTIFY_HUNGUP)) {
                    c = 6;
                    break;
                }
                break;
            case -1183787100:
                if (string.equals(SignalingProtocol.NOTIFY_JOIN_LINK_CHANGED)) {
                    c = 7;
                    break;
                }
                break;
            case -1136546043:
                if (string.equals(SignalingProtocol.NOTIFY_RECORD_STARTED)) {
                    c = '\b';
                    break;
                }
                break;
            case -1123680175:
                if (string.equals(SignalingProtocol.NOTIFY_RECORD_STOPPED)) {
                    c = '\t';
                    break;
                }
                break;
            case -1009634793:
                if (string.equals(SignalingProtocol.NOTIFY_REALLOC_CONSUMER)) {
                    c = '\n';
                    break;
                }
                break;
            case -952973404:
                if (string.equals(SignalingProtocol.NOTIFY_ROLES_CHANGED)) {
                    c = 11;
                    break;
                }
                break;
            case -891376444:
                if (string.equals(SignalingProtocol.NOTIFY_ACCEPTED_CALL)) {
                    c = '\f';
                    break;
                }
                break;
            case -855742144:
                if (string.equals(SignalingProtocol.NOTIFY_ROOM_PARTICIPANTS_UPDATED)) {
                    c = '\r';
                    break;
                }
                break;
            case -776083981:
                if (string.equals(SignalingProtocol.NOTIFY_MULTIPARTY_CHAT_CREATED)) {
                    c = 14;
                    break;
                }
                break;
            case -775651618:
                if (string.equals(SignalingProtocol.NOTIFY_CONNECTION)) {
                    c = 15;
                    break;
                }
                break;
            case -615745013:
                if (string.equals(SignalingProtocol.NOTIFY_PARTICIPANTS_STATE_CHANGED)) {
                    c = 16;
                    break;
                }
                break;
            case -555091700:
                if (string.equals(SignalingProtocol.NOTIFY_RATE_CALL_DATA)) {
                    c = 17;
                    break;
                }
                break;
            case -318071351:
                if (string.equals(SignalingProtocol.NOTIFY_DECORATIVE_PARTICIPANT_ID_CHANGED)) {
                    c = 18;
                    break;
                }
                break;
            case -299374874:
                if (string.equals(SignalingProtocol.NOTIFY_ROOMS_UPDATED)) {
                    c = 19;
                    break;
                }
                break;
            case -191501435:
                if (string.equals("feedback")) {
                    c = 20;
                    break;
                }
                break;
            case -130352389:
                if (string.equals(SignalingProtocol.NOTIFY_PIN_PARTICIPANT)) {
                    c = 21;
                    break;
                }
                break;
            case -109284890:
                if (string.equals(SignalingProtocol.NOTIFY_PARTICIPANT_ADDED)) {
                    c = 22;
                    break;
                }
                break;
            case -53726114:
                if (string.equals(SignalingProtocol.NOTIFY_PARTICIPANT_STATE_CHANGED)) {
                    c = 23;
                    break;
                }
                break;
            case -6349260:
                if (string.equals(SignalingProtocol.NOTIFY_ASR_RECORD_STARTED)) {
                    c = 24;
                    break;
                }
                break;
            case 3208383:
                if (string.equals("hold")) {
                    c = 25;
                    break;
                }
                break;
            case 6516608:
                if (string.equals(SignalingProtocol.NOTIFY_ASR_RECORD_STOPPED)) {
                    c = 26;
                    break;
                }
                break;
            case 45361494:
                if (string.equals(SignalingProtocol.NOTIFY_TOPOLOGY_CHANGED)) {
                    c = 27;
                    break;
                }
                break;
            case 65959073:
                if (string.equals(SignalingProtocol.NOTIFY_PROMOTION_APPROVED)) {
                    c = 28;
                    break;
                }
                break;
            case 148230891:
                if (string.equals(SignalingProtocol.NOTIFY_SWITCH_MICRO)) {
                    c = 29;
                    break;
                }
                break;
            case 335380875:
                if (string.equals(SignalingProtocol.NOTIFY_URL_SHARING_INFO_UPDATED)) {
                    c = 30;
                    break;
                }
                break;
            case 378271103:
                if (string.equals("mute-participant")) {
                    c = 31;
                    break;
                }
                break;
            case 540816845:
                if (string.equals(SignalingProtocol.NOTIFY_PEER_REGISTERED)) {
                    c = ' ';
                    break;
                }
                break;
            case 614369236:
                if (string.equals(SignalingProtocol.NOTIFY_TRANSMITTED_DATA)) {
                    c = '!';
                    break;
                }
                break;
            case 778113871:
                if (string.equals(SignalingProtocol.NOTIFY_FORCE_CHANGE_MEDIA_SETTINGS)) {
                    c = '\"';
                    break;
                }
                break;
            case 1037842889:
                if (string.equals(SignalingProtocol.NOTIFY_ROOM_UPDATED)) {
                    c = '#';
                    break;
                }
                break;
            case 1094077426:
                if (string.equals(SignalingProtocol.NOTIFY_FEATURE_SET_CHANGED)) {
                    c = '$';
                    break;
                }
                break;
            case 1128844070:
                if (string.equals(SignalingProtocol.NOTIFY_AUDIO_ACTIVITY)) {
                    c = '%';
                    break;
                }
                break;
            case 1145321190:
                if (string.equals(SignalingProtocol.NOTIFY_SPEAKER_CHANGED)) {
                    c = '&';
                    break;
                }
                break;
            case 1175114531:
                if (string.equals(SignalingProtocol.NOTIFY_PARTICIPANT_JOINED)) {
                    c = '\'';
                    break;
                }
                break;
            case 1323654813:
                if (string.equals(SignalingProtocol.NOTIFY_FEATURES_PER_ROLE_CHANGED)) {
                    c = '(';
                    break;
                }
                break;
            case 1467147485:
                if (string.equals(SignalingProtocol.NOTIFY_STALLED_ACTIVITY)) {
                    c = ')';
                    break;
                }
                break;
            case 1685715486:
                if (string.equals(SignalingProtocol.NOTIFY_CHAT_ROOM_UPDATED)) {
                    c = ImageSizeKey.SIZE_KEY_BASE;
                    break;
                }
                break;
            case 1736968659:
                if (string.equals(SignalingProtocol.NOTIFY_MEDIA_SETTINGS_CHANGED)) {
                    c = '+';
                    break;
                }
                break;
            case 1885175990:
                if (string.equals(SignalingProtocol.NOTIFY_MOVIE_SHARE_STARTED)) {
                    c = ',';
                    break;
                }
                break;
            case 1898041858:
                if (string.equals(SignalingProtocol.NOTIFY_MOVIE_SHARE_STOPPED)) {
                    c = '-';
                    break;
                }
                break;
            case 2022715558:
                if (string.equals(SignalingProtocol.NOTIFY_PROMOTE_PARTICIPANT)) {
                    c = JwtParser.SEPARATOR_CHAR;
                    break;
                }
                break;
            case 2138278323:
                if (string.equals(SignalingProtocol.NOTIFY_SETTINGS_UPDATE)) {
                    c = '/';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                str = "OKRTCCall";
                this.q0.handleParticipantAnimojiChanged(jSONObject);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 1:
                str = "OKRTCCall";
                this.logger.log(str, "handleCloseConversation");
                this.f0 = false;
                String optString = jSONObject.optString("reason");
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        this.rejectReason = HangupReason.safeValueOf(optString);
                    } catch (IllegalArgumentException unused) {
                        this.logger.logException(str, "close.conversation.notify", new Exception(go9.b("close.conversation.notify.unknown.reason.", optString)));
                    }
                }
                this.callEndInfoHolder.setReason(SignalingCallEndMapper.getCallEndReason(SignalingHangupReason.getFromSignalingKey(optString), jSONObject.optString("errorCode"), null));
                b(CallEvents.CONVERSATION_CLOSED, (Object) null);
                destroy("conversation_closed", null);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 2:
                str = "OKRTCCall";
                a(jSONObject.getJSONArray(SignalingProtocol.KEY_OPTIONS));
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 3:
                str = "OKRTCCall";
                c(jSONObject);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 4:
                str = "OKRTCCall";
                this.H0.getChatHandler().handleChatMessageFromObject(jSONObject);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 5:
                str = "OKRTCCall";
                if (!SignalingProtocol.extractParticipantIdFromAny(jSONObject).equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(SignalingProtocol.extractParticipantIdFromAny(jSONObject)).setSessionState(SignalingProtocol.getSessionStateFromParent(jSONObject)).build());
                }
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 6:
                str = "OKRTCCall";
                CallParticipant.ParticipantId extractParticipantIdFromAny = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                if (extractParticipantIdFromAny.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    String string2 = jSONObject.getString("reason");
                    String optString2 = jSONObject.optString(SignalingProtocol.KEY_EXPLANATION_HTML);
                    String optString3 = jSONObject.optString("errorCode");
                    this.logger.log(str, go9.b("We were removed from the conversation, reason = ", string2));
                    this.rejectReason = HangupReason.safeValueOf(string2);
                    this.callEndInfoHolder.setReason(SignalingCallEndMapper.getCallEndReason(SignalingHangupReason.getFromSignalingKey(string2), optString3, optString2));
                    b(CallEvents.PARTICIPANT_HANGUP, new HangupInfo(SignalingProtocol.parseHungupErrors(jSONObject), optString2, optString3));
                    this.x0 = false;
                    destroy("removed", null);
                } else {
                    this.W.exclude(this.c0.getParticipant(extractParticipantIdFromAny));
                    this.c0.remove(extractParticipantIdFromAny);
                    if (extractParticipantIdFromAny.equals(this.v0)) {
                        this.v0 = null;
                        b(CallEvents.PIN_PARTICIPANT, (Object) null);
                    }
                }
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 7:
                str = "OKRTCCall";
                String optString4 = jSONObject.optString("joinLink");
                this.joinLink = optString4;
                b(CallEvents.JOIN_LINK_CHANGED, optString4);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\b':
                str = "OKRTCCall";
                this.recordManager.getValue().handleStartRecord(jSONObject);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\t':
                str = "OKRTCCall";
                this.recordManager.getValue().handleStopRecord(jSONObject);
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\n':
                str = "OKRTCCall";
                this.logger.log(str, "Unexpected notification " + jSONObject + ". Ignore, because session id support is on");
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 11:
                str = "OKRTCCall";
                String optString5 = jSONObject.optString(SignalingProtocol.KEY_PARTICIPANT_ID);
                if (!optString5.isEmpty()) {
                    CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(optString5);
                    JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_ROLES);
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                try {
                                    arrayList.add(CallParticipant.Role.valueOf(optJSONArray.getString(i)));
                                } catch (IllegalArgumentException e) {
                                    this.logger.logException(str, "invalid ROLE in handleRolesChanged", e);
                                }
                            } catch (JSONException e2) {
                                this.logger.logException(str, "handleRolesChanged", e2);
                            }
                        }
                    }
                    this.y0.handleRolesChangedForMediaOptions(arrayList, fromStringValue);
                    CallParticipant participant = this.c0.getParticipant(fromStringValue);
                    if (participant != null) {
                        participant.setRoles(arrayList);
                        CallParticipant currentUserParticipant = this.c0.getCurrentUserParticipant();
                        if (participant == currentUserParticipant) {
                            this.L0.onIsMeAdminMayHaveChanged(isParticipantAdmin(currentUserParticipant));
                        }
                    }
                    b(CallEvents.ROLES_CHANGED, participant);
                }
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\f':
                this.logger.log("OKRTCCall", "handleAcceptCallNotification");
                CallParticipant.ParticipantId extractParticipantIdFromAny2 = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                if (extractParticipantIdFromAny2.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    b(CallEvents.ACCEPTED_ON_OTHER_DEVICE, (Object) null);
                    destroy("accepted.on.other.device", null);
                    str = "OKRTCCall";
                    this.B0.logTime(str, "notification handling of ".concat(string));
                    return;
                }
                if (!this.y && !this.b1) {
                    o();
                    this.g0.maybeStartConnectivityControl();
                }
                if (this.H.isFired()) {
                    this.logger.log("OKRTCCall", "New accept from participantId=" + extractParticipantIdFromAny2);
                } else {
                    this.H.fire();
                }
                CallMediaOptionsDelegate callMediaOptionsDelegate = this.y0;
                str = "OKRTCCall";
                MutableMediaOptions createParticipantMediaOptions = callMediaOptionsDelegate.createParticipantMediaOptions(jSONObject, extractParticipantIdFromAny2, "handleAcceptCall", callMediaOptionsDelegate.getMediaOptionsForCall(this.c0.getActiveRoomId()).toMap(), true);
                MutableMediaSettings createMediaSettingsFromParent = SignalingProtocol.createMediaSettingsFromParent(jSONObject);
                if (createMediaSettingsFromParent == null) {
                    throw new NullPointerException(jSONObject.toString());
                }
                try {
                    obj = this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromAny2).setAcceptedCallPeer(SignalingProtocol.createPeerFromParent(jSONObject)).setMediaOptions(createParticipantMediaOptions).setMediaSettings(createMediaSettingsFromParent).setRoles(SignalingProtocol.createRolesFromParent(jSONObject)).setExternalIdIfNotNull(SignalingProtocol.createExternalIdFromParent(jSONObject)).setMovies(this.G0.movieSharesInfoParser.parseMoviesFromParticipant(jSONObject, this.c0.getActiveRoomId())).setCapabilities(SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject)).setSessionState(SignalingProtocol.getSessionStateFromParticipant(jSONObject)).build());
                } catch (IllegalStateException e3) {
                    this.logger.reportException(str, "accept.call.add", e3);
                    obj = null;
                }
                this.f0 = true;
                if (this.s) {
                    this.l.removeMessages(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                    b(CallEvents.CALL_ACCEPTED, obj);
                }
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\r':
                this.H0.getSessionRoomNotificationHandler().onRoomParticipantsUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 14:
                long j = jSONObject.getLong("chatId");
                this.T = j;
                b(CallEvents.GROUP_CALL_CHAT_CREATED, Long.valueOf(j));
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 15:
                this.logger.log("OKRTCCall", SignalingProtocol.KEY_HANDLE_CONNECTION);
                JSONObject jSONObject2 = jSONObject.getJSONObject(SignalingProtocol.KEY_CONVERSATION);
                this.n0.readFromJson(jSONObject.optJSONObject(SignalingProtocol.KEY_MEDIA_MODIFIERS));
                a(jSONObject2);
                this.y0.setupMediaOptionStatesForCall(jSONObject2, SignalingProtocol.KEY_HANDLE_CONNECTION, CallMediaOptionsDelegate.CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS, SessionRoomId.MainCall.INSTANCE, true);
                a(jSONObject2, jSONObject.getBoolean(SignalingProtocol.KEY_IS_CONCURRENT), false);
                b(jSONObject);
                TimeProviderExtKt.setServerTimeNs(this.s0, jSONObject.optLong(SignalingProtocol.KEY_STAMP, 0L));
                if (!this.x0) {
                    if (SignalingProtocol.STATE_ENDED.equals(jSONObject2.getString("state"))) {
                        this.callEndInfoHolder.setReason(ConversationEndReason.ConversationAlreadyEnded.INSTANCE);
                        b(CallEvents.CONVERSATION_CLOSED, (Object) null);
                        destroy("conversation.ended", null);
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                OnConnectedListener onConnectedListener = this.N;
                if (onConnectedListener != null) {
                    onConnectedListener.onConnected(this);
                }
                if (this.x0) {
                    this.y0.resetMediaOptionStatesForCurrentUser();
                }
                this.y0.sendMuteInitializedEvent(true);
                Signaling signaling = this.k;
                if (signaling != null) {
                    signaling.onCallConnected(this);
                }
                b(CallEvents.CALL_SIGNALING_CONNECTED, (Object) null);
                boolean z7 = this.x;
                if (z7 || !this.s || this.b1) {
                    q();
                } else if (z7) {
                    this.logger.log("OKRTCCall", "Can't start interaction twice. Ignore");
                } else {
                    this.x = true;
                    q();
                    this.g0.createOffers(!this.params.getExperiments().a0());
                    this.logger.log("OKRTCCall", "Call started as ".concat(this.initialVideoEnabled ? "video" : "audio"));
                }
                this.N0.onSignalingConnected();
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 16:
                for (CallParticipant.ParticipantState participantState : this.G0.participantStateParser.parseParticipantListState(jSONObject)) {
                    this.J0.getParticipantStateListenerProxy().onStateChanged(participantState.participantId, participantState);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 17:
                this.H0.getRateCallHandler().onRateCall(jSONObject);
                this.shouldRate = true;
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 18:
                this.H0.getContactCallNotificationHandler().onDecorativeIdChanged(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 19:
                this.H0.getSessionRoomNotificationHandler().onRoomsUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 20:
                this.H0.getFeedbackNotificationHandler().handleFeedbackUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 21:
                String optString6 = jSONObject.optString(SignalingProtocol.KEY_PARTICIPANT_ID);
                if (!optString6.isEmpty()) {
                    CallParticipant.ParticipantId fromStringValue2 = CallParticipant.ParticipantId.fromStringValue(optString6);
                    boolean extractUnpin = SignalingProtocol.extractUnpin(jSONObject);
                    this.y0.handlePinForMediaOptions(extractUnpin, fromStringValue2);
                    Integer valueOf = jSONObject.has(SignalingProtocol.KEY_ROOM_ID) ? Integer.valueOf(jSONObject.optInt(SignalingProtocol.KEY_ROOM_ID)) : null;
                    if (valueOf != null && valueOf.intValue() > 0) {
                        this.L0.handlePinParticipant(extractUnpin, fromStringValue2, new SessionRoomId.Room(valueOf.intValue()));
                    } else if (extractUnpin) {
                        this.v0 = null;
                    } else {
                        this.v0 = fromStringValue2;
                    }
                    b(CallEvents.PIN_PARTICIPANT, this.v0);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 22:
                this.logger.log("OKRTCCall", "handleParticipantAdded");
                CallParticipant.ParticipantId extractParticipantIdFromAny3 = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_PARTICIPANT);
                if (!extractParticipantIdFromAny3.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    onParticipantAddedToCall(extractParticipantIdFromAny3, optJSONObject);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 23:
                CallParticipant.ParticipantState parseParticipantState = this.G0.participantStateParser.parseParticipantState(jSONObject);
                if (parseParticipantState != null) {
                    this.J0.getParticipantStateListenerProxy().onStateChanged(parseParticipantState.participantId, parseParticipantState);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 24:
                this.asrRecordManager.getValue().handleStartAsrRecord(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 25:
                String optString7 = jSONObject.optString(SignalingProtocol.KEY_PARTICIPANT_ID);
                if (!optString7.isEmpty()) {
                    CallParticipant.ParticipantId fromStringValue3 = CallParticipant.ParticipantId.fromStringValue(optString7);
                    CallParticipant participant2 = this.c0.getParticipant(fromStringValue3);
                    if (participant2 == null) {
                        this.logger.log("OKRTCCall", "unknown participant id " + fromStringValue3.id);
                    } else {
                        boolean optBoolean = jSONObject.optBoolean("hold");
                        if (!fromStringValue3.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                            this.J0.getInternalHoldListenerProxy().onParticipantHoldStateChanged(String.valueOf(fromStringValue3.id), optBoolean);
                            if (optBoolean) {
                                this.logger.log("OKRTCCall", "got remote hold from participant " + participant2);
                                this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                                participant2.isOnHold = true;
                                this.g0.handleRemoteHold(participant2);
                            } else {
                                this.logger.log("OKRTCCall", "got remote unhold from participant " + participant2);
                                participant2.isOnHold = false;
                                if (!this.b1) {
                                    this.g0.handleRemoteUnhold(participant2);
                                }
                            }
                        }
                    }
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 26:
                this.asrRecordManager.getValue().handleStopAsrRecord(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 27:
                this.logger.log("OKRTCCall", "handleNewTopology");
                Topology of = Topology.of(jSONObject.getString(SignalingProtocol.KEY_TOPOLOGY));
                if (!this.g0.is(of)) {
                    a(of, false);
                }
                a(this.g0, 1);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 28:
                this.H0.getWaitingRoomNotificationHandler().handlePromotionApproved(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 29:
                if (jSONObject.has("mute")) {
                    b(jSONObject.getBoolean("mute") ? CallEvents.MUTE_MICRO : CallEvents.UNMUTE_MICRO, (Object) null);
                } else {
                    this.logger.log("OKRTCCall", "switch-micro without 'mute'");
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 30:
                this.H0.getUrlSharingHandler().onInfoUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case 31:
                this.y0.handleMuteParticipant(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case ' ':
                CallParticipant.ParticipantId extractParticipantIdFromAny4 = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                Peer createPeerFromParent = SignalingProtocol.createPeerFromParent(jSONObject);
                String optString8 = jSONObject.optString("platform");
                String optString9 = jSONObject.optString("clientType");
                this.l.removeMessages(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                b(CallEvents.PEER_REGISTERED, (Object) null);
                this.c0.registerPeer(extractParticipantIdFromAny4, createPeerFromParent, optString8, optString9);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '!':
                this.logger.log("OKRTCCall", "handleTransmittedDataNotification");
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("sdp");
                SessionDescription createSdp = SignalingProtocol.createSdp(optJSONObject2);
                if (createSdp != null) {
                    CallParticipant.ParticipantId extractParticipantIdFromAny5 = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                    Peer createPeerFromParent2 = SignalingProtocol.createPeerFromParent(jSONObject);
                    try {
                        z3 = optJSONObject2.getBoolean(SignalingProtocol.KEY_P2P_RELAY);
                    } catch (Exception unused2) {
                        z3 = false;
                    }
                    SessionDescription.Type type = createSdp.type;
                    if (type == SessionDescription.Type.OFFER) {
                        if (this.c0.getParticipant(extractParticipantIdFromAny5) == null) {
                            this.logger.logException("OKRTCCall", "td.sdp.npe", new Exception("td.sdp.unknown.participant"));
                        } else {
                            if (z3) {
                                this.logger.log("OKRTCCall", "handle remote offer. firstDataStat.isReported()? " + this.N0.isReported() + ", isP2PRelayForced " + this.V0);
                                if (!this.N0.isReported()) {
                                    this.logger.log("OKRTCCall", "redirection to P2P relay initiated by server");
                                    this.V0 = true;
                                    this.g0.setUseP2PRelay(true);
                                    Topology topology = Topology.DIRECT;
                                    Iterator it = this.e0.iterator();
                                    while (it.hasNext()) {
                                        ((TopologyChangedListener) it.next()).onTopologyUpdated(topology, topology);
                                    }
                                } else if (!this.V0) {
                                    this.logger.log("OKRTCCall", "redirection to P2P relay initiated by opponent");
                                    this.V0 = true;
                                    a(Topology.DIRECT, false);
                                    a(this.g0, 1);
                                }
                            }
                            this.g0.createAnswerFor(extractParticipantIdFromAny5, createSdp);
                        }
                    } else if (type == SessionDescription.Type.ANSWER && createPeerFromParent2 != null) {
                        CallParticipants callParticipants = this.c0;
                        ParticipantAddOrUpdateParams build = new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromAny5).build();
                        SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
                        CallParticipant addOrUpdate = callParticipants.addOrUpdate(build, mainCall);
                        if (addOrUpdate.isCallAccepted() && CallParticipant.isPeerEquals(CallParticipant.FAKE_PEER, addOrUpdate.getAcceptedCallPeer())) {
                            this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromAny5).setAcceptedCallPeer(createPeerFromParent2).build(), mainCall);
                        }
                        this.logger.log("OKRTCCall", "handle remote answer. isP2PRelayEnabledByServer? " + z3 + " already forced? " + this.V0);
                        if (!z3 && this.V0) {
                            onTopologyUpgradeProposed(this.g0);
                        }
                        if (z3) {
                            this.V0 = true;
                            this.g0.setUseP2PRelay(true);
                            Topology topology2 = Topology.DIRECT;
                            Iterator it2 = this.e0.iterator();
                            while (it2.hasNext()) {
                                ((TopologyChangedListener) it2.next()).onTopologyUpdated(topology2, topology2);
                            }
                        }
                    }
                } else if (!jSONObject3.has("candidate") && !jSONObject3.has(SignalingProtocol.KEY_ICE_REMOVED_CANDIDATES)) {
                    this.logger.logException("OKRTCCall", "unhandled.transmitted.data", new Exception("transmitted.data.has.unknown.type"));
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\"':
                this.logger.log("OKRTCCall", "handleForceChangeMediaSettings");
                MutableMediaSettings createMediaSettingsFromParent2 = SignalingProtocol.createMediaSettingsFromParent(jSONObject);
                if (createMediaSettingsFromParent2 == null) {
                    this.logger.reportException("OKRTCCall", "ms.force.change.npe", new Exception("ms.force.change.no.mediasettings"));
                } else {
                    if (createMediaSettingsFromParent2.isAudioEnabled() || !this.m0.isAudioEnabled()) {
                        z4 = false;
                    } else {
                        this.m0.enableAudio(false);
                        b(CallEvents.MICROPHONE_MUTED_BY_API, (Object) null);
                        z4 = true;
                    }
                    if (createMediaSettingsFromParent2.isVideoEnabled() || !this.m0.isVideoEnabled()) {
                        z5 = z4;
                    } else {
                        this.m0.enableVideo(false);
                        b(CallEvents.CAMERA_MUTED_BY_API, (Object) null);
                        z5 = true;
                    }
                    if (z5) {
                        q();
                    }
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '#':
                this.H0.getSessionRoomNotificationHandler().onRoomUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '$':
                this.H0.getCallFeatureNotificationHandler().onFeatureSetChanged(jSONObject);
                this.logger.log("OKRTCCall", "handleFeatureSetChanged");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("features");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        if ("ADD_PARTICIPANT".equalsIgnoreCase(optJSONArray2.optString(i2))) {
                            z6 = true;
                            this.logger.log("OKRTCCall", "setFeatureAddParticipantEnabled, " + MiscHelper.toYesNo(Boolean.valueOf(z6)));
                            if (this.l0 != z6) {
                                this.l0 = z6;
                            }
                            str = "OKRTCCall";
                            this.B0.logTime(str, "notification handling of ".concat(string));
                            return;
                        }
                    }
                }
                z6 = false;
                this.logger.log("OKRTCCall", "setFeatureAddParticipantEnabled, " + MiscHelper.toYesNo(Boolean.valueOf(z6)));
                if (this.l0 != z6) {
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '%':
                List<CallParticipant.ParticipantId> participantIdsFromAudioActivity = SignalingProtocol.getParticipantIdsFromAudioActivity(jSONObject);
                if (participantIdsFromAudioActivity != null) {
                    this.c0.setTalkingParticipants(participantIdsFromAudioActivity);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '&':
                CallParticipant.ParticipantId participantIdFromSpeakerChanged = SignalingProtocol.getParticipantIdFromSpeakerChanged(jSONObject);
                if (participantIdFromSpeakerChanged != null) {
                    this.c0.setPrimarySpeakerId(participantIdFromSpeakerChanged);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '\'':
                this.logger.log("OKRTCCall", "handleParticipantJoined");
                JSONObject jSONObject4 = jSONObject.getJSONObject(SignalingProtocol.KEY_PARTICIPANT);
                CallParticipant.ParticipantId extractParticipantIdFromParticipant = SignalingProtocol.extractParticipantIdFromParticipant(jSONObject4);
                if (!extractParticipantIdFromParticipant.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    CallMediaOptionsDelegate callMediaOptionsDelegate2 = this.y0;
                    SessionRoomId.MainCall mainCall2 = SessionRoomId.MainCall.INSTANCE;
                    MutableMediaOptions createParticipantMediaOptions2 = callMediaOptionsDelegate2.createParticipantMediaOptions(jSONObject4, extractParticipantIdFromParticipant, "handleParticipantJoined", callMediaOptionsDelegate2.getMediaOptionsForCall(mainCall2).toMap(), true);
                    MutableMediaSettings createMediaSettingsFromParent3 = SignalingProtocol.createMediaSettingsFromParent(jSONObject4);
                    if (createMediaSettingsFromParent3 == null) {
                        this.logger.logException("OKRTCCall", "joined.notify", new Exception("joined.notify.mediaSettings.is.null"));
                    }
                    Peer createPeerFromParent3 = SignalingProtocol.createPeerFromParent(jSONObject4);
                    CallParticipant participant3 = this.c0.getParticipant(extractParticipantIdFromParticipant);
                    if (createPeerFromParent3 == null || participant3 == null || !participant3.isCallAccepted() || CallParticipant.isPeerEquals(createPeerFromParent3, participant3.getAcceptedCallPeer()) || CallParticipant.isPeerEquals(CallParticipant.FAKE_PEER, participant3.getAcceptedCallPeer())) {
                        CallParticipant addOrUpdate2 = this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromParticipant).setAcceptedCallPeer(createPeerFromParent3).setMediaOptions(createParticipantMediaOptions2).setMediaSettingsIfNotNull(createMediaSettingsFromParent3).setRoles(SignalingProtocol.createRolesFromParent(jSONObject4)).setExternalIdIfNotNull(SignalingProtocol.createExternalIdFromParent(jSONObject4)).setMovies(this.G0.movieSharesInfoParser.parseMoviesFromParticipant(jSONObject4, mainCall2)).setCapabilities(SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject4)).setSessionState(SignalingProtocol.getSessionStateFromParticipant(jSONObject4)).build(), mainCall2);
                        String participantStateFromParticipant = SignalingProtocol.getParticipantStateFromParticipant(jSONObject4);
                        if (!addOrUpdate2.isCallAccepted() && SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(participantStateFromParticipant)) {
                            addOrUpdate2.setCallAccepted();
                        }
                        this.g0.createOfferFor(addOrUpdate2, true);
                        if (this.s) {
                            this.logger.log("OKRTCCall", "Opponent accepted (joined) call: " + addOrUpdate2);
                            if (!this.y) {
                                o();
                            }
                            this.f0 = true;
                            if (!this.H.isFired()) {
                                this.H.fire();
                            }
                            this.l.removeMessages(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                            b(CallEvents.CALL_ACCEPTED, addOrUpdate2);
                        }
                    } else {
                        this.logger.logException("OKRTCCall", "joined.notify", new Exception("joined.notify.participant.aready.exist"));
                    }
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '(':
                this.H0.getCallFeatureNotificationHandler().onFeaturesPerRoleChanged(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case ')':
                List<CallParticipant.ParticipantId> participantIdsFromStalledActivity = SignalingProtocol.getParticipantIdsFromStalledActivity(jSONObject);
                if (participantIdsFromStalledActivity != null) {
                    this.w0 = participantIdsFromStalledActivity;
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '*':
                this.H0.getWaitingRoomNotificationHandler().handleChatRoomUpdated(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '+':
                this.logger.log("OKRTCCall", "handleMediaSettingsChanged");
                CallParticipant.ParticipantId extractParticipantIdFromAny6 = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
                if (!extractParticipantIdFromAny6.equals(this.c0.getCurrentUserParticipant().getParticipantId())) {
                    CallParticipant participant4 = this.c0.getParticipant(extractParticipantIdFromAny6);
                    if (participant4 == null) {
                        this.logger.reportException("OKRTCCall", "ms.changed.npe", new Exception("participant.is.null"));
                    } else {
                        MutableMediaSettings createMediaSettingsFromParent4 = SignalingProtocol.createMediaSettingsFromParent(jSONObject);
                        if (createMediaSettingsFromParent4 == null) {
                            this.logger.reportException("OKRTCCall", "ms.changed.absent", new Exception("no.mediasettings.in.notification"));
                        } else {
                            MutableMediaOptions mutableMediaOptions = new MutableMediaOptions(participant4.mediaOptions);
                            MediaOptionState audioState = participant4.mediaOptions.getAudioState();
                            MediaOptionState mediaOptionState = MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE;
                            if (audioState == mediaOptionState && participant4.mediaSettings.isAudioEnabled() && !createMediaSettingsFromParent4.isAudioEnabled()) {
                                mutableMediaOptions.setAudioState(MediaOptionState.MUTED_PERMANENT);
                            }
                            if (participant4.mediaOptions.getVideoState() == mediaOptionState && participant4.mediaSettings.isVideoEnabled() && !createMediaSettingsFromParent4.isVideoEnabled()) {
                                mutableMediaOptions.setVideoState(MediaOptionState.MUTED_PERMANENT);
                            }
                            if (participant4.mediaOptions.getScreenshareState() == mediaOptionState && participant4.mediaSettings.isScreenCaptureEnabled() && !createMediaSettingsFromParent4.isScreenCaptureEnabled()) {
                                mutableMediaOptions.setScreenshareState(MediaOptionState.MUTED_PERMANENT);
                            }
                            if (participant4.mediaSettings.isAnimojiEnabled() != createMediaSettingsFromParent4.isAnimojiEnabled()) {
                                this.q0.onParticipantAnimojiStateChanged(participant4, createMediaSettingsFromParent4.isAnimojiEnabled());
                            }
                            this.c0.addOrUpdate(new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromAny6).setMediaOptions(mutableMediaOptions).setMediaSettings(createMediaSettingsFromParent4).build());
                            b(CallEvents.PEER_MEDIA_SETTINGS_CHANGED, (Object) null);
                        }
                    }
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case ',':
                this.H0.getMovieShareNotificationHandler().handleMovieShareStarted(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '-':
                this.H0.getMovieShareNotificationHandler().handleMovieShareStopped(jSONObject);
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '.':
                try {
                    z = jSONObject.getBoolean(SignalingProtocol.KEY_DEMOTE);
                    this.x0 = z;
                } catch (JSONException e4) {
                    this.logger.logException("OKRTCCall", "handlePromoteParticipant " + e4.getMessage(), e4);
                }
                if (z) {
                    if (!this.R0.isActive()) {
                        this.c0.clear();
                    }
                    this.y0.resetMediaOptionStatesForCurrentUser();
                } else {
                    JSONObject jSONObject5 = jSONObject.getJSONObject(SignalingProtocol.KEY_CONVERSATION);
                    if (SignalingProtocol.STATE_ENDED.equals(jSONObject5.getString("state"))) {
                        this.callEndInfoHolder.setReason(ConversationEndReason.ConversationAlreadyEnded.INSTANCE);
                        b(CallEvents.CONVERSATION_CLOSED, (Object) null);
                        destroy("conversation.ended", null);
                        str = "OKRTCCall";
                        this.B0.logTime(str, "notification handling of ".concat(string));
                        return;
                    }
                    this.n0.readFromJson(jSONObject.optJSONObject(SignalingProtocol.KEY_MEDIA_MODIFIERS));
                    a(jSONObject5);
                    this.y0.setupMediaOptionStatesForCall(jSONObject5, SignalingProtocol.KEY_HANDLE_PROMOTE_PARTICIPANT, CallMediaOptionsDelegate.CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS, SessionRoomId.MainCall.INSTANCE, true);
                    a(jSONObject5, jSONObject.optBoolean(SignalingProtocol.KEY_IS_CONCURRENT, false), true);
                    b(jSONObject);
                    onUserAnswered();
                    p();
                }
                this.y0.sendMuteInitializedEvent(true);
                this.J0.getWaitingRoomListenerProxy().onMeInWaitingRoomChanged(z);
                q();
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            case '/':
                this.c1 = SignalingProtocol.extractPeerVideoSettingsFromAny(jSONObject, SignalingProtocol.KEY_SCREEN_SHARING);
                this.d1 = SignalingProtocol.extractPeerVideoSettingsFromAny(jSONObject, SignalingProtocol.KEY_CAMERA);
                notifyUpdatePeerVideoSettings();
                if (this.J) {
                    this.I.notifySettings(jSONObject);
                }
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
            default:
                str = "OKRTCCall";
                this.B0.logTime(str, "notification handling of ".concat(string));
                return;
        }
    }

    public final /* synthetic */ void f(JSONObject jSONObject) {
        ((SignalingNotificationLogger) this.z0.getValue()).log(jSONObject);
    }

    public final void g(JSONObject jSONObject) {
        this.logger.log("OKRTCCall", "onAcceptedCommandSent");
        if (!this.H.isFired()) {
            this.H.fire();
        }
        a(this.g0, 1);
        CallParticipant opponent = getOpponent();
        if (!this.y && opponent != null && !opponent.isOnHold) {
            o();
            this.g0.maybeStartConnectivityControl();
        }
        b(CallEvents.CALL_ACCEPTED, getCurrentUserCallParticipant());
    }

    public final void h(JSONObject jSONObject) {
        this.d.execute(new wv4(2, this, jSONObject));
    }

    public void dumpLocalAudio(final String str, final int i, final DumpCallback dumpCallback) {
        this.c.execute(new Runnable() { // from class: xsna.y09
            @Override // java.lang.Runnable
            public final void run() {
                Call.this.a(str, i, dumpCallback);
            }
        });
    }

    public final void b(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        if (participantId.equals(this.v0)) {
            this.v0 = null;
            b(CallEvents.PIN_PARTICIPANT, (Object) null);
        }
    }

    public void dumpLocalAudio(final String str, final int i, final Set<DumpSource> set, final DumpCallback dumpCallback) {
        this.c.execute(new Runnable() { // from class: xsna.n09
            @Override // java.lang.Runnable
            public final void run() {
                Call.this.a(str, i, set, dumpCallback);
            }
        });
    }

    public final CallSessionRoomsManager a(CallSessionRoomsManagerFactory callSessionRoomsManagerFactory) {
        return callSessionRoomsManagerFactory.createCallSessionRoomsManager(new GetParticipantListChunkCommand(this.G0.participantListChunkParser, new h20(this, 5)), new GetRoomsCommand(this.G0.sessionRoomsParser, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 6)));
    }

    public final StatListenerManager a(StatListenerManagerFactory statListenerManagerFactory) {
        return statListenerManagerFactory.createStatListenerManager(new m7(this, 14), new zx(this, 8), new g(this));
    }

    public final /* synthetic */ s3q0 a(StatsObserver statsObserver) {
        this.g0.getStats(statsObserver);
        return s3q0.a;
    }

    public final void b(boolean z) {
        if (b()) {
            if (z) {
                this.a0.update();
            }
            if (this.y0.handleMediaOptionsForSetVideo(z)) {
                if (z && this.m0.isAnimojiEnabled()) {
                    this.q0.setEnabled(false, false);
                }
                this.logger.log("OKRTCCall", "Update my settings with video enabled=" + z);
                this.m0.enableVideo(z);
                b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
            }
        }
    }

    public final /* synthetic */ s3q0 a(StatsCallback statsCallback) {
        this.g0.requestStats(statsCallback);
        return s3q0.a;
    }

    public void hangup(HangupReason hangupReason) {
        a(hangupReason, false);
    }

    public final /* synthetic */ void a(CallParticipant.ParticipantId participantId, boolean z, List list, Runnable runnable, Runnable runnable2, JSONObject jSONObject) {
        if (!jSONObject.optString("error").isEmpty()) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Collection<CallParticipant> participantsByUserId = this.c0.getParticipantsByUserId(participantId);
        if (!participantsByUserId.isEmpty()) {
            for (CallParticipant callParticipant : participantsByUserId) {
                if (z) {
                    callParticipant.removeRoles(list);
                } else {
                    callParticipant.addRoles(list);
                }
            }
            b(CallEvents.ROLES_CHANGED_MULTI_DEVICES, participantsByUserId);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final CallTopology b(Topology topology, boolean z) {
        CallTopology build;
        MediaAdaptationController mediaAdaptationController = null;
        if (topology == Topology.DIRECT) {
            DirectCallTopology.Builder timeProvider = new DirectCallTopology.Builder().setContext(this.m).setCallParticipants(this.c0).setMediaSettings(this.m0).setSignaling(this.k).setNotificationsListener(this.i).setRtcLogger(this.logger).setFirstDataStat(this.N0).setCallParams(this.params).setSharedPeerConnectionFactory(this.X).setExecuterService(this.c).setEglBase(this.rootEglBase).setVideoRendererSource(this.delayedVideoRendererSource).setLocalMediaStreamSource(this.Y).setForceRelayPolicy(this.h.getForceRelayPolicy()).setMappingProcessor(this.p0).setAnimojiCore(this.q0).setCallListenersCollection(this.J0).setTimeProvider(this.s0);
            if (this.params.getMediaAdaptation() != null && this.params.getMediaAdaptation().getP2pCallSettings() != null && this.params.getMediaAdaptation().getP2pCallSettings().isEnabled()) {
                if (this.Q0 == null) {
                    this.Q0 = new StatBasedNetworkStateProvider(this.E0, this.logger, this.params.getBadNetworkIndicatorConfig().getCalcNetworkStatusConfig() != null);
                }
                mediaAdaptationController = new MediaAdaptationController(this.Q0, this.params.getMediaAdaptation().getP2pCallSettings().getConfig(), this.s0, this.logger);
            }
            build = timeProvider.setMediaAdaptationController(mediaAdaptationController).setEventListener(this).setTopologyUpgradeStatEventListener(this).setPeerConnectionEventListener(this.P).setCallTimings(this.X0).setWebRTCToInternalStatsMapper(this.Y0).setCropAndScaleParamsProvider(this.Z0).setIsMeInWaitingRoom(new bin0() { // from class: xsna.b19
                @Override // xsna.bin0
                public final Object get() {
                    return Boolean.valueOf(Call.this.isMeInWaitingRoom());
                }
            }).setPcapLabelProvider(this.a1).setIsMaster(this.s).build();
            build.setUseP2PRelay(this.V0);
        } else if (topology == Topology.SERVER) {
            ServerCallTopology.Builder skipRequestReallocEnabled = new ServerCallTopology.Builder().setContext(this.m).setCallParticipants(this.c0).setMediaSettings(this.m0).setSignaling(this.k).addCommandsListener(new RtcCommandExecutorLogger("RtcCommands", this.logger)).addNotificationsListener(this.i).addNotificationsListener(new RtcNotificationReceiverLogger("RtcNotifications", this.logger)).setFirstDataStat(this.N0).setRtcLogger(this.logger).setCallParams(this.params).setCodecListEstimator((CodecListEstimator) this.S.getValue()).setSharedPeerConnectionFactory(this.X).setExecuterService(this.c).setEglBase(this.rootEglBase).setVideoRendererSource(this.delayedVideoRendererSource).setLocalMediaStreamSource(this.Y).setPreferencesHelper(this.b0).setRestart(z).setMappingProcessor(this.p0).setAnimojiCore(this.q0).setCallListenersCollection(this.J0).setScreenshareFirstFrameStat((ScreenshareFirstFrameStat) this.M0.getValue()).addAsrPackageListener(this.j).setSkipRequestReallocEnabled(this.n.j());
            if (this.params.getMediaAdaptation() != null && this.params.getMediaAdaptation().getGroupCallSettings() != null && this.params.getMediaAdaptation().getGroupCallSettings().isEnabled()) {
                if (this.Q0 == null) {
                    this.Q0 = new StatBasedNetworkStateProvider(this.E0, this.logger, this.params.getBadNetworkIndicatorConfig().getCalcNetworkStatusConfig() != null);
                }
                mediaAdaptationController = new MediaAdaptationController(this.Q0, this.params.getMediaAdaptation().getGroupCallSettings().getConfig(), this.s0, this.logger);
            }
            build = skipRequestReallocEnabled.setMediaAdaptationController(mediaAdaptationController).setTimeProvider(this.s0).setScreenCapturePermissionProvider(this.t0).setEventListener(this).setPeerConnectionEventListener(this.P).setCallTimings(this.X0).setWebRTCToInternalStatsMapper(this.Y0).setCropAndScaleParamsProvider(this.Z0).setIsMeInWaitingRoom(new bin0() { // from class: xsna.b19
                @Override // xsna.bin0
                public final Object get() {
                    return Boolean.valueOf(Call.this.isMeInWaitingRoom());
                }
            }).build();
        } else {
            throw new IllegalArgumentException("Unsupported topology: " + topology);
        }
        this.h0.setTopology(new na(this, 13));
        build.setIceServers(this.z);
        return build;
    }

    public static /* synthetic */ void n() {
    }

    public final /* synthetic */ void a(boolean z, CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId, JSONObject jSONObject) {
        if (jSONObject.optString("error").isEmpty()) {
            CallParticipant.ParticipantId participantId2 = z ? participantId : null;
            if (sessionRoomId instanceof SessionRoomId.Room) {
                this.L0.handlePinParticipant(!z, participantId, (SessionRoomId.Room) sessionRoomId);
            } else {
                this.v0 = participantId2;
            }
            b(CallEvents.PIN_PARTICIPANT_INITIATOR, participantId2);
        }
    }

    public final /* synthetic */ void a(Consumer consumer, Runnable runnable, JSONObject jSONObject) {
        CallWaitingRoomParticipantsPage parse = this.A0.parse(jSONObject);
        if (parse != null) {
            consumer.accept(parse);
        } else {
            runnable.run();
        }
    }

    public final void a(String str, HangupInfo hangupInfo, HangupReason hangupReason, String str2) {
        this.callEndInfoHolder.setReason(HangupReasonMapper.getCallEndReason(hangupReason, hangupInfo));
        ConversationEndReason reason = this.callEndInfoHolder.getReason();
        if (reason instanceof ConversationEndReason.Error) {
            this.callFinishReason = new CallTerminatingException.Builder(Domain.SERVER, ((ConversationEndReason.Error) reason).getThrowable(), str2).setSubDomain(UtilsKt.subDomain(this.k.transportType)).build();
        }
        b(CallEvents.PARTICIPANT_HANGUP, hangupInfo);
        Signaling signaling = this.k;
        if (signaling != null) {
            signaling.dispose();
        }
        destroy("conversation_ended." + str, hangupReason);
    }

    public final /* synthetic */ void c(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        this.W.exclude(this.c0.remove(participantId));
    }

    public final void c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            if (optJSONObject.opt("sdk") != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk");
                if (optJSONObject2 != null && optJSONObject2.optString("type").equals(BadConnectionSignaling.TYPE_BAD_NET) && this.J) {
                    this.I.notifyRemoteBadNed(optJSONObject2);
                    return;
                }
                return;
            }
            this.l.post(new i09(this, SignalingProtocol.extractParticipantIdFromAny(jSONObject), optJSONObject, 0));
        }
    }

    public final void a(HangupReason hangupReason, boolean z) {
        this.logger.log("OKRTCCall", "hangup, " + MiscHelper.identity2(hangupReason) + ", unknown");
        MiscHelper.throwIfNotMainThread();
        if (z && isWaitingRoomEnabled() && this.k != null) {
            this.callEndInfoHolder.setReason(ConversationEndReason.EndedForAll.INSTANCE);
            this.L = true;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("reason", hangupReason.toString());
                Signaling signaling = this.k;
                if (signaling != null && signaling.isConnected()) {
                    Signaling signaling2 = this.k;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("command", "hangup");
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject.get(next));
                        }
                        signaling2.sendLastCommand(jSONObject2);
                        this.L = false;
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    this.W0.hangupConversation(hangupReason);
                }
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        destroy("hangup." + hangupReason + ".unknown", hangupReason);
    }

    public final void a() {
        boolean z = false;
        if (!this.a0.isMicrophonePermissionGranted()) {
            this.m0.enableAudio(false);
        }
        if (!this.a0.isCameraPermissionGranted()) {
            this.m0.enableVideo(false);
        } else {
            if (this.initialVideoEnabled && ((isVideoPermittedForParticipant() && isVideoPermittedForCall()) || isMeCreatorOrAdmin())) {
                z = true;
            }
            if (z) {
                b(true);
            }
        }
        this.logger.log("OKRTCCall", "Apply permissions to media settings. Call type: ".concat(z ? "video" : "audio"));
    }

    public final void a(Consumer consumer, Void r6) {
        this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        HashMap hashMap = new HashMap();
        Iterator<CallParticipant> it = this.c0.getActiveSessionRoomParticipants().iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), Boolean.FALSE);
        }
        this.c0.setConnectivityForBatch(hashMap);
        a(this.g0, 2);
        consumer.accept(r6);
    }

    public final /* synthetic */ void d() {
        try {
            PeerConnectionFactory factory = this.X.getFactory();
            if (factory == null) {
                return;
            }
            factory.clearDumpRequests();
        } catch (Throwable th) {
            this.logger.logException("OKRTCCall", "Error stopping local audio dump", th);
        }
    }

    public final void a(Topology topology, boolean z) {
        Topology identity = this.g0.getIdentity();
        this.P0.removeEventListener(this.g0);
        CallTopology callTopology = this.i0;
        if (callTopology != null) {
            callTopology.release();
            this.i0 = null;
        }
        if (this.g0.is(topology)) {
            this.g0.release();
        } else {
            this.i0 = this.g0;
        }
        CallTopology b = b(topology, z);
        this.g0 = b;
        this.P0.setSourceProvider(b.getNetworkConditionProvider());
        this.P0.addEventListener(this.g0);
        boolean z2 = identity == Topology.DIRECT;
        boolean z3 = topology == Topology.SERVER;
        if (z2 && z3) {
            b(CallEvents.MIGRATED_TO_SERVER_TOPOLOGY_FROM_DIRECT, (Object) null);
        }
        Topology identity2 = this.g0.getIdentity();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((TopologyChangedListener) it.next()).onTopologyUpdated(identity, identity2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(JSONObject jSONObject, boolean z, boolean z2) {
        CallParticipant callParticipant;
        String str;
        String str2;
        k kVar;
        boolean z3;
        CallParticipant callParticipant2;
        ParticipantAddOrUpdateParams participantAddOrUpdateParams;
        JSONObject jSONObject2;
        CallParticipant.ParticipantState parseParticipantState;
        a(jSONObject);
        CallParticipant currentUserParticipant = this.c0.getCurrentUserParticipant();
        String str3 = SignalingProtocol.KEY_PARTICIPANTS;
        JSONArray jSONArray = jSONObject.getJSONArray(SignalingProtocol.KEY_PARTICIPANTS);
        CallParticipant currentUserParticipant2 = this.c0.getCurrentUserParticipant();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        boolean z4 = false;
        List<CallParticipant.ParticipantId> list = null;
        boolean z5 = false;
        while (true) {
            callParticipant = currentUserParticipant;
            str = str3;
            boolean z6 = z4;
            List<CallParticipant.ParticipantId> list2 = list;
            boolean z7 = z5;
            if (i < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string = jSONObject3.getString("state");
                int i2 = i;
                CallParticipant.ParticipantId extractParticipantIdFromParticipant = SignalingProtocol.extractParticipantIdFromParticipant(jSONObject3);
                str2 = "state";
                if (i2 != 0 && !extractParticipantIdFromParticipant.equals(currentUserParticipant2.getParticipantId())) {
                    if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(string)) {
                        arrayList2.add(this.G0.participantListParser.createAddOrUpdateParamsForAcceptedParticipant(extractParticipantIdFromParticipant, jSONObject3, SessionRoomId.MainCall.INSTANCE));
                    } else if (SignalingProtocol.PARTICIPANT_STATE_CALLED.equals(string)) {
                        arrayList2.add(this.G0.participantListParser.createAddOrUpdateParamsForCalledParticipant(extractParticipantIdFromParticipant, jSONObject3, SessionRoomId.MainCall.INSTANCE));
                        if (extractParticipantIdFromParticipant.type.equals(CallParticipant.ParticipantId.Type.GROUP)) {
                            jSONObject2 = jSONObject3;
                            z4 = z6;
                            list = list2;
                            z5 = true;
                            parseParticipantState = this.G0.participantStateParser.parseParticipantState(jSONObject2);
                            if (parseParticipantState == null) {
                                this.J0.getParticipantStateListenerProxy().onStateChanged(parseParticipantState.participantId, parseParticipantState);
                            }
                            i = i2 + 1;
                            currentUserParticipant = callParticipant;
                            str3 = str;
                        }
                    } else {
                        arrayList.add(extractParticipantIdFromParticipant);
                    }
                    jSONObject2 = jSONObject3;
                    z4 = z6;
                    list = list2;
                } else {
                    if (currentUserParticipant2.getExternalId() == null) {
                        currentUserParticipant2.setExternalId(SignalingProtocol.createExternalIdFromParent(jSONObject3));
                    }
                    if (currentUserParticipant2.getParticipantId() == null) {
                        currentUserParticipant2.updateId(extractParticipantIdFromParticipant);
                        participantAddOrUpdateParams = new ParticipantAddOrUpdateParams.Builder(extractParticipantIdFromParticipant).build();
                    } else {
                        participantAddOrUpdateParams = null;
                    }
                    if (participantAddOrUpdateParams != null) {
                        arrayList2.add(participantAddOrUpdateParams);
                    }
                    boolean optBoolean = jSONObject3.optBoolean(SignalingProtocol.KEY_RESTRICTED, false);
                    if (!currentUserParticipant2.isCallAccepted()) {
                        if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(string)) {
                            b(CallEvents.ACCEPTED_ON_OTHER_DEVICE, (Object) null);
                            destroy("accepted.on.other.device.con", null);
                            kVar = null;
                            break;
                        } else if ("HUNGUP".equals(string)) {
                            b(CallEvents.PARTICIPANT_HANGUP, (Object) null);
                            destroy("hangup.in.connection.notification", null);
                            kVar = null;
                            break;
                        }
                    }
                    JSONArray optJSONArray = jSONObject3.optJSONArray(SignalingProtocol.KEY_PERMISSIONS);
                    currentUserParticipant2.setMovies(this.G0.movieSharesInfoParser.parseMoviesFromParticipant(jSONObject3, SessionRoomId.MainCall.INSTANCE));
                    Integer participantCapabilitiesFromParticipant = SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject3);
                    if (participantCapabilitiesFromParticipant != null) {
                        currentUserParticipant2.setCapabilities(participantCapabilitiesFromParticipant.intValue());
                    }
                    if (optJSONArray != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= optJSONArray.length()) {
                                break;
                            }
                            if (SignalingProtocol.PARTICIPANT_PERMISSION_MUTE.equals(optJSONArray.optString(i3))) {
                                this.a = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    list = SignalingProtocol.extractParticipantIdListFromResponders(jSONObject3);
                    currentUserParticipant2.setRoles(SignalingProtocol.createRolesFromParent(jSONObject3));
                    b(CallEvents.ROLES_CHANGED, currentUserParticipant2);
                    CallMediaOptionsDelegate callMediaOptionsDelegate = this.y0;
                    SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
                    callMediaOptionsDelegate.setupMediaOptionStatesForCurrentUser(jSONObject3, "handleConversationParticipants", callMediaOptionsDelegate.getCallMediaOptionsDefault(mainCall, CallMediaOptionsDelegate.CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS), true, false, mainCall, mainCall);
                    jSONObject2 = jSONObject3;
                    z4 = optBoolean;
                }
                z5 = z7;
                parseParticipantState = this.G0.participantStateParser.parseParticipantState(jSONObject2);
                if (parseParticipantState == null) {
                }
                i = i2 + 1;
                currentUserParticipant = callParticipant;
                str3 = str;
            } else {
                str2 = "state";
                HashSet hashSet = new HashSet();
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    hashSet.add(((ParticipantAddOrUpdateParams) obj).getParticipantId());
                }
                for (CallParticipant.ParticipantId participantId : this.c0.getActiveSessionRoomParticipantIds()) {
                    if (!hashSet.contains(participantId)) {
                        arrayList.add(participantId);
                    }
                }
                this.c0.removeBatch(arrayList);
                this.c0.addOrUpdateBatch(arrayList2);
                this.C0.setActualSettings(this.D0.create(this.m0));
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
                    boolean optBoolean2 = jSONObject4.optBoolean(SignalingProtocol.KEY_ON_HOLD);
                    CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(jSONObject4.optString("id"));
                    CallParticipant participant = this.c0.getParticipant(fromStringValue);
                    if (participant == null) {
                        this.logger.log("OKRTCCall", "unknown participant id " + fromStringValue.id);
                    } else if (participant.isOnHold != optBoolean2) {
                        if (optBoolean2) {
                            this.logger.log("OKRTCCall", "got remote hold from participant " + participant);
                            this.l.removeMessages(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                            participant.isOnHold = true;
                            this.g0.handleRemoteHold(participant);
                        } else {
                            this.logger.log("OKRTCCall", "got remote unhold from participant " + participant);
                            participant.isOnHold = false;
                            if (!this.b1) {
                                this.g0.handleRemoteUnhold(participant);
                            }
                        }
                    }
                }
                kVar = new k(z6, list2, z7);
            }
        }
        if (this.p && !z2) {
            this.logger.log("OKRTCCall", "connection already handled");
            CallParticipant currentUserParticipant3 = this.c0.getCurrentUserParticipant();
            HashSet hashSet2 = new HashSet();
            JSONArray jSONArray2 = jSONObject.getJSONArray(str);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            boolean z8 = false;
            while (i6 < jSONArray2.length()) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i6);
                CallParticipant callParticipant3 = currentUserParticipant3;
                CallParticipant.ParticipantId extractParticipantIdFromParticipant2 = SignalingProtocol.extractParticipantIdFromParticipant(jSONObject5);
                JSONArray jSONArray3 = jSONArray2;
                int i7 = i6;
                String string2 = jSONObject5.getString(str2);
                if (extractParticipantIdFromParticipant2.equals(callParticipant3.getParticipantId())) {
                    if (callParticipant3.isCallAccepted()) {
                        z8 = true;
                    } else if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(string2)) {
                        b(CallEvents.ACCEPTED_ON_OTHER_DEVICE, (Object) null);
                        destroy("accepted.on.other.device.con", null);
                        return;
                    } else if ("HUNGUP".equals(string2)) {
                        b(CallEvents.PARTICIPANT_HANGUP, (Object) null);
                        destroy("hangup.in.connection.notification", null);
                        return;
                    }
                } else if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(string2)) {
                    hashSet2.add(extractParticipantIdFromParticipant2);
                    arrayList3.add(this.G0.participantListParser.createAddOrUpdateParamsForAcceptedParticipant(extractParticipantIdFromParticipant2, jSONObject5, SessionRoomId.MainCall.INSTANCE));
                } else if (SignalingProtocol.PARTICIPANT_STATE_CALLED.equals(string2)) {
                    hashSet2.add(extractParticipantIdFromParticipant2);
                    arrayList3.add(this.G0.participantListParser.createAddOrUpdateParamsForCalledParticipant(extractParticipantIdFromParticipant2, jSONObject5, SessionRoomId.MainCall.INSTANCE));
                }
                i6 = i7 + 1;
                currentUserParticipant3 = callParticipant3;
                jSONArray2 = jSONArray3;
            }
            this.c0.addOrUpdateBatch(arrayList3);
            if (hashSet2.isEmpty() && !z8) {
                this.logger.log("OKRTCCall", "Conversation has no participants");
                this.callEndInfoHolder.setReason(new ConversationEndReason.Error(new CallTerminatingException.Builder(Domain.INTERNAL, new IllegalStateException("Conversation without participants and current user")).build()));
                b(CallEvents.CONVERSATION_CLOSED, (Object) null);
                destroy("conversation.without.participants", null);
                return;
            }
            Set<CallParticipant.ParticipantId> activeSessionRoomParticipantIds = this.c0.getActiveSessionRoomParticipantIds();
            ArrayList arrayList4 = new ArrayList();
            for (CallParticipant.ParticipantId participantId2 : activeSessionRoomParticipantIds) {
                if (!hashSet2.contains(participantId2)) {
                    arrayList4.add(participantId2);
                }
            }
            this.c0.removeBatch(arrayList4);
            this.C0.setActualSettings(this.D0.create(this.m0));
            this.logger.log("OKRTCCall", "handleNewTopology");
            Topology of = Topology.of(jSONObject.getString(SignalingProtocol.KEY_TOPOLOGY));
            if (!this.g0.is(of)) {
                a(of, false);
            }
            a(this.g0, 1);
            return;
        }
        this.p = true;
        this.logger.log("OKRTCCall", AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED);
        CidExtKt.update(this.u, jSONObject.getString("id"));
        if (jSONObject.has("joinLink")) {
            this.joinLink = jSONObject.getString("joinLink");
        }
        if (z) {
            this.E = true;
        } else if (this.E) {
            this.logger.log("OKRTCCall", "onConnected isConcurrent from api");
        }
        if (kVar == null) {
            return;
        }
        Topology of2 = Topology.of(jSONObject.optString(SignalingProtocol.KEY_TOPOLOGY));
        if (of2 == Topology.DUMMY) {
            this.logger.logException("OKRTCCall", "conn.notify.topology", new Exception("invalid.topology.identity." + of2));
            Topology topology = this.c0.size() > 1 ? Topology.SERVER : Topology.DIRECT;
            this.logger.log("OKRTCCall", "Unknown topology specified (" + of2 + ") , use " + topology);
            of2 = topology;
        }
        if (this.E) {
            this.logger.log("OKRTCCall", "   isConcurrent");
            z3 = false;
            if (this.s) {
                a(of2, false);
            }
            this.s = false;
        } else {
            z3 = false;
        }
        if (!this.g0.is(of2) || z2) {
            a(of2, z3);
        }
        List list3 = kVar.b;
        if (list3 != null && this.g0.is(Topology.DIRECT)) {
            this.X0.trace("call.responders.known");
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                try {
                    callParticipant2 = this.c0.getParticipant((CallParticipant.ParticipantId) it.next());
                } catch (NumberFormatException unused) {
                    this.logger.log("OKRTCCall", "Cant get participant id from responders");
                    callParticipant2 = null;
                }
                if (callParticipant2 != null) {
                    this.g0.createOfferFor(callParticipant2, false);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
        if (optJSONArray2 != null) {
            a(optJSONArray2);
        }
        if (!this.s && !this.t) {
            a(this.g0, 1);
        } else {
            this.x0 = kVar.a;
            if (kVar.a) {
                this.J0.getWaitingRoomListenerProxy().onMeInWaitingRoomChanged(true);
            } else {
                this.J0.getWaitingRoomListenerProxy().onMeInWaitingRoomChanged(false);
                a(this.g0, 1);
                if (containsInOptions(Option.WAITING_HALL)) {
                    this.J0.getCallOptionChangedListenerProxy().onWaitingHallEnabledChanged();
                }
            }
        }
        if (this.E && !kVar.a) {
            boolean isCallAccepted = callParticipant.isCallAccepted();
            onUserAnswered();
            if (isCallAccepted) {
                p();
            }
        }
        this.E0.removeRTCStatsObserver(this.U);
        this.E0.registerRTCStatsObserver(this.U);
        this.E0.removeStatisticsListener(this.V);
        this.E0.addStatisticsListener(this.V, 5L, TimeUnit.SECONDS);
        this.E0.start();
        if (kVar.c) {
            b(CallEvents.PEER_REGISTERED, (Object) null);
        }
        long j = -jSONObject.optLong(SignalingProtocol.KEY_TAM_TAM_MULTICHAT_ID);
        this.T = j;
        if (j != 0) {
            b(CallEvents.GROUP_CALL_CHAT_EXISTS, Long.valueOf(j));
        }
        this.recordManager.getValue().handleRecordInfoOnConnection(jSONObject);
        boolean isNull = jSONObject.isNull(SignalingProtocol.KEY_PINNED_PARTICIPANT_ID);
        String optString = jSONObject.optString(SignalingProtocol.KEY_PINNED_PARTICIPANT_ID, null);
        if (!isNull && optString != null) {
            this.v0 = CallParticipant.ParticipantId.fromStringValue(optString);
        } else {
            this.v0 = null;
        }
        this.H0.getFeedbackNotificationHandler().handleFeedbackUpdated(jSONObject);
        this.asrRecordManager.getValue().handleAsrRecordInfoOnConnection(jSONObject);
        this.H0.getUrlSharingHandler().handleUrlSharingInfoFromObject(jSONObject);
    }

    public final void b(JSONObject jSONObject) {
        try {
            if (jSONObject.has(SignalingProtocol.KEY_ROOMS)) {
                this.H0.getSessionRoomNotificationHandler().onConnectionRooms(jSONObject.getJSONObject(SignalingProtocol.KEY_ROOMS));
            }
        } catch (JSONException e) {
            this.logger.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void b(final Consumer consumer, final Consumer consumer2) {
        this.logger.log("OKRTCCall", "self initiated unhold");
        this.b1 = false;
        this.g0.unhold(new Consumer() { // from class: xsna.t09
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                this.b(consumer, (Void) obj);
            }
        }, new Consumer() { // from class: xsna.u09
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                this.b(consumer2, (gav) obj);
            }
        });
    }

    public final /* synthetic */ void b(Consumer consumer, Void r3) {
        a(this.g0, 1);
        consumer.accept(null);
    }

    public final /* synthetic */ void b(Consumer consumer, gav gavVar) {
        this.b1 = true;
        consumer.accept(gavVar);
    }

    public final s3q0 b(CallEvents callEvents, Object obj) {
        this.logger.log("OKRTCCall", "dispatch [ " + callEvents + " ]");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                try {
                    ((EventListener) obj2).onEvent(this, callEvents, obj);
                } catch (Throwable th) {
                    this.logger.logException("OKRTCCall", "Error on dispatch event " + callEvents, th);
                }
            }
        } else {
            this.l.post(new w09(this, callEvents, obj, 0));
        }
        return s3q0.a;
    }

    public final void b(AnimojiDataSupplierInterface animojiDataSupplierInterface) {
        if (this.X == null) {
            return;
        }
        this.c.execute(new vv4(1, this, animojiDataSupplierInterface));
    }

    public final /* synthetic */ void b(Runnable runnable) {
        this.l.post(new xsna.b0(2, this, runnable));
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology.EventListener
    public void onTopologyRemoteVideoTrackAdded(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, @NonNull String str) {
    }

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        this.H0.getCallFeatureNotificationHandler().onFeatureSetChanged(jSONObject);
        this.H0.getCallFeatureNotificationHandler().onFeaturesPerRoleChanged(jSONObject);
        boolean z = false;
        if (optJSONArray != null) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                }
                if ("ADD_PARTICIPANT".equalsIgnoreCase(optJSONArray.optString(i))) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.logger.log("OKRTCCall", "setFeatureAddParticipantEnabled, " + MiscHelper.toYesNo(Boolean.valueOf(z)));
        if (this.l0 != z) {
            this.l0 = z;
        }
    }

    public final /* synthetic */ void a(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        CustomDataListener customDataListener = this.k0;
        if (customDataListener != null) {
            customDataListener.onCustomData(participantId, jSONObject);
        }
    }

    public final void a(CallTopology callTopology, int i) {
        this.logger.log("OKRTCCall", "maybeSetTopologyState, " + callTopology + ", state=" + CallTopology.getStateAsString(i));
        if (i == 0) {
            callTopology.setState(i);
            return;
        }
        if (!this.Q) {
            this.logger.log("OKRTCCall", "cant set " + callTopology + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.s) {
            if (!this.f0) {
                this.logger.log("OKRTCCall", "cant set " + callTopology + " to active state, conversation is not started yet");
                return;
            }
            if (!this.o0) {
                this.logger.log("OKRTCCall", "cant set " + callTopology + " to active state, user is not accepted call yet");
                return;
            }
        }
        callTopology.setIceServers(this.z);
        callTopology.permitIceApply(true);
        callTopology.setState(i);
        getCurrentUserMediaSettings().redeliverActiveSettings();
    }

    public final void a(Option option) {
        CallOptionChangedListenerProxy callOptionChangedListenerProxy = this.J0.getCallOptionChangedListenerProxy();
        int ordinal = option.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                callOptionChangedListenerProxy.onWaitingHallEnabledChanged();
            } else {
                if (ordinal == 2) {
                    callOptionChangedListenerProxy.onRecurringChanged();
                    return;
                }
                if (ordinal == 3) {
                    callOptionChangedListenerProxy.onFeedbackEnabledChanged();
                    return;
                }
                if (ordinal == 5) {
                    callOptionChangedListenerProxy.onAsrOnlineAvailableChanged();
                    return;
                } else if (ordinal != 6) {
                    if (ordinal != 7) {
                        return;
                    }
                    callOptionChangedListenerProxy.onAdminInCallChanged();
                    return;
                }
            }
            callOptionChangedListenerProxy.onWaitForAdminChanged();
            callOptionChangedListenerProxy.onAdminInCallChanged();
            return;
        }
        callOptionChangedListenerProxy.onAnonJoinForbiddenChanged();
    }

    public final void a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(Option.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.logger.log("OKRTCCall", zr.a("got unknown conversation option '", string, "'"));
            }
        }
        ArrayList arrayList2 = new ArrayList(this.q);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(this.q);
        this.q.clear();
        this.q.addAll(arrayList);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            a((Option) obj);
        }
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            a((Option) obj2);
        }
    }

    public final void a(final Consumer consumer, final Consumer consumer2) {
        this.logger.log("OKRTCCall", "self initiated hold");
        this.b1 = true;
        if (this.x0) {
            hangup(HangupReason.REJECTED);
            consumer.accept(null);
        } else {
            Consumer<gav> consumer3 = new Consumer() { // from class: xsna.d09
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    this.a(consumer2, (gav) obj);
                }
            };
            this.g0.hold(new Consumer() { // from class: xsna.h09
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    this.a(consumer, (Void) obj);
                }
            }, consumer3);
        }
    }

    public final /* synthetic */ void a(Consumer consumer, gav gavVar) {
        this.b1 = false;
        consumer.accept(gavVar);
    }

    public final void a(CallEvents callEvents, Object obj) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            try {
                ((EventListener) obj2).onEvent(this, callEvents, obj);
            } catch (Throwable th) {
                this.logger.logException("OKRTCCall", "Error on dispatch event " + callEvents, th);
            }
        }
    }

    public final /* synthetic */ void a(boolean z) {
        if (this.r) {
            return;
        }
        Iterator it = this.d0.iterator();
        while (it.hasNext()) {
            ((NetworkConnectivityListener) it.next()).onNetworkConnectivityChanged(z);
        }
    }

    public final /* synthetic */ void a(AnimojiDataSupplierInterface animojiDataSupplierInterface) {
        try {
            String libPath = animojiDataSupplierInterface.getLibPath();
            PeerConnectionFactory factory = this.X.getFactory();
            if (factory == null) {
                return;
            }
            factory.setTFLiteLibraryPath(libPath);
        } catch (IllegalStateException e) {
            this.logger.reportException("OKRTCCall", "Error loading TFLite", e);
        }
    }

    public final void a(final NoiseSuppressorActiveState noiseSuppressorActiveState, boolean z, final boolean z2) {
        final PeerConnectionFactory factory;
        final SharedPeerConnectionFactory sharedPeerConnectionFactory = this.X;
        if (sharedPeerConnectionFactory == null || (factory = sharedPeerConnectionFactory.getFactory()) == null) {
            return;
        }
        final String filePath = noiseSuppressorActiveState.getFilePath();
        final boolean z3 = (this.M || !z || filePath == null) ? false : true;
        this.c.execute(new Runnable() { // from class: xsna.s09
            @Override // java.lang.Runnable
            public final void run() {
                Call.this.a(noiseSuppressorActiveState, sharedPeerConnectionFactory, z2, factory, z3, filePath);
            }
        });
    }

    public final /* synthetic */ void a(NoiseSuppressorActiveState noiseSuppressorActiveState, SharedPeerConnectionFactory sharedPeerConnectionFactory, boolean z, PeerConnectionFactory peerConnectionFactory, boolean z2, String str) {
        Runnable qq4Var;
        Runnable onNoiseSuppressorDisabledDueToStutter = noiseSuppressorActiveState.getOnNoiseSuppressorDisabledDueToStutter();
        sharedPeerConnectionFactory.f(z);
        PeerConnectionFactory.EnhancerKind enhancerKind = noiseSuppressorActiveState.getEnhancerKind();
        int inputSampleRate = noiseSuppressorActiveState.getInputSampleRate();
        int outputSampleRate = noiseSuppressorActiveState.getOutputSampleRate();
        int fallbackTimeLimitMillis = noiseSuppressorActiveState.getFallbackTimeLimitMillis();
        int fallbackStutterCountMillis = noiseSuppressorActiveState.getFallbackStutterCountMillis();
        int fallbackTimeframeMillis = noiseSuppressorActiveState.getFallbackTimeframeMillis();
        boolean logTimings = noiseSuppressorActiveState.getLogTimings();
        if (z2) {
            qq4Var = new ls2(1, this, onNoiseSuppressorDisabledDueToStutter);
        } else {
            qq4Var = new qq4(1);
        }
        peerConnectionFactory.setPreprocessorParams(z2, enhancerKind, str, inputSampleRate, outputSampleRate, fallbackTimeLimitMillis, fallbackStutterCountMillis, fallbackTimeframeMillis, logTimings, qq4Var);
    }

    public final /* synthetic */ void a(SharedPeerConnectionFactory sharedPeerConnectionFactory, String str) {
        try {
            PeerConnectionFactory factory = sharedPeerConnectionFactory.getFactory();
            if (factory == null) {
                return;
            }
            factory.submitDumpRequest(str, Integer.MAX_VALUE, null);
        } catch (Throwable th) {
            this.logger.logException("OKRTCCall", "Error starting local audio dump", th);
        }
    }

    public final /* synthetic */ void a(String str, int i, DumpCallback dumpCallback) {
        try {
            PeerConnectionFactory factory = this.X.getFactory();
            if (factory == null) {
                return;
            }
            factory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis(i), dumpCallback);
        } catch (Throwable th) {
            this.logger.logException("OKRTCCall", "Error starting local audio dump", th);
        }
    }

    public final /* synthetic */ void a(String str, int i, Set set, DumpCallback dumpCallback) {
        try {
            PeerConnectionFactory factory = this.X.getFactory();
            if (factory == null) {
                return;
            }
            factory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis(i), set, dumpCallback);
        } catch (Throwable th) {
            this.logger.logException("OKRTCCall", "Error starting local audio dump", th);
        }
    }

    public final void a(CallParticipant.ParticipantId participantId, Signaling.Listener listener, Signaling.Listener listener2, JSONObject jSONObject) {
        this.logger.log("OKRTCCall", "handle response from signaling on add-participant command");
        try {
            int ordinal = onParticipantAddedToCall(participantId, jSONObject.optJSONObject(SignalingProtocol.KEY_PARTICIPANT)).ordinal();
            if (ordinal == 0) {
                if (listener != null) {
                    listener.onResponse(jSONObject);
                }
            } else if (ordinal == 1 && listener2 != null) {
                listener2.onResponse(new JSONObject().put("error", "state.accepted"));
            }
        } catch (JSONException e) {
            this.logger.reportException("OKRTCCall", "add.participant.success", e);
        }
    }

    public final void a(Runnable runnable) {
        this.logger.log("OKRTCCall", "disabling enhancer");
        if (isDestroyed()) {
            return;
        }
        this.M = true;
        setNoiseSuppressorParams(new NoiseSuppressorActiveState.Builder().setServersideAnn(true).setClientsidePlatform(true).build());
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(Exception exc, String str) {
        this.logger.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }
}
