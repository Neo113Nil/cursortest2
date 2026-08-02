package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.pqc0;
import xsna.sqc0;

/* compiled from: PostingWithAuthorReducer.kt */
/* loaded from: classes4.dex */
public final class qqc0 extends dm50<yqc0, pqc0, sqc0> {
    @Override // xsna.dm50
    public final sqc0 c(sqc0 sqc0Var, pqc0 pqc0Var) {
        pqc0 pqc0Var2 = pqc0Var;
        if (pqc0Var2 instanceof pqc0.b) {
            return sqc0.b.b;
        }
        if (pqc0Var2 instanceof pqc0.c) {
            return new sqc0.c(((pqc0.c) pqc0Var2).b);
        }
        if (pqc0Var2 instanceof pqc0.d) {
            return new sqc0.c(((pqc0.d) pqc0Var2).b);
        }
        if (pqc0Var2 instanceof pqc0.a) {
            return new sqc0.a(((pqc0.a) pqc0Var2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final yqc0 d() {
        return new yqc0(e(new j0r(20)), e(new p7x(18)), e(new c3v(14)));
    }

    @Override // xsna.dm50
    public final void h(sqc0 sqc0Var, yqc0 yqc0Var) {
        sqc0 sqc0Var2 = sqc0Var;
        yqc0 yqc0Var2 = yqc0Var;
        if (sqc0Var2 instanceof sqc0.b) {
            f(yqc0Var2.a, sqc0Var2);
        } else if (sqc0Var2 instanceof sqc0.c) {
            f(yqc0Var2.b, sqc0Var2);
        } else {
            if (!(sqc0Var2 instanceof sqc0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(yqc0Var2.c, sqc0Var2);
        }
    }
}
