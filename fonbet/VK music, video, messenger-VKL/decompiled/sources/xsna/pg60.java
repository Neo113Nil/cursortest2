package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.vf60;

/* compiled from: NewsfeedCustomPagingReducer.kt */
/* loaded from: classes4.dex */
public final class pg60 implements bm50<xf60, vf60> {
    public final pr60 a;

    public pg60(s1v s1vVar, rr60 rr60Var) {
        this.a = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final xf60 a(xf60 xf60Var, vf60 vf60Var) {
        xf60 xf60Var2 = xf60Var;
        vf60 vf60Var2 = vf60Var;
        if (vf60Var2 instanceof uf60) {
            return xf60.a(xf60Var2, null, this.a.a(xf60Var2.d, ((uf60) vf60Var2).a), null, 251);
        }
        if (vf60Var2 instanceof vf60.a) {
            return xf60.a(xf60Var2, null, null, ((vf60.a) vf60Var2).a, 247);
        }
        if (vf60Var2 instanceof vf60.b) {
            return xf60.a(xf60Var2, ((vf60.b) vf60Var2).a, null, null, 254);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(vf60 vf60Var) {
        return true;
    }
}
