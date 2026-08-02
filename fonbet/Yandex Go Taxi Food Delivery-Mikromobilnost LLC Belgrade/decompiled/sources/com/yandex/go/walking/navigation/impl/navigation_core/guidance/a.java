package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import com.yandex.go.walking.navigation.impl.experiment.WalkNavExperiment;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.im21;
import defpackage.l141;
import defpackage.pzt0;
import defpackage.smw0;
import defpackage.tse;
import defpackage.y141;

/* loaded from: classes14.dex */
public final class a {
    public final im21 a;
    public final tse b;
    public final b c;
    public final y141 d;
    public final cne0 e;
    public pzt0 f;
    public pzt0 g;

    public a(dne0 dne0Var, im21 im21Var, tse tseVar, b bVar, y141 y141Var) {
        this.a = im21Var;
        this.b = tseVar;
        this.c = bVar;
        this.d = y141Var;
        this.e = dne0Var.a("walk_nav_auto_finish");
    }

    public final void a() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.g = null;
        cne0 cne0Var = this.e;
        cne0Var.q(-1L, "walk_nav_total_route_time");
        cne0Var.q(-1L, "walk_nav_deadline");
    }

    public final boolean b() {
        cne0 cne0Var = this.e;
        long j = cne0Var.j("walk_nav_deadline", -1L);
        Long valueOf = j == -1 ? null : Long.valueOf(j);
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (System.currentTimeMillis() >= longValue) {
                cne0Var.q(-1L, "walk_nav_total_route_time");
                cne0Var.q(-1L, "walk_nav_deadline");
                return true;
            }
            e(longValue);
            d();
        }
        return false;
    }

    public final void c(long j) {
        long g = smw0.g(j, 1000L, System.currentTimeMillis(), ((WalkNavExperiment) ((l141) this.a.get()).a.b()).c * 60000);
        cne0 cne0Var = this.e;
        cne0Var.q(j, "walk_nav_total_route_time");
        cne0Var.q(g, "walk_nav_deadline");
        e(g);
        d();
    }

    public final void d() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.g = com.yandex.go.coroutines.b.g(this.b, null, null, new WalkNavGuidanceDeadlineInteractor$startRouteFinishListenerIfNeeded$1(this, null), 3);
        }
    }

    public final void e(long j) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        this.f = com.yandex.go.coroutines.b.g(this.b, null, null, new WalkNavGuidanceDeadlineInteractor$startTimer$1(currentTimeMillis, this, null), 3);
    }
}
