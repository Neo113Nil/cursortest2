package ru.ok.android.webrtc.di;

import android.content.Context;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.vk.movika.sdk.base.logic.interactor.b;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import okcalls.x;
import okcalls.y;
import org.webrtc.EglBase;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.CallFlags;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.LocalMediaPermissionProvider;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.SimpleVideoCaptureFactory;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.api.CallApiService;
import ru.ok.android.webrtc.asr.CallAsrRecordManager;
import ru.ok.android.webrtc.asr_online.CallAsrOnlineManagerImpl;
import ru.ok.android.webrtc.codecs.CodecListEstimator;
import ru.ok.android.webrtc.di.factory.AnimojiCoreFactory;
import ru.ok.android.webrtc.di.factory.CallSessionRoomsManagerFactory;
import ru.ok.android.webrtc.di.factory.SignalingNotificationHandlersFactory;
import ru.ok.android.webrtc.di.factory.StatListenerManagerFactory;
import ru.ok.android.webrtc.events.destroy.CallEndInfoHolder;
import ru.ok.android.webrtc.listeners.CallListenersImpl;
import ru.ok.android.webrtc.log.CallCodecLogger;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.mediaadaptation.DelegatingNetworkConditionProvider;
import ru.ok.android.webrtc.mediamodifiers.MediaModifiers;
import ru.ok.android.webrtc.notification.SignalingNotificationLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.talking.OwnTalkingReporter;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsParser;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.notifications.handlers.RtcNotificationHandlers;
import ru.ok.android.webrtc.record.CallRecordManager;
import ru.ok.android.webrtc.record.RecordInfoProvider;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.CallSessionRooms;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettingsCreator;
import ru.ok.android.webrtc.signaling.parser.SignalingParsers;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.stat.CallAnalytics;
import ru.ok.android.webrtc.stat.StatsReportHandler;
import ru.ok.android.webrtc.stat.call.CallStatisticsLogger;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.DummyCallTopology;
import ru.ok.android.webrtc.utils.BadConnectionProcessor;
import ru.ok.android.webrtc.utils.CodeBlockDurationLogger;
import ru.ok.android.webrtc.utils.Condition;
import ru.ok.android.webrtc.utils.CropAndScaleParamsProviderImpl;
import ru.ok.android.webrtc.utils.HardwareVideoEncoderExceptionHandlerImpl;
import ru.ok.android.webrtc.utils.PeerVideoSettingsAdapter;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.utils.TopologyProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.bpn0;
import xsna.d69;
import xsna.op0;
import xsna.qs90;
import xsna.rj1;
import xsna.s3q0;
import xsna.sx0;
import xsna.t61;
import xsna.ux0;
import xsna.vf0;
import xsna.wm1;
import xsna.xm1;
import xsna.y6;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallModuleImpl implements CallModule {
    public final DummyCallTopology A;
    public final TopologyProvider B;
    public final CallStatisticsLoggerModuleImpl C;
    public final EglBase D;
    public final ExecutorService E;
    public final ExecutorService F;
    public final DelegatingNetworkConditionProvider G;
    public final SharedPeerConnectionFactory H;
    public final LocalMediaPermissionProvider I;
    public final SimpleVideoCaptureFactory J;
    public final CallMediaOptionsDelegate K;
    public final SignalingParsers L;
    public final FirstDataStatModuleImpl M;
    public final Lazy N;
    public final Context a;
    public final CallParams b;
    public final boolean c;
    public final boolean d;
    public final CallParticipant e;
    public final ConversationIdProvider f;
    public final RTCLog g;
    public final RTCLogConfiguration h;
    public final OKCameraCapturer.Factory i;
    public final RotationProvider j;
    public final AnimojiDataSupplierInterface k;
    public final TimeProvider l;
    public final PreferencesHelper m;
    public final ScreenCapturePermissionProvider n;
    public final CallFlags o;
    public final CallApiService p;
    public final CallTimings q;
    public final RecordInfoProvider r;
    public final qs90 s;
    public final long t;
    public final CallListenersImpl u;
    public final CallSessionRooms v;
    public final CallParticipants w;
    public final WebRTCToInternalStatsMapper x;
    public final MappingProcessor y;
    public final CropAndScaleParamsProviderImpl z;

    public CallModuleImpl(Context context, CallParams callParams, boolean z, boolean z2, CallParticipant callParticipant, ConversationIdProvider conversationIdProvider, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, OKCameraCapturer.Factory factory, RotationProvider rotationProvider, AnimojiDataSupplierInterface animojiDataSupplierInterface, TimeProvider timeProvider, CallAnalyticsSender callAnalyticsSender, PreferencesHelper preferencesHelper, ScreenCapturePermissionProvider screenCapturePermissionProvider, CallFlags callFlags, CallApiService callApiService, CallTimings callTimings, RecordInfoProvider recordInfoProvider, qs90 qs90Var, long j) {
        this.a = context;
        this.b = callParams;
        this.c = z;
        this.d = z2;
        this.e = callParticipant;
        this.f = conversationIdProvider;
        this.g = rTCLog;
        this.h = rTCLogConfiguration;
        this.i = factory;
        this.j = rotationProvider;
        this.k = animojiDataSupplierInterface;
        this.l = timeProvider;
        this.m = preferencesHelper;
        this.n = screenCapturePermissionProvider;
        this.o = callFlags;
        this.p = callApiService;
        this.q = callTimings;
        this.r = recordInfoProvider;
        this.s = qs90Var;
        this.t = j;
        CallListenersImpl callListenersImpl = new CallListenersImpl(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        this.u = callListenersImpl;
        CallSessionRooms callSessionRooms = new CallSessionRooms(callListenersImpl);
        this.v = callSessionRooms;
        CallParticipants callParticipants = new CallParticipants(callParticipant, callListenersImpl, callSessionRooms, rTCLog);
        this.w = callParticipants;
        WebRTCToInternalStatsMapper webRTCToInternalStatsMapper = new WebRTCToInternalStatsMapper(rTCLog);
        this.x = webRTCToInternalStatsMapper;
        this.y = new MappingProcessor();
        CropAndScaleParamsProviderImpl cropAndScaleParamsProviderImpl = new CropAndScaleParamsProviderImpl(0, 1, null);
        this.z = cropAndScaleParamsProviderImpl;
        HardwareVideoEncoderExceptionHandlerImpl hardwareVideoEncoderExceptionHandlerImpl = new HardwareVideoEncoderExceptionHandlerImpl(rTCLog);
        this.A = new DummyCallTopology(callParticipants, callParams, rTCLog, callListenersImpl, timeProvider, callTimings, cropAndScaleParamsProviderImpl);
        TopologyProvider topologyProvider = new TopologyProvider(new wm1(this, 10));
        this.B = topologyProvider;
        CallStatisticsLoggerModuleImpl callStatisticsLoggerModuleImpl = new CallStatisticsLoggerModuleImpl(context, new CallAnalytics(callAnalyticsSender), timeProvider, (ConnectivityManager) context.getSystemService("connectivity"), (TelephonyManager) context.getSystemService("phone"), rTCLog, topologyProvider, conversationIdProvider, callParams);
        this.C = callStatisticsLoggerModuleImpl;
        EglBase create = EglBase.create();
        this.D = create;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.E = newSingleThreadExecutor;
        this.F = Executors.newSingleThreadExecutor();
        DelegatingNetworkConditionProvider delegatingNetworkConditionProvider = new DelegatingNetworkConditionProvider(rTCLog);
        this.G = delegatingNetworkConditionProvider;
        this.H = new SharedPeerConnectionFactory(context, newSingleThreadExecutor, create, rTCLog, callParams, delegatingNetworkConditionProvider, callStatisticsLoggerModuleImpl.getCallEventualStatSender(), context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency"), topologyProvider, cropAndScaleParamsProviderImpl, hardwareVideoEncoderExceptionHandlerImpl);
        LocalMediaPermissionProvider localMediaPermissionProvider = new LocalMediaPermissionProvider(context, rTCLog);
        this.I = localMediaPermissionProvider;
        this.J = new SimpleVideoCaptureFactory.Builder(context).setAdditionalWhitelistedCodecPrefixes(callParams.getAdditionalWhitelistedCodecPrefixes()).setOkCameraCapturerFactory(factory).setMediaPermissionsProvider(localMediaPermissionProvider).setUseCamera2Api(callParams.getExperiments().M()).setRtcLog(rTCLog).build();
        CallMediaOptionsDelegate callMediaOptionsDelegate = new CallMediaOptionsDelegate(callParticipants, rTCLog, new d69((byte) 0, 0), new SessionRoomCommonParser(rTCLog), new y(callParticipants, CallParticipants.class, "activeRoomId", "getActiveRoomId()Lru/ok/android/webrtc/sessionroom/SessionRoomId;", 0), localMediaPermissionProvider, callParams);
        this.K = callMediaOptionsDelegate;
        this.L = new SignalingParsers(rTCLog, callParticipants.getCurrentUserParticipant(), callMediaOptionsDelegate);
        this.M = new FirstDataStatModuleImpl(callStatisticsLoggerModuleImpl.getCallEventualStatSender(), webRTCToInternalStatsMapper, timeProvider, z, z2, new xm1(this, 8), topologyProvider, new x(0, callParticipants, CallParticipants.class, "size", "size()I", 0), rTCLog);
        this.N = new bpn0(new m(6));
    }

    public static final void a(CallModuleImpl callModuleImpl, StatsTrackIdClassifier statsTrackIdClassifier) {
        callModuleImpl.x.setStatsTrackIdClassifier(statsTrackIdClassifier);
    }

    public static final CallParticipant.ParticipantId c(CallModuleImpl callModuleImpl) {
        return callModuleImpl.e.getParticipantId();
    }

    public static final CodecListEstimator d() {
        return new CodecListEstimator();
    }

    public static final CallRecordManager f(CallModuleImpl callModuleImpl) {
        return new CallRecordManager(callModuleImpl.L.recordInfoParser, callModuleImpl.u, callModuleImpl.r);
    }

    public static final ScreenshareFirstFrameStat g(CallModuleImpl callModuleImpl) {
        return new ScreenshareFirstFrameStat(callModuleImpl.C.getCallEventualStatSender(), callModuleImpl.l);
    }

    public static final SignalingNotificationLogger h(CallModuleImpl callModuleImpl) {
        return new SignalingNotificationLogger(callModuleImpl.g, callModuleImpl.h);
    }

    public static final CallTopology i(CallModuleImpl callModuleImpl) {
        return callModuleImpl.A;
    }

    public final Lazy b() {
        return new bpn0(new rj1(this, 10));
    }

    public final SharedLocalMediaStreamSource.Builder e() {
        return new SharedLocalMediaStreamSource.Builder().setSharedPeerConnectionFactory(this.H).setVideoCaptureFactory(this.J).setMaxCameraFrameDimension(Integer.valueOf(this.b.getExperiments().b())).setMediaSettings(this.e.mediaSettings).setContext(this.a).setRtcLog(this.g).setStartCameraCapturerOnDemand(this.b.getStartCameraCapturerOnDemand()).setEglContext(this.D.getEglBaseContext()).setParams(this.b).setScreenshareChecker(new ux0(this, 6)).setMediaPermissionsProvider(this.I).setRotationProvider(this.j).setTimeProvider(this.l).setStatsTrackIdClassifierConsumer(new op0(this, 3));
    }

    @Override // ru.ok.android.webrtc.di.CallModule
    public Call getCall() {
        Context context = this.a;
        TimeProvider timeProvider = this.l;
        CallListenersImpl callListenersImpl = this.u;
        CallSessionRooms callSessionRooms = this.v;
        CallParticipants callParticipants = this.w;
        CallParams callParams = this.b;
        Lazy c = c();
        boolean z = this.c;
        boolean z2 = this.d;
        MutableMediaSettings mutableMediaSettings = this.e.mediaSettings;
        MediaModifiers mediaModifiers = new MediaModifiers();
        ConversationIdProvider conversationIdProvider = this.f;
        RTCLog rTCLog = this.g;
        PreferencesHelper preferencesHelper = this.m;
        boolean isDataChannelScreenshareSendEnabled = this.b.isDataChannelScreenshareSendEnabled();
        MappingProcessor mappingProcessor = this.y;
        CallWaitingRoomParticipantsParser callWaitingRoomParticipantsParser = new CallWaitingRoomParticipantsParser(this.g);
        BadConnectionProcessor badConnectionProcessor = new BadConnectionProcessor(this.b.getBadNetworkIndicatorConfig().getCalcNetworkStatusConfig() != null, this.b.getBadNetworkIndicatorConfig().getSignalingConfig().getDcReportNetworkStatEnabled());
        CodeBlockDurationLogger codeBlockDurationLogger = new CodeBlockDurationLogger(this.g);
        StatListenerManagerFactory statListenerManagerFactory = new StatListenerManagerFactory(this.g, this.l, this.b.getExperiments().I());
        CallStatisticsLogger callStatisticsLogger = this.C.getCallStatisticsLogger();
        DummyCallTopology dummyCallTopology = this.A;
        TopologyProvider topologyProvider = this.B;
        StatsReportHandler statsReportHandler = new StatsReportHandler(this.b, this.g, this.w.getCurrentUserParticipant());
        CallCodecLogger callCodecLogger = new CallCodecLogger(this.g);
        EglBase eglBase = this.D;
        CallOpenGLRenderer callOpenGLRenderer = new CallOpenGLRenderer(this.g, this.D.getEglBaseContext(), EglBase.CONFIG_PLAIN, null);
        ExecutorService executorService = this.E;
        ExecutorService executorService2 = this.F;
        Condition condition = new Condition("pc_created", this.g);
        Condition condition2 = new Condition("accepted", this.g);
        DelegatingNetworkConditionProvider delegatingNetworkConditionProvider = this.G;
        SharedPeerConnectionFactory sharedPeerConnectionFactory = this.H;
        LocalMediaPermissionProvider localMediaPermissionProvider = this.I;
        SimpleVideoCaptureFactory simpleVideoCaptureFactory = this.J;
        SharedLocalMediaStreamSource.Builder e = e();
        boolean enableLossRttBadConnectionHandling = this.b.getEnableLossRttBadConnectionHandling();
        Lazy j = j();
        SignalingMediaSettingsCreator signalingMediaSettingsCreator = new SignalingMediaSettingsCreator();
        AnimojiCoreFactory animojiCoreFactory = new AnimojiCoreFactory(this.H, this.g, this.y, this.k, this.e.mediaSettings, this.D);
        AnimojiDataSupplierInterface animojiDataSupplierInterface = this.k;
        CallMediaOptionsDelegate callMediaOptionsDelegate = this.K;
        return new Call(context, timeProvider, callListenersImpl, callSessionRooms, callParticipants, callParams, c, z, z2, mutableMediaSettings, mediaModifiers, conversationIdProvider, rTCLog, preferencesHelper, isDataChannelScreenshareSendEnabled, mappingProcessor, callWaitingRoomParticipantsParser, badConnectionProcessor, codeBlockDurationLogger, statListenerManagerFactory, callStatisticsLogger, dummyCallTopology, topologyProvider, statsReportHandler, callCodecLogger, eglBase, callOpenGLRenderer, executorService, executorService2, condition, condition2, delegatingNetworkConditionProvider, sharedPeerConnectionFactory, localMediaPermissionProvider, simpleVideoCaptureFactory, e, enableLossRttBadConnectionHandling, j, signalingMediaSettingsCreator, animojiCoreFactory, animojiDataSupplierInterface, callMediaOptionsDelegate, this.L, new CallSessionRoomsManagerFactory(this.g, this.w, this.v, callMediaOptionsDelegate, this.u, this.l), new SignalingNotificationHandlersFactory(this.w, this.L, this.u, this.g), new RtcNotificationHandlers(this.u, this.g), h(), b(), a(), i(), this.M.getFirstDataStat(), this.M.getFirstDataStatCallParticipantsListener(), this.n, f(), new CallEndInfoHolder(this.g), Camera.getNumberOfCameras(), this.o, this.p, this.q, this.x, getPeerVideoSettingsAdapter(), this.z, this.s, this.t);
    }

    @Override // ru.ok.android.webrtc.di.CallModule
    public PeerVideoSettingsAdapter getPeerVideoSettingsAdapter() {
        return (PeerVideoSettingsAdapter) this.N.getValue();
    }

    public final Lazy j() {
        return new bpn0(new b(this, 9));
    }

    public static final s3q0 a(CallEvents callEvents, Object obj) {
        return s3q0.a;
    }

    public static Lazy c() {
        return new bpn0(new t61(6));
    }

    public static final boolean d(CallModuleImpl callModuleImpl) {
        return callModuleImpl.b.isDataChannelScreenshareSendEnabled();
    }

    public static final PeerVideoSettingsAdapter g() {
        return new PeerVideoSettingsAdapter();
    }

    public final OwnTalkingReporter f() {
        return new OwnTalkingReporter(this.g, new sx0(this, 9));
    }

    public final Lazy h() {
        return new bpn0(new vf0(this, 12));
    }

    public final Lazy i() {
        return new bpn0(new y6(this, 8));
    }

    public static final CallAsrRecordManager b(CallModuleImpl callModuleImpl) {
        return new CallAsrRecordManager(callModuleImpl.L.asrParser, callModuleImpl.u);
    }

    public final Lazy a() {
        return new bpn0(new h(this, 9));
    }

    public static final CallAsrOnlineManagerImpl a(CallModuleImpl callModuleImpl) {
        return new CallAsrOnlineManagerImpl(callModuleImpl.u);
    }

    public static final boolean e(CallModuleImpl callModuleImpl) {
        return callModuleImpl.w.getCurrentUserParticipant().isAudioEnabled();
    }
}
