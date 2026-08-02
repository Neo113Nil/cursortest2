package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import defpackage.ys41;
import defpackage.zs41;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    private final ys41 mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(ys41 ys41Var) {
        this.mWebViewRenderProcessClient = ys41Var;
    }

    public ys41 getFrameworkRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        ys41 ys41Var = this.mWebViewRenderProcessClient;
        WeakHashMap weakHashMap = zs41.b;
        zs41 zs41Var = (zs41) weakHashMap.get(webViewRenderProcess);
        if (zs41Var == null) {
            zs41Var = new zs41();
            zs41Var.a = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, zs41Var);
        }
        ys41Var.onRenderProcessResponsive(webView, zs41Var);
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        ys41 ys41Var = this.mWebViewRenderProcessClient;
        WeakHashMap weakHashMap = zs41.b;
        zs41 zs41Var = (zs41) weakHashMap.get(webViewRenderProcess);
        if (zs41Var == null) {
            zs41Var = new zs41();
            zs41Var.a = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, zs41Var);
        }
        ys41Var.onRenderProcessUnresponsive(webView, zs41Var);
    }
}
