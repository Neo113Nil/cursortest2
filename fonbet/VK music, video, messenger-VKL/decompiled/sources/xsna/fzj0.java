package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d8o0;

/* compiled from: SkinTemperatureRecord.kt */
/* loaded from: classes12.dex */
public final class fzj0 implements oox {
    public static final c8o0 i = atv0.l(0);
    public static final c8o0 j = atv0.l(100);
    public static final AggregateMetric<d8o0> k;
    public static final AggregateMetric<d8o0> l;
    public static final AggregateMetric<d8o0> m;
    public static final Object n;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final List<d> f;
    public final c8o0 g;
    public final int h;

    /* compiled from: SkinTemperatureRecord.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Double, d8o0> {
        @Override // xsna.izs
        public final d8o0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((d8o0.a) this.receiver).getClass();
            return d8o0.a.a(doubleValue);
        }
    }

    /* compiled from: SkinTemperatureRecord.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Double, d8o0> {
        @Override // xsna.izs
        public final d8o0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((d8o0.a) this.receiver).getClass();
            return d8o0.a.a(doubleValue);
        }
    }

    /* compiled from: SkinTemperatureRecord.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Double, d8o0> {
        @Override // xsna.izs
        public final d8o0 invoke(Double d) {
            double doubleValue = d.doubleValue();
            ((d8o0.a) this.receiver).getClass();
            return d8o0.a.a(doubleValue);
        }
    }

    /* compiled from: SkinTemperatureRecord.kt */
    public static final class d {
        public static final d8o0 c;
        public static final d8o0 d;
        public final Instant a;
        public final d8o0 b;

        static {
            d8o0.d.getClass();
            c = d8o0.a.a(-30.0d);
            d = d8o0.a.a(30.0d);
        }

        public d(Instant instant, d8o0 d8o0Var) {
            this.a = instant;
            this.b = d8o0Var;
            v3r0.e(d8o0Var, c, "delta");
            v3r0.f(d8o0Var, d, "delta");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!d.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Delta(time=" + this.a + ", delta=" + this.b + ')';
        }
    }

    static {
        AggregateMetric.AggregationType aggregationType = AggregateMetric.AggregationType.AVERAGE;
        d8o0.a aVar = d8o0.d;
        k = new AggregateMetric<>(new AggregateMetric.c(new a(1, aVar, d8o0.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0)), "SkinTemperature", aggregationType, "temperatureDelta");
        l = new AggregateMetric<>(new AggregateMetric.c(new c(1, aVar, d8o0.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0)), "SkinTemperature", AggregateMetric.AggregationType.MINIMUM, "temperatureDelta");
        m = new AggregateMetric<>(new AggregateMetric.c(new b(1, aVar, d8o0.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0)), "SkinTemperature", AggregateMetric.AggregationType.MAXIMUM, "temperatureDelta");
        Map k2 = pn00.k(new Pair("finger", 1), new Pair("toe", 2), new Pair("wrist", 3));
        n = k2;
        v3r0.g(k2);
    }

    public fzj0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, List<d> list, c8o0 c8o0Var, int i2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = list;
        this.g = c8o0Var;
        this.h = i2;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (c8o0Var != null) {
            v3r0.e(c8o0Var, i, "temperature");
            v3r0.f(c8o0Var, j, "temperature");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant3 = ((d) next).a;
            do {
                Object next2 = it.next();
                Instant instant4 = ((d) next2).a;
                if (instant3.compareTo(instant4) > 0) {
                    next = next2;
                    instant3 = instant4;
                }
            } while (it.hasNext());
        }
        if (((d) next).a.isBefore(this.a)) {
            throw new IllegalArgumentException("deltas can not be out of parent time range.");
        }
        Iterator<T> it2 = this.f.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            Instant instant5 = ((d) next3).a;
            do {
                Object next4 = it2.next();
                Instant instant6 = ((d) next4).a;
                if (instant5.compareTo(instant6) < 0) {
                    next3 = next4;
                    instant5 = instant6;
                }
            } while (it2.hasNext());
        }
        if (!((d) next3).a.isBefore(this.c)) {
            throw new IllegalArgumentException("deltas can not be out of parent time range.");
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
        if (!(obj instanceof fzj0)) {
            return false;
        }
        fzj0 fzj0Var = (fzj0) obj;
        return epx.f(this.a, fzj0Var.a) && epx.f(this.c, fzj0Var.c) && epx.f(this.b, fzj0Var.b) && epx.f(this.d, fzj0Var.d) && epx.f(this.g, fzj0Var.g) && this.h == fzj0Var.h && epx.f(this.f, fzj0Var.f) && epx.f(this.e, fzj0Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c2 = w11.c(this.c, this.a.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int hashCode = (c2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset2 = this.d;
        int hashCode2 = (hashCode + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31;
        c8o0 c8o0Var = this.g;
        return this.e.hashCode() + fw3.a(shy.a(this.h, (hashCode2 + (c8o0Var != null ? c8o0Var.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkinTemperatureRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", deltas=");
        sb.append(this.f);
        sb.append(", baseline=");
        sb.append(this.g);
        sb.append(", measurementLocation=");
        sb.append(this.h);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.e, ')');
    }
}
