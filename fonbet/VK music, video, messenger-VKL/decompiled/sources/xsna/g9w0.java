package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.f9w0;
import xsna.h9w0;

/* compiled from: VmojiPhotoUploadReducer.kt */
/* loaded from: classes7.dex */
public final class g9w0 extends dm50<j9w0, f9w0, h9w0> {
    @Override // xsna.dm50
    public final h9w0 c(h9w0 h9w0Var, f9w0 f9w0Var) {
        f9w0 f9w0Var2 = f9w0Var;
        if (f9w0Var2.equals(f9w0.a.b)) {
            return h9w0.a.b;
        }
        if (f9w0Var2.equals(f9w0.b.b)) {
            return h9w0.b.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final j9w0 d() {
        return new j9w0(e(new g1s0(4)), e(new u5u0(1)));
    }

    @Override // xsna.dm50
    public final void h(h9w0 h9w0Var, j9w0 j9w0Var) {
        h9w0 h9w0Var2 = h9w0Var;
        j9w0 j9w0Var2 = j9w0Var;
        if (h9w0Var2 instanceof h9w0.b) {
            f(j9w0Var2.a, h9w0Var2);
        } else {
            if (!(h9w0Var2 instanceof h9w0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(j9w0Var2.b, h9w0Var2);
        }
    }
}
