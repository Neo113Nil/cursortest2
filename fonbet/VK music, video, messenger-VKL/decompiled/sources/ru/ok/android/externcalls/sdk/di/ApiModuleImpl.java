package ru.ok.android.externcalls.sdk.di;

import com.vk.movika.sdk.base.model.b;
import com.vk.movika.sdk.base.model.e;
import kotlin.Lazy;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.interceptor.LoginInterceptorListener;
import ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.sdk.api.ApiAppKeyProvider;
import ru.ok.android.sdk.api.ApiDeviceIdProvider;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.OkApiHolder;
import ru.ok.android.sdk.api.login.LoginResponse;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.TimeProviderExtKt;
import xsna.bb;
import xsna.bpn0;
import xsna.cb;
import xsna.gzs;
import xsna.wyg0;
import xsna.zcl;

/* compiled from: ApiModule.kt */
/* loaded from: classes9.dex */
public final class ApiModuleImpl implements ApiModule {
    private final OkApi api;
    private final Lazy apiImpl$delegate;
    private final Lazy apiStats$delegate;
    private final wyg0 callSslProvider;
    private final gzs<CallEventualStatSender> getEventualStatSender;
    private final Lazy loginApiInterceptor$delegate;
    private final Lazy loginInterceptorListener$delegate;

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f108me;
    private final OkApiService okApiService;
    private final RTCLog rtcLog;
    private final TimeProvider timeProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiModuleImpl(OkApi okApi, ConversationParticipant conversationParticipant, OkApiService okApiService, gzs<? extends CallEventualStatSender> gzsVar, RTCLog rTCLog, TimeProvider timeProvider, wyg0 wyg0Var) {
        this.api = okApi;
        this.f108me = conversationParticipant;
        this.okApiService = okApiService;
        this.getEventualStatSender = gzsVar;
        this.rtcLog = rTCLog;
        this.timeProvider = timeProvider;
        this.loginInterceptorListener$delegate = new bpn0(new b(this, 6));
        this.loginApiInterceptor$delegate = new bpn0(new e(this, 2));
        this.apiImpl$delegate = new bpn0(new bb(this, 5));
        this.apiStats$delegate = new bpn0(new cb(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkApi apiImpl_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        OkApi.Builder newBuilder = apiModuleImpl.api.newBuilder();
        newBuilder.setApiRequestDebugger(new LoggingApiRequestDebugger(apiModuleImpl.rtcLog, newBuilder.getSessionStore()));
        newBuilder.addOkApiInterceptor(apiModuleImpl.getLoginApiInterceptor());
        newBuilder.setSSLProvider(null);
        return newBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiStats apiStats_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        return new ApiStats(apiModuleImpl.getEventualStatSender);
    }

    private final OkApi getApiImpl() {
        return (OkApi) this.apiImpl$delegate.getValue();
    }

    private final ApiStats getApiStats() {
        return (ApiStats) this.apiStats$delegate.getValue();
    }

    private final MethodListenerInterceptor<LoginResponse> getLoginApiInterceptor() {
        return (MethodListenerInterceptor) this.loginApiInterceptor$delegate.getValue();
    }

    private final LoginInterceptorListener getLoginInterceptorListener() {
        return (LoginInterceptorListener) this.loginInterceptorListener$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MethodListenerInterceptor loginApiInterceptor_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        MethodListenerInterceptor methodListenerInterceptor = new MethodListenerInterceptor("auth.anonymLogin", LoginResponse.class);
        methodListenerInterceptor.addListener(apiModuleImpl.getLoginInterceptorListener());
        return methodListenerInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoginInterceptorListener loginInterceptorListener_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        return new LoginInterceptorListener(apiModuleImpl.f108me, apiModuleImpl.rtcLog);
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public ApiAppKeyProvider getAppKeyProvider() {
        return getApiImpl().getAppKeyProvider();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public ApiDeviceIdProvider getDeviceIdProvider() {
        return getApiImpl().getDeviceIdProvider();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public OkApiHolder getOkApiHolder() {
        return getApiImpl().getOkApiHolder();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public OkApiServiceInternal getOkApiServiceInternal() {
        return new OkApiServiceInternal(getRxApiClient(), this.okApiService, getApiStats(), this.rtcLog, this.timeProvider);
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public RxApiClient getRxApiClient() {
        return getApiImpl().getRxApiClient();
    }

    public /* synthetic */ ApiModuleImpl(OkApi okApi, ConversationParticipant conversationParticipant, OkApiService okApiService, gzs gzsVar, RTCLog rTCLog, TimeProvider timeProvider, wyg0 wyg0Var, int i, zcl zclVar) {
        this(okApi, conversationParticipant, okApiService, gzsVar, (i & 16) != 0 ? RTCLog.NoOp.INSTANCE : rTCLog, (i & 32) != 0 ? TimeProviderExtKt.newInstance(TimeProvider.Companion) : timeProvider, wyg0Var);
    }
}
