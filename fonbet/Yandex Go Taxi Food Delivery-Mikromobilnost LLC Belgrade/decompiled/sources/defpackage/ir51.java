package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ir51 {
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

    public ir51(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
        if (!(obj instanceof ir51)) {
            return false;
        }
        ir51 ir51Var = (ir51) obj;
        return ldc.c(this.a, ir51Var.a) && ldc.c(this.b, ir51Var.b) && ldc.c(this.c, ir51Var.c) && ldc.c(this.d, ir51Var.d) && ldc.c(this.e, ir51Var.e) && ldc.c(this.f, ir51Var.f) && ldc.c(this.g, ir51Var.g) && ldc.c(this.h, ir51Var.h) && ldc.c(this.i, ir51Var.i) && ldc.c(this.j, ir51Var.j);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.j) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        String i3 = ldc.i(this.c);
        String i4 = ldc.i(this.d);
        String i5 = ldc.i(this.e);
        String i6 = ldc.i(this.f);
        String i7 = ldc.i(this.g);
        String i8 = ldc.i(this.h);
        String i9 = ldc.i(this.i);
        String i10 = ldc.i(this.j);
        StringBuilder v = b64.v("YbControlColors(activeDark=", i, ", activeDarkDisabled=", i2, ", activeDarkHovered=");
        g8e.D(v, i3, ", activeDarkPressed=", i4, ", default=");
        g8e.D(v, i5, ", defaultDisabled=", i6, ", defaultHovered=");
        g8e.D(v, i7, ", defaultPressed=", i8, ", handleDefault=");
        return g8e.r(v, i9, ", handleDisabled=", i10, Extension.C_BRAKE);
    }
}
