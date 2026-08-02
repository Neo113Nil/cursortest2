package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.je10;
import xsna.oe10;

/* compiled from: MarketShopConditionsReducer.kt */
/* loaded from: classes18.dex */
public final class ke10 extends dm50<ve10, je10, oe10> {
    @Override // xsna.dm50
    public final oe10 c(oe10 oe10Var, je10 je10Var) {
        je10 je10Var2 = je10Var;
        if (je10Var2 instanceof je10.a) {
            return new oe10.a(((je10.a) je10Var2).b);
        }
        if (je10Var2 instanceof je10.b) {
            return oe10.b.b;
        }
        if (je10Var2 instanceof je10.c) {
            return oe10.c.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ve10 d() {
        return new ve10(e(new qcw(4)), e(new pyz(3)), e(new qey(6)));
    }

    @Override // xsna.dm50
    public final void h(oe10 oe10Var, ve10 ve10Var) {
        oe10 oe10Var2 = oe10Var;
        ve10 ve10Var2 = ve10Var;
        if (oe10Var2 instanceof oe10.a) {
            f(ve10Var2.b, oe10Var2);
        } else if (oe10Var2 instanceof oe10.b) {
            f(ve10Var2.c, oe10Var2);
        } else {
            if (!(oe10Var2 instanceof oe10.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f(ve10Var2.a, oe10Var2);
        }
    }
}
