package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.q740;

/* compiled from: MultipleCoownershipReducer.kt */
/* loaded from: classes3.dex */
public final class r740 extends dm50<z740, q740, w740> {
    public final p740 d;

    public r740(w740 w740Var, p740 p740Var) {
        super(w740Var);
        this.d = p740Var;
    }

    @Override // xsna.dm50
    public final w740 c(w740 w740Var, q740 q740Var) {
        w740 w740Var2 = w740Var;
        q740 q740Var2 = q740Var;
        if (q740Var2 instanceof q740.a) {
            return w740.a(w740Var2, null, 7);
        }
        if (q740Var2 instanceof q740.b) {
            return w740.a(w740Var2, ((q740.b) q740Var2).b, 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final z740 d() {
        return new z740(e(new r3h(this, 29)));
    }

    @Override // xsna.dm50
    public final void h(w740 w740Var, z740 z740Var) {
        f(z740Var.a, w740Var);
    }
}
