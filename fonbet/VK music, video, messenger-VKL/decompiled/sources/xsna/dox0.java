package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.cox0;
import xsna.eox0;

/* compiled from: WidgetSettingsReducer.kt */
/* loaded from: classes6.dex */
public final class dox0 extends dm50<oox0, cox0, eox0> {
    @Override // xsna.dm50
    public final eox0 c(eox0 eox0Var, cox0 cox0Var) {
        cox0 cox0Var2 = cox0Var;
        if (cox0Var2 instanceof cox0.a.b) {
            return new eox0(eox0.a.b.b);
        }
        if (cox0Var2 instanceof cox0.a.c) {
            return new eox0(new eox0.a.c(((cox0.a.c) cox0Var2).b));
        }
        if (cox0Var2 instanceof cox0.a.C2674a) {
            return new eox0(new eox0.a.C2830a(((cox0.a.C2674a) cox0Var2).b));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final oox0 d() {
        return new oox0(e(new lbx0(1)));
    }

    @Override // xsna.dm50
    public final void h(eox0 eox0Var, oox0 oox0Var) {
        f(oox0Var.a, eox0Var);
    }
}
