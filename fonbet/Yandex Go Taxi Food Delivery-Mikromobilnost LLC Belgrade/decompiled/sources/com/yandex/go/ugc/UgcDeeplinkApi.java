package com.yandex.go.ugc;

import defpackage.as11;
import defpackage.rab1;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wnt;
import defpackage.yr11;
import defpackage.zr11;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0002\u001bB#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/ugc/UgcDeeplinkApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Las11;", "callbacks", "Ltt2;", "appDispatchers", "Lwnt;", "goJson", "<init>", "(Las11;Ltt2;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleWebViewReady", "(Ljava/lang/String;[Ljava/lang/String;)V", "handleWebViewLoadError", "handleHideWebView", "handleSendAnalyticsEvent", "handleGeo", "openExternal", "handleSelectTheme", "Las11;", "Ltt2;", "Companion", "zr11", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UgcDeeplinkApi extends JsNativeApi {
    private static final zr11 Companion = new zr11();

    @Deprecated
    public static final String ON_WEB_VIEW_LOAD_ERROR = "taxi.app.onWebViewLoadError";

    @Deprecated
    public static final String ON_WEB_VIEW_READY = "taxi.app.onWebViewReady";

    @Deprecated
    public static final String REQUEST_HIDE_WEB_VIEW = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String UGC_GEOLOCATION_WATCH_POSITION = "taxi.navigator.geolocation.watchPosition";

    @Deprecated
    public static final String UGC_OPEN_EXTERNAL_BROWSER = "taxi.app.openExternalBrowser";

    @Deprecated
    public static final String UGC_SELECT_THEME = "taxi.app.selectTheme";

    @Deprecated
    public static final String UGC_SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";
    private final tt2 appDispatchers;
    private final as11 callbacks;

    public UgcDeeplinkApi(as11 as11Var, tt2 tt2Var, wnt wntVar) {
        super(wntVar);
        this.callbacks = as11Var;
        this.appDispatchers = tt2Var;
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new yr11(this, 0), new String[0]);
        rab1.d(getDocument(), "taxi.app.onWebViewLoadError", new yr11(this, 1), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new yr11(this, 2), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new yr11(this, 3), "params");
        rab1.d(getDocument(), UGC_GEOLOCATION_WATCH_POSITION, new yr11(this, 4), new String[0]);
        rab1.d(getDocument(), "taxi.app.openExternalBrowser", new yr11(this, 5), "params");
        rab1.d(getDocument(), UGC_SELECT_THEME, new yr11(this, 6), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGeo(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleGeo$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSelectTheme(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleSelectTheme$1(this, promiseId, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleSendAnalyticsEvent$1(this, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewLoadError(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleWebViewLoadError$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewReady(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$handleWebViewReady$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternal(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new UgcDeeplinkApi$openExternal$1(this, promiseId, null, params), 3);
    }
}
