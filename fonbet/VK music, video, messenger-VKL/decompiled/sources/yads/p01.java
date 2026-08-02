package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class p01 {
    public final boolean a;
    public final th2 b;

    public p01(boolean z, th2 th2Var) {
        this.a = z;
        this.b = th2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p01)) {
            return false;
        }
        p01 p01Var = (p01) obj;
        return this.a == p01Var.a && epx.f(this.b, p01Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        th2 th2Var = this.b;
        return hashCode + (th2Var == null ? 0 : th2Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.a + ", handledPackage=" + this.b + ")";
    }
}
