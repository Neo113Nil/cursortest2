package xsna;

/* compiled from: Spinner.kt */
/* loaded from: classes.dex */
public final class nkk0 {
    public final int a;
    public final int b;
    public final int c;

    public nkk0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkk0)) {
            return false;
        }
        nkk0 nkk0Var = (nkk0) obj;
        return this.a == nkk0Var.a && this.b == nkk0Var.b && this.c == nkk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinnerColor(cardColor=");
        sb.append(this.a);
        sb.append(", contentColor=");
        sb.append(this.b);
        sb.append(", subtitleColor=");
        return vu5.b(sb, this.c, ')');
    }
}
