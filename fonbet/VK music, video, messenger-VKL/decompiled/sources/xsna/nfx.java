package xsna;

import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: IntermenstrualBleedingRecord.kt */
/* loaded from: classes12.dex */
public final class nfx implements w7x {
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;

    public nfx(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
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
        if (!(obj instanceof nfx)) {
            return false;
        }
        nfx nfxVar = (nfx) obj;
        return epx.f(this.a, nfxVar.a) && epx.f(this.b, nfxVar.b) && epx.f(this.c, nfxVar.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntermenstrualBleedingRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
