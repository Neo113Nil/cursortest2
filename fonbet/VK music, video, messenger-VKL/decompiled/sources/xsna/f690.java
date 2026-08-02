package xsna;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: OxygenSaturationRecord.kt */
/* loaded from: classes12.dex */
public final class f690 implements w7x {
    public final Instant a;
    public final ZoneOffset b;
    public final uv90 c;
    public final hi20 d;

    public f690(Instant instant, ZoneOffset zoneOffset, uv90 uv90Var, hi20 hi20Var) {
        double d = uv90Var.b;
        this.a = instant;
        this.b = zoneOffset;
        this.c = uv90Var;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else {
            v3r0.d(d, "percentage");
            v3r0.f(Double.valueOf(d), Double.valueOf(100.0d), "percentage");
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
        if (!(obj instanceof f690)) {
            return false;
        }
        f690 f690Var = (f690) obj;
        return epx.f(this.c, f690Var.c) && epx.f(this.a, f690Var.a) && epx.f(this.b, f690Var.b) && epx.f(this.d, f690Var.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, Double.hashCode(this.c.b) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OxygenSaturationRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", percentage=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
