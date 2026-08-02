package xsna;

/* compiled from: TrackProgress.kt */
/* loaded from: classes3.dex */
public final class ugp0 {
    public int a;
    public int b;
    public int c;

    public ugp0() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugp0)) {
            return false;
        }
        ugp0 ugp0Var = (ugp0) obj;
        return this.a == ugp0Var.a && this.b == ugp0Var.b && this.c == ugp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackProgress(duration=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", bufferingPercent=");
        return vu5.b(sb, this.c, ')');
    }

    public ugp0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
