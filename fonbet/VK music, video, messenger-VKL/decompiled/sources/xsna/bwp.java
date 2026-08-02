package xsna;

/* compiled from: ErrorInfo.kt */
/* loaded from: classes3.dex */
public final class bwp {
    public final int a;
    public final int b;

    public bwp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwp)) {
            return false;
        }
        bwp bwpVar = (bwp) obj;
        return this.a == bwpVar.a && this.b == bwpVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorInfo(errorResId=");
        sb.append(this.a);
        sb.append(", actionResId=");
        return vu5.b(sb, this.b, ')');
    }
}
