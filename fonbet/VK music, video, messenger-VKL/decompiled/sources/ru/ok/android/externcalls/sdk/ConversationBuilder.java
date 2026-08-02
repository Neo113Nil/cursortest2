package ru.ok.android.externcalls.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import one.video.calls.sdk.experiments.c;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationConfig;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.d0y;
import xsna.qcy;
import xsna.wyg0;

/* loaded from: classes9.dex */
class ConversationBuilder {
    List<String> additionalWhitelistedCodecPrefixes;
    CallAnalyticsSender analyticsSender;
    AnimojiDataSupplierInterface animojiRenderProvider;

    @Nullable
    String anonToken;
    boolean answerAsContact;
    OkApi api;
    BadNetworkIndicatorConfig badNetworkIndicatorConfig;
    OKCameraCapturer.Factory cameraCapturerFactory;
    String cid;
    String clientType;
    Context context;
    ConversationFactory creator;
    boolean dnsResolverEnabled;
    String domainId;
    boolean enableLossRttBadConnectionHandling;
    ConversationEventsListener eventListener;
    ExecutionTimeInterceptor executionTimeInterceptor;
    ExecutorService executorService;

    @NonNull
    final one.video.calls.sdk.experiments.c experiments;
    IdsMapper<CallParticipant.ParticipantId, ParticipantId> externalIdsMapper;
    boolean forceRelayPolicy;
    CapturedFrameInterceptor frameInterceptor;
    MediaAdaptationConfig groupCallMediaAdaptationConfig;
    boolean hasVideo;
    IdMappingWrapper idMappingWrapper;
    ConversationParticipant initialOpponent;
    IdsMapper<ParticipantId, CallParticipant.ParticipantId> internalIdsMapper;
    boolean isAnswer;
    boolean isCaller;
    boolean isConsumerUpdateEnabled;
    boolean isDataChannelScreenshareRecvEnabled;
    boolean isDataChannelScreenshareSendEnabled;
    boolean isJoined;
    boolean isOnDemandTracksEnabled;
    boolean isWatchTogetherEnabledForAll;
    d0y joinConversationDelegate;
    String joinLink;
    RTCLog log;
    RTCLogConfiguration logConfiguration;

    /* renamed from: me, reason: collision with root package name */
    ConversationParticipant f104me;
    MediaConnectionSettings mediaConnectionSettings;
    long mediaReceivingTimeoutMs;
    boolean multipleDevicesEnabled;
    OkApiService okApiService;
    String payload;
    MediaAdaptationConfig ptpCallMediaAdaptationConfig;
    RttRateHintConfig rttRateHintConfig;
    ScreenCapturePermissionProvider screenCapturePermissionProvider;
    boolean showLocalVideoInOriginalQuality;
    wyg0 sslProvider;
    StartConversationDelegate startConversationDelegate;
    TimeProvider timeProvider;
    String version;
    boolean waitForAdminEnabled = false;
    int audioLevelFrequencyMs = 250;
    CallParams.Bitrates bitrates = null;
    int videoTracksCount = 10;
    boolean fastRecoverEnabled = false;
    boolean isWebRTCCodecFilteringEnabled = false;
    String[] audioCodecs = null;
    String[] videoCodecs = null;
    RotationProvider rotationProvider = RotationProvider.DISABLED;
    boolean isFastScreenCaptureEnabled = false;
    boolean isDeviceAudioShareEnabled = false;
    boolean isAsrOnlineEnabled = false;
    boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    Locale locale = null;
    ChatStateListener chatStateListener = ChatStateListener.EMPTY;

    @Nullable
    Long chatId = null;

    @NonNull
    ClientCapabilities clientCapabilities = ClientCapabilities.getDefault();

    @Nullable
    RemoteSettings remoteSettings = null;
    long ringingTimeout = 0;

    public ConversationBuilder(IdMappingWrapper idMappingWrapper, one.video.calls.sdk.experiments.c cVar) {
        this.idMappingWrapper = idMappingWrapper;
        this.experiments = cVar;
    }

