package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.challenge.v;
import defpackage.li91;
import defpackage.rs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes2.dex */
public final class g extends com.lightside.slab.a {
    public final j E;
    public final Activity F;
    public final f G;
    public final c0 H;
    public final d I;

    public g(j jVar, Activity activity, f fVar, c0 c0Var, d dVar) {
        this.E = jVar;
        this.F = activity;
        this.G = fVar;
        this.H = c0Var;
        this.I = dVar;
    }

    @Override // defpackage.ins0
    public final void f(Bundle bundle) {
        if (bundle != null) {
            this.E.z.restoreState(bundle);
            j jVar = this.G.a;
            jVar.A.setVisibility(8);
            jVar.x.setVisibility(8);
            WebView webView = jVar.z;
            webView.setVisibility(0);
            webView.requestFocus();
        }
    }

    @Override // defpackage.ins0
    public final void h() {
        j jVar = this.E;
        ConstraintLayout root = jVar.getRoot();
        WebView webView = jVar.z;
        root.removeView(webView);
        webView.destroy();
        super.h();
    }

    @Override // defpackage.ins0
    public final void i(Bundle bundle) {
        this.E.z.saveState(bundle);
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        c cVar = (c) obj;
        WebViewClient webViewClient = new WebViewClient(this.F, cVar, this.G, this.H, this.I);
        j jVar = this.E;
        WebView webView = jVar.z;
        webView.setWebViewClient(webViewClient);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + com.yandex.passport.common.web.a.b);
        settings.setDomStorageEnabled(true);
        webView.setLayerType(1, null);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        li91.e(new WebViewSlab$setupClicks$1$1(webViewClient, this, jVar, null), (Button) jVar.A.findViewById(R.id.button_retry));
        cVar.getClass();
        String str = ((v) cVar).c;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Open url: " + ((Object) com.yandex.passport.common.url.b.l(str)), 8);
        }
        jVar.z.loadUrl(str);
        return zy11.a;
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onPause() {
        this.E.z.onPause();
        super.onPause();
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onResume() {
        super.onResume();
        this.E.z.onResume();
    }
}
