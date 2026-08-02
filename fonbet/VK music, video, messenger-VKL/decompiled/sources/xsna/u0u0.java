package xsna;

/* compiled from: SizeEntities.kt */
/* loaded from: classes4.dex */
public final class u0u0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public u0u0() {
        this(0, 0, 0, 0, 31, 0);
    }

    public static u0u0 a(u0u0 u0u0Var, int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = u0u0Var.a;
        if ((i5 & 2) != 0) {
            i6 = u0u0Var.b;
        }
        if ((i5 & 4) != 0) {
            i2 = u0u0Var.c;
        }
        if ((i5 & 8) != 0) {
            i3 = u0u0Var.d;
        }
        if ((i5 & 16) != 0) {
            i4 = u0u0Var.e;
        }
        int i8 = i4;
        u0u0Var.getClass();
        int i9 = i3;
        return new u0u0(i7, i6, i2, i9, i8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0u0)) {
            return false;
        }
        u0u0 u0u0Var = (u0u0) obj;
        return this.b == u0u0Var.b && this.c == u0u0Var.c && this.d == u0u0Var.d && this.e == u0u0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewSizeResult(viewId=");
        sb.append(this.a);
        sb.append(", left=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", bottom=");
        return vu5.b(sb, this.e, ')');
    }

    public u0u0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public /* synthetic */ u0u0(int i, int i2, int i3, int i4, int i5, int i6) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, 0, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
