package defpackage;

import com.yandex.delivery.mapper.model.policies.ShowPolicy$LimitedCount$Lifetime;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class l8s0 implements m8s0 {
    public final String a;
    public final int b;
    public final ShowPolicy$LimitedCount$Lifetime c;

    public l8s0(String str, int i, ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime) {
        this.a = str;
        this.b = i;
        this.c = showPolicy$LimitedCount$Lifetime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8s0)) {
            return false;
        }
        l8s0 l8s0Var = (l8s0) obj;
        return jl40.l(this.a, l8s0Var.a) && this.b == l8s0Var.b && this.c == l8s0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "LimitedCount(cacheKey=", this.a, ", maxShowCount=", ", lifetime=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
