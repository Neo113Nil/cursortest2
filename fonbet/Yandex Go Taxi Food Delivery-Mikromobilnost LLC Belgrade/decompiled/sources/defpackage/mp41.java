package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.ip41;
import defpackage.jl40;
import defpackage.lp41;
import defpackage.tl60;
import defpackage.xl10;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class mp41 {
    public final tls a;
    public WebView b;
    public final r0 c;

    public mp41(int i) {
        this.a = new r941(27);
        this.c = bvf0.c(hp41.a);
    }

    public final WebView a(final Context context, boolean z, boolean z2, l7x l7xVar, final tls tlsVar, tls tlsVar2) {
        final tl60 tl60Var = new tl60(context);
        WebView webView = (WebView) this.a.invoke(context);
        webView.addJavascriptInterface(l7xVar, "nativeAMAndroid");
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setCacheMode(z ? -1 : 2);
        settings.setDomStorageEnabled(z2);
        String str = (String) tlsVar2.invoke(settings.getUserAgentString());
        if (str != null) {
            settings.setUserAgentString(str);
        }
        final boolean z3 = false;
        webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.fintechsdk.core.ui.impl.api.view.webview.WebViewFacade$init$webView$1$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                r0 r0Var = this.c;
                r0Var.getClass();
                r0Var.m(null, ip41.a);
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                tl60.this.a.b(error, new xl10(new lp41(handler, z3)));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (((Boolean) tlsVar.invoke(request)).booleanValue()) {
                    return true;
                }
                if (!jl40.l(request.getUrl().getScheme(), "market")) {
                    return super.shouldOverrideUrlLoading(view, request);
                }
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", request.getUrl()));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
        });
        WebView.setWebContentsDebuggingEnabled(false);
        this.b = webView;
        return webView;
    }

    public final void b(String str, Map map) {
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, jp41.a);
        Iterator<E> it = EmptyList.a.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ny61.u();
                return;
            } else {
                CookieManager.getInstance();
                throw null;
            }
        }
        WebView webView = this.b;
        if (webView != null) {
            webView.post(new hpo0(25, this, str, map));
        }
    }

    public mp41() {
        this(0);
    }
}
