package defpackage;

/* loaded from: classes11.dex */
public final class fy00 extends gy00 {
    public final int a;
    public final boolean b;

    public fy00(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy00)) {
            return false;
        }
        fy00 fy00Var = (fy00) obj;
        return this.a == fy00Var.a && this.b == fy00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Solid(color=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return unr0.u(sb, this.b, ')');
    }
}
