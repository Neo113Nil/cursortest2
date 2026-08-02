package com.yandex.fintechsdk.features.webview.internal.presentation;

import android.webkit.CookieManager;
import android.webkit.WebView;
import defpackage.abe;
import defpackage.mp41;
import defpackage.qr41;
import defpackage.uq41;
import defpackage.vt41;
import defpackage.wc5;
import defpackage.wn41;
import defpackage.zu41;

/* loaded from: classes12.dex */
public final class b extends wc5 {
    public final uq41 A;
    public final wn41 c;
    public final qr41 w;
    public final zu41 x;
    public final abe y;
    public final mp41 z;

    public b(wn41 wn41Var, qr41 qr41Var, zu41 zu41Var, abe abeVar, mp41 mp41Var, uq41 uq41Var) {
        super(vt41.a);
        this.c = wn41Var;
        this.w = qr41Var;
        this.x = zu41Var;
        this.y = abeVar;
        this.z = mp41Var;
        this.A = uq41Var;
    }

    @Override // defpackage.yr31
    public final void V() {
        WebView webView = this.z.b;
        if (webView != null) {
            webView.destroy();
        }
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    @Override // defpackage.wc5
    public final void W() {
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this, new WebViewViewModel$onBackPressed$1(this, null));
    }
}
