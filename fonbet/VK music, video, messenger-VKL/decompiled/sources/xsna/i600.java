package xsna;

/* compiled from: LongtapSnippetEntity.kt */
/* loaded from: classes3.dex */
public final class i600 implements jx4 {
    public static final i600 f = new i600(0, 0, "", false);
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public i600(long j, long j2, String str, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    @Override // xsna.jx4
    public final long a() {
        return this.c;
    }

    @Override // xsna.jx4
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i600)) {
            return false;
        }
        i600 i600Var = (i600) obj;
        return this.b == i600Var.b && this.c == i600Var.c && epx.f(this.d, i600Var.d) && this.e == i600Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongtapSnippetEntity(startFromMs=");
        sb.append(this.b);
        sb.append(", stopAtMs=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isFallback=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
