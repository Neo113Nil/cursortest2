package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jox0;
import xsna.lox0;

/* compiled from: WidgetSettingsTabReducer.kt */
/* loaded from: classes6.dex */
public final class kox0 extends dm50<mox0, jox0, lox0> {
    public final iox0 d;

    public kox0(iox0 iox0Var) {
        super(lox0.b.b);
        this.d = iox0Var;
    }

    @Override // xsna.dm50
    public final lox0 c(lox0 lox0Var, jox0 jox0Var) {
        jox0 jox0Var2 = jox0Var;
        if (jox0Var2 instanceof jox0.a.b) {
            return lox0.b.b;
        }
        if (jox0Var2 instanceof jox0.a.C3135a) {
            return new lox0.a(((jox0.a.C3135a) jox0Var2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final mox0 d() {
        return new mox0(e(new aiw0(this, 6)));
    }

    @Override // xsna.dm50
    public final void h(lox0 lox0Var, mox0 mox0Var) {
        f(mox0Var.a, lox0Var);
    }
}
