package com.yandex.go.scooters.subscription.pci_dss.web.js;

import defpackage.hax;
import defpackage.rab1;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wnt;
import defpackage.ywo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BË\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012 \b\u0001\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0011\u0012\"\b\u0001\u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\b\u0010\u0018J+\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J+\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0018J+\u0010\"\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\"\u0010\u001dJ+\u0010#\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b#\u0010\u001dJ:\u0010(\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010%*\u00020$*\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0019j\u0002`\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0082@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+R,\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R.\u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-¨\u0006."}, d2 = {"Lcom/yandex/go/scooters/subscription/pci_dss/web/js/ScootersSubscriptionJsApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lwnt;", "goJson", "Ltt2;", "appDispatchers", "Lkotlin/Function0;", "Lzy11;", "onWebViewReady", "Lkotlin/Function1;", "Lfti0;", "onForceUpdate", "onRequestHideWebView", "Lk52;", "onSendAnalyticsEvent", "onEnableSwipe", "onDisableSwipe", "Lkotlin/Function2;", "", "onShowStories", "onShowPlus", "<init>", "(Lwnt;Ltt2;Lsls;Ltls;Lsls;Ltls;Lsls;Lsls;Lwls;Lwls;)V", "promiseId", "(Ljava/lang/String;)V", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "forceUpdate", "(Ljava/lang/String;[Ljava/lang/String;)V", "requestHideWebView", "sendAnalyticsEvent", "enableSwipe", "disableSwipe", "showStories", "showPlus", "", "T", "Lkotlinx/serialization/KSerializer;", "serializer", "deserializeParam", "([Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltt2;", "Lsls;", "Ltls;", "Lwls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionJsApi extends JsNativeApi {
    private final tt2 appDispatchers;
    private final sls onDisableSwipe;
    private final sls onEnableSwipe;
    private final tls onForceUpdate;
    private final sls onRequestHideWebView;
    private final tls onSendAnalyticsEvent;
    private final wls onShowPlus;
    private final wls onShowStories;
    private final sls onWebViewReady;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((ScootersSubscriptionJsApi) this.receiver).onWebViewReady((String) obj);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((ScootersSubscriptionJsApi) this.receiver).requestHideWebView((String) obj);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((ScootersSubscriptionJsApi) this.receiver).enableSwipe((String) obj);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((ScootersSubscriptionJsApi) this.receiver).disableSwipe((String) obj);
            return zy11.a;
        }
    }

    public ScootersSubscriptionJsApi(wnt wntVar, tt2 tt2Var, sls slsVar, tls tlsVar, sls slsVar2, tls tlsVar2, sls slsVar3, sls slsVar4, wls wlsVar, wls wlsVar2) {
        super(wntVar);
        this.appDispatchers = tt2Var;
        this.onWebViewReady = slsVar;
        this.onForceUpdate = tlsVar;
        this.onRequestHideWebView = slsVar2;
        this.onSendAnalyticsEvent = tlsVar2;
        this.onEnableSwipe = slsVar3;
        this.onDisableSwipe = slsVar4;
        this.onShowStories = wlsVar;
        this.onShowPlus = wlsVar2;
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new hax(new AnonymousClass1(1, this, ScootersSubscriptionJsApi.class, "onWebViewReady", "onWebViewReady(Ljava/lang/String;)V", 0)), new String[0]);
        rab1.d(getDocument(), "taxi.app.forceUpdate", new ywo0(this, 0), "params");
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new hax(new AnonymousClass3(1, this, ScootersSubscriptionJsApi.class, "requestHideWebView", "requestHideWebView(Ljava/lang/String;)V", 0)), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new ywo0(this, 1), "params");
        rab1.d(getDocument(), "taxi.app.enableSwipe", new hax(new AnonymousClass5(1, this, ScootersSubscriptionJsApi.class, "enableSwipe", "enableSwipe(Ljava/lang/String;)V", 0)), new String[0]);
        rab1.d(getDocument(), "taxi.app.disableSwipe", new hax(new AnonymousClass6(1, this, ScootersSubscriptionJsApi.class, "disableSwipe", "disableSwipe(Ljava/lang/String;)V", 0)), new String[0]);
        rab1.d(getDocument(), "taxi.app.showStories", new ywo0(this, 2), "params");
        rab1.d(getDocument(), "taxi.app.showPlus", new ywo0(this, 3), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object deserializeParam(String[] strArr, KSerializer kSerializer, Continuation<? super T> continuation) {
        if (strArr.length == 0) {
            return null;
        }
        this.appDispatchers.getClass();
        return tje.k0(uyj.a, new ScootersSubscriptionJsApi$deserializeParam$2(this, strArr, kSerializer, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableSwipe(String promiseId) {
        tje.N(getScopeDelegate().c(), null, null, new ScootersSubscriptionJsApi$disableSwipe$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableSwipe(String promiseId) {
        tje.N(getScopeDelegate().c(), null, null, new ScootersSubscriptionJsApi$enableSwipe$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceUpdate(String promiseId, String[] params) {
        tje.N(((JsNativeApi) this).scopeDelegate.c(), null, null, new ScootersSubscriptionJsApi$forceUpdate$$inlined$handleApiMethodCall$1(this, promiseId, null, this, params, promiseId), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWebViewReady(String promiseId) {
        tje.N(getScopeDelegate().c(), null, null, new ScootersSubscriptionJsApi$onWebViewReady$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHideWebView(String promiseId) {
        tje.N(getScopeDelegate().c(), null, null, new ScootersSubscriptionJsApi$requestHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(((JsNativeApi) this).scopeDelegate.c(), null, null, new ScootersSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1(this, promiseId, null, this, params, promiseId), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPlus(String promiseId, String[] params) {
        tje.N(((JsNativeApi) this).scopeDelegate.c(), null, null, new ScootersSubscriptionJsApi$showPlus$$inlined$handleApiMethodCall$1(this, promiseId, null, this, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStories(String promiseId, String[] params) {
        tje.N(((JsNativeApi) this).scopeDelegate.c(), null, null, new ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1(this, promiseId, null, this, params), 3);
    }
}
