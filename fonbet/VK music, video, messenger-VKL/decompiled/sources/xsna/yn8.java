package xsna;

import xsna.us2;

/* compiled from: Bullet.kt */
/* loaded from: classes11.dex */
public final class yn8 implements us2.a {
    public final bdc a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final qio f;

    static {
        l2l0.n(1, 8589934592L);
        long i = l2l0.i(0.25d);
        new yn8(i, i, l2l0.i(0.25d));
    }

    public yn8(long j, long j2, long j3) {
        qbr qbrVar = qbr.a;
        this.a = bdc.a;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = Float.NaN;
        this.f = qbrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yn8)) {
            return false;
        }
        yn8 yn8Var = (yn8) obj;
        return epx.f(this.a, yn8Var.a) && fno0.b(this.b, yn8Var.b) && fno0.b(this.c, yn8Var.c) && fno0.b(this.d, yn8Var.d) && this.e == yn8Var.e && epx.f(this.f, yn8Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gno0[] gno0VarArr = fno0.b;
        return this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, bh10.a(bh10.a(bh10.a(hashCode, 31, this.b), 31, this.c), 961, this.d), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + this.a + ", size=(" + ((Object) fno0.f(this.b)) + ", " + ((Object) fno0.f(this.c)) + "), padding=" + ((Object) fno0.f(this.d)) + ", brush=null, alpha=" + this.e + ", drawStyle=" + this.f + ')';
    }
}
