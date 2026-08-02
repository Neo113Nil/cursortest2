package xsna;

/* compiled from: SdkVideoSize.kt */
/* loaded from: classes17.dex */
public final class rlh0 {
    public final int a;
    public final int b;

    public rlh0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlh0)) {
            return false;
        }
        rlh0 rlh0Var = (rlh0) obj;
        return this.a == rlh0Var.a && this.b == rlh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkVideoSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
