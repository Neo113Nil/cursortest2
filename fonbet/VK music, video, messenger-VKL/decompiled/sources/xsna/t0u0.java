package xsna;

/* compiled from: SizeEntities.kt */
/* loaded from: classes18.dex */
public final class t0u0 {
    public int a;
    public int b;
    public int c;

    public t0u0() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0u0)) {
            return false;
        }
        t0u0 t0u0Var = (t0u0) obj;
        return this.a == t0u0Var.a && this.b == t0u0Var.b && this.c == t0u0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewSizeRequest(viewId=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }

    public t0u0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
