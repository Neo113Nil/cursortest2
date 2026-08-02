package defpackage;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class gm41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewClientProxyApi$WebViewClientImpl b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ String w;

    public /* synthetic */ gm41(WebViewClientProxyApi$WebViewClientImpl webViewClientProxyApi$WebViewClientImpl, WebView webView, String str, int i) {
        this.a = i;
        this.b = webViewClientProxyApi$WebViewClientImpl;
        this.c = webView;
        this.w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.w;
        WebView webView = this.c;
        WebViewClientProxyApi$WebViewClientImpl webViewClientProxyApi$WebViewClientImpl = this.b;
        switch (i) {
            case 0:
                webViewClientProxyApi$WebViewClientImpl.lambda$onPageFinished$3(webView, str);
                break;
            case 1:
                webViewClientProxyApi$WebViewClientImpl.lambda$onPageCommitVisible$19(webView, str);
                break;
            case 2:
                webViewClientProxyApi$WebViewClientImpl.lambda$onPageStarted$1(webView, str);
                break;
            default:
                webViewClientProxyApi$WebViewClientImpl.lambda$onLoadResource$17(webView, str);
                break;
        }
    }
}
