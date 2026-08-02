package defpackage;

/* loaded from: classes2.dex */
public final class n690 {
    public final int a;
    public final int b;

    public n690(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n690)) {
            return false;
        }
        n690 n690Var = (n690) obj;
        return this.a == n690Var.a && this.b == n690Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + oyr.b(0, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Paddings(left=", ", right=", ", top=0, bottom=0)");
    }

    public n690() {
        this(0, 0, 15);
    }
}
