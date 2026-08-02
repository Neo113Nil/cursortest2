package com.yandex.go.safety.center.safetycenter_web.domain.web;

import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebChangeResult;
import defpackage.gvl0;
import defpackage.hvl0;
import defpackage.kvl0;
import defpackage.rab1;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wnt;
import defpackage.xf41;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0002'(B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J+\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J+\u0010\u001b\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J+\u0010\u001c\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J+\u0010\u001d\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u001f\u0010!\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006)"}, d2 = {"Lcom/yandex/go/safety/center/safetycenter_web/domain/web/SafetyCenterWebJsApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lwnt;", "goJson", "Ltt2;", "appDispatchers", "Lxf41;", "webViewNotifier", "Lkvl0;", "safetyCenterWebJsCallbacks", "<init>", "(Lwnt;Ltt2;Lxf41;Lkvl0;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "webViewReadyCallback", "(Ljava/lang/String;[Ljava/lang/String;)V", "showEmailInput", "showPhotoInput", "showChooseContacts", "forceUpdate", "requestHide", "sendAnalyticsEvent", "showSupport", "showStory", "shareUrl", "showEmergencyCall", "showFallbackScreen", "", "isChanged", "changeCallbackResult", "(Ljava/lang/String;Z)V", "Ltt2;", "Lxf41;", "Lkvl0;", "Companion", "jvl0", "hvl0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterWebJsApi extends JsNativeApi {
    private static final hvl0 Companion = new hvl0();

    @Deprecated
    public static final String FORCE_UPDATE = "taxi.app.forceUpdate";

    @Deprecated
    public static final String REQUEST_HIDE = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";

    @Deprecated
    public static final String SHARE_URL = "taxi.app.shareUrl";

    @Deprecated
    public static final String SHOW_CHOOSE_CONTACTS = "taxi.app.contacts.choose";

    @Deprecated
    public static final String SHOW_EMAIL_INPUT = "taxi.app.showEmailInputModal";

    @Deprecated
    public static final String SHOW_EMERGENCY_CALL = "taxi.app.showEmergencyCall";

    @Deprecated
    public static final String SHOW_FALLBACK_SCREEN = "taxi.app.showFallbackScreen";

    @Deprecated
    public static final String SHOW_PHOTO_INPUT = "taxi.app.showPhotoInputModal";

    @Deprecated
    public static final String SHOW_STORY = "taxi.app.showStory";

    @Deprecated
    public static final String SHOW_SUPPORT = "taxi.app.showSupport";

    @Deprecated
    public static final String WEB_VIEW_READY = "taxi.app.onWebViewReady";
    private final tt2 appDispatchers;
    private final kvl0 safetyCenterWebJsCallbacks;
    private final xf41 webViewNotifier;

    public SafetyCenterWebJsApi(wnt wntVar, tt2 tt2Var, xf41 xf41Var, kvl0 kvl0Var) {
        super(wntVar);
        this.appDispatchers = tt2Var;
        this.webViewNotifier = xf41Var;
        this.safetyCenterWebJsCallbacks = kvl0Var;
        rab1.d(getDocument(), "taxi.app.forceUpdate", new gvl0(this, 3), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new gvl0(this, 4), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new gvl0(this, 5), "params");
        rab1.d(getDocument(), SHOW_SUPPORT, new gvl0(this, 6), new String[0]);
        rab1.d(getDocument(), "taxi.app.showStory", new gvl0(this, 7), "params");
        rab1.d(getDocument(), SHARE_URL, new gvl0(this, 8), "params");
        rab1.d(getDocument(), SHOW_EMERGENCY_CALL, new gvl0(this, 9), new String[0]);
        rab1.d(getDocument(), SHOW_FALLBACK_SCREEN, new gvl0(this, 10), new String[0]);
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new gvl0(this, 11), new String[0]);
        rab1.d(getDocument(), SHOW_EMAIL_INPUT, new gvl0(this, 0), new String[0]);
        rab1.d(getDocument(), SHOW_PHOTO_INPUT, new gvl0(this, 1), new String[0]);
        rab1.d(getDocument(), SHOW_CHOOSE_CONTACTS, new gvl0(this, 2), new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeCallbackResult(String promiseId, boolean isChanged) {
        callbackResult(promiseId, SafetyCenterWebChangeResult.Companion.serializer(), new SafetyCenterWebChangeResult(isChanged ? SafetyCenterWebChangeResult.Result.CHANGED : SafetyCenterWebChangeResult.Result.UNCHANGED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceUpdate(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$forceUpdate$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHide(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$requestHide$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$sendAnalyticsEvent$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareUrl(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$shareUrl$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showChooseContacts(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showChooseContacts$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEmailInput(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showEmailInput$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEmergencyCall(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showEmergencyCall$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFallbackScreen(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showFallbackScreen$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPhotoInput(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showPhotoInput$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStory(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showStory$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSupport(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$showSupport$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void webViewReadyCallback(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new SafetyCenterWebJsApi$webViewReadyCallback$1(this, promiseId, null), 3);
    }
}
