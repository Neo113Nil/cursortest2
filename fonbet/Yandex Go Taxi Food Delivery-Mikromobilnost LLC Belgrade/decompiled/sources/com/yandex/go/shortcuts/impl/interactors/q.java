package com.yandex.go.shortcuts.impl.interactors;

import defpackage.a5s0;
import defpackage.abf0;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.e2t;
import defpackage.g18;
import defpackage.hay0;
import defpackage.iaf0;
import defpackage.ike;
import defpackage.iw70;
import defpackage.jc00;
import defpackage.mdh;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.qaf0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t9f0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes13.dex */
public final class q {
    public final m a;
    public final abf0 b;
    public final com.yandex.go.navigation.screen.c c;
    public final t9f0 d;
    public final hay0 e;
    public final jc00 f;
    public final n g;
    public final a5s0 h;
    public final e2t i;
    public final tt2 j;
    public g18 k = g18.u1;
    public pzt0 l;
    public pzt0 m;
    public final ike n;

    public q(m mVar, abf0 abf0Var, com.yandex.go.navigation.screen.c cVar, t9f0 t9f0Var, hay0 hay0Var, jc00 jc00Var, n nVar, a5s0 a5s0Var, e2t e2tVar, tt2 tt2Var) {
        this.a = mVar;
        this.b = abf0Var;
        this.c = cVar;
        this.d = t9f0Var;
        this.e = hay0Var;
        this.f = jc00Var;
        this.g = nVar;
        this.h = a5s0Var;
        this.i = e2tVar;
        this.j = tt2Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.n = bvf0.a(o400.a);
    }

    public final void a() {
        q qVar;
        sls productsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1;
        com.yandex.go.navigation.screen.c cVar = this.c;
        int i = iaf0.a[cVar.b().ordinal()];
        int i2 = 2;
        if (i == 1) {
            qVar = this;
            productsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1 = new ProductsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1(0, this, q.class, "subscribeProductsChangesOnMainScreen", "subscribeProductsChangesOnMainScreen()V", 0);
        } else if (i != 2) {
            productsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1 = new bgc(12);
            qVar = this;
        } else {
            qVar = this;
            productsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1 = new ProductsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$2(0, qVar, q.class, "subscribeProductsChangesOnTaxiMainScreen", "subscribeProductsChangesOnTaxiMainScreen()V", 0);
        }
        pzt0 pzt0Var = qVar.m;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            productsPointsInteractorImpl$subscribeProductsChanges$subscribeProductsChanges$1.invoke();
        }
        pzt0 pzt0Var2 = qVar.l;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        qVar.l = tje.N(qVar.n, null, null, new ProductsPointsInteractorImpl$subscribeProductsChanges$1(qVar, null), 3);
        qVar.k = cVar.a(new iw70(i2, qVar));
        qVar.g.b();
    }

    public final void b(qaf0 qaf0Var) {
        this.b.a(qaf0Var);
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j.getClass();
        sjh sjhVar = uyj.a;
        this.m = tje.N(this.n, mdh.b, null, new ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1(this, qaf0Var, null), 2);
    }
}
