package xsna;

/* compiled from: VideoFragmentFormat.kt */
/* loaded from: classes3.dex */
public final class ems0 {
    public final int a;
    public final int b;
    public final int c;
    public final gye0 d;

    public ems0(int i, int i2, int i3, gye0 gye0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = gye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ems0)) {
            return false;
        }
        ems0 ems0Var = (ems0) obj;
        return this.a == ems0Var.a && this.b == ems0Var.b && this.c == ems0Var.c && epx.f(this.d, ems0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "VideoFragmentFormat(width=" + this.a + ", height=" + this.b + ", frameRate=" + this.c + ", rawColorInfo=" + this.d + ')';
    }
}