    @CallInternalApi
    public ConversationImpl createConversation() {
        return new ConversationImpl(this);
    }

    public ConversationBuilder setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
        return this;
    }

    public ConversationBuilder setAnalyticsSender(CallAnalyticsSender callAnalyticsSender) {
        this.analyticsSender = callAnalyticsSender;
        return this;
    }

    public ConversationBuilder setAnimojiDataSupplier(AnimojiDataSupplierInterface animojiDataSupplierInterface) {
        this.animojiRenderProvider = animojiDataSupplierInterface;
        return this;
    }

    public ConversationBuilder setAnonToken(String str) {
        this.anonToken = str;
        return this;
    }

    public ConversationBuilder setAnswerAsContact(boolean z) {
        this.answerAsContact = z;
        return this;
    }

    public ConversationBuilder setApi(OkApi okApi) {
        this.api = okApi;
        return this;
    }

    public ConversationBuilder setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
        return this;
    }

    public ConversationBuilder setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
        return this;
    }

    public ConversationBuilder setBadNetworkIndicatorConfig(BadNetworkIndicatorConfig badNetworkIndicatorConfig) {
        this.badNetworkIndicatorConfig = badNetworkIndicatorConfig;
        return this;
    }

    public ConversationBuilder setBitrates(CallParams.Bitrates bitrates) {
        this.bitrates = bitrates;
        return this;
    }

    public ConversationBuilder setCameraCapturerFactory(OKCameraCapturer.Factory factory) {
        this.cameraCapturerFactory = factory;
        return this;
    }

    public ConversationBuilder setChatId(@Nullable Long l) {
        this.chatId = l;
        return this;
    }

    public ConversationBuilder setChatStateListener(@NonNull ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
        return this;
    }

    public ConversationBuilder setCid(String str) {
        this.cid = str;
        return this;
    }

    public ConversationBuilder setClientCapabilities(ClientCapabilities clientCapabilities) {
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault();
        }
        this.clientCapabilities = clientCapabilities;
        return this;
    }

    public ConversationBuilder setClientType(String str) {
        this.clientType = str;
        return this;
    }

    public ConversationBuilder setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
        return this;
    }

    public ConversationBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public ConversationBuilder setCreator(ConversationFactory conversationFactory) {
        this.creator = conversationFactory;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareRecvEnabled(boolean z) {
        this.isDataChannelScreenshareRecvEnabled = z;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareSendEnabled(boolean z) {
        this.isDataChannelScreenshareSendEnabled = z;
        return this;
    }

    public ConversationBuilder setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
        return this;
    }

    public ConversationBuilder setDnsResolverEnabled(boolean z) {
        this.dnsResolverEnabled = z;
        return this;
    }

    public ConversationBuilder setDomainId(String str) {
        this.domainId = str;
        return this;
    }

    public ConversationBuilder setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
        return this;
    }

    public ConversationBuilder setEventListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener = conversationEventsListener;
        return this;
    }

    public ConversationBuilder setExecutionTimeInterceptor(ExecutionTimeInterceptor executionTimeInterceptor) {
        this.executionTimeInterceptor = executionTimeInterceptor;
        return this;
    }

    public ConversationBuilder setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public ConversationBuilder setExternalIdsMapper(IdsMapper<CallParticipant.ParticipantId, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
        return this;
    }

    public ConversationBuilder setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
        return this;
    }

    public ConversationBuilder setFieldTrials(String str) {
        c.a aVar = this.experiments.m;
        qcy<Object> qcyVar = one.video.calls.sdk.experiments.c.j0[11];
        aVar.b(str);
        return this;
    }

    public ConversationBuilder setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
        return this;
    }

    public ConversationBuilder setFrameInterceptor(CapturedFrameInterceptor capturedFrameInterceptor) {
        this.frameInterceptor = capturedFrameInterceptor;
        return this;
    }

    public ConversationBuilder setGroupCallMediaAdaptationConfig(MediaAdaptationConfig mediaAdaptationConfig) {
        this.groupCallMediaAdaptationConfig = mediaAdaptationConfig;
        return this;
    }

    public ConversationBuilder setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public ConversationBuilder setInternalIdsMapper(IdsMapper<ParticipantId, CallParticipant.ParticipantId> idsMapper) {
        this.internalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setIsAnswer(boolean z) {
        this.isAnswer = z;
        return this;
    }

    public ConversationBuilder setIsCaller(boolean z) {
        this.isCaller = z;
        return this;
    }

    public ConversationBuilder setIsJoined(boolean z) {
        this.isJoined = z;
        return this;
    }

    public ConversationBuilder setIsLazyStart(boolean z) {
        c.a aVar = this.experiments.i0;
        qcy<Object> qcyVar = one.video.calls.sdk.experiments.c.j0[59];
        aVar.b(Boolean.valueOf(z));
        return this;
    }

    public ConversationBuilder setJoinLink(String str) {
        this.joinLink = str;
        return this;
    }

    public ConversationBuilder setLocale(Locale locale) {
        this.locale = locale;
        return this;
    }

    public ConversationBuilder setLog(RTCLog rTCLog) {
        this.log = rTCLog;
        return this;
    }

    public ConversationBuilder setLogConfiguration(RTCLogConfiguration rTCLogConfiguration) {
        this.logConfiguration = rTCLogConfiguration;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
        return this;
    }

    public ConversationBuilder setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
        return this;
    }

    public ConversationBuilder setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
        return this;
    }

    public ConversationBuilder setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
        return this;
    }

    public ConversationBuilder setMyId(@NonNull ParticipantId participantId) {
        this.f104me = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        return this;
    }

    public ConversationBuilder setOkApiService(@NonNull OkApiService okApiService) {
        this.okApiService = okApiService;
        return this;
    }

    public ConversationBuilder setOnDemandTracksEnabled(boolean z) {
        this.isOnDemandTracksEnabled = z;
        return this;
    }

    public ConversationBuilder setOpponentId(@Nullable ParticipantId participantId) {
        if (participantId != null) {
            this.initialOpponent = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        }
        return this;
    }

    public ConversationBuilder setP2PCallMediaAdaptationConfig(MediaAdaptationConfig mediaAdaptationConfig) {
        this.ptpCallMediaAdaptationConfig = mediaAdaptationConfig;
        return this;
    }

    public ConversationBuilder setPayload(String str) {
        this.payload = str;
        return this;
    }

    public ConversationBuilder setRemoteSettings(RemoteSettings remoteSettings) {
        this.remoteSettings = remoteSettings;
        return this;
    }

    public ConversationBuilder setRingingTimeout(long j) {
        this.ringingTimeout = j;
        return this;
    }

    public ConversationBuilder setRotationProvider(RotationProvider rotationProvider) {
        this.rotationProvider = rotationProvider;
        return this;
    }

    public ConversationBuilder setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
        return this;
    }

    public ConversationBuilder setScreenCapturePermissionProvider(ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        this.screenCapturePermissionProvider = screenCapturePermissionProvider;
        return this;
    }

    public ConversationBuilder setStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.startConversationDelegate = startConversationDelegate;
        return this;
    }

    public ConversationBuilder setTimeProvider(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
        return this;
    }

    public ConversationBuilder setVersion(String str) {
        this.version = str;
        return this;
    }

    public ConversationBuilder setVideoTracksCount(int i) {
        this.videoTracksCount = i;
        return this;
    }

    public ConversationBuilder setWaitForAdminEnabled(boolean z) {
        this.waitForAdminEnabled = z;
        return this;
    }

    public ConversationBuilder setWatchTogetherEnabledForAll(boolean z) {
        this.isWatchTogetherEnabledForAll = z;
        return this;
    }

    public ConversationBuilder setWebRTCAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
        return this;
    }

    public ConversationBuilder setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setWebRTCVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
        return this;
    }

    public ConversationBuilder showLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
        return this;
    }

    public ConversationBuilder setJoinConversationDelegate(d0y d0yVar) {
        return this;
    }

    public ConversationBuilder setSSLProvider(wyg0 wyg0Var) {
        return this;
    }
}
