package com.yandex.go.taxi.summary.map.focus.data;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kev0;
import defpackage.mth;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes14.dex */
public final class c implements kev0 {
    public final com.yandex.go.navigation.screen.c a;
    public final ike b;
    public pzt0 c;
    public AtomicBoolean d;

    public c(tse tseVar, tt2 tt2Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = cVar;
        tt2Var.getClass();
        this.b = bvf0.M(tseVar, uyj.a);
        this.d = new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    public final void a() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = kotlinx.coroutines.flow.e.H(this.b, new jqr(kotlinx.coroutines.flow.e.T(new b(new mth(new j0(null, this.a.c(), new SummaryClarifyRepositoryImpl$attach$$inlined$withPreviousEmit$1(3, null)), 6)), 1), new SummaryClarifyRepositoryImpl$attach$2(this, null), 3));
    }
}
