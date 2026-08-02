package xsna;

/* compiled from: PagerSettings.kt */
/* loaded from: classes5.dex */
public final class bc90 {
    public final boolean a;
    public final int b;

    public bc90(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final int a(int i) {
        int i2 = this.b;
        if (i2 <= 1) {
            return 0;
        }
        return this.a ? i % i2 : swe0.g(i, 0, i2 - 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc90)) {
            return false;
        }
        bc90 bc90Var = (bc90) obj;
        return this.a == bc90Var.a && this.b == bc90Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagerSettings(isInfinite=");
        sb.append(this.a);
        sb.append(", itemsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
