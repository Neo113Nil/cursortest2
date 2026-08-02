package com.yandex.go.call_order_fallback.domain;

import defpackage.i3y;
import defpackage.oep0;
import defpackage.pft0;
import defpackage.sb1;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class d implements pft0 {
    public final tt2 a;
    public final c b;
    public final oep0 c;
    public final i3y d;

    public d(sb1 sb1Var, tt2 tt2Var, c cVar, oep0 oep0Var) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = oep0Var;
        this.d = kotlin.a.a(new CallOrderFallbackListener$router$2(0, sb1Var, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        this.a.getClass();
        tje.N(tseVar, uyj.a, null, new CallOrderFallbackListener$onAttach$1(this, null), 2);
    }
}
