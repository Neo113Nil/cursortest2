package com.yandex.go.business.impl.web;

import android.content.Context;
import com.yandex.go.business.impl.web.handler.a;
import com.yandex.go.business.impl.web.handler.b;
import defpackage.j73;
import defpackage.jn51;
import defpackage.kxf0;
import defpackage.mdh;
import defpackage.oyr;
import defpackage.rab1;
import defpackage.sjh;
import defpackage.sn51;
import defpackage.tls;
import defpackage.tn51;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 F2\u00020\u0001:\u0001GBE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J+\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J8\u0010$\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u001e\b\u0004\u0010#\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H\u0082\b¢\u0006\u0004\b$\u0010%JA\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\b\b\u0000\u0010&*\u00020\"2\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0002¢\u0006\u0004\b*\u0010+J5\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\b\b\u0000\u0010&*\u00020\"2\u0006\u0010-\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0002¢\u0006\u0004\b.\u0010/J>\u00101\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122$\b\u0004\u0010#\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170)0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H\u0082\b¢\u0006\u0004\b1\u0010%JY\u00101\u001a\u00020\u0017\"\u0006\b\u0000\u00102\u0018\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000'2$\b\u0004\u0010#\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H\u0082\bø\u0001\u0000¢\u0006\u0004\b1\u00103J\u007f\u00108\u001a\u00020\u00172n\u00107\u001a8\u00124\b\u0001\u00120\u0012\u0004\u0012\u00020\u0012\u0012&\u0012$\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u001705j\u0002`6040\u0014\"0\u0012\u0004\u0012\u00020\u0012\u0012&\u0012$\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u001705j\u0002`604H\u0002¢\u0006\u0004\b8\u00109J\u0087\u0001\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:2n\u00107\u001a8\u00124\b\u0001\u00120\u0012\u0004\u0012\u00020\u0012\u0012&\u0012$\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u001705j\u0002`6040\u0014\"0\u0012\u0004\u0012\u00020\u0012\u0012&\u0012$\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u001705j\u0002`604H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u0012\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010E\u0082\u0002\u0004\n\u0002\b9¨\u0006H"}, d2 = {"Lcom/yandex/go/business/impl/web/YangoBusinessJsNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Ltn51;", "callbacks", "Landroid/content/Context;", "context", "Ltt2;", "appDispatchers", "Ljn51;", "analytics", "Lcom/yandex/go/business/impl/web/handler/b;", "sharingHandler", "Lcom/yandex/go/business/impl/web/handler/a;", "savingHandler", "Lwnt;", "goJson", "<init>", "(Ltn51;Landroid/content/Context;Ltt2;Ljn51;Lcom/yandex/go/business/impl/web/handler/b;Lcom/yandex/go/business/impl/web/handler/a;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleWebViewReady", "(Ljava/lang/String;[Ljava/lang/String;)V", "handleWebViewLoadError", "handleRequestHideWebView", "handleSendAnalyticsEvent", "openLinkInBrowser", "saveContent", "shareContent", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "callback", "handleAction", "(Ljava/lang/String;Ltls;)V", "T", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Result;", "parseFirstParam-gIAlu-s", "([Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;", "parseFirstParam", "arg", "safeParse-gIAlu-s", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;", "safeParse", "handleActionWithResult", "R", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Ltls;)V", "Lkotlin/Pair;", "Lkotlin/Function2;", "Lcom/yandex/go/business/impl/web/Handler;", "functions", "addFunctions", "([Lkotlin/Pair;)V", "", "paramsCount", "addFunctionsWithParams", "(I[Lkotlin/Pair;)V", "Ltn51;", "Landroid/content/Context;", "getContext$annotations", "()V", "Ltt2;", "Ljn51;", "Lcom/yandex/go/business/impl/web/handler/b;", "Lcom/yandex/go/business/impl/web/handler/a;", "Companion", "sn51", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi extends JsNativeApi {
    public static final sn51 Companion = new sn51();
    private static final IllegalArgumentException EMPTY_PARAMS_EXCEPTION = new IllegalArgumentException("Params are empty");
    private static final String JS_NAMESPACE = "goplatform";
    private static final String ON_WEB_VIEW_LOAD_ERROR = "goplatform.app.onWebViewLoadError";
    private static final String ON_WEB_VIEW_READY = "goplatform.app.onWebViewReady";
    private static final String OPEN_LINK_IN_BROWSER = "goplatform.app.openLinkInBrowser";
    private static final String PARAM = "param";
    private static final String REQUEST_HIDE_WEB_VIEW = "goplatform.app.requestHideWebView";
    private static final String SAVE_CONTENT = "goplatform.app.saveContent";
    private static final String SEND_ANALYTICS_EVENT = "goplatform.app.reportGoalReached";
    private static final String SHARE_CONTENT = "goplatform.app.shareContent";
    private final jn51 analytics;
    private final tt2 appDispatchers;
    private final tn51 callbacks;
    private final Context context;
    private final a savingHandler;
    private final b sharingHandler;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).handleWebViewReady((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).handleWebViewLoadError((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).handleRequestHideWebView((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).openLinkInBrowser((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).saveContent((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).shareContent((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$7, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((YangoBusinessJsNativeApi) this.receiver).handleSendAnalyticsEvent((String) obj, (String[]) obj2);
            return zy11.a;
        }
    }

    public YangoBusinessJsNativeApi(tn51 tn51Var, Context context, tt2 tt2Var, jn51 jn51Var, b bVar, a aVar, wnt wntVar) {
        super(wntVar);
        this.callbacks = tn51Var;
        this.context = context;
        this.appDispatchers = tt2Var;
        this.analytics = jn51Var;
        this.sharingHandler = bVar;
        this.savingHandler = aVar;
        addFunctions(new Pair(ON_WEB_VIEW_READY, new AnonymousClass1(2, this, YangoBusinessJsNativeApi.class, "handleWebViewReady", "handleWebViewReady(Ljava/lang/String;[Ljava/lang/String;)V", 0)), new Pair(ON_WEB_VIEW_LOAD_ERROR, new AnonymousClass2(2, this, YangoBusinessJsNativeApi.class, "handleWebViewLoadError", "handleWebViewLoadError(Ljava/lang/String;[Ljava/lang/String;)V", 0)), new Pair(REQUEST_HIDE_WEB_VIEW, new AnonymousClass3(2, this, YangoBusinessJsNativeApi.class, "handleRequestHideWebView", "handleRequestHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0)));
        addFunctionsWithParams(1, new Pair(OPEN_LINK_IN_BROWSER, new AnonymousClass4(2, this, YangoBusinessJsNativeApi.class, "openLinkInBrowser", "openLinkInBrowser(Ljava/lang/String;[Ljava/lang/String;)V", 0)), new Pair(SAVE_CONTENT, new AnonymousClass5(2, this, YangoBusinessJsNativeApi.class, "saveContent", "saveContent(Ljava/lang/String;[Ljava/lang/String;)V", 0)));
        addFunctionsWithParams(2, new Pair(SHARE_CONTENT, new AnonymousClass6(2, this, YangoBusinessJsNativeApi.class, "shareContent", "shareContent(Ljava/lang/String;[Ljava/lang/String;)V", 0)), new Pair(SEND_ANALYTICS_EVENT, new AnonymousClass7(2, this, YangoBusinessJsNativeApi.class, "handleSendAnalyticsEvent", "handleSendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0)));
    }

    private final void addFunctions(Pair<String, ? extends wls>... functions) {
        for (Pair<String, ? extends wls> pair : functions) {
            rab1.d(getDocument(), (String) pair.getFirst(), new kxf0(2, (wls) pair.getSecond()), new String[0]);
        }
    }

    private final void addFunctionsWithParams(int paramsCount, Pair<String, ? extends wls>... functions) {
        String[] strArr = new String[paramsCount];
        int i = 0;
        while (i < paramsCount) {
            int i2 = i + 1;
            strArr[i] = oyr.i(i2, PARAM);
            i = i2;
        }
        for (Pair<String, ? extends wls> pair : functions) {
            rab1.d(getDocument(), (String) pair.getFirst(), new kxf0(2, (wls) pair.getSecond()), (String[]) Arrays.copyOf(strArr, paramsCount));
        }
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    private final void handleAction(String promiseId, tls callback) {
        com.yandex.go.coroutines.b.g(getScopeDelegate().c(), null, null, new YangoBusinessJsNativeApi$handleAction$1(callback, this, promiseId, null), 3);
    }

    private final <R> void handleActionWithResult(String promiseId, KSerializer serializer, tls callback) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$handleActionWithResult$2(callback, this, promiseId, serializer, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRequestHideWebView(String promiseId, String[] params) {
        com.yandex.go.coroutines.b.g(getScopeDelegate().c(), null, null, new YangoBusinessJsNativeApi$handleRequestHideWebView$$inlined$handleAction$1(this, promiseId, null, this.callbacks), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAnalyticsEvent(String promiseId, String[] params) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1(this, promiseId, params, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewLoadError(String promiseId, String[] params) {
        com.yandex.go.coroutines.b.g(getScopeDelegate().c(), null, null, new YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1(this, promiseId, null, this.callbacks), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewReady(String promiseId, String[] params) {
        com.yandex.go.coroutines.b.g(getScopeDelegate().c(), null, null, new YangoBusinessJsNativeApi$handleWebViewReady$$inlined$handleAction$1(this, promiseId, null, this.callbacks), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openLinkInBrowser(String promiseId, String[] params) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$openLinkInBrowser$$inlined$handleActionWithResult$1(this, promiseId, null, this, params), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: parseFirstParam-gIAlu-s, reason: not valid java name */
    public final <T> Object m184parseFirstParamgIAlus(String[] params, KSerializer serializer) {
        return !(params.length == 0) ? m185safeParsegIAlus((String) j73.C(params), serializer) : new Result.Failure(EMPTY_PARAMS_EXCEPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: safeParse-gIAlu-s, reason: not valid java name */
    public final <T> Object m185safeParsegIAlus(String arg, KSerializer serializer) {
        try {
            return ((xnt) getGoJson()).c(arg, serializer);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveContent(String promiseId, String[] params) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$saveContent$$inlined$handleActionWithResult$1(this, promiseId, null, this, params), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareContent(String promiseId, String[] params) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1(this, promiseId, null, this, params), 2);
    }

    private final void handleActionWithResult(String promiseId, tls callback) {
        tse c = getScopeDelegate().c();
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$handleActionWithResult$1(callback, this, promiseId, null), 2);
    }
}
