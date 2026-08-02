package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class ia2 {
    public final g93 a;
    public final uc3 b;

    public ia2(g93 g93Var, uc3 uc3Var) {
        this.a = g93Var;
        this.b = uc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        return epx.f(this.a, ia2Var.a) && epx.f(this.b, ia2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.a + ", validationResult=" + this.b + ")";
    }
}
