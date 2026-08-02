package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* compiled from: StepsCadenceRecord.kt */
/* loaded from: classes12.dex */
public final class r0l0 implements lni0<a> {
    public static final AggregateMetric<Double> g = new AggregateMetric<>(new q71(), "StepsCadenceSeries", AggregateMetric.AggregationType.AVERAGE, "rate");
    public static final AggregateMetric<Double> h = new AggregateMetric<>(new q71(), "StepsCadenceSeries", AggregateMetric.AggregationType.MINIMUM, "rate");
    public static final AggregateMetric<Double> i = new AggregateMetric<>(new q71(), "StepsCadenceSeries", AggregateMetric.AggregationType.MAXIMUM, "rate");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final List<a> e;
    public final hi20 f;

    /* compiled from: StepsCadenceRecord.kt */
    public static final class a {
        public final Instant a;
        public final double b;

        public a(double d, Instant instant) {
            this.a = instant;
            this.b = d;
            v3r0.d(d, "rate");
            v3r0.f(Double.valueOf(d), Double.valueOf(10000.0d), "rate");
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
            return Double.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Sample(time=");
            sb.append(this.a);
            sb.append(", rate=");
            return ojp0.a(sb, this.b, ')');
        }
    }

    public r0l0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<a> list, hi20 hi20Var) {
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
        if (!(obj instanceof r0l0)) {
            return false;
        }
        r0l0 r0l0Var = (r0l0) obj;
        return epx.f(this.a, r0l0Var.a) && epx.f(this.b, r0l0Var.b) && epx.f(this.c, r0l0Var.c) && epx.f(this.d, r0l0Var.d) && epx.f(this.e, r0l0Var.e) && epx.f(this.f, r0l0Var.f);
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
        StringBuilder sb = new StringBuilder("StepsCadenceRecord(startTime=");
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
