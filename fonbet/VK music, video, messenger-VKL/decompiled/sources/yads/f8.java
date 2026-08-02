package yads;

import java.util.Map;
import java.util.Set;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class f8 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final long d;
    public final int e;
    public final boolean f;
    public final Set g;
    public final Map h;

    public f8(boolean z, boolean z2, String str, long j, int i, boolean z3, Set set, Map map) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = z3;
        this.g = set;
        this.h = map;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.a == f8Var.a && this.b == f8Var.b && epx.f(this.c, f8Var.c) && this.d == f8Var.d && this.e == f8Var.e && this.f == f8Var.f && epx.f(this.g, f8Var.g) && epx.f(this.h, f8Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fw3.b(qoy.b(re3.a(this.e, bh10.a(k4.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String str = this.c;
        long j = this.d;
        int i = this.e;
        boolean z3 = this.f;
        Set set = this.g;
        Map map = this.h;
        StringBuilder c = xsna.gp.c("AdQualityVerificationConfiguration(enabled=", ", debug=", ", apiKey=", z, z2);
        c.append(str);
        c.append(", validationTimeoutInSec=");
        c.append(j);
        c.append(", usagePercent=");
        c.append(i);
        c.append(", blockAdOnInternalError=");
        c.append(z3);
        c.append(", enabledAdUnits=");
        c.append(set);
        c.append(", adNetworksCustomParameters=");
        c.append(map);
        c.append(")");
        return c.toString();
    }
}
