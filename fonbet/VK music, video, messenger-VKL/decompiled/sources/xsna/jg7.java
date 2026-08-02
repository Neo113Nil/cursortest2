package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.x2d0;

/* compiled from: BloodPressureRecord.kt */
/* loaded from: classes12.dex */
public final class jg7 implements w7x {
    public static final Object h;
    public static final Object i;
    public static final x2d0 j;
    public static final x2d0 k;
    public static final x2d0 l;
    public static final x2d0 m;
    public static final AggregateMetric<x2d0> n;
    public static final AggregateMetric<x2d0> o;
    public static final AggregateMetric<x2d0> p;
    public static final AggregateMetric<x2d0> q;
    public static final AggregateMetric<x2d0> r;
    public static final AggregateMetric<x2d0> s;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final x2d0 d;
    public final x2d0 e;
    public final int f;
    public final int g;

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    /* compiled from: BloodPressureRecord.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Double, x2d0> {
        @Override // xsna.izs
        public final x2d0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((x2d0.a) this.receiver).getClass();
            return new x2d0(doubleValue);
        }
    }

    static {
        Map k2 = pn00.k(new Pair("left_upper_arm", 3), new Pair("left_wrist", 1), new Pair("right_upper_arm", 4), new Pair("right_wrist", 2));
        h = k2;
        v3r0.g(k2);
        Map k3 = pn00.k(new Pair("lying_down", 3), new Pair("reclining", 4), new Pair("sitting_down", 2), new Pair("standing_up", 1));
        i = k3;
        v3r0.g(k3);
        j = y2d0.a(20);
        k = y2d0.a(200);
        l = y2d0.a(10);
        m = y2d0.a(180);
        AggregateMetric.AggregationType aggregationType = AggregateMetric.AggregationType.AVERAGE;
        x2d0.a aVar = x2d0.c;
        n = new AggregateMetric<>(new AggregateMetric.c(new d(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType, "systolic");
        AggregateMetric.AggregationType aggregationType2 = AggregateMetric.AggregationType.MINIMUM;
        o = new AggregateMetric<>(new AggregateMetric.c(new f(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType2, "systolic");
        AggregateMetric.AggregationType aggregationType3 = AggregateMetric.AggregationType.MAXIMUM;
        p = new AggregateMetric<>(new AggregateMetric.c(new e(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType3, "systolic");
        q = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType, "diastolic");
        r = new AggregateMetric<>(new AggregateMetric.c(new c(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType2, "diastolic");
        s = new AggregateMetric<>(new AggregateMetric.c(new b(1, aVar, x2d0.a.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0)), "BloodPressure", aggregationType3, "diastolic");
    }

    public jg7(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, x2d0 x2d0Var, x2d0 x2d0Var2, int i2, int i3) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = x2d0Var;
        this.e = x2d0Var2;
        this.f = i2;
        this.g = i3;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(x2d0Var, j, "systolic");
        v3r0.f(x2d0Var, k, "systolic");
        v3r0.e(x2d0Var2, l, "diastolic");
        v3r0.f(x2d0Var2, m, "diastolic");
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
        if (!(obj instanceof jg7)) {
            return false;
        }
        jg7 jg7Var = (jg7) obj;
        return epx.f(this.d, jg7Var.d) && epx.f(this.e, jg7Var.e) && this.f == jg7Var.f && this.g == jg7Var.g && epx.f(this.a, jg7Var.a) && epx.f(this.b, jg7Var.b) && epx.f(this.c, jg7Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c2 = w11.c(this.a, (((zjh0.b(this.e.b, Double.hashCode(this.d.b) * 31, 31) + this.f) * 31) + this.g) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((c2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BloodPressureRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", systolic=");
        sb.append(this.d);
        sb.append(", diastolic=");
        sb.append(this.e);
        sb.append(", bodyPosition=");
        sb.append(this.f);
        sb.append(", measurementLocation=");
        sb.append(this.g);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
