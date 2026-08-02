package com.yandex.go.scooters.passes.data;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.ufo0;
import defpackage.yeo0;
import defpackage.ywm0;
import defpackage.zeo0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b implements ufo0 {
    public final ywm0 a;
    public final r0 b = bvf0.c(yeo0.a);
    public final n0 c = ffx.c(0, 0, null, 7);

    public b(ywm0 ywm0Var) {
        this.a = ywm0Var;
    }

    public final void a() {
        zeo0 zeo0Var = new zeo0();
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, zeo0Var);
        this.a.c(new ScootersPassesPurchasingStateRepositoryImpl$purchased$1(this, zeo0Var, null));
    }
}
