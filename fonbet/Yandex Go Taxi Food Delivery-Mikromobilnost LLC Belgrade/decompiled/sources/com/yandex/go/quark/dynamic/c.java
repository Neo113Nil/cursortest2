package com.yandex.go.quark.dynamic;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import defpackage.bgc;
import defpackage.rdb;
import defpackage.se41;
import defpackage.uig0;
import defpackage.uo41;
import defpackage.w511;
import defpackage.wig0;
import defpackage.y3x0;
import defpackage.yig0;
import defpackage.zq41;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c implements rdb {
    public final View a;
    public final /* synthetic */ se41 b;
    public final /* synthetic */ h c;
    public final /* synthetic */ uig0 d;

    public c(se41 se41Var, h hVar, uig0 uig0Var) {
        this.b = se41Var;
        this.c = hVar;
        this.d = uig0Var;
        this.a = (View) se41Var.D.getValue();
    }

    public final void a() {
        h hVar = this.c;
        yig0 yig0Var = hVar.d;
        int i = wig0.b[yig0Var.b.ordinal()];
        if (i == 1) {
            ((com.yandex.go.quark.dynamic.chat.a) hVar.l.get()).c = new bgc(12);
        } else if (i != 2) {
            w511.b();
            return;
        }
        se41 se41Var = this.b;
        se41Var.c.e("WebChatViewController", "Destroy web content view");
        se41Var.n.c(uo41.a);
        if (se41Var.w.isInitialized()) {
            y3x0 y3x0Var = (y3x0) se41Var.a();
            WebView webView = y3x0Var.e;
            if (webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
            y3x0Var.k.clear();
            y3x0Var.f = null;
            y3x0Var.g = null;
            y3x0Var.i.clear();
            se41Var.d.b(zq41.d);
        }
        se41Var.v.onDestroy();
        se41Var.m.a = null;
        r0 r0Var = hVar.r;
        do {
        } while (!r0Var.k(r0Var.getValue(), Integer.valueOf(((Number) r2).intValue() - 1)));
        if (yig0Var.a) {
            hVar.f();
        }
    }

    public final kotlinx.coroutines.flow.internal.g b() {
        return kotlinx.coroutines.flow.e.X(this.b.A, new QuarkServiceImpl$createChatViewController$3$viewStateFlow$1(this.c, null));
    }
}
