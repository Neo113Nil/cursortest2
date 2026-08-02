package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c2z;

/* compiled from: HeightRecord.kt */
/* loaded from: classes12.dex */
public final class x1v implements w7x {
    public static final c2z e;
    public static final AggregateMetric<c2z> f;
    public static final AggregateMetric<c2z> g;
    public static final AggregateMetric<c2z> h;
    public final Instant a;
    public final ZoneOffset b;
    public final c2z c;
    public final hi20 d;

    /* compiled from: HeightRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, c2z> {
        @Override // xsna.izs
        public final c2z invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((c2z.a) this.receiver).getClass();
            return c2z.a.a(doubleValue);
        }
    }

    /* compiled from: HeightRecord.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Double, c2z> {
        @Override // xsna.izs
        public final c2z invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((c2z.a) this.receiver).getClass();
            return c2z.a.a(doubleValue);
        }
    }

    /* compiled from: HeightRecord.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Double, c2z> {
        @Override // xsna.izs
        public final c2z invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((c2z.a) this.receiver).getClass();
            return c2z.a.a(doubleValue);
        }
    }

    static {
        c2z.a aVar = c2z.d;
        aVar.getClass();
        e = c2z.a.a(3);
        f = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, c2z.a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0)), "Height", AggregateMetric.AggregationType.AVERAGE, "height");
        g = new AggregateMetric<>(new AggregateMetric.c(new c(1, aVar, c2z.a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0)), "Height", AggregateMetric.AggregationType.MINIMUM, "height");
        h = new AggregateMetric<>(new AggregateMetric.c(new b(1, aVar, c2z.a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0)), "Height", AggregateMetric.AggregationType.MAXIMUM, "height");
    }

    public x1v(Instant instant, ZoneOffset zoneOffset, c2z c2zVar, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = c2zVar;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(c2zVar, (c2z) pn00.h(c2zVar.c, c2z.e), "height");
        v3r0.f(c2zVar, e, "height");
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
        if (!(obj instanceof x1v)) {
            return false;
        }
        x1v x1vVar = (x1v) obj;
        return epx.f(this.c, x1vVar.c) && epx.f(this.a, x1vVar.a) && epx.f(this.b, x1vVar.b) && epx.f(this.d, x1vVar.d);
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
        StringBuilder sb = new StringBuilder("HeightRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
