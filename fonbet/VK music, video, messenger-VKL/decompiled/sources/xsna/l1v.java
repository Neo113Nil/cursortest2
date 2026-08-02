package xsna;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: HeartRateVariabilityRmssdRecord.kt */
/* loaded from: classes12.dex */
public final class l1v implements w7x {
    public final Instant a;
    public final ZoneOffset b;
    public final double c;
    public final hi20 d;

    public l1v(Instant instant, ZoneOffset zoneOffset, double d, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = d;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        Double valueOf = Double.valueOf(d);
        Double valueOf2 = Double.valueOf(1.0d);
        Double valueOf3 = Double.valueOf(200.0d);
        v3r0.e(valueOf, valueOf2, "heartRateVariabilityMillis");
        v3r0.f(valueOf, valueOf3, "heartRateVariabilityMillis");
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
        if (!(obj instanceof l1v)) {
            return false;
        }
        l1v l1vVar = (l1v) obj;
        return this.c == l1vVar.c && epx.f(this.a, l1vVar.a) && epx.f(this.b, l1vVar.b) && epx.f(this.d, l1vVar.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, Double.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartRateVariabilityRmssdRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", heartRateVariabilityMillis=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
