package com.yandex.go.vault.data;

import defpackage.rab1;
import defpackage.s331;
import defpackage.t331;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u331;
import defpackage.wnt;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0002\u0017B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\n0\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/vault/data/VaultStoreApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lu331;", "callbacks", "Ltt2;", "appDispatchers", "Lwnt;", "goJson", "<init>", "(Lu331;Ltt2;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleHideWebView", "(Ljava/lang/String;[Ljava/lang/String;)V", "handleSendAnalyticsEvent", "openExternal", "Lu331;", "Ltt2;", "Companion", "t331", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultStoreApi extends JsNativeApi {
    private static final t331 Companion = new t331();

    @Deprecated
    public static final String OPEN_EXTERNAL_BROWSER_EVENT = "taxi.app.openExternalBrowser";

    @Deprecated
    public static final String REQUEST_HIDE_WEB_VIEW = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String WEB_VIEW_SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";
    private final tt2 appDispatchers;
    private final u331 callbacks;

    public VaultStoreApi(u331 u331Var, tt2 tt2Var, wnt wntVar) {
        super(wntVar);
        this.callbacks = u331Var;
        this.appDispatchers = tt2Var;
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new s331(this, 0), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new s331(this, 1), "params");
        rab1.d(getDocument(), "taxi.app.openExternalBrowser", new s331(this, 2), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new VaultStoreApi$handleHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new VaultStoreApi$handleSendAnalyticsEvent$1(this, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternal(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new VaultStoreApi$openExternal$1(params, this, promiseId, null), 3);
    }
}
