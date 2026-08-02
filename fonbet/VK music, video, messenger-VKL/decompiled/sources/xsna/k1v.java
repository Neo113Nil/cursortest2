package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* compiled from: HeartRateRecord.kt */
/* loaded from: classes12.dex */
public final class k1v implements lni0<a> {
    public static final AggregateMetric<Long> g = new AggregateMetric<>(new p71(), "HeartRateSeries", AggregateMetric.AggregationType.AVERAGE, "bpm");
    public static final AggregateMetric<Long> h = new AggregateMetric<>(new p71(), "HeartRateSeries", AggregateMetric.AggregationType.MINIMUM, "bpm");
    public static final AggregateMetric<Long> i = new AggregateMetric<>(new p71(), "HeartRateSeries", AggregateMetric.AggregationType.MAXIMUM, "bpm");
    public static final AggregateMetric<Long> j = new AggregateMetric<>(new p71(), "HeartRateSeries", AggregateMetric.AggregationType.COUNT, null);
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final List<a> e;
    public final hi20 f;

    /* compiled from: HeartRateRecord.kt */
    public static final class a {
        public final Instant a;
        public final long b;

        public a(Instant instant, long j) {
            this.a = instant;
            this.b = j;
            v3r0.e(Long.valueOf(j), 1L, "beatsPerMinute");
            v3r0.f(Long.valueOf(j), 300L, "beatsPerMinute");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Sample(time=");
            sb.append(this.a);
            sb.append(", beatsPerMinute=");
            return vu5.a(')', this.b, sb);
        }
    }

    public k1v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<a> list, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = list;
        this.f = hi20Var;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // xsna.lni0
    public final List<a> K() {
        return this.e;
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
        if (!(obj instanceof k1v)) {
            return false;
        }
        k1v k1vVar = (k1v) obj;
        return epx.f(this.a, k1vVar.a) && epx.f(this.b, k1vVar.b) && epx.f(this.c, k1vVar.c) && epx.f(this.d, k1vVar.d) && epx.f(this.e, k1vVar.e) && epx.f(this.f, k1vVar.f);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + fw3.a((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartRateRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", samples=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
