package com.yandex.go.platform.auth;

import android.webkit.WebView;
import defpackage.fk;
import defpackage.lb20;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.ss2;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;

/* loaded from: classes13.dex */
public final class a {
    public final tse a;
    public final fk b;
    public final ss2 c;
    public final WebView d;
    public final lb20 e;

    public a(tse tseVar, fk fkVar, ss2 ss2Var, WebView webView, lb20 lb20Var) {
        this.a = tseVar;
        this.b = fkVar;
        this.c = ss2Var;
        this.d = webView;
        this.e = lb20Var;
    }

    public final void a(boolean z) {
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new AccountChangeWatcher$onAccountChanged$1(this, z, null), 2);
    }
}
