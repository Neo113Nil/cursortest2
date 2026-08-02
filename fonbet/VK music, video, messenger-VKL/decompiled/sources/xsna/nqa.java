package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CervicalMucusRecord.kt */
/* loaded from: classes12.dex */
public final class nqa implements w7x {
    public static final Object f;
    public static final Object g;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final int d;
    public final int e;

    static {
        Map k = pn00.k(new Pair("clear", 5), new Pair("creamy", 3), new Pair("dry", 1), new Pair("sticky", 2), new Pair("watery", 4), new Pair("unusual", 6));
        f = k;
        v3r0.g(k);
        Map k2 = pn00.k(new Pair("light", 1), new Pair("medium", 2), new Pair("heavy", 3));
        g = k2;
        v3r0.g(k2);
    }

    public nqa(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, int i, int i2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = i;
        this.e = i2;
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
        if (!nqa.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nqa nqaVar = (nqa) obj;
        return epx.f(this.a, nqaVar.a) && epx.f(this.b, nqaVar.b) && this.d == nqaVar.d && this.e == nqaVar.e && epx.f(this.c, nqaVar.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((((((hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CervicalMucusRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", appearance=");
        sb.append(this.d);
        sb.append(", sensation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
