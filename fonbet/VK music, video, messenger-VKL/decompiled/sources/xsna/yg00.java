package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.xg00;

/* compiled from: ManageCommunitiesNotificationsReducer.kt */
/* loaded from: classes5.dex */
public final class yg00 extends dm50<lh00, xg00, dh00> {
    @Override // xsna.dm50
    public final dh00 c(dh00 dh00Var, xg00 xg00Var) {
        dh00 dh00Var2 = dh00Var;
        xg00 xg00Var2 = xg00Var;
        if (xg00Var2 instanceof xg00.a) {
            return new dh00(((xg00.a) xg00Var2).b, false, false, false);
        }
        if (xg00Var2.equals(xg00.b.b)) {
            return dh00.a(dh00Var2, false, true, EmptyList.b, 2);
        }
        if (xg00Var2.equals(xg00.c.b)) {
            return dh00.a(dh00Var2, true, false, EmptyList.b, 2);
        }
        if (xg00Var2.equals(xg00.d.b)) {
            return dh00.a(dh00Var2, false, false, null, 13);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final lh00 d() {
        return new lh00(e(new d37(23)));
    }

    @Override // xsna.dm50
    public final void h(dh00 dh00Var, lh00 lh00Var) {
        f(lh00Var.a, dh00Var);
    }
}
