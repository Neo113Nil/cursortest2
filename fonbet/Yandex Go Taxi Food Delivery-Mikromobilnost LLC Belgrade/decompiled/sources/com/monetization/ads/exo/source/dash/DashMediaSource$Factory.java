package com.monetization.ads.exo.source.dash;

import defpackage.c981;
import defpackage.d981;
import defpackage.gp61;
import defpackage.hn71;
import defpackage.hz71;
import defpackage.jv71;
import defpackage.ll81;
import defpackage.n881;
import defpackage.op81;
import defpackage.ql61;
import defpackage.qv81;
import defpackage.tn81;
import defpackage.u571;
import java.util.List;

/* loaded from: classes7.dex */
public final class DashMediaSource$Factory implements hz71 {
    private final n881 a;
    private final u571 b;
    private gp61 c = new gp61();
    private final ll81 e = new ll81();
    private final long f = 30000;
    private final jv71 d = new jv71();

    public DashMediaSource$Factory(u571 u571Var) {
        this.a = new n881(u571Var);
        this.b = u571Var;
    }

    @Override // defpackage.hz71
    public final qv81 a(op81 op81Var) {
        op81Var.b.getClass();
        ql61 tn81Var = new tn81();
        d981 d981Var = op81Var.b;
        List list = d981Var.b;
        if (!list.isEmpty()) {
            tn81Var = new hn71(1, tn81Var, list);
        }
        ql61 ql61Var = tn81Var;
        u571 u571Var = this.b;
        n881 n881Var = this.a;
        jv71 jv71Var = this.d;
        this.c.getClass();
        d981Var.getClass();
        d981Var.getClass();
        return new i(op81Var, u571Var, ql61Var, n881Var, jv71Var, c981.a, this.e, this.f);
    }
}
