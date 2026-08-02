package xsna;

/* compiled from: AboutScreenScreenshotData.kt */
/* loaded from: classes6.dex */
public final class z3 {
    public final String a;
    public final int b;
    public final int c;

    public z3(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return epx.f(this.a, z3Var.a) && this.b == z3Var.b && this.c == z3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AboutScreenScreenshotData(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }
}
