package com.yandex.go.scooters.subscription.data;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.jyo0;
import defpackage.kyo0;
import defpackage.myo0;
import defpackage.vyo0;
import defpackage.ywm0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b implements vyo0 {
    public final ywm0 a;
    public final r0 b = bvf0.c(jyo0.a);
    public final n0 c = ffx.c(0, 0, null, 7);

    public b(ywm0 ywm0Var) {
        this.a = ywm0Var;
    }

    public final void a(myo0 myo0Var) {
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, myo0Var);
        if (myo0Var instanceof kyo0) {
            this.a.c(new ScootersSubscriptionPurchasingStateRepositoryImpl$update$1(this, myo0Var, null));
        }
    }
}
