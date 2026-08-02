package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.qy2;
import yads.sy2;

/* loaded from: classes7.dex */
public final class hc71 {
    public final qy2 a;
    public final sy2 b;
    public final long c;

    public hc71(qy2 qy2Var, sy2 sy2Var, long j) {
        this.a = qy2Var;
        this.b = sy2Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc71)) {
            return false;
        }
        hc71 hc71Var = (hc71) obj;
        return this.a == hc71Var.a && this.b == hc71Var.b && this.c == hc71Var.c;
    }

    public final int hashCode() {
        qy2 qy2Var = this.a;
        int hashCode = (qy2Var == null ? 0 : qy2Var.hashCode()) * 31;
        sy2 sy2Var = this.b;
        return Long.hashCode(this.c) + ((hashCode + (sy2Var != null ? sy2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPodSkip(transitionStrategy=");
        sb.append(this.a);
        sb.append(", visibility=");
        sb.append(this.b);
        sb.append(", delay=");
        return oyr.n(this.c, Extension.C_BRAKE, sb);
    }
}
