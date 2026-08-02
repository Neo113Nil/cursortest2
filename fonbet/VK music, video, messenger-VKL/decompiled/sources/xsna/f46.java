package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jlp;
import xsna.swc0;

/* compiled from: BasalMetabolicRateRecord.kt */
/* loaded from: classes12.dex */
public final class f46 implements w7x {
    public static final swc0 e;
    public static final AggregateMetric<jlp> f;
    public final Instant a;
    public final ZoneOffset b;
    public final swc0 c;
    public final hi20 d;

    /* compiled from: BasalMetabolicRateRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, jlp> {
        @Override // xsna.izs
        public final jlp invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((jlp.a) this.receiver).getClass();
            return jlp.a.a(doubleValue);
        }
    }

    static {
        swc0.d.getClass();
        e = new swc0(10000, swc0.b.KILOCALORIES_PER_DAY);
        f = new AggregateMetric<>(new AggregateMetric.c(new a(1, jlp.d, jlp.a.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0)), "BasalCaloriesBurned", AggregateMetric.AggregationType.TOTAL, "energy");
    }

    public f46(Instant instant, ZoneOffset zoneOffset, swc0 swc0Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = swc0Var;
        this.d = hi20Var;
        v3r0.e(swc0Var, (swc0) pn00.h(swc0Var.c, swc0.e), "bmr");
        v3r0.f(swc0Var, e, "bmr");
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
        if (!(obj instanceof f46)) {
            return false;
        }
        f46 f46Var = (f46) obj;
        return epx.f(this.c, f46Var.c) && epx.f(this.a, f46Var.a) && epx.f(this.b, f46Var.b) && epx.f(this.d, f46Var.d);
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
        StringBuilder sb = new StringBuilder("BasalMetabolicRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", basalMetabolicRate=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
