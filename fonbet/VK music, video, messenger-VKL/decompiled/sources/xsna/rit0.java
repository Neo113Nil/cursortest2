package xsna;

/* compiled from: VideoStreamOptions.kt */
/* loaded from: classes18.dex */
public final class rit0 {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rit0)) {
            return false;
        }
        rit0 rit0Var = (rit0) obj;
        return this.a == rit0Var.a && this.b == rit0Var.b && this.c == rit0Var.c && this.d == rit0Var.d && this.e == rit0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStreamOptions(bitrate=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", rotation=");
        sb.append(this.d);
        sb.append(", disabled=");
        return vu5.b(sb, this.e, ')');
    }
}
