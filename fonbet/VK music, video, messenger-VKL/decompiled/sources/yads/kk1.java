package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class kk1 {
    public final lk1 a;
    public final lk1 b;

    public kk1(lk1 lk1Var, lk1 lk1Var2) {
        this.a = lk1Var;
        this.b = lk1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return epx.f(this.a, kk1Var.a) && epx.f(this.b, kk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
