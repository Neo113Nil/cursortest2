package com.yandex.go.payments.shared.family.web.nativeapi;

import defpackage.bap;
import defpackage.brb;
import defpackage.ibp;
import defpackage.jbp;
import defpackage.rab1;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wfe0;
import defpackage.wnt;
import defpackage.z9p;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J+\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J+\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J+\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*¨\u00063"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/FamilyJsNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lwnt;", "goJson", "Ltt2;", "appDispatchers", "Lbrb;", "chooseContactsRouter", "Lwfe0;", "postcardRouter", "Lbap;", "navigator", "Lz9p;", "familyAccountAnalytics", "<init>", "(Lwnt;Ltt2;Lbrb;Lwfe0;Lbap;Lz9p;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "chooseContacts", "(Ljava/lang/String;[Ljava/lang/String;)V", "createPostcard", "webViewReadyCallback", "sendAnalyticsEvent", "requestHideWebView", "forceUpdate", "showLoading", "hideLoading", "Ltt2;", "Lbrb;", "Lwfe0;", "Lbap;", "Lz9p;", "Lkotlin/Function0;", "onWebViewReadyAction", "Lsls;", "getOnWebViewReadyAction", "()Lsls;", "setOnWebViewReadyAction", "(Lsls;)V", "showLoadingAction", "getShowLoadingAction", "setShowLoadingAction", "hideLoadingAction", "getHideLoadingAction", "setHideLoadingAction", "Companion", "jbp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FamilyJsNativeApi extends JsNativeApi {
    public static final int $stable = 8;
    public static final jbp Companion = new jbp();
    private static final String WEB_VIEW_CONTACTS_CHOOSE = "taxi.app.contacts.choose";
    private static final String WEB_VIEW_CONTACTS_POSTCARD = "taxi.app.contacts.postcard";
    private static final String WEB_VIEW_FORCE_UPDATE = "taxi.app.forceUpdate";
    private static final String WEB_VIEW_LOADING_HIDE = "taxi.app.loading.hide";
    private static final String WEB_VIEW_LOADING_SHOW = "taxi.app.loading.show";
    private static final String WEB_VIEW_READY = "taxi.app.onWebViewReady";
    private static final String WEB_VIEW_REQUEST_HIDE = "taxi.app.requestHideWebView";
    private static final String WEB_VIEW_SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";
    private final tt2 appDispatchers;
    private final brb chooseContactsRouter;
    private final z9p familyAccountAnalytics;
    private sls hideLoadingAction;
    private final bap navigator;
    private sls onWebViewReadyAction;
    private final wfe0 postcardRouter;
    private sls showLoadingAction;

    public FamilyJsNativeApi(wnt wntVar, tt2 tt2Var, brb brbVar, wfe0 wfe0Var, bap bapVar, z9p z9pVar) {
        super(wntVar);
        this.appDispatchers = tt2Var;
        this.chooseContactsRouter = brbVar;
        this.postcardRouter = wfe0Var;
        this.navigator = bapVar;
        this.familyAccountAnalytics = z9pVar;
        rab1.d(getDocument(), "taxi.app.contacts.choose", new ibp(this, 0), "params");
        rab1.d(getDocument(), WEB_VIEW_CONTACTS_POSTCARD, new ibp(this, 1), "params");
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new ibp(this, 2), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new ibp(this, 3), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new ibp(this, 4), "params");
        rab1.d(getDocument(), "taxi.app.forceUpdate", new ibp(this, 5), "params");
        rab1.d(getDocument(), WEB_VIEW_LOADING_SHOW, new ibp(this, 6), new String[0]);
        rab1.d(getDocument(), WEB_VIEW_LOADING_HIDE, new ibp(this, 7), new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chooseContacts(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$chooseContacts$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPostcard(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$createPostcard$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceUpdate(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$forceUpdate$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$hideLoading$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$requestHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$sendAnalyticsEvent$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$showLoading$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void webViewReadyCallback(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FamilyJsNativeApi$webViewReadyCallback$1(this, promiseId, null), 3);
    }

    public final sls getHideLoadingAction() {
        return this.hideLoadingAction;
    }

    public final sls getOnWebViewReadyAction() {
        return this.onWebViewReadyAction;
    }

    public final sls getShowLoadingAction() {
        return this.showLoadingAction;
    }

    public final void setHideLoadingAction(sls slsVar) {
        this.hideLoadingAction = slsVar;
    }

    public final void setOnWebViewReadyAction(sls slsVar) {
        this.onWebViewReadyAction = slsVar;
    }

    public final void setShowLoadingAction(sls slsVar) {
        this.showLoadingAction = slsVar;
    }
}
