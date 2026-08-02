package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.nd70;

/* compiled from: NotificationMenuModalReducer.kt */
/* loaded from: classes4.dex */
public final class ud70 extends dm50<ce70, nd70, yd70> {
    @Override // xsna.dm50
    public final yd70 c(yd70 yd70Var, nd70 nd70Var) {
        yd70 yd70Var2 = yd70Var;
        nd70 nd70Var2 = nd70Var;
        if (nd70Var2 instanceof nd70.c) {
            nd70.c cVar = (nd70.c) nd70Var2;
            return yd70.a(yd70Var2, false, false, cVar.b, cVar.c, null, cVar.d, 19);
        }
        if (nd70Var2.equals(nd70.d.b)) {
            return yd70.a(yd70Var2, true, false, false, false, null, null, 60);
        }
        if (nd70Var2.equals(nd70.b.b)) {
            return yd70.a(yd70Var2, false, true, false, false, null, null, 60);
        }
        if (nd70Var2 instanceof nd70.a) {
            return yd70.a(yd70Var2, false, false, false, false, ((nd70.a) nd70Var2).b, null, 46);
        }
        if (nd70Var2 instanceof nd70.f) {
            return yd70.a(yd70Var2, false, false, false, ((nd70.f) nd70Var2).b, null, null, 55);
        }
        if (nd70Var2 instanceof nd70.e) {
            return yd70.a(yd70Var2, false, false, false, false, null, ((nd70.e) nd70Var2).b, 31);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ce70 d() {
        return new ce70(e(new d220(8)));
    }

    @Override // xsna.dm50
    public final void h(yd70 yd70Var, ce70 ce70Var) {
        f(ce70Var.a, yd70Var);
    }
}
