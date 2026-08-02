package xsna;

/* compiled from: Size.kt */
/* loaded from: classes7.dex */
public final class kxj0 {
    public static final kxj0 c = new kxj0(0, 0);
    public final int a;
    public final int b;

    public kxj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxj0)) {
            return false;
        }
        kxj0 kxj0Var = (kxj0) obj;
        return this.a == kxj0Var.a && this.b == kxj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
