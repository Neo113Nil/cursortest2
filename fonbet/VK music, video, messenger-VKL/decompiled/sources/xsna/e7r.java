package xsna;

/* compiled from: FieldColorScheme.kt */
/* loaded from: classes17.dex */
public final class e7r {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public e7r(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7r)) {
            return false;
        }
        e7r e7rVar = (e7r) obj;
        return l5g.d(this.a, e7rVar.a) && l5g.d(this.b, e7rVar.b) && l5g.d(this.c, e7rVar.c) && l5g.d(this.d, e7rVar.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldColorScheme(fieldBackground=");
        dn.h(this.a, ", fieldBorderAlpha=", sb);
        dn.h(this.b, ", fieldBorderAlphaActive=", sb);
        dn.h(this.c, ", fieldBorderAlphaHover=", sb);
        return pm0.d(')', this.d, sb);
    }
}
