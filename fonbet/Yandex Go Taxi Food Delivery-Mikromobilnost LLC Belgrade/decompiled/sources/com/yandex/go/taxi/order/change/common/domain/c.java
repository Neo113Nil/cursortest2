package com.yandex.go.taxi.order.change.common.domain;

import defpackage.ike;
import defpackage.n20;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.yvf0;

/* loaded from: classes14.dex */
public final class c {
    public final tt2 a;
    public final n20 b;
    public final com.yandex.go.taxi.order.popup.b c;
    public final yvf0 d;
    public final oep0 e;

    public c(tt2 tt2Var, n20 n20Var, com.yandex.go.taxi.order.popup.b bVar, yvf0 yvf0Var, oep0 oep0Var) {
        this.a = tt2Var;
        this.b = n20Var;
        this.c = bVar;
        this.d = yvf0Var;
        this.e = oep0Var;
    }

    public final void a(ike ikeVar) {
        tje.N(ikeVar, null, null, new ChangeOrderErrorModalInteractor$attach$1(this, null), 3);
    }
}
