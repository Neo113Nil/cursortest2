package xsna;

/* compiled from: ScreenConfiguration.kt */
/* loaded from: classes3.dex */
public final class xah0 {
    public final float a;
    public final int b;
    public final boolean c;

    public xah0(float f, int i, boolean z) {
        this.a = f;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xah0)) {
            return false;
        }
        xah0 xah0Var = (xah0) obj;
        return Float.compare(this.a, xah0Var.a) == 0 && this.b == xah0Var.b && this.c == xah0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenConfiguration(density=");
        sb.append(this.a);
        sb.append(", screenWidthDp=");
        sb.append(this.b);
        sb.append(", isTablet=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
