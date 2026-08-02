package xsna;

/* compiled from: BackgroundData.kt */
/* loaded from: classes4.dex */
public final class ew5 {
    public final lw5 a;
    public final int b;
    public final int c;

    public ew5(lw5 lw5Var, int i, int i2) {
        this.a = lw5Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew5)) {
            return false;
        }
        ew5 ew5Var = (ew5) obj;
        return epx.f(this.a, ew5Var.a) && this.b == ew5Var.b && this.c == ew5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundData(model=");
        sb.append(this.a);
        sb.append(", drawableRes=");
        sb.append(this.b);
        sb.append(", accessibilityDescription=");
        return h5s.c(this.c, ")", sb);
    }
}
