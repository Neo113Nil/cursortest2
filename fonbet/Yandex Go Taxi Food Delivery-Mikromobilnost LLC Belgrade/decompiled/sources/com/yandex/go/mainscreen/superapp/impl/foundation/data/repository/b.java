package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.q;
import defpackage.c0z0;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class b {
    public final c0z0 a;
    public final q b;
    public final tt2 c;
    public final hbp0 d = new hbp0(new czo0(14), "SuperappGeoParams", null);
    public final n0 e;
    public final jqr f;

    public b(c0z0 c0z0Var, q qVar, tt2 tt2Var) {
        this.a = c0z0Var;
        this.b = qVar;
        this.c = tt2Var;
        n0 c = ffx.c(1, 0, null, 6);
        this.e = c;
        this.f = new jqr(c, new SuperappGeoParamsRepository$changesFlow$1(this, null), 3);
    }

    public final void a(boolean z) {
        hbp0 hbp0Var = this.d;
        hbp0Var.f();
        this.c.getClass();
        hbp0.e(hbp0Var, uyj.a, null, new SuperappGeoParamsRepository$subscribeToChanges$1(this, z, null), 2);
    }
}
