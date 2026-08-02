package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.imr0;

/* compiled from: SpeedRecord.kt */
/* loaded from: classes12.dex */
public final class gkk0 implements lni0<d> {
    public static final imr0 g;
    public static final AggregateMetric<imr0> h;
    public static final AggregateMetric<imr0> i;
    public static final AggregateMetric<imr0> j;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final List<d> e;
    public final hi20 f;

    /* compiled from: SpeedRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, imr0> {
        @Override // xsna.izs
        public final imr0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((imr0.a) this.receiver).getClass();
            return imr0.a.a(doubleValue);
        }
    }

    /* compiled from: SpeedRecord.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Double, imr0> {
        @Override // xsna.izs
        public final imr0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((imr0.a) this.receiver).getClass();
            return imr0.a.a(doubleValue);
        }
    }

    /* compiled from: SpeedRecord.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Double, imr0> {
        @Override // xsna.izs
        public final imr0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((imr0.a) this.receiver).getClass();
            return imr0.a.a(doubleValue);
        }
    }

    /* compiled from: SpeedRecord.kt */
    public static final class d {
        public final Instant a;
        public final imr0 b;

        public d(Instant instant, imr0 imr0Var) {
            this.a = instant;
            this.b = imr0Var;
            v3r0.e(imr0Var, (imr0) pn00.h(imr0Var.c, imr0.e), "speed");
            v3r0.f(imr0Var, gkk0.g, "speed");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Sample(time=" + this.a + ", speed=" + this.b + ')';
        }
    }

    static {
        imr0.a aVar = imr0.d;
        aVar.getClass();
        g = imr0.a.a(1000000);
        h = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, imr0.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0)), "SpeedSeries", AggregateMetric.AggregationType.AVERAGE, "speed");
        i = new AggregateMetric<>(new AggregateMetric.c(new c(1, aVar, imr0.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0)), "SpeedSeries", AggregateMetric.AggregationType.MINIMUM, "speed");
        j = new AggregateMetric<>(new AggregateMetric.c(new b(1, aVar, imr0.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0)), "SpeedSeries", AggregateMetric.AggregationType.MAXIMUM, "speed");
    }

    public gkk0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<d> list, hi20 hi20Var) {
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
    public final List<d> K() {
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
        if (!(obj instanceof gkk0)) {
            return false;
        }
        gkk0 gkk0Var = (gkk0) obj;
        return epx.f(this.a, gkk0Var.a) && epx.f(this.b, gkk0Var.b) && epx.f(this.c, gkk0Var.c) && epx.f(this.d, gkk0Var.d) && epx.f(this.e, gkk0Var.e) && epx.f(this.f, gkk0Var.f);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int c2 = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + fw3.a((c2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedRecord(startTime=");
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
