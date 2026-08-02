package xsna;

import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: BodyTemperatureRecord.kt */
/* loaded from: classes12.dex */
public final class uj7 implements w7x {
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final c8o0 d;
    public final int e;

    public uj7(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, c8o0 c8o0Var, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = c8o0Var;
        this.e = i;
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
        if (!(obj instanceof uj7)) {
            return false;
        }
        uj7 uj7Var = (uj7) obj;
        return epx.f(this.d, uj7Var.d) && this.e == uj7Var.e && epx.f(this.a, uj7Var.a) && epx.f(this.b, uj7Var.b) && epx.f(this.c, uj7Var.c);
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
        StringBuilder sb = new StringBuilder("BodyTemperatureRecord(time=");
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
