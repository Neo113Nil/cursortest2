package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qqd0;

/* compiled from: ProductManagementReducer.kt */
/* loaded from: classes18.dex */
public final class rqd0 implements bm50<apl0, qqd0> {
    @Override // xsna.bm50
    public final apl0 a(apl0 apl0Var, qqd0 qqd0Var) {
        apl0 apl0Var2 = apl0Var;
        qqd0 qqd0Var2 = qqd0Var;
        tsd0 tsd0Var = apl0Var2.m;
        if (qqd0Var2 instanceof qqd0.c) {
            if (tsd0Var != null) {
                return apl0.a(apl0Var2, null, null, null, null, null, null, null, tsd0.a(tsd0Var, false, tsd0Var.e.get(((qqd0.c) qqd0Var2).a), 127), null, 12287);
            }
        } else if (qqd0Var2.equals(qqd0.a.a)) {
            if (tsd0Var != null) {
                return apl0.a(apl0Var2, null, null, null, null, null, null, null, tsd0.a(tsd0Var, false, null, 127), null, 12287);
            }
        } else {
            if (!(qqd0Var2 instanceof qqd0.b)) {
                if (qqd0Var2 instanceof qqd0.d) {
                    return apl0.a(apl0Var2, null, null, null, null, null, null, null, ((qqd0.d) qqd0Var2).a, null, 12287);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (tsd0Var != null) {
                return apl0.a(apl0Var2, null, null, null, null, null, null, null, tsd0.a(tsd0Var, ((qqd0.b) qqd0Var2).a, null, 191), null, 12287);
            }
        }
        return apl0Var2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(qqd0 qqd0Var) {
        return true;
    }
}
