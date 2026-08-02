package xsna;

/* compiled from: OneVideoLoadControlParams.kt */
/* loaded from: classes8.dex */
public final class zl80 {
    public static final zl80 g = new zl80(50000, 50000, 1000, 2000, 0, false);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public zl80(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = i5;
    }

    public static zl80 a(zl80 zl80Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = zl80Var.a;
        }
        int i4 = i;
        int i5 = (i3 & 4) != 0 ? zl80Var.c : 2500;
        int i6 = (i3 & 8) != 0 ? zl80Var.d : 5000;
        boolean z = zl80Var.e;
        int i7 = zl80Var.f;
        zl80Var.getClass();
        return new zl80(i4, i2, i5, i6, i7, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl80)) {
            return false;
        }
        zl80 zl80Var = (zl80) obj;
        return this.a == zl80Var.a && this.b == zl80Var.b && this.c == zl80Var.c && this.d == zl80Var.d && this.e == zl80Var.e && this.f == zl80Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b(shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder a = odj.a(this.a, this.b, "OneVideoLoadControlParams(minBufferMs=", ", maxBufferMs=", ", bufferForPlaybackMs=");
        cgn.a(this.c, this.d, ", bufferForPlaybackAfterRebufferMs=", ", prioritizeTimeOverSizeThresholds=", a);
        a.append(this.e);
        a.append(", backBufferDurationMs=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
