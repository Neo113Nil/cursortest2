package xsna;

/* compiled from: MarketPaginationDotsView.kt */
/* loaded from: classes18.dex */
public final class t910 {
    public static final t910 e;
    public static final t910 f;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        float f2 = 4;
        e = new t910(iah0.a(f2), iah0.a(f2), iah0.a(2), iah0.a(f2));
        float f3 = 6;
        f = new t910(iah0.a(7), iah0.a(f3), iah0.a(f2), iah0.a(f3));
    }

    public t910(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t910)) {
            return false;
        }
        t910 t910Var = (t910) obj;
        return this.a == t910Var.a && this.b == t910Var.b && this.c == t910Var.c && this.d == t910Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPaginationDotsSize(dotSizePx=");
        sb.append(this.a);
        sb.append(", gapPx=");
        sb.append(this.b);
        sb.append(", verticalPaddingPx=");
        sb.append(this.c);
        sb.append(", horizontalPaddingPx=");
        return vu5.b(sb, this.d, ')');
    }
}
