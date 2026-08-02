package xsna;

/* compiled from: VideoImageScaleConfig.kt */
/* loaded from: classes2.dex */
public final class xps0 {
    public final float a;
    public final int b;
    public final int c;

    public xps0(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xps0)) {
            return false;
        }
        xps0 xps0Var = (xps0) obj;
        return Float.compare(this.a, xps0Var.a) == 0 && this.b == xps0Var.b && this.c == xps0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoImageScaleConfig(scale=");
        sb.append(this.a);
        sb.append(", minWidth=");
        sb.append(this.b);
        sb.append(", maxWidth=");
        return vu5.b(sb, this.c, ')');
    }
}
