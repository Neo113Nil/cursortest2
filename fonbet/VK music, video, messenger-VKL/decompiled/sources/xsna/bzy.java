package xsna;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;
import xsna.vi10;

/* compiled from: LeanBodyMassRecord.kt */
/* loaded from: classes12.dex */
public final class bzy implements w7x {
    public static final vi10 e;
    public final Instant a;
    public final ZoneOffset b;
    public final vi10 c;
    public final hi20 d;

    static {
        vi10.d.getClass();
        e = new vi10(1000, vi10.b.KILOGRAMS);
    }

    public bzy(Instant instant, ZoneOffset zoneOffset, vi10 vi10Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = vi10Var;
        this.d = hi20Var;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
            return;
        }
        v3r0.e(vi10Var, (vi10) pn00.h(vi10Var.c, vi10.e), "mass");
        v3r0.f(vi10Var, e, "mass");
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
        if (!(obj instanceof bzy)) {
            return false;
        }
        bzy bzyVar = (bzy) obj;
        return epx.f(this.c, bzyVar.c) && epx.f(this.a, bzyVar.a) && epx.f(this.b, bzyVar.b) && epx.f(this.d, bzyVar.d);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, this.c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeanBodyMassRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", mass=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
