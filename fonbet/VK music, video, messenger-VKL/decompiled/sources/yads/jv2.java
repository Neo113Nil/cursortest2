package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class jv2 implements lv2 {
    public final mn3 a;
    public final xy b;

    public jv2(mn3 mn3Var, xy xyVar) {
        this.a = mn3Var;
        this.b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv2)) {
            return false;
        }
        jv2 jv2Var = (jv2) obj;
        return epx.f(this.a, jv2Var.a) && this.b == jv2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", configurationSource=" + this.b + ")";
    }
}
