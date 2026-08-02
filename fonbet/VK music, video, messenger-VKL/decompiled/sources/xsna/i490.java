package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;

/* compiled from: OvulationTestRecord.kt */
/* loaded from: classes12.dex */
public final class i490 implements w7x {
    public static final Object e;
    public final Instant a;
    public final ZoneOffset b;
    public final int c;
    public final hi20 d;

    static {
        Map k = pn00.k(new Pair("inconclusive", 0), new Pair("positive", 1), new Pair("high", 2), new Pair("negative", 3));
        e = k;
        v3r0.g(k);
    }

    public i490(int i, Instant instant, ZoneOffset zoneOffset, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = i;
        this.d = hi20Var;
    }

    @Override // xsna.w7x
    public final Instant C() {
        return this.a;
    }

    @Override // xsna.w7x
    public final ZoneOffset e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i490)) {
            return false;
        }
        i490 i490Var = (i490) obj;
        return this.c == i490Var.c && epx.f(this.a, i490Var.a) && epx.f(this.b, i490Var.b) && epx.f(this.d, i490Var.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, Integer.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OvulationTestRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
