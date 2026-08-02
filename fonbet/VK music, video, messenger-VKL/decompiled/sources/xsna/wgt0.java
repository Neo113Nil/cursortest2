package xsna;

/* compiled from: VideoSize.kt */
/* loaded from: classes3.dex */
public final class wgt0 {
    public final int a;
    public final int b;

    public wgt0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgt0)) {
            return false;
        }
        wgt0 wgt0Var = (wgt0) obj;
        return this.a == wgt0Var.a && this.b == wgt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
