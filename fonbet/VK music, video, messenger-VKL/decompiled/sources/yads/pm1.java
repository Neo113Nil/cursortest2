package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class pm1 {
    public final lm1 a;
    public final lm1 b;

    public pm1(lm1 lm1Var, lm1 lm1Var2) {
        this.a = lm1Var;
        this.b = lm1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return epx.f(this.a, pm1Var.a) && epx.f(this.b, pm1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lm1 lm1Var = this.b;
        return hashCode + (lm1Var == null ? 0 : lm1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.a + ", fallback=" + this.b + ")";
    }
}
