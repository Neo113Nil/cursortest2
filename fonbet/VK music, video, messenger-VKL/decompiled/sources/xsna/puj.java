package xsna;

import android.view.autofill.AutofillValue;
import xsna.cgj;
import xsna.mlj;

/* compiled from: CoreTextFieldSemanticsModifier.kt */
/* loaded from: classes11.dex */
public final class puj extends ytl implements fgi0 {
    public klp0 r;
    public tho0 s;
    public j1z t;
    public boolean u;
    public boolean v;
    public uv70 w;
    public gho0 x;
    public rnw y;
    public rwr z;

    public static void l2(j1z j1zVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        sio0 sio0Var = j1zVar.e;
        bzw bzwVar = j1zVar.v;
        if (sio0Var == null) {
            int length = str.length();
            bzwVar.invoke(new tho0(str, jgz.c(length, length), 4));
        } else {
            tho0 c = j1zVar.d.c(e43.l(new tul(), new pgg(str, 1)));
            sio0Var.a(null, c);
            bzwVar.invoke(c);
        }
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        us2 us2Var = this.s.a;
        qcy<Object>[] qcyVarArr = qgi0.a;
        sgi0<us2> sgi0Var = ngi0.F;
        qcy<Object>[] qcyVarArr2 = qgi0.a;
        qcy<Object> qcyVar = qcyVarArr2[18];
        tgi0Var.a(sgi0Var, us2Var);
        us2 us2Var2 = this.r.a;
        sgi0<us2> sgi0Var2 = ngi0.G;
        qcy<Object> qcyVar2 = qcyVarArr2[19];
        tgi0Var.a(sgi0Var2, us2Var2);
        long j = this.s.b;
        sgi0<qko0> sgi0Var3 = ngi0.H;
        qcy<Object> qcyVar3 = qcyVarArr2[20];
        tgi0Var.a(sgi0Var3, new qko0(j));
        sgi0<cgj> sgi0Var4 = ngi0.s;
        qcy<Object> qcyVar4 = qcyVarArr2[9];
        tgi0Var.a(sgi0Var4, cgj.a.a);
        r82 r82Var = new r82(AutofillValue.forText(this.s.a));
        sgi0<xbr> sgi0Var5 = ngi0.t;
        qcy<Object> qcyVar5 = qcyVarArr2[10];
        tgi0Var.a(sgi0Var5, r82Var);
        int i = 3;
        qgi0.f(tgi0Var, new frg(this, i));
        int i2 = this.y.d;
        int i3 = 8;
        if (i2 == 6) {
            mlj.a.getClass();
            m72 m72Var = mlj.a.c;
            sgi0<mlj> sgi0Var6 = ngi0.r;
            qcy<Object> qcyVar6 = qcyVarArr2[8];
            tgi0Var.a(sgi0Var6, m72Var);
        } else if (i2 == 7 || i2 == 8) {
            mlj.a.getClass();
            m72 m72Var2 = mlj.a.b;
            sgi0<mlj> sgi0Var7 = ngi0.r;
            qcy<Object> qcyVar7 = qcyVarArr2[8];
            tgi0Var.a(sgi0Var7, m72Var2);
        } else if (i2 == 4) {
            mlj.a.getClass();
            m72 m72Var3 = mlj.a.d;
            sgi0<mlj> sgi0Var8 = ngi0.r;
            qcy<Object> qcyVar8 = qcyVarArr2[8];
            tgi0Var.a(sgi0Var8, m72Var3);
        }
        if (!this.v) {
            qgi0.a(tgi0Var);
        }
        int i4 = 0;
        boolean z = this.v && !this.u;
        sgi0<Boolean> sgi0Var9 = ngi0.O;
        qcy<Object> qcyVar9 = qcyVarArr2[28];
        tgi0Var.a(sgi0Var9, Boolean.valueOf(z));
        qgi0.b(tgi0Var, new eph(this, i));
        if (z) {
            tgi0Var.a(wfi0.k, new ck(null, new pz(this, 25)));
            tgi0Var.a(wfi0.o, new ck(null, new defpackage.o(17, this, tgi0Var)));
        }
        tgi0Var.a(wfi0.j, new ck(null, new ouj(this, i4)));
        int i5 = this.y.e;
        k5h k5hVar = new k5h(this, 5);
        tgi0Var.a(ngi0.I, new qnw(i5));
        tgi0Var.a(wfi0.p, new ck(null, k5hVar));
        qgi0.e(tgi0Var, null, new c5f(this, i3));
        tgi0Var.a(wfi0.c, new ck(null, new z4f(this, 13)));
        if (!qko0.c(this.s.b)) {
            tgi0Var.a(wfi0.q, new ck(null, new yqf(this, 8)));
            if (this.v && !this.u) {
                tgi0Var.a(wfi0.r, new ck(null, new zqf(this, 11)));
            }
        }
        if (!this.v || this.u) {
            return;
        }
        tgi0Var.a(wfi0.s, new ck(null, new nuj(this, i4)));
    }

    @Override // xsna.fgi0
    public final boolean q1() {
        return true;
    }
}
