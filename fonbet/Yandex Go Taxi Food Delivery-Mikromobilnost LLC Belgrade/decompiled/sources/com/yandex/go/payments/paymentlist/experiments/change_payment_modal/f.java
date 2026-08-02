package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import com.yandex.go.payments.domain.j0;
import defpackage.auu0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.fga0;
import defpackage.h6w;
import defpackage.k8u;
import defpackage.lw90;
import defpackage.n65;
import defpackage.qea0;
import defpackage.rbx;
import defpackage.rgf;
import defpackage.sbx;
import defpackage.tpr;
import defpackage.u5s0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class f {
    public final fga0 a;
    public final cne0 b;
    public final tpr c;

    public f(u5s0 u5s0Var, fga0 fga0Var, com.yandex.go.navigation.screen.c cVar, rgf rgfVar, dne0 dne0Var, qea0 qea0Var, lw90 lw90Var) {
        this.a = fga0Var;
        this.b = dne0Var.b();
        this.c = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(new c(u5s0Var.a.a()), new e(((j0) qea0Var).a(lw90.c(lw90Var, null, new n65[0], 3))), cVar.c(), kotlinx.coroutines.flow.e.d(rgfVar.a), new ChangePaymentOnSummaryRepository$showModalFlow$3(this, null)));
    }

    public final Map a() {
        String l = this.b.l("change_payment_on_summary_show_counts", null);
        if (l == null || l.length() == 0) {
            return kotlin.collections.b.f();
        }
        try {
            rbx rbxVar = sbx.d;
            rbxVar.getClass();
            return (Map) rbxVar.b(new k8u(auu0.a, h6w.a, 1), l);
        } catch (Exception unused) {
            return kotlin.collections.b.f();
        }
    }
}
