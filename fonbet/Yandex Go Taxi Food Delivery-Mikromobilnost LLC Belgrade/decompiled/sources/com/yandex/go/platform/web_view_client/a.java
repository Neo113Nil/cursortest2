package com.yandex.go.platform.web_view_client;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.view.OneShotPreDrawListener;
import com.adjust.sdk.Constants;
import com.yandex.go.platform.sdk.models.PlatformEnvironment;
import defpackage.ci41;
import defpackage.evu0;
import defpackage.fk;
import defpackage.fst;
import defpackage.i32;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jyp0;
import defpackage.lb20;
import defpackage.n790;
import defpackage.oyr;
import defpackage.pj41;
import defpackage.qpo;
import defpackage.ryh;
import defpackage.s421;
import defpackage.scc;
import defpackage.sls;
import defpackage.ss2;
import defpackage.tls;
import defpackage.tt41;
import defpackage.uio0;
import defpackage.wls;
import defpackage.ycc;
import defpackage.ymu;
import defpackage.zh41;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes13.dex */
public final class a implements ci41, pj41 {
    public static final Set o = j73.f0(new String[]{"http", Constants.SCHEME});
    public final ViewGroup a;
    public final uio0 b;
    public final ryh c;
    public final sls d;
    public final zh41 e;
    public final lb20 f;
    public final GoWebViewClient i;
    public boolean j;
    public boolean l;
    public final tt41 m;
    public final WebView n;
    public final ArrayList g = new ArrayList();
    public final LinkedHashMap h = new LinkedHashMap();
    public final Handler k = new Handler(Looper.getMainLooper());

