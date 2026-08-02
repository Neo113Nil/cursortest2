package com.yandex.go.payments.shared;

import defpackage.oep0;
import defpackage.omr0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uwd0;
import defpackage.x2b;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class g {
    public final tse a;
    public final oep0 b;
    public final x2b c;
    public omr0 d;

    public g(tse tseVar, oep0 oep0Var, x2b x2bVar) {
        this.a = tseVar;
        this.b = oep0Var;
        this.c = x2bVar;
    }

    public static pzt0 a(g gVar, tls tlsVar) {
        omr0 omr0Var = gVar.d;
        if (omr0Var != null) {
            omr0Var.i();
        }
        omr0 omr0Var2 = new omr0(gVar.c);
        gVar.d = omr0Var2;
        pzt0 N = tje.N(gVar.a, null, CoroutineStart.LAZY, new SharedAccountProgressInteractor$runWithSpinner$task$1(tlsVar, gVar, omr0Var2, null), 1);
        omr0Var2.P(new uwd0(N, 1));
        oep0.b(gVar.b, omr0Var2);
        N.start();
        return N;
    }
}
