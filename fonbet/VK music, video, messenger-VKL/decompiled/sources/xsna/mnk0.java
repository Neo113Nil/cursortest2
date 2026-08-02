package xsna;

/* compiled from: SseConfig.kt */
/* loaded from: classes11.dex */
public final class mnk0 {
    public static final a i = new a();
    public static final mnk0 j = new mnk0(25000, false, false, false, 15000, 10000, 5000, false);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    /* compiled from: SseConfig.kt */
    public static final class a {
    }

    public mnk0(int i2, boolean z, boolean z2, boolean z3, int i3, int i4, int i5, boolean z4) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnk0)) {
            return false;
        }
        mnk0 mnk0Var = (mnk0) obj;
        return this.a == mnk0Var.a && this.b == mnk0Var.b && this.c == mnk0Var.c && this.d == mnk0Var.d && this.e == mnk0Var.e && this.f == mnk0Var.f && this.g == mnk0Var.g && this.h == mnk0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, qoy.b(qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SseConfig(readTimeout=");
        sb.append(this.a);
        sb.append(", sseEnabled=");
        sb.append(this.b);
        sb.append(", sseOverQuicEnabled=");
        sb.append(this.c);
        sb.append(", statEnabled=");
        sb.append(this.d);
        sb.append(", sseTwoGReadThresholdMs=");
        sb.append(this.e);
        sb.append(", sseThreeGReadThresholdMs=");
        sb.append(this.f);
        sb.append(", sseWifiReadThresholdMs=");
        sb.append(this.g);
        sb.append(", gzipEnabled=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
