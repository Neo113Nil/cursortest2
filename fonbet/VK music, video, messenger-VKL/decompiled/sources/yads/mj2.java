package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class mj2 {
    public final String a;
    public final c13 b;

    public mj2(String str, c13 c13Var) {
        this.a = str;
        this.b = c13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj2)) {
            return false;
        }
        mj2 mj2Var = (mj2) obj;
        return epx.f(this.a, mj2Var.a) && epx.f(this.b, mj2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.a + ", size=" + this.b + ")";
    }
}
