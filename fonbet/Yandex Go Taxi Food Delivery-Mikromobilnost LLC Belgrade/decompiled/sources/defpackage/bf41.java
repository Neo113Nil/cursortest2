package defpackage;

import android.webkit.JsResult;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class bf41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebChromeClientProxyApi$WebChromeClientImpl b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ bf41(WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl, JsResult jsResult, int i) {
        this.a = i;
        this.b = webChromeClientProxyApi$WebChromeClientImpl;
        this.c = jsResult;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 lambda$onJsConfirm$9;
        zy11 lambda$onJsAlert$8;
        int i = this.a;
        JsResult jsResult = this.c;
        WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = this.b;
        bzj0 bzj0Var = (bzj0) obj;
        switch (i) {
            case 0:
                lambda$onJsConfirm$9 = webChromeClientProxyApi$WebChromeClientImpl.lambda$onJsConfirm$9(jsResult, bzj0Var);
                return lambda$onJsConfirm$9;
            default:
                lambda$onJsAlert$8 = webChromeClientProxyApi$WebChromeClientImpl.lambda$onJsAlert$8(jsResult, bzj0Var);
                return lambda$onJsAlert$8;
        }
    }
}
