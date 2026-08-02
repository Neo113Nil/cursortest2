package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: FloorsClimbedRecord.kt */
/* loaded from: classes12.dex */
public final class jsr implements oox {
    public static final AggregateMetric<Double> g = new AggregateMetric<>(new q71(), "FloorsClimbed", AggregateMetric.AggregationType.TOTAL, "floors");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final double e;
    public final hi20 f;

    public jsr(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, double d, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = d;
        this.f = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            v3r0.d(d, "floors");
            v3r0.f(Double.valueOf(d), Double.valueOf(1000000.0d), "floors");
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
        if (!(obj instanceof jsr)) {
            return false;
        }
        jsr jsrVar = (jsr) obj;
        return this.e == jsrVar.e && epx.f(this.a, jsrVar.a) && epx.f(this.b, jsrVar.b) && epx.f(this.c, jsrVar.c) && epx.f(this.d, jsrVar.d) && epx.f(this.f, jsrVar.f);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.e) * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloorsClimbedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", floors=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
