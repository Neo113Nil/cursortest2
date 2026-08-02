package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c2z;

/* compiled from: DistanceRecord.kt */
/* loaded from: classes12.dex */
public final class bhn implements oox {
    public static final c2z g;
    public static final AggregateMetric<c2z> h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final c2z e;
    public final hi20 f;

    /* compiled from: DistanceRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, c2z> {
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
        g = c2z.a.a(1000000);
        h = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, c2z.a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0)), "Distance", AggregateMetric.AggregationType.TOTAL, "distance");
    }

    public bhn(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c2z c2zVar, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = c2zVar;
        this.f = hi20Var;
        v3r0.e(c2zVar, (c2z) pn00.h(c2zVar.c, c2z.e), "distance");
        v3r0.f(c2zVar, g, "distance");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
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
        if (!(obj instanceof bhn)) {
            return false;
        }
        bhn bhnVar = (bhn) obj;
        c2z c2zVar = bhnVar.e;
        c2z c2zVar2 = this.e;
        return epx.f(c2zVar2, c2zVar) && epx.f(this.a, bhnVar.a) && epx.f(this.b, bhnVar.b) && epx.f(this.c, bhnVar.c) && epx.f(this.d, bhnVar.d) && epx.f(this.f, bhnVar.f) && c2zVar2.a() == bhnVar.e.a();
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        c2z c2zVar = this.e;
        int c = w11.c(this.a, c2zVar.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int c2 = w11.c(this.c, (c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return Double.hashCode(c2zVar.a()) + ((this.f.hashCode() + ((c2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DistanceRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", distance=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
