package xsna;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Vo2MaxRecord.kt */
/* loaded from: classes12.dex */
public final class qbw0 implements w7x {
    public static final Object f;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final double d;
    public final int e;

    static {
        Map k = pn00.k(new Pair("other", 0), new Pair("metabolic_cart", 1), new Pair("heart_rate_ratio", 2), new Pair("cooper_test", 3), new Pair("multistage_fitness_test", 4), new Pair("rockport_fitness_test", 5));
        f = k;
        v3r0.g(k);
    }

    public qbw0(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, double d, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = d;
        this.e = i;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            v3r0.d(d, "vo2MillilitersPerMinuteKilogram");
            v3r0.f(Double.valueOf(d), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
        }
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
        if (!(obj instanceof qbw0)) {
            return false;
        }
        qbw0 qbw0Var = (qbw0) obj;
        return this.d == qbw0Var.d && this.e == qbw0Var.e && epx.f(this.a, qbw0Var.a) && epx.f(this.b, qbw0Var.b) && epx.f(this.c, qbw0Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, ((Double.hashCode(this.d) * 31) + this.e) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vo2MaxRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", vo2MillilitersPerMinuteKilogram=");
        sb.append(this.d);
        sb.append(", measurementMethod=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
