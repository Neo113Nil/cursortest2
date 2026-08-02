package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class hp3 implements jp3 {
    public final hx1 a;

    public hp3(hx1 hx1Var) {
        this.a = hx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp3) && epx.f(this.a, ((hp3) obj).a);
    }

    public final int hashCode() {
        hx1 hx1Var = this.a;
        if (hx1Var == null) {
            return 0;
        }
        return hx1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.a + ")";
    }
}
