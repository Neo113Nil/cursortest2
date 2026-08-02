package ru.ok.android.externcalls.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.request.GetSystemInfo;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;
import ru.ok.android.externcalls.sdk.events.SharedAnalyticsEvent;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;
import ru.ok.android.internal.tracer.TracerLiteFacade;
import ru.ok.android.internal.tracer.TracerRTCLog;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.PeerConnectionParameters;
import ru.ok.android.webrtc.PeerConnectionWebRtcParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.TimeProviderExtKt;
import xsna.b1j;
import xsna.i8;
import xsna.izs;
import xsna.ja6;
import xsna.jrj;
import xsna.k60;
import xsna.krj;
import xsna.la2;
import xsna.lrj;
import xsna.ob;
import xsna.pb;
import xsna.vq;
import xsna.wh1;
import xsna.x4;
import xsna.yqf;
import xsna.zqf;

/* loaded from: classes9.dex */
public class ConversationFactory extends ConversationFactoryParams {
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "0.2.3";
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private static volatile Long keepSharedSettingsStorageTimeMs = null;
    private final CallAnalyticsSender.Listener analyticsSenderListener;
    private AnimojiDataSupplierInterface animojiDataSupplier;
    private final OkApi api;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private final io.reactivex.rxjava3.disposables.b disposable;
    private String domainId;

    @NonNull
    private ExecutionTimeInterceptor executionTimeInterceptor;
    private final one.video.calls.sdk.experiments.a experimentsManager;
    private IdsMapper<CallParticipant.ParticipantId, ParticipantId> externalIdsMapper;
    private volatile WeakReference<AnalyticsEventListener> externalListener;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, CallParticipant.ParticipantId> internalIdsMapper;
    private Locale locale;
    private RTCLogConfiguration logConfiguration;

    @NonNull
    private OkApiService okApiService;
    private RemoteSettings remoteSettings;
    private final Object remoteSettingsLock;

    @NonNull
    private final TimeProvider timeProvider;
    private final TracerLiteFacade tracerLiteFacade;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$2, reason: invalid class name */
    public class AnonymousClass2 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ StartCallParams val$params;

