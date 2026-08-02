package xsna;

import org.webrtc.Size;

/* loaded from: classes8.dex */
public final class cjz0 {
    public final Size a;
    public final int b;
    public final double c;
    public final boolean d;
    public final boolean e;

    public cjz0(Size size, int i, double d, boolean z, boolean z2) {
        this.a = size;
        this.b = i;
        this.c = d;
        this.d = z;
        this.e = z2;
    }

    public static cjz0 a(cjz0 cjz0Var) {
        return new cjz0(cjz0Var.a, cjz0Var.b, cjz0Var.c, cjz0Var.d, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjz0)) {
            return false;
        }
        cjz0 cjz0Var = (cjz0) obj;
        return epx.f(this.a, cjz0Var.a) && this.b == cjz0Var.b && Double.compare(this.c, cjz0Var.c) == 0 && this.d == cjz0Var.d && this.e == cjz0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + wn4.b(this.d, be.b(this.c, de.v(this.b, this.a.hashCode() * 31)));
    }

    public final String toString() {
        return "InternalSimulcastLayer(size=" + this.a + ", bitrate=" + this.b + ", scale=" + this.c + ", isAligned=" + this.d + ", isEnabledAndReal=" + this.e + ")";
    }
}
