package defpackage;

/* loaded from: classes10.dex */
public final class mgv {
    public static int k;
    public static final zoy0 l = new zoy0();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final b531 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public mgv(String str, float f, float f2, float f3, float f4, b531 b531Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = b531Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgv)) {
            return false;
        }
        mgv mgvVar = (mgv) obj;
        return jl40.l(this.a, mgvVar.a) && y7m.b(this.b, mgvVar.b) && y7m.b(this.c, mgvVar.c) && this.d == mgvVar.d && this.e == mgvVar.e && this.f.equals(mgvVar.f) && ldc.c(this.g, mgvVar.g) && this.h == mgvVar.h && this.i == mgvVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = ldc.n;
        return Boolean.hashCode(this.i) + oyr.b(this.h, qv10.c(hashCode, 31, this.g), 31);
    }
}
