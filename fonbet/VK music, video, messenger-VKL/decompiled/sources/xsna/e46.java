package xsna;

import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: BasalBodyTemperatureRecord.kt */
/* loaded from: classes12.dex */
public final class e46 implements w7x {
    public static final c8o0 f = atv0.l(0);
    public static final c8o0 g = atv0.l(100);
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final c8o0 d;
    public final int e;

    public e46(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, c8o0 c8o0Var, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = c8o0Var;
        this.e = i;
        v3r0.e(c8o0Var, f, "temperature");
        v3r0.f(c8o0Var, g, "temperature");
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
        if (!(obj instanceof e46)) {
            return false;
        }
        e46 e46Var = (e46) obj;
        return epx.f(this.d, e46Var.d) && this.e == e46Var.e && epx.f(this.a, e46Var.a) && epx.f(this.b, e46Var.b) && epx.f(this.c, e46Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, ((this.d.hashCode() * 31) + this.e) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasalBodyTemperatureRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", temperature=");
        sb.append(this.d);
        sb.append(", measurementLocation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
