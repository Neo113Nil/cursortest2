package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.j;

/* loaded from: classes10.dex */
public final class boy0 implements yly0 {
    public asy0 b;
    public final /* synthetic */ j d;
    public boolean a = true;
    public dkq0 c = wfz.Q;

    public boy0(j jVar) {
        this.d = jVar;
    }

    @Override // defpackage.yly0
    public final void a() {
    }

    @Override // defpackage.yly0
    public final void b(long j) {
        ery0 d;
        long c;
        j jVar = this.d;
        if (!jVar.l() || jVar.o().a.b.length() == 0) {
            return;
        }
        jVar.q = wu60.f(jVar.q, j);
        oay oayVar = jVar.d;
        if (oayVar != null && (d = oayVar.d()) != null) {
            jVar.s.setValue(new wu60(wu60.f(jVar.o, jVar.q)));
            if (jVar.p != null || d.c(jVar.j().a)) {
                asy0 asy0Var = jVar.p;
                int b = asy0Var != null ? (int) (asy0Var.a >> 32) : d.b(jVar.o, false);
                int b2 = d.b(jVar.j().a, false);
                if (jVar.p == null && b == b2) {
                    return;
                } else {
                    c = j.c(jVar, jVar.o(), jVar.j().a, false, false, this.c, true, new z6u(9));
                }
            } else {
                c = j.c(jVar, jVar.o(), jVar.j().a, false, false, jVar.b.j(d.b(jVar.o, true)) == jVar.b.j(d.b(jVar.j().a, true)) ? wfz.Q : wfz.R, true, new z6u(9));
            }
            this.b = new asy0(c);
            if (!asy0.a(c, jVar.p)) {
                this.a = false;
            }
        }
        jVar.u(false);
    }

    @Override // defpackage.yly0
    public final void c(long j, dkq0 dkq0Var) {
        long j2;
        ery0 d;
        ery0 d2;
        j jVar = this.d;
        oz40 oz40Var = jVar.r;
        if (jVar.l() && ((Handle) oz40Var.getValue()) == null) {
            oz40Var.setValue(Handle.SelectionEnd);
            jVar.t = -1;
            this.a = true;
            this.c = dkq0Var;
            jVar.p();
            oay oayVar = jVar.d;
            if (oayVar == null || (d2 = oayVar.d()) == null || !d2.c(j)) {
                j2 = j;
                oay oayVar2 = jVar.d;
                if (oayVar2 != null && (d = oayVar2.d()) != null) {
                    int j3 = jVar.b.j(d.b(j2, true));
                    hoy0 e = j.e(jVar.o().a, eja1.c(j3, j3));
                    jVar.h(false);
                    w6u w6uVar = jVar.k;
                    if (w6uVar != null) {
                        ((lvc0) w6uVar).a(0);
                    }
                    jVar.c.invoke(e);
                    jVar.w = new asy0(e.b);
                }
                this.a = false;
            } else {
                if (jVar.o().a.b.length() == 0) {
                    return;
                }
                jVar.h(false);
                long c = j.c(jVar, hoy0.a(jVar.o(), null, asy0.b, 5), j, true, false, this.c, true, new z6u(0));
                j2 = j;
                jVar.p = new asy0(c);
                this.b = new asy0(c);
            }
            jVar.r(HandleState.None);
            jVar.o = j2;
            jVar.s.setValue(new wu60(j2));
            jVar.q = 0L;
        }
    }

    @Override // defpackage.yly0
    public final void d() {
    }

    public final void e() {
        j jVar = this.d;
        jVar.r.setValue(null);
        jVar.s.setValue(null);
        this.c = wfz.Q;
        jVar.u(true);
        asy0 asy0Var = this.b;
        boolean c = asy0.c(asy0Var != null ? asy0Var.a : jVar.o().b);
        jVar.r(c ? HandleState.Cursor : HandleState.Selection);
        oay oayVar = jVar.d;
        if (oayVar != null) {
            oayVar.m.setValue(Boolean.valueOf(!c && amb1.f(jVar, true)));
        }
        oay oayVar2 = jVar.d;
        if (oayVar2 != null) {
            oayVar2.n.setValue(Boolean.valueOf(!c && amb1.f(jVar, false)));
        }
        oay oayVar3 = jVar.d;
        if (oayVar3 != null) {
            oayVar3.o.setValue(Boolean.valueOf(c && amb1.f(jVar, true)));
        }
        if (this.a) {
            j.b(jVar, jVar.p);
        }
        jVar.p = null;
    }

    @Override // defpackage.yly0
    public final void onCancel() {
        e();
    }

    @Override // defpackage.yly0
    public final void onStop() {
        e();
    }
}
