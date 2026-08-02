package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class tv2 implements uv2 {
    public final rd a;
    public final km0 b;

    public tv2(rd rdVar, km0 km0Var) {
        this.a = rdVar;
        this.b = km0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv2)) {
            return false;
        }
        tv2 tv2Var = (tv2) obj;
        return epx.f(this.a, tv2Var.a) && epx.f(this.b, tv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.a + ", environmentConfiguration=" + this.b + ")";
    }
}
