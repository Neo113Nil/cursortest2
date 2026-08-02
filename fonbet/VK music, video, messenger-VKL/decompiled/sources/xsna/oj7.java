package xsna;

import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: BodyFatRecord.kt */
/* loaded from: classes12.dex */
public final class oj7 implements w7x {
    public static final uv90 e = new uv90(100);
    public final Instant a;
    public final ZoneOffset b;
    public final uv90 c;
    public final hi20 d;

    public oj7(Instant instant, ZoneOffset zoneOffset, uv90 uv90Var, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = uv90Var;
        this.d = hi20Var;
        v3r0.d(uv90Var.b, "percentage");
        v3r0.f(uv90Var, e, "percentage");
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
        if (!(obj instanceof oj7)) {
            return false;
        }
        oj7 oj7Var = (oj7) obj;
        return epx.f(this.c, oj7Var.c) && epx.f(this.a, oj7Var.a) && epx.f(this.b, oj7Var.b) && epx.f(this.d, oj7Var.d);
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
        StringBuilder sb = new StringBuilder("BodyFatRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", percentage=");
        sb.append(this.c);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.d, ')');
    }
}
