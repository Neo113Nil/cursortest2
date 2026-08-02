package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: RestingHeartRateRecord.kt */
/* loaded from: classes12.dex */
public final class vbg0 implements w7x {
    public static final AggregateMetric<Long> e = new AggregateMetric<>(new p71(), "RestingHeartRate", AggregateMetric.AggregationType.AVERAGE, "bpm");
    public static final AggregateMetric<Long> f = new AggregateMetric<>(new p71(), "RestingHeartRate", AggregateMetric.AggregationType.MINIMUM, "bpm");
    public static final AggregateMetric<Long> g = new AggregateMetric<>(new p71(), "RestingHeartRate", AggregateMetric.AggregationType.MAXIMUM, "bpm");
    public final Instant a;
    public final ZoneOffset b;
    public final long c;
    public final hi20 d;

    public vbg0(Instant instant, ZoneOffset zoneOffset, long j, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = j;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            if (j < 0) {
                throw new IllegalArgumentException("beatsPerMinute".concat(" must not be negative").toString());
            }
            v3r0.f(Long.valueOf(j), 300L, "beatsPerMinute");
        }
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
        if (!(obj instanceof vbg0)) {
            return false;
        }
        vbg0 vbg0Var = (vbg0) obj;
        return this.c == vbg0Var.c && epx.f(this.a, vbg0Var.a) && epx.f(this.b, vbg0Var.b) && epx.f(this.d, vbg0Var.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, Long.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestingHeartRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", beatsPerMinute=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
