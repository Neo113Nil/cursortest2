package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class bn3 {
    public final int a;
    public final String b;

    public bn3(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn3)) {
            return false;
        }
        bn3 bn3Var = (bn3) obj;
        return this.a == bn3Var.a && epx.f(this.b, bn3Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xsna.gq.b(this.a, "VisibleAreaResult(area=", ", description=", this.b, ")");
    }
}
