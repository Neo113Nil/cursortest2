package xsna;

import java.util.Set;

/* compiled from: RememberEventDispatcher.kt */
/* loaded from: classes11.dex */
public final class lr90 implements huf0 {
    public final Set<huf0> b;
    public final ci50<iuf0> c = new ci50<>(new iuf0[16]);

    public lr90(Set<huf0> set) {
        this.b = set;
    }

    @Override // xsna.huf0
    public final void e() {
        ci50<iuf0> ci50Var = this.c;
        iuf0[] iuf0VarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            huf0 b = iuf0VarArr[i2].b();
            this.b.remove(b);
            b.e();
        }
    }

    @Override // xsna.huf0
    public final void d() {
    }

    @Override // xsna.huf0
    public final void f() {
    }
}
