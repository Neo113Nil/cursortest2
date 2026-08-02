package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* compiled from: SleepSessionRecord.kt */
/* loaded from: classes12.dex */
public final class uzj0 implements oox {
    public static final AggregateMetric<Duration> i = new AggregateMetric<>(androidx.health.connect.client.aggregate.a.b, "SleepSession", AggregateMetric.AggregationType.DURATION, null);
    public static final Object j;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final String f;
    public final String g;
    public final List<a> h;

    /* compiled from: SleepSessionRecord.kt */
    public static final class a {
        public final Instant a;
        public final Instant b;
        public final int c;

        public a(Instant instant, Instant instant2, int i) {
            this.a = instant;
            this.b = instant2;
            this.c = i;
            if (!instant.isBefore(instant2)) {
                throw new IllegalArgumentException("startTime must be before endTime.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + w11.c(this.a, Integer.hashCode(this.c) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Stage(startTime=");
            sb.append(this.a);
            sb.append(", endTime=");
            sb.append(this.b);
            sb.append(", stage=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: SleepSessionRecord.kt */
    public static final class b extends Lambda implements wzs<a, a, Integer> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Integer invoke(a aVar, a aVar2) {
            return Integer.valueOf(aVar.a.compareTo(aVar2.a));
        }
    }

    static {
        Map k = pn00.k(new Pair("awake", 1), new Pair("sleeping", 2), new Pair("out_of_bed", 3), new Pair("light", 4), new Pair("deep", 5), new Pair("rem", 6), new Pair("awake_in_bed", 7), new Pair("unknown", 0));
        j = k;
        Set<Map.Entry> entrySet = k.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public uzj0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, String str, String str2, List<a> list) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = str;
        this.g = str2;
        this.h = list;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (list.isEmpty()) {
            return;
        }
        final b bVar = b.i;
        List D0 = j5g.D0(new Comparator() { // from class: xsna.tzj0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) wzs.this.invoke(obj, obj2)).intValue();
            }
        }, list);
        int h = e43.h(D0);
        int i2 = 0;
        while (i2 < h) {
            Instant instant3 = ((a) D0.get(i2)).b;
            i2++;
            if (instant3.isAfter(((a) D0.get(i2)).a)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        if (((a) j5g.Y(D0)).a.isBefore(this.a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (((a) j5g.i0(D0)).b.isAfter(this.c)) {
            throw new IllegalArgumentException("Failed requirement.");
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
        if (!(obj instanceof uzj0)) {
            return false;
        }
        uzj0 uzj0Var = (uzj0) obj;
        return epx.f(this.f, uzj0Var.f) && epx.f(this.g, uzj0Var.g) && epx.f(this.h, uzj0Var.h) && epx.f(this.a, uzj0Var.a) && epx.f(this.b, uzj0Var.b) && epx.f(this.c, uzj0Var.c) && epx.f(this.d, uzj0Var.d) && epx.f(this.e, uzj0Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        String str = this.f;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.g;
        int a2 = fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (a2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SleepSessionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", notes=");
        sb.append(this.g);
        sb.append(", stages=");
        sb.append(this.h);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.e, ')');
    }
}
