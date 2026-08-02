package com.yandex.plus.webview.internal.contract.impl.loading;

import com.yandex.plus.webview.core.WebViewMainFrameException;
import defpackage.bvf0;
import defpackage.h2t;
import defpackage.ike;
import defpackage.jln;
import defpackage.mw2;
import defpackage.n4u0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.swh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt4;
import defpackage.u85;
import defpackage.x85;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class a extends b {
    public static final r0 i = bvf0.c(Boolean.FALSE);
    public final tse e;
    public sls f;
    public n4u0 g;
    public pzt0 h;

    public a(long j, jln jlnVar, h2t h2tVar, ike ikeVar) {
        super(j, jlnVar, h2tVar);
        this.e = ikeVar;
        this.f = new tt4(15);
        this.g = i;
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void e(swh swhVar) {
        this.f = new mw2(21, this, swhVar);
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void f() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
        this.d = x85.a;
        this.g = (n4u0) this.f.invoke();
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void g() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
        this.g = i;
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void h(WebViewMainFrameException webViewMainFrameException) {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
        a();
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void i(String str) {
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void j(String str) {
        if (this.d instanceof u85) {
            return;
        }
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
        b();
        if (((Boolean) this.g.getValue()).booleanValue()) {
            c();
        } else {
            this.h = tje.N(this.e, null, null, new BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1(this, str, null), 3);
        }
    }

    public abstract n4u0 k(swh swhVar);
}
