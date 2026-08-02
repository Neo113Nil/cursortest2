package com.yandex.go.preorder.navigation;

import defpackage.bvf0;
import defpackage.hbp0;
import defpackage.jse0;
import defpackage.qse0;
import defpackage.tt2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class g {
    public final r0 a = bvf0.c(0);
    public qse0 b = new jse0();
    public final hbp0 c;

    public g(tt2 tt2Var) {
        this.c = new hbp0(new PreorderPresenceRepositoryImpl$presentScope$1(0, tt2Var, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    public final boolean a() {
        return ((Number) this.a.getValue()).intValue() > 0;
    }

    public final void b(boolean z) {
        boolean a = a();
        r0 r0Var = this.a;
        if (z) {
            r0Var.m(null, Integer.valueOf(((Number) r0Var.getValue()).intValue() + 1));
        } else {
            r0Var.m(null, Integer.valueOf(((Number) r0Var.getValue()).intValue() - 1));
        }
        hbp0 hbp0Var = this.c;
        if (!a && a()) {
            hbp0Var.a();
        }
        if (!a || a()) {
            return;
        }
        hbp0Var.b();
    }
}
