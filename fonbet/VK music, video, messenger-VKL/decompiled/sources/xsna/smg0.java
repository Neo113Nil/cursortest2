package xsna;

/* compiled from: RotaryScrollEvent.android.kt */
/* loaded from: classes11.dex */
public final class smg0 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public smg0(long j, float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof smg0)) {
            return false;
        }
        smg0 smg0Var = (smg0) obj;
        return smg0Var.a == this.a && smg0Var.b == this.b && smg0Var.c == this.c && smg0Var.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return vu5.b(sb, this.d, ')');
    }
}
