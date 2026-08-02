package xsna;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.state.ToggleableState;
import xsna.cgj;

/* compiled from: Toggleable.kt */
/* loaded from: classes11.dex */
public final class dqp0 extends ujc {
    public ToggleableState P;

    public dqp0() {
        throw null;
    }

    @Override // xsna.zc
    public final void l2(tgi0 tgi0Var) {
        qgi0.t(tgi0Var, this.P);
        sgi0<cgj> sgi0Var = ngi0.s;
        qcy<Object>[] qcyVarArr = qgi0.a;
        qcy<Object> qcyVar = qcyVarArr[9];
        tgi0Var.a(sgi0Var, cgj.a.b);
        r82 r82Var = new r82(AutofillValue.forToggle(this.P != ToggleableState.Indeterminate));
        sgi0<xbr> sgi0Var2 = ngi0.t;
        qcy<Object> qcyVar2 = qcyVarArr[10];
        tgi0Var.a(sgi0Var2, r82Var);
        qgi0.f(tgi0Var, new u2k0(tgi0Var, 13));
    }
}
