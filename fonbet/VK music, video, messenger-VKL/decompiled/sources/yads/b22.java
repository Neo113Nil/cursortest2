package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class b22 {
    public final g9 a;
    public final w52 b;
    public final zp2 c;
    public final int d;

    public b22(g9 g9Var, w52 w52Var, c22 c22Var, int i) {
        this.a = g9Var;
        this.b = w52Var;
        this.c = c22Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b22)) {
            return false;
        }
        b22 b22Var = (b22) obj;
        return epx.f(this.a, b22Var.a) && this.b == b22Var.b && epx.f(this.c, b22Var.c) && this.d == b22Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.a + ", nativeResponseType=" + this.b + ", requestPolicy=" + this.c + ", adsCount=" + this.d + ")";
    }
}
