package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class iq20 {
    public final pr20 a;
    public final oq20 b;
    public final Map c;
    public final Map d;

    public iq20(pr20 pr20Var, oq20 oq20Var, Map map, Map map2) {
        this.a = pr20Var;
        this.b = oq20Var;
        this.c = map;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq20)) {
            return false;
        }
        iq20 iq20Var = (iq20) obj;
        return jl40.l(this.a, iq20Var.a) && this.b.equals(iq20Var.b) && jl40.l(this.c, iq20Var.c) && this.d.equals(iq20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        return "MobProvision(mobSelectedProxy=" + this.a + ", queryParams=" + this.b + ", headers=" + this.c + ", additionalMetricaParameters=" + this.d + Extension.C_BRAKE;
    }
}
