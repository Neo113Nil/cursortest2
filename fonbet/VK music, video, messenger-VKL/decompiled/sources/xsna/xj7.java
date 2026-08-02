package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import xsna.vi10;

/* compiled from: BoneMassRecord.kt */
/* loaded from: classes12.dex */
public final class xj7 implements w7x {
    public static final vi10 e;
    public final Instant a;
    public final ZoneOffset b;
    public final vi10 c;
    public final hi20 d;

    static {
        vi10.d.getClass();
        e = new vi10(1000, vi10.b.KILOGRAMS);
    }

    public xj7(Instant instant, ZoneOffset zoneOffset, vi10 vi10Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = vi10Var;
        this.d = hi20Var;
        v3r0.e(vi10Var, (vi10) pn00.h(vi10Var.c, vi10.e), "mass");
        v3r0.f(vi10Var, e, "mass");
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
        if (!(obj instanceof xj7)) {
            return false;
        }
        xj7 xj7Var = (xj7) obj;
        return epx.f(this.c, xj7Var.c) && epx.f(this.a, xj7Var.a) && epx.f(this.b, xj7Var.b) && epx.f(this.d, xj7Var.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, this.c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoneMassRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", mass=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
