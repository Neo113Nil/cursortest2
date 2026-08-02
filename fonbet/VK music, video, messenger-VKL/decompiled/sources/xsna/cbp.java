package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c2z;

/* compiled from: ElevationGainedRecord.kt */
/* loaded from: classes12.dex */
public final class cbp implements oox {
    public static final c2z g;
    public static final c2z h;
    public static final AggregateMetric<c2z> i;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final c2z e;
    public final hi20 f;

    /* compiled from: ElevationGainedRecord.kt */
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
        aVar.getClass();
        h = c2z.a.a(-1000000);
        i = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, c2z.a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0)), "ElevationGained", AggregateMetric.AggregationType.TOTAL, "elevation");
    }

    public cbp(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c2z c2zVar, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = c2zVar;
        this.f = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            v3r0.e(c2zVar, h, "elevation");
            v3r0.f(c2zVar, g, "elevation");
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
        if (!(obj instanceof cbp)) {
            return false;
        }
        cbp cbpVar = (cbp) obj;
        return epx.f(this.e, cbpVar.e) && epx.f(this.a, cbpVar.a) && epx.f(this.b, cbpVar.b) && epx.f(this.c, cbpVar.c) && epx.f(this.d, cbpVar.d) && epx.f(this.f, cbpVar.f);
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
        StringBuilder sb = new StringBuilder("ElevationGainedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", elevation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
