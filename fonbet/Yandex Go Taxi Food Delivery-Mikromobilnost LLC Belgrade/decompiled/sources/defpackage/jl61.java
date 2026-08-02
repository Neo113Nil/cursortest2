package defpackage;

import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class jl61 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final long d;
    public final int e;
    public final boolean f;
    public final Set g;
    public final Map h;

    public jl61(boolean z, boolean z2, String str, long j, int i, boolean z3, Set set, Map map) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = z3;
        this.g = set;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl61)) {
            return false;
        }
        jl61 jl61Var = (jl61) obj;
        return this.a == jl61Var.a && this.b == jl61Var.b && jl40.l(this.c, jl61Var.c) && this.d == jl61Var.d && this.e == jl61Var.e && this.f == jl61Var.f && this.g.equals(jl61Var.g) && this.h.equals(jl61Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + g8e.e(this.g, unr0.e(fia1.b(this.e, qv10.c(z2a1.a(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c), 31, this.d)), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("AdQualityVerificationConfiguration(enabled=", ", debug=", ", apiKey=", this.a, this.b);
        ly3.y(this.d, this.c, ", validationTimeoutInSec=", u);
        u.append(", usagePercent=");
        u.append(this.e);
        u.append(", blockAdOnInternalError=");
        u.append(this.f);
        u.append(", enabledAdUnits=");
        u.append(this.g);
        u.append(", adNetworksCustomParameters=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
