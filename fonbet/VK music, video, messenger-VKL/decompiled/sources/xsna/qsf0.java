package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.psf0;
import xsna.tsf0;

/* compiled from: RelatedUserPinInputReducer.kt */
/* loaded from: classes6.dex */
public final class qsf0 extends dm50<usf0, psf0, tsf0> {
    @Override // xsna.dm50
    public final tsf0 c(tsf0 tsf0Var, psf0 psf0Var) {
        tsf0 tsf0Var2 = tsf0Var;
        psf0 psf0Var2 = psf0Var;
        if (psf0Var2 instanceof psf0.a.C3528a) {
            return tsf0.a(tsf0Var2, tsf0.a.b.C3766a.a, 2);
        }
        if (psf0Var2 instanceof psf0.a.c) {
            return tsf0.a(tsf0Var2, tsf0.a.b.c.a, 2);
        }
        if (psf0Var2 instanceof psf0.a.b) {
            return tsf0.a(tsf0Var2, new tsf0.a.b.C3767b(((psf0.a.b) psf0Var2).b), 2);
        }
        if (psf0Var2 instanceof psf0.d) {
            return tsf0.a(tsf0Var2, tsf0.a.c.a, 2);
        }
        if (psf0Var2 instanceof psf0.c) {
            return tsf0.a(tsf0Var2, tsf0.a.C3765a.a, 2);
        }
        if (psf0Var2 instanceof psf0.b) {
            return tsf0.a(tsf0Var2, null, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final usf0 d() {
        return new usf0(e(new d0w(this, 22)));
    }

    @Override // xsna.dm50
    public final void h(tsf0 tsf0Var, usf0 usf0Var) {
        f(usf0Var.a, tsf0Var);
    }
}
