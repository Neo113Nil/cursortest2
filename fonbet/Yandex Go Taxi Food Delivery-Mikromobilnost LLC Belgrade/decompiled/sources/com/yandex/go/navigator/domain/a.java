package com.yandex.go.navigator.domain;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.czo0;
import defpackage.dne0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.mf50;
import defpackage.oc50;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final o a;
    public final t b;
    public final oc50 c;
    public final mf50 d;
    public final h3y e;
    public final h3y f;
    public final cne0 g;
    public final r0 h;
    public boolean i;
    public long j;
    public final hbp0 k;

    public a(o oVar, t tVar, oc50 oc50Var, mf50 mf50Var, h3y h3yVar, h3y h3yVar2, dne0 dne0Var) {
        this.a = oVar;
        this.b = tVar;
        this.c = oc50Var;
        this.d = mf50Var;
        this.e = h3yVar;
        this.f = h3yVar2;
        cne0 a = dne0Var.a("com.yandex.go.navigator.AutocompleteManager");
        this.g = a;
        this.h = bvf0.c(Boolean.FALSE);
        this.j = a.j("GUIDANCE_START_TIME", 0L);
        this.k = new hbp0(new czo0(14), a.class.getName(), null);
    }

    public final boolean a() {
        if (this.j == 0 || System.currentTimeMillis() - this.j <= 86400000) {
            return false;
        }
        this.b.f(false);
        return true;
    }

    public final void b() {
        if (a()) {
            return;
        }
        if (this.j == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.j = currentTimeMillis;
            this.g.q(currentTimeMillis, "GUIDANCE_START_TIME");
        }
        hbp0 hbp0Var = this.k;
        hbp0Var.b();
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.h;
        r0Var.getClass();
        r0Var.m(null, bool);
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new AutocompleteManager$onRouteStarted$1(this, null), 3);
    }
}
