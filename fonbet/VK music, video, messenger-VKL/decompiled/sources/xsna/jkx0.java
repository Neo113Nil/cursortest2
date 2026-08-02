package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vi10;

/* compiled from: WeightRecord.kt */
/* loaded from: classes12.dex */
public final class jkx0 implements w7x {
    public static final vi10 e;
    public static final AggregateMetric<vi10> f;
    public static final AggregateMetric<vi10> g;
    public static final AggregateMetric<vi10> h;
    public final Instant a;
    public final ZoneOffset b;
    public final vi10 c;
    public final hi20 d;

    /* compiled from: WeightRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, vi10> {
        @Override // xsna.izs
        public final vi10 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((vi10.a) this.receiver).getClass();
            return new vi10(doubleValue, vi10.b.KILOGRAMS);
        }
    }

    /* compiled from: WeightRecord.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Double, vi10> {
        @Override // xsna.izs
        public final vi10 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((vi10.a) this.receiver).getClass();
            return new vi10(doubleValue, vi10.b.KILOGRAMS);
        }
    }

    /* compiled from: WeightRecord.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Double, vi10> {
        @Override // xsna.izs
        public final vi10 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((vi10.a) this.receiver).getClass();
            return new vi10(doubleValue, vi10.b.KILOGRAMS);
        }
    }

    static {
        vi10.a aVar = vi10.d;
        aVar.getClass();
        e = new vi10(1000, vi10.b.KILOGRAMS);
        f = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, vi10.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0)), "Weight", AggregateMetric.AggregationType.AVERAGE, "weight");
        g = new AggregateMetric<>(new AggregateMetric.c(new c(1, aVar, vi10.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0)), "Weight", AggregateMetric.AggregationType.MINIMUM, "weight");
        h = new AggregateMetric<>(new AggregateMetric.c(new b(1, aVar, vi10.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0)), "Weight", AggregateMetric.AggregationType.MAXIMUM, "weight");
    }

    public jkx0(Instant instant, ZoneOffset zoneOffset, vi10 vi10Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = vi10Var;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(vi10Var, (vi10) pn00.h(vi10Var.c, vi10.e), "weight");
        v3r0.f(vi10Var, e, "weight");
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
        if (!(obj instanceof jkx0)) {
            return false;
        }
        jkx0 jkx0Var = (jkx0) obj;
        return epx.f(this.c, jkx0Var.c) && epx.f(this.a, jkx0Var.a) && epx.f(this.b, jkx0Var.b) && epx.f(this.d, jkx0Var.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c2 = w11.c(this.a, this.c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WeightRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", weight=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