    public a(ss2 ss2Var, ViewGroup viewGroup, s421 s421Var, uio0 uio0Var, ryh ryhVar, sls slsVar, zh41 zh41Var, lb20 lb20Var) {
        this.a = viewGroup;
        this.b = uio0Var;
        this.c = ryhVar;
        this.d = slsVar;
        this.e = zh41Var;
        this.f = lb20Var;
        this.i = new GoWebViewClient((ci41) s421Var.w, (ss2) s421Var.b, kotlin.collections.a.m0((List) s421Var.c, Collections.singletonList(this)), null, (i32) s421Var.x);
        tt41 f = f(ss2Var.a, false);
        this.m = f;
        this.n = f.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r9.l == false) goto L35;
     */
    @Override // defpackage.pj41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(Uri uri) {
        boolean z = true;
        if (((com.yandex.go.platform.deeplink.a) this.d.invoke()).a(uri, true)) {
            return Boolean.TRUE;
        }
        if (!kotlin.collections.a.G(o, uri.getScheme())) {
            return Boolean.FALSE;
        }
        tt41 tt41Var = this.m;
        if (!jl40.l(tt41Var.c, uri.getHost())) {
            return null;
        }
        if (jl40.l(tt41Var.c, uri.getHost())) {
            ArrayList arrayList = this.g;
            boolean isEmpty = arrayList.isEmpty();
            WebView webView = this.n;
            if (!isEmpty) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tt41 tt41Var2 = (tt41) it.next();
                    WebView webView2 = tt41Var2.a;
                    String str = tt41Var2.d;
                    if (webView2 != webView) {
                        try {
                            this.a.removeView(webView2);
                        } catch (Exception unused) {
                        }
                        try {
                            webView2.removeJavascriptInterface(str);
                        } catch (Exception unused2) {
                        }
                        try {
                            webView2.destroy();
                        } catch (Exception unused3) {
                        }
                        this.h.remove(str);
                    }
                }
                ycc.w(arrayList, new tls() { // from class: com.yandex.go.platform.web_view_client.GoWebViewStack$clearSecondaryWebViews$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((tt41) obj).a != a.this.n);
                    }
                }, true);
            }
            String uri2 = uri.toString();
            String url = webView.getUrl();
            if (jl40.l(url, uri2)) {
                if (jl40.l(tt41Var.c, Uri.parse(url).getHost())) {
                }
            }
            i(webView, uri2, true);
            this.j = true;
            this.l = false;
            webView.requestFocus();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ci41
    public final void b(n790 n790Var) {
    }

    @Override // defpackage.pj41
    public final boolean c(WebResourceRequest webResourceRequest) {
        Boolean a = a(webResourceRequest.getUrl());
        if (a != null) {
            return a.booleanValue();
        }
        String uri = webResourceRequest.getUrl().toString();
        if (!webResourceRequest.isRedirect()) {
            j(uri, false);
            return true;
        }
        tt41 g = g();
        WebView webView = g.a;
        WebView webView2 = this.n;
        if (webView == webView2) {
            if (!jl40.l(this.m.c, webResourceRequest.getUrl().getHost())) {
                this.l = true;
            }
        }
        WebView webView3 = g.a;
        if (webView3 != webView2) {
            tt41 tt41Var = new tt41(webView3, uri);
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty()) {
                arrayList.add(tt41Var);
                return false;
            }
            arrayList.set(scc.f(arrayList), tt41Var);
        }
        return false;
    }

    public final void d(WebView webView) {
        webView.animate().translationY(TypedValue.applyDimension(1, 200.0f, webView.getContext().getResources().getDisplayMetrics())).alpha(0.0f).setDuration(200L).withEndAction(new qpo(22, this, webView)).start();
    }

    public final void e() {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tt41 tt41Var = (tt41) it.next();
            try {
                this.a.removeView(tt41Var.a);
            } catch (Exception unused) {
            }
            try {
                tt41Var.a.removeJavascriptInterface(tt41Var.d);
            } catch (Exception unused2) {
            }
            try {
                tt41Var.a.destroy();
            } catch (Exception unused3) {
            }
            this.h.remove(tt41Var.d);
        }
        arrayList.clear();
    }

    public final tt41 f(String str, boolean z) {
        uio0 uio0Var = this.b;
        WebView webView = new WebView((Context) uio0Var.b);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        webView.getSettings().setBuiltInZoomControls(true);
        String str2 = ((ss2) uio0Var.c).b.b;
        String userAgentString = webView.getSettings().getUserAgentString();
        if (userAgentString != null && !evu0.J(userAgentString)) {
            str2 = oyr.f(HexString.CHAR_SPACE, userAgentString, str2);
        }
        webView.getSettings().setUserAgentString(str2);
        webView.setWebChromeClient((GoWebChromeClient) uio0Var.a);
        if (((PlatformEnvironment) uio0Var.d) == PlatformEnvironment.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setWebViewClient(this.i);
        i(webView, str, z);
        this.a.addView(webView, -1, -1);
        webView.requestFocus();
        OneShotPreDrawListener.add(webView, new fst(webView, this, webView));
        return new tt41(webView, str);
    }

    public final tt41 g() {
        ArrayList arrayList = this.g;
        return !arrayList.isEmpty() ? (tt41) kotlin.collections.a.Z(arrayList) : this.m;
    }

    public final boolean h() {
        tt41 g = g();
        WebView webView = g.a;
        if (webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        if (g == this.m) {
            return false;
        }
        d(webView);
        k(g);
        return true;
    }

    public final void i(WebView webView, String str, boolean z) {
        Map<String, String> f;
        com.yandex.taxi.go_platform.delegates.a aVar = (com.yandex.taxi.go_platform.delegates.a) ((fk) this.c.b);
        String f2 = aVar.b.f();
        if (f2 == null || evu0.J(f2)) {
            f = b.f();
        } else {
            String concat = "Bearer ".concat(f2);
            f = b.i(new Pair("Authorization", concat), new Pair("X-YaTaxi-Authorization", concat), new Pair("X-Oauth-Token", f2), new Pair("X-YaTaxi-Uid", String.valueOf(aVar.a.i())));
        }
        if (f.isEmpty() || !(z || jl40.l(g(), this.m))) {
            webView.loadUrl(str);
        } else {
            webView.loadUrl(str, f);
        }
    }

    public final void j(String str, boolean z) {
        WebView webView = this.n;
        String url = webView.getUrl();
        if (url == null || str.equals(webView.getUrl())) {
            return;
        }
        final tt41 f = f(str, z);
        WebView webView2 = f.a;
        jyp0 jyp0Var = (jyp0) new ymu(url, webView2, this.f, new wls() { // from class: com.yandex.go.platform.web_view_client.GoWebViewStack$openUrlInNewWebView$listener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                a aVar = a.this;
                aVar.k.post(new qpo(23, aVar, f));
                return zy11.a;
            }
        }).c;
        this.h.put(f.d, jyp0Var);
        this.e.a.add(jyp0Var);
        webView2.addJavascriptInterface(jyp0Var, "goPlatformNativeApi");
        this.g.add(f);
    }

    public final boolean k(tt41 tt41Var) {
        tt41Var.a.removeJavascriptInterface("goPlatformNativeApi");
        ci41 ci41Var = (ci41) this.h.remove(tt41Var.d);
        if (ci41Var != null) {
            this.e.a.remove(ci41Var);
        }
        return this.g.remove(tt41Var);
    }

    @Override // defpackage.ci41
    public final void onPageFinished(String str) {
        if (this.j) {
            this.j = false;
            this.n.clearHistory();
        }
    }

    @Override // defpackage.ci41
    public final void onPageStarted(String str) {
    }
}
