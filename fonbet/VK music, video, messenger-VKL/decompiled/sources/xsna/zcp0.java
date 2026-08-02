package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jlp;

/* compiled from: TotalCaloriesBurnedRecord.kt */
/* loaded from: classes12.dex */
public final class zcp0 implements oox {
    public static final jlp g;
    public static final AggregateMetric<jlp> h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final jlp e;
    public final hi20 f;

    /* compiled from: TotalCaloriesBurnedRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, jlp> {
        @Override // xsna.izs
        public final jlp invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((jlp.a) this.receiver).getClass();
            return jlp.a.a(doubleValue);
        }
    }

    static {
        jlp.a aVar = jlp.d;
        aVar.getClass();
        g = jlp.a.a(1000000);
        h = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, jlp.a.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0)), "TotalCaloriesBurned", AggregateMetric.AggregationType.TOTAL, "energy");
    }

    public zcp0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, jlp jlpVar, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = jlpVar;
        this.f = hi20Var;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(jlpVar, (jlp) pn00.h(jlpVar.c, jlp.e), "energy");
        v3r0.f(jlpVar, g, "energy");
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
        if (!(obj instanceof zcp0)) {
            return false;
        }
        zcp0 zcp0Var = (zcp0) obj;
        return epx.f(this.e, zcp0Var.e) && epx.f(this.a, zcp0Var.a) && epx.f(this.b, zcp0Var.b) && epx.f(this.c, zcp0Var.c) && epx.f(this.d, zcp0Var.d) && epx.f(this.f, zcp0Var.f);
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
        StringBuilder sb = new StringBuilder("TotalCaloriesBurnedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", energy=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.f, ')');
    }
}
