package xsna;

import xsna.cz40;

/* compiled from: MusicPlayerPreparedMeta.kt */
/* loaded from: classes3.dex */
public final class ky40 {
    public static final ky40 f = new ky40(cz40.b.a.a, 0, 0, 0);
    public final cz40 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ky40(cz40 cz40Var, long j, long j2, long j3) {
        this.a = cz40Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j3 - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky40)) {
            return false;
        }
        ky40 ky40Var = (ky40) obj;
        return epx.f(this.a, ky40Var.a) && this.b == ky40Var.b && this.c == ky40Var.c && this.d == ky40Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerPreparedMeta(playerType=");
        sb.append(this.a);
        sb.append(", streamDurationMs=");
        sb.append(this.b);
        sb.append(", startFromMs=");
        sb.append(this.c);
        sb.append(", stopAtMs=");
        return vu5.a(')', this.d, sb);
    }
}
