package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class jm3 {
    public final String a;
    public final int b;

    public jm3(int i, String str) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return epx.f(this.a, jm3Var.a) && this.b == jm3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xsna.iq.a(this.b, "ViewSizeKey(adUnitId=", this.a, ", screenOrientation=", ")");
    }
}
