package com.yandex.go.flex.common.router.web_view;

import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.flex.common.router.web_view.FlexWebApi;
import defpackage.hyw;
import defpackage.j4p;
import defpackage.kr;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.rab1;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uhx;
import defpackage.wmr;
import defpackage.wnt;
import defpackage.xmr;
import defpackage.yg41;
import defpackage.ymr;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 !2\u00020\u0001:\u0002\u000b\"BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J+\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J+\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006#"}, d2 = {"Lcom/yandex/go/flex/common/router/web_view/FlexWebApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lwnt;", "goJson", "", "Lcom/yandex/go/flex/common/api/actions/OpenWebAction$WebCallback;", "callbacks", "Lj4p;", "externalCallbacks", "Lyg41;", "actionHandler", "Lymr;", "routerCallbacks", "Ltt2;", "appDispatchers", "<init>", "(Lwnt;Ljava/util/List;Ljava/util/List;Lyg41;Lymr;Ltt2;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleHideWebView", "(Ljava/lang/String;[Ljava/lang/String;)V", "shareText", "handleSendAnalyticsEvent", "handleSendAdjustEvent", "handleOpenWindowEvent", "Lymr;", "getRouterCallbacks", "()Lymr;", "Ltt2;", "Companion", "xmr", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlexWebApi extends JsNativeApi {
    private static final xmr Companion = new xmr();

    @Deprecated
    public static final String ON_CARD_CLOSE = "yandex.mapsApp.close";

    @Deprecated
    public static final String OPEN_WINDOW_EVENT = "taxi.app.openWindow";

    @Deprecated
    public static final String PARAMS = "params";

    @Deprecated
    public static final String REQUEST_HIDE_WEB_VIEW = "taxi.app.requestHideWebView";

    @Deprecated
    public static final String SEND_ADJUST_EVENT = "taxi.app.sendAdjustEvent";

    @Deprecated
    public static final String SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";

    @Deprecated
    public static final String SHARE_TEXT = "taxi.app.requestShareMethod";

    @Deprecated
    public static final String YANDEX_JS_NAMESPACE = "yandex";
    private final tt2 appDispatchers;
    private final ymr routerCallbacks;

    public FlexWebApi(wnt wntVar, List<OpenWebAction.WebCallback> list, List<j4p> list2, final yg41 yg41Var, ymr ymrVar, tt2 tt2Var) {
        super(wntVar);
        int i;
        this.routerCallbacks = ymrVar;
        this.appDispatchers = tt2Var;
        Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            final OpenWebAction.WebCallback webCallback = (OpenWebAction.WebCallback) it.next();
            rab1.d(getDocument(), webCallback.a, new hyw() { // from class: vmr
                @Override // defpackage.hyw
                public final void a(String str, String[] strArr) {
                    FlexWebApi.lambda$0$0(yg41.this, webCallback, this, str, strArr);
                }
            }, new String[0]);
        }
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            if (it2.next() == null) {
                getDocument();
                throw null;
            }
            ny61.u();
            throw null;
        }
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new wmr(this, i), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestShareMethod", new wmr(this, 1), "params");
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new wmr(this, 2), "params");
        rab1.d(getDocument(), SEND_ADJUST_EVENT, new wmr(this, 3), "params");
        rab1.d(getDocument(), OPEN_WINDOW_EVENT, new wmr(this, 4), "params");
        rab1.d(getDocument(), "yandex.mapsApp.close", new wmr(this, 5), new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHideWebView(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FlexWebApi$handleHideWebView$1(this, promiseId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOpenWindowEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FlexWebApi$handleOpenWindowEvent$1(this, null, params), 3);
        callbackResult(promiseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAdjustEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FlexWebApi$handleSendAdjustEvent$1(this, null, params), 3);
        callbackResult(promiseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAnalyticsEvent(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FlexWebApi$handleSendAnalyticsEvent$1(this, null, params), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(yg41 yg41Var, OpenWebAction.WebCallback webCallback, FlexWebApi flexWebApi, String str, String[] strArr) {
        kr krVar = webCallback.b;
        n6u n6uVar = (n6u) ((uhx) yg41Var).b;
        n6uVar.c.b(krVar, n6uVar.b, n6uVar.e);
        flexWebApi.callbackResult(str);
    }

    private static final void lambda$1$0(j4p j4pVar, FlexWebApi flexWebApi, String str, String[] strArr) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareText(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new FlexWebApi$shareText$1(this, promiseId, params, null), 3);
    }

    public final ymr getRouterCallbacks() {
        return this.routerCallbacks;
    }
}
