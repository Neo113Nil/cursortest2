package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.wca0;

/* compiled from: PhotoTagsReducer.kt */
/* loaded from: classes4.dex */
public final class ada0 extends dm50<jda0, wca0, eda0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ada0() {
        super(eda0.e);
        eda0 eda0Var = eda0.e;
    }

    @Override // xsna.dm50
    public final eda0 c(eda0 eda0Var, wca0 wca0Var) {
        eda0 eda0Var2 = eda0Var;
        wca0 wca0Var2 = wca0Var;
        if (wca0Var2 instanceof wca0.c) {
            return eda0.a(eda0Var2, ((wca0.c) wca0Var2).b, null, null, 4);
        }
        if (wca0Var2 instanceof wca0.a) {
            return eda0.a(eda0Var2, null, null, izi0.k(eda0Var2.d, Integer.valueOf(((wca0.a) wca0Var2).b.j)), 3);
        }
        if (wca0Var2 instanceof wca0.b) {
            return eda0.a(eda0Var2, null, ((wca0.b) wca0Var2).b, null, 5);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final jda0 d() {
        return new jda0(e(new qw30(this, 13)));
    }

    @Override // xsna.dm50
    public final void h(eda0 eda0Var, jda0 jda0Var) {
        f(jda0Var.a, eda0Var);
    }
}
