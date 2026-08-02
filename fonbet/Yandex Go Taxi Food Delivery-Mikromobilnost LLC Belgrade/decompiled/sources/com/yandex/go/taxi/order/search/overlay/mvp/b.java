package com.yandex.go.taxi.order.search.overlay.mvp;

import defpackage.ad5;
import defpackage.ah00;
import defpackage.ga30;
import defpackage.jwu0;
import defpackage.jzf0;
import defpackage.l390;
import defpackage.mdh;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes14.dex */
public final class b extends ad5 {
    public final ga30 A;
    public final jzf0 B;
    public pzt0 C;
    public final l390 x;
    public final ah00 y;
    public final tt2 z;

    public b(l390 l390Var, ah00 ah00Var, tt2 tt2Var, ga30 ga30Var, jzf0 jzf0Var) {
        super(jwu0.class);
        this.x = l390Var;
        this.y = ah00Var;
        this.z = tt2Var;
        this.A = ga30Var;
        this.B = jzf0Var;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tse Jg = Jg();
        this.z.getClass();
        sjh sjhVar = uyj.a;
        this.C = tje.N(Jg, mdh.b, null, new StubOverlayPresenter$onResume$1(this, null), 2);
    }
}