        public AnonymousClass2(ConversationImpl conversationImpl, StartCallParams startCallParams) {
            this.val$conversation = conversationImpl;
            this.val$params = startCallParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$0(StartCallParams startCallParams, Conversation conversation) {
            startCallParams.getOnPrepared().invoke(conversation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$1(StartCallParams startCallParams, Throwable th) {
            startCallParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final StartCallParams startCallParams = this.val$params;
            conversationImpl.prepare(null, new Consumer() { // from class: ru.ok.android.externcalls.sdk.a
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass2.lambda$start$0(StartCallParams.this, (Conversation) obj);
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.b
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass2.lambda$start$1(StartCallParams.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$3, reason: invalid class name */
    public class AnonymousClass3 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinCallParams val$params;

        public AnonymousClass3(ConversationImpl conversationImpl, JoinCallParams joinCallParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinCallParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$0(JoinCallParams joinCallParams, Conversation conversation) {
            joinCallParams.getOnPrepared().invoke(conversation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$1(JoinCallParams joinCallParams, Throwable th) {
            joinCallParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinCallParams joinCallParams = this.val$params;
            conversationImpl.prepare(null, new Consumer() { // from class: ru.ok.android.externcalls.sdk.c
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass3.lambda$start$0(JoinCallParams.this, (Conversation) obj);
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.d
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass3.lambda$start$1(JoinCallParams.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$4, reason: invalid class name */
    public class AnonymousClass4 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinByLinkParams val$params;

        public AnonymousClass4(ConversationImpl conversationImpl, JoinByLinkParams joinByLinkParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinByLinkParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$0(JoinByLinkParams joinByLinkParams, Conversation conversation) {
            joinByLinkParams.getOnPrepared().invoke(conversation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$1(JoinByLinkParams joinByLinkParams, Throwable th) {
            joinByLinkParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinByLinkParams joinByLinkParams = this.val$params;
            conversationImpl.prepareJoinByLink(new Consumer() { // from class: ru.ok.android.externcalls.sdk.e
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass4.lambda$start$0(JoinByLinkParams.this, (Conversation) obj);
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.f
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass4.lambda$start$1(JoinByLinkParams.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$5, reason: invalid class name */
    public class AnonymousClass5 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinAnonByLinkParams val$params;

        public AnonymousClass5(ConversationImpl conversationImpl, JoinAnonByLinkParams joinAnonByLinkParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinAnonByLinkParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$0(JoinAnonByLinkParams joinAnonByLinkParams, Conversation conversation) {
            joinAnonByLinkParams.getOnPrepared().invoke(conversation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$1(JoinAnonByLinkParams joinAnonByLinkParams, Throwable th) {
            joinAnonByLinkParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinAnonByLinkParams joinAnonByLinkParams = this.val$params;
            conversationImpl.prepareJoinByLink(new Consumer() { // from class: ru.ok.android.externcalls.sdk.g
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass5.lambda$start$0(JoinAnonByLinkParams.this, (Conversation) obj);
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.h
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass5.lambda$start$1(JoinAnonByLinkParams.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$6, reason: invalid class name */
    public class AnonymousClass6 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ CreateConfParams val$params;

        public AnonymousClass6(ConversationImpl conversationImpl, CreateConfParams createConfParams) {
            this.val$conversation = conversationImpl;
            this.val$params = createConfParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$0(CreateConfParams createConfParams, Conversation conversation) {
            createConfParams.getOnPrepared().invoke(conversation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$start$1(CreateConfParams createConfParams, Throwable th) {
            createConfParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final CreateConfParams createConfParams = this.val$params;
            conversationImpl.prepare(null, true, new Consumer() { // from class: ru.ok.android.externcalls.sdk.i
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass6.lambda$start$0(CreateConfParams.this, (Conversation) obj);
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.j
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationFactory.AnonymousClass6.lambda$start$1(CreateConfParams.this, (Throwable) obj);
                }
            });
        }
    }

    public ConversationFactory(@NonNull OkApi okApi, @NonNull Context context, @NonNull String str) {
        this(okApi, context, str, null);
    }

    @NonNull
    private LazyConversation callInternal(@NonNull izs<StartCallParams.Builder, StartCallParams> izsVar, boolean z) {
        StartCallParams invoke = izsVar.invoke(new StartCallParams.Builder());
        ConversationBuilder ringingTimeout = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(true).setPayload(invoke.getPayload()).setCid(invoke.getConversationId() != null ? invoke.getConversationId().toString() : generateConversationId()).setEventListener(invoke.getEventListener()).setFrameInterceptor(invoke.getFrameInterceptor()).setWatchTogetherEnabledForAll(invoke.isWatchTogetherEnabledForAll()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).setOpponentId(invoke.getOpponentId()).setChatId(invoke.getChatId()).setFieldTrials(invoke.getFieldTrials()).setStartConversationDelegate(this.p2pStartConversationDelegate).setWaitForAdminEnabled(invoke.isWaitingForAdminEnabled()).setIsLazyStart(z).setRingingTimeout(invoke.getRingingTimeout());
        if (invoke.getTokenProvider() != null) {
            ringingTimeout.setApi(this.api.newBuilder().withWrappedConfigurationStorage(new la2(19)).setTokenProvider(invoke.getTokenProvider()).build());
        }
        if (invoke.getTokenInfoProvider() != null) {
            ringingTimeout.setApi(this.api.newBuilder().withWrappedSessionStore(new wh1(13)).setTokenInfoProvider(invoke.getTokenInfoProvider()).build());
        }
        return new AnonymousClass2(ringingTimeout.createConversation(), invoke);
    }

    @NonNull
    private LazyConversation createConfRoomInternal(@NonNull izs<CreateConfParams.Builder, CreateConfParams> izsVar, boolean z) {
        CreateConfParams invoke = izsVar.invoke(new CreateConfParams.Builder());
        ConversationBuilder isLazyStart = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(true).setPayload(invoke.getPayload()).setChatId(invoke.getChatId()).setCid(invoke.getConversationId() != null ? invoke.getConversationId().toString() : generateConversationId()).setEventListener(invoke.getEventListener()).setFrameInterceptor(invoke.getFrameInterceptor()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(invoke.isWatchTogetherEnabledForAll()).setMyId(invoke.getMyId()).setFieldTrials(invoke.getFieldTrials()).setStartConversationDelegate(this.confroomStartConversationDelegate).setWaitForAdminEnabled(invoke.isWaitingForAdminEnabled()).setIsLazyStart(z);
        if (invoke.getTokenProvider() != null) {
            isLazyStart.setApi(this.api.newBuilder().setTokenProvider(invoke.getTokenProvider()).withWrappedConfigurationStorage(new la2(19)).build());
        }
        if (invoke.getTokenInfoProvider() != null) {
            isLazyStart.setApi(this.api.newBuilder().withWrappedSessionStore(new k60(23)).setTokenInfoProvider(invoke.getTokenInfoProvider()).build());
        }
        ConversationImpl createConversation = isLazyStart.createConversation();
        createConversation.initStore(invoke.getInitialIds());
        return new AnonymousClass6(createConversation, invoke);
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private RemoteSettings getRemoteSettings() {
        Long l = keepSharedSettingsStorageTimeMs;
        synchronized (this.remoteSettingsLock) {
            if (l != null) {
                try {
                    if (this.remoteSettings == null) {
                        this.remoteSettings = new RemoteSettingsShared(this.api.getRxApiClient(), this.timeProvider, new b1j(this, 1), RemoteSettings.getKeys(), l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.remoteSettings;
    }

    public static synchronized void init(@NonNull Context context) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context).build());
        }
    }

    @NonNull
    private LazyConversation joinAnonByLinkInternal(@NonNull izs<JoinAnonByLinkParams.Builder, JoinAnonByLinkParams> izsVar, boolean z) {
        JoinAnonByLinkParams invoke = izsVar.invoke(new JoinAnonByLinkParams.Builder());
        OkApi.Builder newBuilder = this.api.newBuilder();
        if (newBuilder.getTokenInfoProvider() == null || invoke.getApiEndpoint() == null) {
            newBuilder.withWrappedConfigurationStorage(new la2(19)).setTokenProvider(new vq(11));
        } else {
            newBuilder.withWrappedSessionStore(new ob(17)).setTokenInfoProvider(new pb(invoke, 15));
        }
        ConversationImpl createConversation = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(invoke.getEventListener()).setFrameInterceptor(invoke.getFrameInterceptor()).setJoinLink(invoke.getLink()).setApi(newBuilder.build()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).setFieldTrials(invoke.getFieldTrials()).setAnonToken(invoke.getToken()).setJoinConversationDelegate(null).setIsLazyStart(z).createConversation();
        createConversation.initAsConfJoin();
        return new AnonymousClass5(createConversation, invoke);
    }

    @NonNull
    private LazyConversation joinByLinkInternal(@NonNull izs<JoinByLinkParams.Builder, JoinByLinkParams> izsVar, boolean z) {
        JoinByLinkParams invoke = izsVar.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder isLazyStart = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(invoke.getEventListener()).setFrameInterceptor(invoke.getFrameInterceptor()).setJoinLink(invoke.getLink()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setPayload(invoke.getPayload()).setMyId(invoke.getMyId()).setJoinConversationDelegate(null).setFieldTrials(invoke.getFieldTrials()).setIsLazyStart(z);
        if (invoke.getTokenProvider() != null) {
            isLazyStart.setApi(this.api.newBuilder().setTokenProvider(invoke.getTokenProvider()).withWrappedConfigurationStorage(new la2(19)).build());
        }
        if (invoke.getTokenInfoProvider() != null) {
            isLazyStart.setApi(this.api.newBuilder().withWrappedSessionStore(new x4(23)).setTokenInfoProvider(invoke.getTokenInfoProvider()).build());
        }
        ConversationImpl createConversation = isLazyStart.createConversation();
        createConversation.initAsConfJoin();
        return new AnonymousClass4(createConversation, invoke);
    }

    @NonNull
    private LazyConversation joinInternal(@NonNull izs<JoinCallParams.Builder, JoinCallParams> izsVar, boolean z) {
        JoinCallParams invoke = izsVar.invoke(new JoinCallParams.Builder());
        ConversationImpl createConversation = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setCid(invoke.getConversationId()).setEventListener(invoke.getEventListener()).setFrameInterceptor(invoke.getFrameInterceptor()).setChatId(invoke.getChatId()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setMyId(invoke.getMyId()).setFieldTrials(invoke.getFieldTrials()).setIsLazyStart(z).createConversation();
        createConversation.initAsConfJoin();
        return new AnonymousClass3(createConversation, invoke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiSessionStore lambda$answer$3(ApiSessionStore apiSessionStore) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$4(AnswerCallParams answerCallParams, Conversation conversation) {
        answerCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$5(AnswerCallParams answerCallParams, Throwable th) {
        answerCallParams.getOnError().invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiSessionStore lambda$callInternal$2(ApiSessionStore apiSessionStore) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiSessionStore lambda$createConfRoomInternal$10(ApiSessionStore apiSessionStore) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RTCLog lambda$getRemoteSettings$14() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$hangup$11(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.skipValue();
        return new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiSessionStore lambda$joinAnonByLinkInternal$7(ApiSessionStore apiSessionStore) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiTokenInfoProvider.Info lambda$joinAnonByLinkInternal$8(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new ApiTokenInfoProvider.Info(null, joinAnonByLinkParams.getApiEndpoint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$joinAnonByLinkInternal$9() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApiSessionStore lambda$joinByLinkInternal$6(ApiSessionStore apiSessionStore) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RTCLog lambda$new$0() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RTCLog lambda$new$1() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestServerTime$15() {
        try {
            GetSystemInfo.Response response = (GetSystemInfo.Response) this.api.getRxApiClient().execute((ApiExecutableRequest) new GetSystemInfo.Request()).c();
            Long serverTime = response.getServerTime();
            if (serverTime != null) {
                TimeProviderExtKt.setServerTimeMs(this.timeProvider, serverTime.longValue());
            }
            this.log.log(LOG_TAG, "Server time: " + response.getServerTime());
        } catch (Throwable th) {
            this.log.logException(LOG_TAG, "Can't get server time ", th);
        }
    }

    private void requestServerTime() {
        try {
            io.reactivex.rxjava3.schedulers.a.b().c(new ja6(this, 4));
        } catch (Throwable th) {
            this.log.logException(LOG_TAG, "Can't schedule server time request", th);
        }
    }

    @NonNull
    public Conversation answer(@NonNull izs<AnswerCallParams.Builder, AnswerCallParams> izsVar) {
        final AnswerCallParams invoke = izsVar.invoke(new AnswerCallParams.Builder());
        ConversationParams conversationParams = null;
        ConversationBuilder fieldTrials = getBaseBuilder().setHasVideo(invoke.getShouldStartWithVideo()).setAnswerAsContact(invoke.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload(null).setCid(invoke.getConversationId()).setEventListener(invoke.getEventListener()).setCameraCapturerFactory(invoke.getCameraCapturerFactory()).setFrameInterceptor(invoke.getFrameInterceptor()).setMyId(invoke.getMyId()).setOpponentId(invoke.getOpponentId()).setFieldTrials(invoke.getFieldTrials());
        if (invoke.getTokenProvider() != null) {
            fieldTrials.setApi(this.api.newBuilder().withWrappedConfigurationStorage(new la2(19)).setTokenProvider(invoke.getTokenProvider()).build());
        }
        if (invoke.getTokenInfoProvider() != null) {
            fieldTrials.setApi(this.api.newBuilder().withWrappedSessionStore(new i8(28)).setTokenInfoProvider(invoke.getTokenInfoProvider()).build());
        }
        ConversationImpl createConversation = fieldTrials.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParams = ConversationParams.decode(invoke.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        createConversation.prepare(conversationParams, new Consumer() { // from class: xsna.mrj
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationFactory.lambda$answer$4(AnswerCallParams.this, (Conversation) obj);
            }
        }, new Consumer() { // from class: xsna.nrj
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationFactory.lambda$answer$5(AnswerCallParams.this, (Throwable) obj);
            }
        });
        return createConversation;
    }

    @NonNull
    public Conversation call(@NonNull izs<StartCallParams.Builder, StartCallParams> izsVar) {
        LazyConversation callInternal = callInternal(izsVar, false);
        callInternal.start();
        return callInternal.getConversation();
    }

    @NonNull
    public LazyConversation callLazy(@NonNull izs<StartCallParams.Builder, StartCallParams> izsVar) {
        return callInternal(izsVar, true);
    }

    public void clearApiAuthSession() {
        this.api.getOkApiHolder().clearSession();
    }

    @NonNull
    public Conversation createConfRoom(@NonNull izs<CreateConfParams.Builder, CreateConfParams> izsVar) {
        LazyConversation createConfRoomInternal = createConfRoomInternal(izsVar, false);
        createConfRoomInternal.start();
        return createConfRoomInternal.getConversation();
    }

    @NonNull
    public LazyConversation createConfRoomLazy(@NonNull izs<CreateConfParams.Builder, CreateConfParams> izsVar) {
        return createConfRoomInternal(izsVar, true);
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public AnimojiDataSupplierInterface getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public ConversationBuilder getBaseBuilder() {
        RTCLog rTCLog = this.log;
        if (!(rTCLog instanceof TracerRTCLog)) {
            setLogger(new TracerRTCLog(this.tracerLiteFacade, rTCLog));
        }
        return super.getBaseBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setTimeProvider(this.timeProvider).setExecutionTimeInterceptor(this.executionTimeInterceptor).setExecutorService(WEBRTC_EXECUTOR).setLog(this.log).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setDomainId(this.domainId).setAnimojiDataSupplier(this.animojiDataSupplier).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setAnalyticsSender(this.callAnalyticsSender).setRemoteSettings(getRemoteSettings());
    }

    public one.video.calls.sdk.experiments.a getExperiments() {
        return this.experimentsManager;
    }

    public void hangup(@NonNull HangupReason hangupReason, String str) {
        hangup(hangupReason, str, null);
    }

    @NonNull
    public Conversation join(@NonNull izs<JoinCallParams.Builder, JoinCallParams> izsVar) {
        LazyConversation joinInternal = joinInternal(izsVar, false);
        joinInternal.start();
        return joinInternal.getConversation();
    }

    @NonNull
    public Conversation joinAnonByLink(@NonNull izs<JoinAnonByLinkParams.Builder, JoinAnonByLinkParams> izsVar) {
        LazyConversation joinAnonByLinkInternal = joinAnonByLinkInternal(izsVar, false);
        joinAnonByLinkInternal.start();
        return joinAnonByLinkInternal.getConversation();
    }

    @NonNull
    public LazyConversation joinAnonByLinkLazy(@NonNull izs<JoinAnonByLinkParams.Builder, JoinAnonByLinkParams> izsVar) {
        return joinAnonByLinkInternal(izsVar, true);
    }

    @NonNull
    public Conversation joinByLink(@NonNull izs<JoinByLinkParams.Builder, JoinByLinkParams> izsVar) {
        LazyConversation joinByLinkInternal = joinByLinkInternal(izsVar, false);
        joinByLinkInternal.start();
        return joinByLinkInternal.getConversation();
    }

    @NonNull
    public LazyConversation joinByLinkLazy(@NonNull izs<JoinByLinkParams.Builder, JoinByLinkParams> izsVar) {
        return joinByLinkInternal(izsVar, true);
    }

    @NonNull
    public LazyConversation joinLazy(@NonNull izs<JoinCallParams.Builder, JoinCallParams> izsVar) {
        return joinInternal(izsVar, true);
    }

    public void reset() {
        this.disposable.e();
        this.api.getOkApiHolder().clearSession();
        this.idMappingWrapper.clear();
    }

    public void setAnalyticsEventListener(AnalyticsEventListener analyticsEventListener) {
        CallAnalyticsSender.Listener listener;
        if (analyticsEventListener == null) {
            listener = null;
            this.externalListener = null;
        } else {
            CallAnalyticsSender.Listener listener2 = this.analyticsSenderListener;
            this.externalListener = new WeakReference<>(analyticsEventListener);
            listener = listener2;
        }
        this.callAnalyticsSender.setEventListener(listener);
    }

    public void setAnimojiDataSupplier(AnimojiDataSupplierInterface animojiDataSupplierInterface) {
        this.animojiDataSupplier = animojiDataSupplierInterface;
    }

    public void setChatStateListener(@NonNull ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
    }

    public void setDomainId(@Nullable String str) {
        this.domainId = str;
    }

    public void setExternalIdsMapper(@Nullable IdsMapper<CallParticipant.ParticipantId, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setInternalIdsMapper(@Nullable IdsMapper<ParticipantId, CallParticipant.ParticipantId> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setLogConfiguration(@NonNull RTCLogConfiguration rTCLogConfiguration) {
        this.logConfiguration = rTCLogConfiguration;
    }

    public void setLogger(@Nullable RTCLog rTCLog) {
        if (rTCLog == null) {
            rTCLog = RTCLog.NoOp.INSTANCE;
            this.api.getOkApiHolder().setRequestDebugger(ApiRequestDebugger.NO_OP);
        } else {
            this.api.getOkApiHolder().setRequestDebugger(new LoggingApiRequestDebugger(rTCLog, this.api.newBuilder().getSessionStore()));
        }
        TracerRTCLog tracerRTCLog = new TracerRTCLog(this.tracerLiteFacade, rTCLog);
        this.log = tracerRTCLog;
        GlobalRTCLogger.setLog(tracerRTCLog);
    }

    public void setOkApiService(@NonNull OkApiService okApiService) {
        this.okApiService = okApiService;
    }

    @SuppressLint({"NewApi"})
    public ConversationFactory(OkApi okApi, Context context, String str, @Nullable String str2) {
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.locale = null;
        this.animojiDataSupplier = AnimojiDataSupplierInterface.Disabled.INSTANCE;
        this.chatStateListener = ChatStateListener.EMPTY;
        CallAnalyticsSender callAnalyticsSender = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.analyticsSenderListener = new CallAnalyticsSender.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationFactory.1
            @Override // ru.ok.android.externcalls.analytics.CallAnalyticsSender.Listener
            public void onNewEvent(@NonNull CallAnalyticsEvent callAnalyticsEvent) {
                AnalyticsEventListener.AnalyticsEvent eventListenerEvent;
                WeakReference weakReference = ConversationFactory.this.externalListener;
                AnalyticsEventListener analyticsEventListener = weakReference == null ? null : (AnalyticsEventListener) weakReference.get();
                if (analyticsEventListener == null || (eventListenerEvent = SharedAnalyticsEvent.toEventListenerEvent(callAnalyticsEvent)) == null) {
                    return;
                }
                analyticsEventListener.onAnalyticsEvent(eventListenerEvent);
            }
        };
        this.remoteSettings = null;
        this.remoteSettingsLock = new Object();
        this.clientType = str;
        this.domainId = str2;
        this.executionTimeInterceptor = new ExecutionTimeInterceptor(null, TimeProviderExtKt.newInstance());
        OkApi build = okApi.newBuilder().addOkApiInterceptor(this.executionTimeInterceptor).build();
        this.api = build;
        requestServerTime();
        this.context = context;
        this.disposable = new io.reactivex.rxjava3.disposables.b();
        this.timeProvider = TimeProviderExtKt.newInstance();
        IdMappingWrapper idMappingWrapper = IdMappingWrapper.get(context, new RTCLogWrapper(new yqf(this, 7)));
        this.idMappingWrapper = idMappingWrapper;
        idMappingWrapper.scheduleReadCacheFromDisk();
        this.experimentsManager = new one.video.calls.sdk.experiments.a(this.experiments, context);
        this.okApiService = new OkApiService(build.getRxApiClient());
        this.tracerLiteFacade = new TracerLiteFacade(context);
        new CallAnalyticsInitializer().init(callAnalyticsSender, conversationAnalyticsSenderImpl.getConfiguration(), build, new zqf(this, 10));
        getRemoteSettings();
    }

    public void hangup(@NonNull HangupReason hangupReason, @NonNull String str, @Nullable String str2) {
        this.disposable.b(RetryKt.retryApiCallForBackgroundWork(this.api.getRxApiClient().execute(BasicApiRequest.methodBuilder(HangupConversation.METHOD_NAME).scope(ApiScope.OPT_SESSION).param("conversationId", str).param("reason", hangupReason.toString()).param(ApiProtocol.PARAM_ANONYM_TOKEN, str2).build(), new jrj()), this.log).subscribe(new krj(), new lrj()));
    }

    public static synchronized void init(@NonNull Context context, @Nullable NativeLibraryLoader nativeLibraryLoader) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
        }
    }

    public static synchronized void init(@NonNull ConversationFactoryInitParams conversationFactoryInitParams) {
        synchronized (ConversationFactory.class) {
            if (initDone) {
                return;
            }
            keepSharedSettingsStorageTimeMs = conversationFactoryInitParams.getSharedSettingsLifeTime();
            ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
            PeerConnectionClient.init(conversationFactoryInitParams.getContext(), new PeerConnectionParameters.Builder().setLogger(peerConnection.getLogger()).setWebRtcParams(new PeerConnectionWebRtcParams.Builder().setRttMultCapsMs(peerConnection.getRttMultCapMs()).setAudioPipelineOffOnMuteEnabled(peerConnection.isAudioPipelineOffOnMuteEnabled()).setBonusFieldTrials(peerConnection.getBonusFieldTrials()).setUdpMarker(peerConnection.getUdpMarker()).setTcpMarker(peerConnection.getTcpMarker()).setEarlyAudioPlayoutEnabled(peerConnection.isEarlyAudioPlayoutEnabled()).setEarlyAudioRecordingEnabled(peerConnection.isEarlyAudioRecordingEnabled()).setSimulcastEnabled(peerConnection.isSimulcastEnabled()).build()).build(), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
            initDone = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$12(Object obj) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$13(Throwable th) throws Throwable {
    }
}
