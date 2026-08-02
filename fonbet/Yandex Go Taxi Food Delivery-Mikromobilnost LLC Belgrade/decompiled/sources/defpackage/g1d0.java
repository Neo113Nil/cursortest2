package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g1d0 {
    public final ioc0 a;
    public final LinkedHashMap b;
    public final df20 c;
    public final int d;
    public final boolean e;
    public final c f;

    public g1d0(ioc0 ioc0Var, LinkedHashMap linkedHashMap, df20 df20Var, int i, boolean z, c cVar) {
        this.a = ioc0Var;
        this.b = linkedHashMap;
        this.c = df20Var;
        this.d = i;
        this.e = z;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1d0)) {
            return false;
        }
        g1d0 g1d0Var = (g1d0) obj;
        return this.a.equals(g1d0Var.a) && this.b.equals(g1d0Var.b) && jl40.l(this.c, g1d0Var.c) && this.d == g1d0Var.d && this.e == g1d0Var.e && jl40.l(this.f, g1d0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(oyr.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e);
        c cVar = this.f;
        return e + (cVar == null ? 0 : cVar.a.hashCode());
    }

    public final String toString() {
        return "PlusBadgeModel(plaqueModel=" + this.a + ", metricContext=" + this.b + ", condition=" + this.c + ", priority=" + this.d + ", enabledMarkSeenPlaque=" + this.e + ", seenContext=" + this.f + Extension.C_BRAKE;
    }
}
