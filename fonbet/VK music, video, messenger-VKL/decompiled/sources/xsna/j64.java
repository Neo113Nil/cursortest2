package xsna;

/* compiled from: AttachesContentPadding.kt */
/* loaded from: classes18.dex */
public final class j64 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j64(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j64)) {
            return false;
        }
        j64 j64Var = (j64) obj;
        return this.a == j64Var.a && this.b == j64Var.b && this.c == j64Var.c && this.d == j64Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesContentPadding(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vu5.b(sb, this.d, ')');
    }
}
