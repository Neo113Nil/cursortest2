package xsna;

/* compiled from: OverflowFlowRow.kt */
/* loaded from: classes18.dex */
public final class khk0 {
    public final int a;
    public final int b;

    public khk0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khk0)) {
            return false;
        }
        khk0 khk0Var = (khk0) obj;
        return this.a == khk0Var.a && this.b == khk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Spacings(horizontal=");
        sb.append(this.a);
        sb.append(", vertical=");
        return vu5.b(sb, this.b, ')');
    }
}
