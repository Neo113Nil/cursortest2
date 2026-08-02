package xsna;

import java.util.ArrayList;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public abstract class kf7 {
    public final int a;
    public final kf7 b;
    public final kf7 c;

    public kf7(kf7 kf7Var) {
        if (kf7Var != null) {
            kf7Var.c = this;
        }
        this.b = kf7Var;
        if (kf7Var == null) {
            this.a = 0;
            return;
        }
        this.a = kf7Var.e() + kf7Var.a;
        kf7Var.c = this;
    }

    public void a(int i, int i2) {
        kf7 kf7Var = this.c;
        if (kf7Var != null) {
            kf7Var.a(i, i2);
        }
    }

    public kf7 b(int i) {
        kf7 kf7Var;
        int i2 = this.a;
        if (i >= i2) {
            return (i < e() + i2 || (kf7Var = this.c) == null) ? this : kf7Var.b(i);
        }
        kf7 kf7Var2 = this.b;
        if (kf7Var2 != null) {
            return kf7Var2.b(i);
        }
        return null;
    }

    public abstract kf7 c();

    public abstract kf7 d();

    public abstract int e();

    public abstract CharSequence f();

    public final int g() {
        return f().length() + this.a;
    }

    public void h(ArrayList arrayList) {
        k9x k9xVar = (k9x) j5g.k0(arrayList);
        if (k9xVar != null && k9xVar.c == this.a - 1) {
            arrayList.set(arrayList.size() - 1, swe0.q(k9xVar.b, g()));
        }
        kf7 kf7Var = this.c;
        if (kf7Var != null) {
            kf7Var.h(arrayList);
        }
    }

    public final boolean i() {
        return f().length() == e();
    }

    public abstract zvb0 j();

    public abstract hke0 k(char c);

    public final String toString() {
        return getClass().getSimpleName() + "(position=" + this.a + ", size=" + e() + ", value=" + ((Object) f()) + ')';
    }
}
