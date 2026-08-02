package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class kv2 implements lv2 {
    public final qu2 a;
    public final xy b;

    public kv2(qu2 qu2Var, xy xyVar) {
        this.a = qu2Var;
        this.b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv2)) {
            return false;
        }
        kv2 kv2Var = (kv2) obj;
        return epx.f(this.a, kv2Var.a) && this.b == kv2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.a + ", configurationSource=" + this.b + ")";
    }
}
