package xsna;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class i0k0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public i0k0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0k0)) {
            return false;
        }
        i0k0 i0k0Var = (i0k0) obj;
        return l5g.d(this.a, i0k0Var.a) && l5g.d(this.b, i0k0Var.b) && l5g.d(this.c, i0k0Var.c) && l5g.d(this.d, i0k0Var.d) && l5g.d(this.e, i0k0Var.e) && l5g.d(this.f, i0k0Var.f) && l5g.d(this.g, i0k0Var.g) && l5g.d(this.h, i0k0Var.h) && l5g.d(this.i, i0k0Var.i) && l5g.d(this.j, i0k0Var.j);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.j) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
