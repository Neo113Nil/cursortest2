package com.yandex.go.support.web;

import android.content.Context;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import defpackage.fxf0;
import defpackage.gsq0;
import defpackage.qje;
import defpackage.wnt;
import defpackage.xnt;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.proxy.ProxyProvisionNativeApi;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/support/web/CommonSupportJsNativeApi;", "Lru/yandex/taxi/proxy/ProxyProvisionNativeApi;", "Lfxf0;", "dynamicApiNameProvider", "Landroid/content/Context;", "context", "Lwnt;", "goJson", "<init>", "(Lfxf0;Landroid/content/Context;Lwnt;)V", "", "botGuid", "toFrontendParam", "(Ljava/lang/String;)Ljava/lang/String;", "Lzy11;", "evaluateNavigation", "(Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getContext$annotations", "()V", "Params", "Payload", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommonSupportJsNativeApi extends ProxyProvisionNativeApi {
    private final Context context;

    public CommonSupportJsNativeApi(fxf0 fxf0Var, Context context, wnt wntVar) {
        super(fxf0Var, wntVar);
        this.context = context;
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    private final String toFrontendParam(String botGuid) {
        return ((xnt) getGoJson()).e(new Params(new Payload(botGuid)), Params.Companion.serializer());
    }

    public final void evaluateNavigation(String botGuid) {
        String frontendParam = toFrontendParam(botGuid);
        WebView webView = getWebView();
        if (webView != null) {
            webView.evaluateJavascript("window.externalNavigation(" + frontendParam + Extension.C_BRAKE, null);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/support/web/CommonSupportJsNativeApi$Payload;", "", "Companion", "$serializer", "com/yandex/go/support/web/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Payload {
        public static final d Companion = new d();
        public final String a;

        public /* synthetic */ Payload(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                qje.Z(i, 1, CommonSupportJsNativeApi$Payload$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Payload(String str) {
            this.a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/support/web/CommonSupportJsNativeApi$Params;", "", "Companion", "$serializer", "com/yandex/go/support/web/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Params {
        public static final c Companion = new c();
        public final String a;
        public final Payload b;

        public /* synthetic */ Params(int i, String str, Payload payload) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, CommonSupportJsNativeApi$Params$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = payload;
        }

        public Params(Payload payload) {
            this.a = Constants.PUSH;
            this.b = payload;
        }
    }
}
