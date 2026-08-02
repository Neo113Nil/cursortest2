package xsna;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: RespiratoryRateRecord.kt */
/* loaded from: classes12.dex */
public final class ibg0 implements w7x {
    public final Instant a;
    public final ZoneOffset b;
    public final double c;
    public final hi20 d;

    public ibg0(Instant instant, ZoneOffset zoneOffset, double d, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = d;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            v3r0.d(d, "rate");
            v3r0.f(Double.valueOf(d), Double.valueOf(1000.0d), "rate");
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
        if (!(obj instanceof ibg0)) {
            return false;
        }
        ibg0 ibg0Var = (ibg0) obj;
        return this.c == ibg0Var.c && epx.f(this.a, ibg0Var.a) && epx.f(this.b, ibg0Var.b) && epx.f(this.d, ibg0Var.d);
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
        StringBuilder sb = new StringBuilder("RespiratoryRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", rate=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
