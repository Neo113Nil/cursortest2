package xsna;

import android.view.autofill.AutofillValue;
import xsna.cgj;

/* compiled from: Toggleable.kt */
/* loaded from: classes11.dex */
public final class e1p0 extends ujc {
    public boolean P;
    public izs<? super Boolean, s3q0> Q;
    public final dac0 R;

    public e1p0() {
        throw null;
    }

    public e1p0(boolean z, sg50 sg50Var, boolean z2, boolean z3, plg0 plg0Var, izs izsVar) {
        super(sg50Var, null, z2, z3, null, plg0Var, new s810(izsVar, z));
        this.P = z;
        this.Q = izsVar;
        this.R = new dac0(this, 21);
    }

    @Override // xsna.zc
    public final void l2(tgi0 tgi0Var) {
        qgi0.t(tgi0Var, jgz.d(this.P));
        sgi0<cgj> sgi0Var = ngi0.s;
        qcy<Object>[] qcyVarArr = qgi0.a;
        qcy<Object> qcyVar = qcyVarArr[9];
        tgi0Var.a(sgi0Var, cgj.a.b);
        r82 r82Var = new r82(AutofillValue.forToggle(this.P));
        sgi0<xbr> sgi0Var2 = ngi0.t;
        qcy<Object> qcyVar2 = qcyVarArr[10];
        tgi0Var.a(sgi0Var2, r82Var);
        qgi0.f(tgi0Var, new skj0(tgi0Var, 6));
    }
}
