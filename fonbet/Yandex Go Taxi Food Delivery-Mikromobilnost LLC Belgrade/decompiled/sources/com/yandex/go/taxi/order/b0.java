package com.yandex.go.taxi.order;

import defpackage.a880;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.time.DurationUnit;

/* loaded from: classes14.dex */
public final /* synthetic */ class b0 {
    public final /* synthetic */ e0 a;

    public /* synthetic */ b0(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(boolean z) {
        long longValue;
        e0 e0Var = this.a;
        a880 a880Var = e0Var.i;
        if (z) {
            Long l = a880Var.a;
            longValue = l != null ? l.longValue() : 10000L;
        } else {
            Long l2 = a880Var.b;
            longValue = l2 != null ? l2.longValue() : 60000L;
        }
        pzt0 pzt0Var = e0Var.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new d0(com.yandex.go.coroutines.b.m(kp50.V(longValue, durationUnit), kp50.V(longValue, durationUnit)), e0Var), new OrderStatusTotwUpdater$updateAsync$3(e0Var, null));
        e0Var.b.getClass();
        sjh sjhVar = uyj.a;
        e0Var.l = tje.N(e0Var.a, null, null, new OrderStatusTotwUpdater$updateAsync$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(oVar, mdh.b), null, e0Var), 3);
    }
}
