package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.n4;
import com.yandex.passport.internal.report.r4;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import defpackage.jl40;
import defpackage.scc;
import defpackage.w511;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class n extends l3 {
    public final com.yandex.passport.internal.features.a b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public LoginProperties w;

    public n(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar, com.yandex.passport.internal.core.accounts.d dVar) {
        super(jVar);
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.e.getValue(aVar, com.yandex.passport.internal.features.a.J[1])).booleanValue();
    }

    public final void j(w1 w1Var) {
        f(n4.w, new jd(w1Var.a, false), new com.yandex.passport.internal.report.a(w1Var.b), new com.yandex.passport.internal.report.i(w1Var.x, 15), new com.yandex.passport.internal.report.i(w1Var.z, 3));
    }

    public final void k(r1 r1Var) {
        r4 r4Var = r4.w;
        if (r1Var.equals(com.yandex.passport.internal.ui.bouncer.model.k1.a) || r1Var.equals(n1.a) || r1Var.equals(p1.a) || (r1Var instanceof o1) || (r1Var instanceof l1)) {
            f(r4Var, new com.yandex.passport.internal.report.a(r1Var));
            return;
        }
        if (r1Var instanceof m1) {
            f(r4Var, new com.yandex.passport.internal.report.a(r1Var), new yd(((m1) r1Var).a));
        } else if (r1Var instanceof q1) {
            f(r4Var, new com.yandex.passport.internal.report.a(r1Var), new com.yandex.passport.internal.report.i(((q1) r1Var).c));
        } else {
            w511.b();
        }
    }

    public final void l(s1 s1Var) {
        LoginProperties loginProperties = this.w;
        LoginProperties loginProperties2 = s1Var.c;
        boolean l = jl40.l(loginProperties, loginProperties2);
        ArrayList i = scc.i(new com.yandex.passport.internal.report.a(s1Var.a), new com.yandex.passport.internal.report.a(s1Var.b), new com.yandex.passport.internal.report.a(s1Var.d), new com.yandex.passport.internal.report.a(s1Var.e));
        if (this.w == null) {
            i.add(new jd(loginProperties2, false));
        } else if (!l) {
            i.add(new jd(loginProperties2, true));
        }
        e(r4.w, i);
        if (l) {
            return;
        }
        this.w = loginProperties2;
    }
}
