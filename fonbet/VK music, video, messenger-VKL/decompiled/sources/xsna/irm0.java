package xsna;

/* compiled from: StrokeColorScheme.kt */
/* loaded from: classes17.dex */
public final class irm0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public irm0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irm0)) {
            return false;
        }
        irm0 irm0Var = (irm0) obj;
        return l5g.d(this.a, irm0Var.a) && l5g.d(this.b, irm0Var.b) && l5g.d(this.c, irm0Var.c) && l5g.d(this.d, irm0Var.d) && l5g.d(this.e, irm0Var.e) && l5g.d(this.f, irm0Var.f) && l5g.d(this.g, irm0Var.g);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.g) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColorScheme(strokeAccent=");
        dn.h(this.a, ", strokeAccentThemed=", sb);
        dn.h(this.b, ", strokeContrast=", sb);
        dn.h(this.c, ", strokeContrastSecondaryAlpha=", sb);
        dn.h(this.d, ", strokeNegative=", sb);
        dn.h(this.e, ", strokePositive=", sb);
        dn.h(this.f, ", strokePrimary=", sb);
        return pm0.d(')', this.g, sb);
    }
}
