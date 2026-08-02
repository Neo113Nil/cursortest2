package xsna;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final class yf00 {
    public final int a;
    public final int b;
    public final int c;

    public yf00(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf00)) {
            return false;
        }
        yf00 yf00Var = (yf00) obj;
        return this.a == yf00Var.a && this.b == yf00Var.b && this.c == yf00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSlotInsets(bottomInsetPx=");
        sb.append(this.a);
        sb.append(", startInsetPx=");
        sb.append(this.b);
        sb.append(", endInsetPx=");
        return vu5.b(sb, this.c, ')');
    }
}
