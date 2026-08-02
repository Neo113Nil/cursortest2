package xsna;

/* compiled from: SizeEntities.kt */
/* loaded from: classes4.dex */
public final class s0u0 {
    public int a;
    public int b;
    public int c;

    public s0u0() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0u0)) {
            return false;
        }
        s0u0 s0u0Var = (s0u0) obj;
        return this.a == s0u0Var.a && this.b == s0u0Var.b && this.c == s0u0Var.c;
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

    public s0u0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
