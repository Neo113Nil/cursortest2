package defpackage;

/* loaded from: classes11.dex */
public final class ey00 extends gy00 {
    public final int a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final float e;

    public ey00(int i, float f, boolean z, boolean z2, float f2) {
        this.a = i;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = f2;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey00)) {
            return false;
        }
        ey00 ey00Var = (ey00) obj;
        return this.a == ey00Var.a && Float.compare(this.b, ey00Var.b) == 0 && this.c == ey00Var.c && this.d == ey00Var.d && Float.compare(this.e, ey00Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + unr0.e(unr0.e(g8e.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particles(color=");
        sb.append(this.a);
        sb.append(", density=");
        sb.append(this.b);
        sb.append(", isAnimated=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", particleSize=");
        return n.n(sb, this.e, ')');
    }
}
