package xsna;

/* compiled from: PaddingValues.kt */
/* loaded from: classes.dex */
public final class r890 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r890() {
        this(r0, r0, 15);
        int i = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r890)) {
            return false;
        }
        r890 r890Var = (r890) obj;
        return this.a == r890Var.a && this.b == r890Var.b && this.c == r890Var.c && this.d == r890Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vu5.b(sb, this.d, ')');
    }

    public /* synthetic */ r890(int i, int i2, int i3) {
        this(0, (i3 & 2) != 0 ? 0 : i, 0, (i3 & 8) != 0 ? 0 : i2);
    }

    public r890(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r890(int i, int i2, Object obj) {
        this(i, 0, i, 0);
        i = (i2 & 1) != 0 ? 0 : i;
    }
}
