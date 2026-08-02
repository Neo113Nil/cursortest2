package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;

/* compiled from: SexualActivityRecord.kt */
/* loaded from: classes12.dex */
public final class e4j0 implements w7x {
    public static final Object e;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final int d;

    static {
        Map k = pn00.k(new Pair("protected", 1), new Pair("unprotected", 2));
        e = k;
        v3r0.g(k);
    }

    public e4j0(int i, Instant instant, ZoneOffset zoneOffset, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = i;
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
        if (!(obj instanceof e4j0)) {
            return false;
        }
        e4j0 e4j0Var = (e4j0) obj;
        return this.d == e4j0Var.d && epx.f(this.a, e4j0Var.a) && epx.f(this.b, e4j0Var.b) && epx.f(this.c, e4j0Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, this.d * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SexualActivityRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", protectionUsed=");
        sb.append(this.d);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
