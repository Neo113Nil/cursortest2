package xsna;

/* compiled from: NewsfeedListMviHost.kt */
/* loaded from: classes4.dex */
public final class cgh0 {
    public final int a;
    public final int b;

    public cgh0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgh0)) {
            return false;
        }
        cgh0 cgh0Var = (cgh0) obj;
        return this.a == cgh0Var.a && this.b == cgh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollPosition(index=");
        sb.append(this.a);
        sb.append(", offset=");
        return vu5.b(sb, this.b, ')');
    }
}
