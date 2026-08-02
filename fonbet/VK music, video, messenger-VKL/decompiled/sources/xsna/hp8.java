package xsna;

/* compiled from: ButtonDefaults.kt */
/* loaded from: classes.dex */
public final class hp8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public hp8(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp8)) {
            return false;
        }
        hp8 hp8Var = (hp8) obj;
        return this.a == hp8Var.a && this.b == hp8Var.b && this.c == hp8Var.c && this.d == hp8Var.d && this.e == hp8Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonColors(backgroundColor=");
        sb.append(this.a);
        sb.append(", contentColor=");
        sb.append(this.b);
        sb.append(", iconColor=");
        sb.append(this.c);
        sb.append(", counterColor=");
        sb.append(this.d);
        sb.append(", counterBackgroundColor=");
        return vu5.b(sb, this.e, ')');
    }
}
