package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: WheelchairPushesRecord.kt */
/* loaded from: classes12.dex */
public final class qkx0 implements oox {
    public static final AggregateMetric<Long> g = new AggregateMetric<>(new p71(), "WheelchairPushes", AggregateMetric.AggregationType.TOTAL, "count");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final long e;
    public final hi20 f;

    public qkx0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = j;
        this.f = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            if (j < 0) {
                throw new IllegalArgumentException("count".concat(" must not be negative").toString());
            }
            v3r0.f(Long.valueOf(j), 1000000L, "count");
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
        if (!(obj instanceof qkx0)) {
            return false;
        }
        qkx0 qkx0Var = (qkx0) obj;
        return this.e == qkx0Var.e && epx.f(this.a, qkx0Var.a) && epx.f(this.b, qkx0Var.b) && epx.f(this.c, qkx0Var.c) && epx.f(this.d, qkx0Var.d) && epx.f(this.f, qkx0Var.f);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.e) * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelchairPushesRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
