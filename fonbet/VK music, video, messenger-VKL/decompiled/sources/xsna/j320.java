package xsna;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: MenstruationPeriodRecord.kt */
/* loaded from: classes12.dex */
public final class j320 implements oox {
    public static final Duration f = Duration.ofDays(31);
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;

    public j320(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Duration.between(instant, instant2).compareTo(f) > 0) {
            throw new IllegalArgumentException("Period must not exceed 31 days");
        }
    }

    @Override // xsna.oox
    public final Instant a() {
        return this.a;
    }

    @Override // xsna.oox
    public final Instant b() {
        return this.c;
    }

    @Override // xsna.oox
    public final ZoneOffset c() {
        return this.d;
    }

    @Override // xsna.oox
    public final ZoneOffset d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j320)) {
            return false;
        }
        j320 j320Var = (j320) obj;
        return epx.f(this.a, j320Var.a) && epx.f(this.b, j320Var.b) && epx.f(this.c, j320Var.c) && epx.f(this.d, j320Var.d) && epx.f(this.e, j320Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenstruationPeriodRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.e, ')');
    }
}
