package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class cn0 {
    public final dn0 a;
    public final String b;

    public cn0(dn0 dn0Var, String str) {
        this.a = dn0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj;
        return this.a == cn0Var.a && epx.f(this.b, cn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.a + ", value=" + this.b + ")";
    }
}
