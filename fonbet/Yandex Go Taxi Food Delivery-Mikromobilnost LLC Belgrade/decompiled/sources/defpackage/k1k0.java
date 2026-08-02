package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k1k0 {
    public final long a;
    public final qi4 b;
    public final wz50 c;
    public final long d;
    public final ArrayList e;

    public k1k0(long j, qi4 qi4Var, wz50 wz50Var, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = qi4Var;
        this.c = wz50Var;
        this.d = j2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1k0) {
            k1k0 k1k0Var = (k1k0) obj;
            if (e3n.d(this.a, k1k0Var.a) && this.b.equals(k1k0Var.b) && this.c == k1k0Var.c && e3n.d(this.d, k1k0Var.d) && this.e.equals(k1k0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        return this.e.hashCode() + qv10.c((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        String p = e3n.p(this.a);
        String p2 = e3n.p(this.d);
        StringBuilder sb = new StringBuilder("RetryConfig(timeout=");
        sb.append(p);
        sb.append(", backoff=");
        sb.append(this.b);
        sb.append(", retryCondition=");
        sb.append(this.c);
        sb.append(", delayMargin=");
        sb.append(p2);
        sb.append(", cooldownItems=");
        return b64.n(Extension.C_BRAKE, sb, this.e);
    }
}
