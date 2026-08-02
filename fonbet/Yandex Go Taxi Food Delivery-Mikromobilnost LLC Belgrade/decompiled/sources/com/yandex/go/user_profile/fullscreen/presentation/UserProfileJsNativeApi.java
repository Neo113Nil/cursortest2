package com.yandex.go.user_profile.fullscreen.presentation;

import android.content.Context;
import com.yandex.go.repositories.e;
import defpackage.bs21;
import defpackage.fti0;
import defpackage.ipu0;
import defpackage.is21;
import defpackage.js21;
import defpackage.k52;
import defpackage.ny61;
import defpackage.qke;
import defpackage.rab1;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.xf41;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 22\u00020\u0001:\u00013BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J+\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\"\u0010\u0019J+\u0010#\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b#\u0010\u0019J*\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0082@¢\u0006\u0004\b%\u0010 J+\u0010'\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00120\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b'\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101¨\u00064"}, d2 = {"Lcom/yandex/go/user_profile/fullscreen/presentation/UserProfileJsNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Landroid/content/Context;", "context", "Lxf41;", "webViewNotifier", "Lcom/yandex/go/repositories/e;", "userPhotoStateRepository", "Lbs21;", "userProfileAnalytics", "Ltt2;", "appDispatchers", "Lipu0;", "storyNavigator", "Lwnt;", "goJson", "<init>", "(Landroid/content/Context;Lxf41;Lcom/yandex/go/repositories/e;Lbs21;Ltt2;Lipu0;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "webViewReadyCallback", "(Ljava/lang/String;[Ljava/lang/String;)V", "showStory", "generateHapticFeedback", "sendAnalyticsEvent", "Lkotlin/Result;", "Lk52;", "decodeAnalyticsEvent-gIAlu-s", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeAnalyticsEvent", "requestHideWebView", "forceUpdate", "Lfti0;", "decodeReloadParams-gIAlu-s", "decodeReloadParams", "getAvatarUrl", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getContext$annotations", "()V", "Lxf41;", "Lcom/yandex/go/repositories/e;", "Lbs21;", "Ltt2;", "Lipu0;", "Companion", "js21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi extends JsNativeApi {
    public static final int $stable = 8;
    private static final js21 Companion = new js21();

    @Deprecated
    public static final String GENERATE_HAPTIC_FEEDBACK = "taxi.app.generateHapticFeedback";

    @Deprecated
    public static final String GET_PROFILE_AVATAR_URL = "taxi.app.profile.getAvatarUrl";

    @Deprecated
    public static final String HAPTIC_HEAVY_INTENSITY = "heavy";

    @Deprecated
    public static final String HAPTIC_LIGHT_INTENSITY = "light";

    @Deprecated
    public static final String HAPTIC_MEDIUM_INTENSITY = "medium";

    @Deprecated
    public static final String SHOW_STORY = "taxi.app.showStory";

    @Deprecated
    public static final String WEB_VIEW_FORCE_UPDATE = "taxi.app.forceUpdate";

    @Deprecated
    public static final String WEB_VIEW_READY = "taxi.app.onWebViewReady";

    @Deprecated
    public static final String WEB_VIEW_REQUEST_HIDE = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String WEB_VIEW_SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";
    private final tt2 appDispatchers;
    private final Context context;
    private final ipu0 storyNavigator;
    private final e userPhotoStateRepository;
    private final bs21 userProfileAnalytics;
    private final xf41 webViewNotifier;

    public UserProfileJsNativeApi(Context context, xf41 xf41Var, e eVar, bs21 bs21Var, tt2 tt2Var, ipu0 ipu0Var, wnt wntVar) {
        super(wntVar);
        this.context = context;
        this.webViewNotifier = xf41Var;
        this.userPhotoStateRepository = eVar;
        this.userProfileAnalytics = bs21Var;
        this.appDispatchers = tt2Var;
        this.storyNavigator = ipu0Var;
        rab1.d(getDocument(), GET_PROFILE_AVATAR_URL, new is21(this, 0), new String[0]);
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new is21(this, 1), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new is21(this, 2), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new is21(this, 3), "params");
        rab1.d(getDocument(), "taxi.app.forceUpdate", new is21(this, 4), "params");
        rab1.d(getDocument(), GENERATE_HAPTIC_FEEDBACK, new is21(this, 5), "params");
        rab1.d(getDocument(), "taxi.app.showStory", new is21(this, 6), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: decodeAnalyticsEvent-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m209decodeAnalyticsEventgIAlus(String[] strArr, Continuation<? super Result<k52>> continuation) {
        UserProfileJsNativeApi$decodeAnalyticsEvent$1 userProfileJsNativeApi$decodeAnalyticsEvent$1;
        int i;
        if (continuation instanceof UserProfileJsNativeApi$decodeAnalyticsEvent$1) {
            userProfileJsNativeApi$decodeAnalyticsEvent$1 = (UserProfileJsNativeApi$decodeAnalyticsEvent$1) continuation;
            int i2 = userProfileJsNativeApi$decodeAnalyticsEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileJsNativeApi$decodeAnalyticsEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userProfileJsNativeApi$decodeAnalyticsEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileJsNativeApi$decodeAnalyticsEvent$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.appDispatchers.getClass();
                    sjh sjhVar = uyj.a;
                    UserProfileJsNativeApi$decodeAnalyticsEvent$2 userProfileJsNativeApi$decodeAnalyticsEvent$2 = new UserProfileJsNativeApi$decodeAnalyticsEvent$2(this, strArr, null);
                    userProfileJsNativeApi$decodeAnalyticsEvent$1.L$0 = null;
                    userProfileJsNativeApi$decodeAnalyticsEvent$1.label = 1;
                    obj = tje.k0(sjhVar, userProfileJsNativeApi$decodeAnalyticsEvent$2, userProfileJsNativeApi$decodeAnalyticsEvent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        userProfileJsNativeApi$decodeAnalyticsEvent$1 = new UserProfileJsNativeApi$decodeAnalyticsEvent$1(this, continuation);
        Object obj2 = userProfileJsNativeApi$decodeAnalyticsEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileJsNativeApi$decodeAnalyticsEvent$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: decodeReloadParams-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m210decodeReloadParamsgIAlus(String[] strArr, Continuation<? super Result<fti0>> continuation) {
        UserProfileJsNativeApi$decodeReloadParams$1 userProfileJsNativeApi$decodeReloadParams$1;
        int i;
        if (continuation instanceof UserProfileJsNativeApi$decodeReloadParams$1) {
            userProfileJsNativeApi$decodeReloadParams$1 = (UserProfileJsNativeApi$decodeReloadParams$1) continuation;
            int i2 = userProfileJsNativeApi$decodeReloadParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileJsNativeApi$decodeReloadParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userProfileJsNativeApi$decodeReloadParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileJsNativeApi$decodeReloadParams$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.appDispatchers.getClass();
                    sjh sjhVar = uyj.a;
                    UserProfileJsNativeApi$decodeReloadParams$2 userProfileJsNativeApi$decodeReloadParams$2 = new UserProfileJsNativeApi$decodeReloadParams$2(this, strArr, null);
                    userProfileJsNativeApi$decodeReloadParams$1.L$0 = null;
                    userProfileJsNativeApi$decodeReloadParams$1.label = 1;
                    obj = tje.k0(sjhVar, userProfileJsNativeApi$decodeReloadParams$2, userProfileJsNativeApi$decodeReloadParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        userProfileJsNativeApi$decodeReloadParams$1 = new UserProfileJsNativeApi$decodeReloadParams$1(this, continuation);
        Object obj2 = userProfileJsNativeApi$decodeReloadParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileJsNativeApi$decodeReloadParams$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceUpdate(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$forceUpdate$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void generateHapticFeedback(String promiseId, String[] params) {
        if (params.length == 0) {
            qke.E(this.context, HapticController$Effect.CLICK_MEDIUM, false, 8);
            callbackResult(promiseId);
            return;
        }
        String str = params[0];
        int hashCode = str.hashCode();
        if (hashCode == -1078030475) {
            if (str.equals("medium")) {
                qke.E(this.context, HapticController$Effect.CLICK_MEDIUM, false, 8);
            }
            qke.E(this.context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        } else if (hashCode != 99152071) {
            if (hashCode == 102970646 && str.equals("light")) {
                qke.E(this.context, HapticController$Effect.CLICK_LIGHT, false, 8);
            }
            qke.E(this.context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        } else {
            if (str.equals(HAPTIC_HEAVY_INTENSITY)) {
                qke.E(this.context, HapticController$Effect.CLICK_HEAVY, false, 8);
            }
            qke.E(this.context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        }
        callbackResult(promiseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getAvatarUrl(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$getAvatarUrl$1(this, promiseId, null), 3);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$requestHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$sendAnalyticsEvent$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStory(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$showStory$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void webViewReadyCallback(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UserProfileJsNativeApi$webViewReadyCallback$1(this, promiseId, null), 3);
    }

    public final Context getContext() {
        return this.context;
    }
}
