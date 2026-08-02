package xsna;

/* compiled from: MapOptionsConfig.kt */
/* loaded from: classes3.dex */
public final class xl00 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public xl00() {
        this(2047, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl00)) {
            return false;
        }
        xl00 xl00Var = (xl00) obj;
        return this.a == xl00Var.a && this.b == xl00Var.b && this.c == xl00Var.c && this.d == xl00Var.d && this.e == xl00Var.e && this.f == xl00Var.f && this.g == xl00Var.g && this.h == xl00Var.h && this.i == xl00Var.i && this.j == xl00Var.j;
    }

    public final int hashCode() {
        return qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.e, qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapOptionsConfig(ambientEnabled=");
        sb.append(this.a);
        sb.append(", compassEnabled=");
        sb.append(this.b);
        sb.append(", liteMode=");
        sb.append(this.c);
        sb.append(", mapToolbarEnabled=");
        sb.append(this.d);
        sb.append(", mapType=");
        sb.append(this.e);
        sb.append(", rotateGesturesEnabled=");
        sb.append(this.f);
        sb.append(", scrollGesturesEnabled=");
        sb.append(this.g);
        sb.append(", tiltGesturesEnabled=");
        sb.append(this.h);
        sb.append(", useViewLifecycle=");
        sb.append(this.i);
        sb.append(", zoomControlsEnabled=");
        return n23.b(sb, this.j, ", camera=null)");
    }

    public xl00(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? false : z3;
        z4 = (i & 128) != 0 ? false : z4;
        boolean z5 = (i & 256) == 0;
        this.a = false;
        this.b = false;
        this.c = z;
        this.d = false;
        this.e = 1;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = false;
    }
}
