package xsna;

/* compiled from: BiometricsLockPinRender.kt */
/* loaded from: classes15.dex */
public final class wla0 {
    public final int a;
    public final boolean b;
    public final long c;

    public wla0() {
        this(false, 0L, 7);
    }

    public static wla0 a(wla0 wla0Var, int i) {
        boolean z = wla0Var.b;
        long j = wla0Var.c;
        wla0Var.getClass();
        return new wla0(i, z, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wla0)) {
            return false;
        }
        wla0 wla0Var = (wla0) obj;
        return this.a == wla0Var.a && this.b == wla0Var.b && this.c == wla0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinDotBackoff(errorCounter=");
        sb.append(this.a);
        sb.append(", isAvailable=");
        sb.append(this.b);
        sb.append(", remainingTime=");
        return vu5.a(')', this.c, sb);
    }

    public wla0(int i, boolean z, long j) {
        this.a = i;
        this.b = z;
        this.c = j;
    }

    public /* synthetic */ wla0(boolean z, long j, int i) {
        this(0, (i & 2) != 0 ? false : z, (i & 4) != 0 ? -1L : j);
    }
}
