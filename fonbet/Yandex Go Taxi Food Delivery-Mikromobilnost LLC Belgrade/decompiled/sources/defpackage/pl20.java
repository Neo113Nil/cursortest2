package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pl20 {
    public final String a;
    public final List b;
    public final pr20 c;

    public pl20(pr20 pr20Var, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = pr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl20)) {
            return false;
        }
        pl20 pl20Var = (pl20) obj;
        return jl40.l(this.a, pl20Var.a) && jl40.l(this.b, pl20Var.b) && jl40.l(this.c, pl20Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        pr20 pr20Var = this.c;
        return c + (pr20Var == null ? 0 : pr20Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = xvz.r("MobApiNameAvailabilityReport(apiName=", this.a, ", checks=", this.b, ", selectedProxy=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
