package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.epx;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class i8 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final Map d;
    public final Set e;

    public i8(int i, boolean z, boolean z2, LinkedHashMap linkedHashMap, Set set) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = linkedHashMap;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.a == i8Var.a && this.b == i8Var.b && this.c == i8Var.c && epx.f(this.d, i8Var.d) && epx.f(this.e, i8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xsna.v11.a(qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.a + ", enabled=" + this.b + ", blockAdOnInternalError=" + this.c + ", adNetworksCustomParameters=" + this.d + ", enabledAdUnits=" + this.e + ")";
    }
}
