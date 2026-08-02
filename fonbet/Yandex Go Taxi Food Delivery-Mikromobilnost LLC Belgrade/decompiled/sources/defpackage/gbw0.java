package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class gbw0 {
    public final String a;
    public final long b;
    public final long c;
    public final double d;
    public final double e;
    public final double f;
    public final long g;
    public final boolean h;
    public final MapBuilder i;

    public gbw0(String str, long j, long j2, double d, double d2, double d3, long j3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = j3;
        this.h = z;
        MapBuilder y = qv10.y("provider", str);
        y.put(ClidProvider.TIMESTAMP, Long.valueOf(j));
        y.put("age", Long.valueOf(j2));
        y.put("accuracy", Double.valueOf(d));
        y.put("lat", Double.valueOf(d2));
        y.put("lon", Double.valueOf(d3));
        y.put("time_since_start", Long.valueOf(j3));
        y.put("cached", Boolean.valueOf(z));
        this.i = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbw0)) {
            return false;
        }
        gbw0 gbw0Var = (gbw0) obj;
        return this.a.equals(gbw0Var.a) && this.b == gbw0Var.b && this.c == gbw0Var.c && Double.compare(this.d, gbw0Var.d) == 0 && Double.compare(this.e, gbw0Var.e) == 0 && Double.compare(this.f, gbw0Var.f) == 0 && this.g == gbw0Var.g && this.h == gbw0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qv10.c(unr0.a(unr0.a(unr0.a(qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder l = x4e.l("LocationParams(provider=", this.a, ", timestamp=", this.b);
        x4e.A(this.c, ", age=", ", accuracy=", l);
        l.append(this.d);
        nzs.o(l, ", lat=", this.e, ", lon=");
        l.append(this.f);
        x4e.A(this.g, ", timeSinceStart=", ", cached=", l);
        return x4e.i(l, this.h, Extension.C_BRAKE);
    }
}
