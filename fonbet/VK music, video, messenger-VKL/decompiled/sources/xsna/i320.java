package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: MenstruationFlowRecord.kt */
/* loaded from: classes12.dex */
public final class i320 implements w7x {
    public static final Object e;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final int d;

    static {
        Map k = pn00.k(new Pair("light", 1), new Pair("medium", 2), new Pair("heavy", 3));
        e = k;
        Set<Map.Entry> entrySet = k.entrySet();
        int e2 = on00.e(c5g.u(entrySet, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public i320(int i, Instant instant, ZoneOffset zoneOffset, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = i;
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
        if (!(obj instanceof i320)) {
            return false;
        }
        i320 i320Var = (i320) obj;
        return this.d == i320Var.d && epx.f(this.a, i320Var.a) && epx.f(this.b, i320Var.b) && epx.f(this.c, i320Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, this.d * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenstruationFlowRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", flow=");
        sb.append(this.d);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
