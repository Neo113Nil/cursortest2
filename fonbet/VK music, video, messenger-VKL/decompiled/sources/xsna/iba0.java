package xsna;

/* compiled from: CropImageState.kt */
/* loaded from: classes18.dex */
public final class iba0 {
    public final int a;
    public final int b;

    public iba0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iba0)) {
            return false;
        }
        iba0 iba0Var = (iba0) obj;
        return this.a == iba0Var.a && this.b == iba0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
