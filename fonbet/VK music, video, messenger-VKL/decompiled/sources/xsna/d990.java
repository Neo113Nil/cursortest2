package xsna;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class d990 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public d990() {
        this(false, 0 == true ? 1 : 0, 15);
    }

    public static d990 a(d990 d990Var, boolean z, boolean z2) {
        boolean z3 = d990Var.c;
        int i = d990Var.d;
        d990Var.getClass();
        return new d990(z, i, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d990)) {
            return false;
        }
        d990 d990Var = (d990) obj;
        return this.a == d990Var.a && this.b == d990Var.b && this.c == d990Var.c && this.d == d990Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageInfo(isNextLoading=");
        sb.append(this.a);
        sb.append(", isNextError=");
        sb.append(this.b);
        sb.append(", hasNextPage=");
        sb.append(this.c);
        sb.append(", nextAmount=");
        return vu5.b(sb, this.d, ')');
    }

    public /* synthetic */ d990(boolean z, int i, int i2) {
        this(false, (i2 & 8) != 0 ? 0 : i, false, (i2 & 4) != 0 ? false : z);
    }

    public d990(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }
}
