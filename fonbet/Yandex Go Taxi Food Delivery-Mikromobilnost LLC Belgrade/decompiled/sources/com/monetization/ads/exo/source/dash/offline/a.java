package com.monetization.ads.exo.source.dash.offline;

import defpackage.a871;
import defpackage.b4a1;
import defpackage.de71;
import defpackage.dw81;
import defpackage.he81;
import defpackage.if81;
import defpackage.ik71;
import defpackage.jt81;
import defpackage.n171;
import defpackage.of81;
import defpackage.qd81;
import defpackage.uz71;
import defpackage.x281;
import yads.t31;

/* loaded from: classes7.dex */
public final class a extends de71 {
    public final /* synthetic */ n171 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ x281 k;

    public a(n171 n171Var, int i, x281 x281Var) {
        this.i = n171Var;
        this.j = i;
        this.k = x281Var;
    }

    @Override // defpackage.de71
    public final Object b() {
        n171 n171Var = this.i;
        int i = this.j;
        x281 x281Var = this.k;
        of81 of81Var = x281Var.x;
        t31 t31Var = x281Var.b;
        if (of81Var == null) {
            return null;
        }
        qd81 qd81Var = x281Var.a;
        String str = qd81Var.D;
        uz71 uz71Var = new uz71((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new dw81() : new if81(0), i, qd81Var);
        of81 of81Var2 = x281Var.x;
        of81Var2.getClass();
        of81 f = x281Var.f();
        if (f != null) {
            of81 a = of81Var2.a(f, ((ik71) t31Var.get(0)).a);
            if (a == null) {
                new he81(n171Var, b4a1.a(x281Var, ((ik71) t31Var.get(0)).a, of81Var2, 0), x281Var.a, 0, null, uz71Var).a();
            } else {
                f = a;
            }
            new he81(n171Var, b4a1.a(x281Var, ((ik71) t31Var.get(0)).a, f, 0), x281Var.a, 0, null, uz71Var).a();
        }
        a871 a871Var = uz71Var.A;
        if (a871Var instanceof jt81) {
            return (jt81) a871Var;
        }
        return null;
    }
}
