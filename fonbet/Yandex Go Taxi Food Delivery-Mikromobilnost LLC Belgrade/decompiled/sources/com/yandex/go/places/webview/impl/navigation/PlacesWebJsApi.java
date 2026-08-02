package com.yandex.go.places.webview.impl.navigation;

import defpackage.evu0;
import defpackage.kax;
import defpackage.rab1;
import defpackage.rgc0;
import defpackage.sgc0;
import defpackage.tgc0;
import defpackage.tje;
import defpackage.wnt;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0002\u0004\u0016B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ+\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/places/webview/impl/navigation/PlacesWebJsApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lwnt;", "goJson", "Ltgc0;", "callbacks", "<init>", "(Lwnt;Ltgc0;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleWebViewReady", "(Ljava/lang/String;[Ljava/lang/String;)V", "handleWebViewLoadError", "handleHideWebView", "handleFeedbackSent", "handleCardUpdated", "Ltgc0;", "Companion", "sgc0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesWebJsApi extends JsNativeApi {
    private static final sgc0 Companion = new sgc0();

    @Deprecated
    public static final String ON_CARD_CLOSE = "yandex.mapsApp.close";

    @Deprecated
    public static final String ON_CARD_UPDATED = "taxi.app.organizationCardWasUpdated";

    @Deprecated
    public static final String ON_FEEDBACK_SENT = "taxi.app.organizationFeedbackSent";

    @Deprecated
    public static final String ON_WEB_VIEW_LOAD_ERROR = "taxi.app.onWebViewLoadError";

    @Deprecated
    public static final String ON_WEB_VIEW_READY = "taxi.app.onWebViewReady";

    @Deprecated
    public static final String REQUEST_HIDE_WEB_VIEW = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String YANDEX_JS_NAMESPACE = "yandex";
    private final tgc0 callbacks;

    public PlacesWebJsApi(wnt wntVar, tgc0 tgc0Var) {
        super(wntVar);
        List W;
        this.callbacks = tgc0Var;
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new rgc0(this, 0), new String[0]);
        rab1.d(getDocument(), "taxi.app.onWebViewLoadError", new rgc0(this, 1), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new rgc0(this, 2), new String[0]);
        rab1.d(getDocument(), ON_FEEDBACK_SENT, new rgc0(this, 3), new String[0]);
        rab1.d(getDocument(), ON_CARD_UPDATED, new rgc0(this, 4), new String[0]);
        kax document = getDocument();
        W = evu0.W("yandex", new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        rab1.e(document, W);
        rab1.d(getDocument(), "yandex.mapsApp.close", new rgc0(this, 5), new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCardUpdated(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new PlacesWebJsApi$handleCardUpdated$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFeedbackSent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new PlacesWebJsApi$handleFeedbackSent$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new PlacesWebJsApi$handleHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewLoadError(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new PlacesWebJsApi$handleWebViewLoadError$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewReady(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new PlacesWebJsApi$handleWebViewReady$1(this, promiseId, null), 3);
    }
}
