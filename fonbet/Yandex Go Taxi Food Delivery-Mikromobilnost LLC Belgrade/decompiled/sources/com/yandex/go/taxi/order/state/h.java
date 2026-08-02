package com.yandex.go.taxi.order.state;

import defpackage.j780;
import defpackage.jqr;
import defpackage.k5s0;
import defpackage.kyx0;
import defpackage.q5s0;
import defpackage.uw40;
import defpackage.wd00;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class h {
    public final uw40 a;
    public final k5s0 b;
    public final q5s0 c;
    public final j780 d;
    public final kyx0 e;

    public h(uw40 uw40Var, k5s0 k5s0Var, q5s0 q5s0Var, j780 j780Var, kyx0 kyx0Var) {
        this.a = uw40Var;
        this.b = k5s0Var;
        this.c = q5s0Var;
        this.d = j780Var;
        this.e = kyx0Var;
    }

    public final jqr a() {
        return new jqr(new g(new kotlinx.coroutines.flow.n(this.a.d, new MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$1(this, null)), this.d), new MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3(this, null), 3);
    }

    public final wd00 b() {
        boolean z = this.a.a.get();
        this.d.getClass();
        wd00 wd00Var = new wd00(true, null, true, !z);
        q5s0 q5s0Var = this.c;
        q5s0Var.getClass();
        q5s0Var.a.a("ShowBanNotification", new HashMap(), 1, new HashMap());
        return wd00Var;
    }
}
