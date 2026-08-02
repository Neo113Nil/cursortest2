package defpackage;

import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class inr0 implements m1k {
    public final n0 a;
    public final long b;
    public final Object c;
    public final j18 w;

    public inr0(n0 n0Var, long j, Object obj, j18 j18Var) {
        this.a = n0Var;
        this.b = j;
        this.c = obj;
        this.w = j18Var;
    }

    @Override // defpackage.m1k
    public final void dispose() {
        n0 n0Var = this.a;
        synchronized (n0Var) {
            if (this.b >= n0Var.q()) {
                Object[] objArr = n0Var.A;
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    ffx.e(objArr, j, ffx.i);
                    n0Var.l();
                }
            }
        }
    }
}
