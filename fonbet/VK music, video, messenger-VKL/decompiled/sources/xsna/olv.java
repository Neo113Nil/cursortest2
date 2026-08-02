package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.v6x0;

/* compiled from: HydrationRecord.kt */
/* loaded from: classes12.dex */
public final class olv implements oox {
    public static final v6x0 g;
    public static final AggregateMetric<v6x0> h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final v6x0 e;
    public final hi20 f;

    /* compiled from: HydrationRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, v6x0> {
        @Override // xsna.izs
        public final v6x0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((v6x0.a) this.receiver).getClass();
            return new v6x0(doubleValue, v6x0.b.LITERS);
        }
    }

    static {
        v6x0.a aVar = v6x0.d;
        aVar.getClass();
        g = new v6x0(100, v6x0.b.LITERS);
        h = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, v6x0.a.class, "liters", "liters(D)Landroidx/health/connect/client/units/Volume;", 0)), "Hydration", AggregateMetric.AggregationType.TOTAL, "volume");
    }

    public olv(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, v6x0 v6x0Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = v6x0Var;
        this.f = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(v6x0Var, (v6x0) pn00.h(v6x0Var.c, v6x0.e), "volume");
        v3r0.f(v6x0Var, g, "volume");
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
        if (!(obj instanceof olv)) {
            return false;
        }
        olv olvVar = (olv) obj;
        return epx.f(this.e, olvVar.e) && epx.f(this.a, olvVar.a) && epx.f(this.b, olvVar.b) && epx.f(this.c, olvVar.c) && epx.f(this.d, olvVar.d) && epx.f(this.f, olvVar.f);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, this.e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int c2 = w11.c(this.c, (c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((c2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HydrationRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", volume=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
