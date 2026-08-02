package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.i6;

/* loaded from: classes7.dex */
public final class g971 {
    public final long a;
    public final hc71 b;
    public final i6 c;

    public g971(long j, hc71 hc71Var, i6 i6Var) {
        this.a = j;
        this.b = hc71Var;
        this.c = i6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g971)) {
            return false;
        }
        g971 g971Var = (g971) obj;
        return this.a == g971Var.a && jl40.l(this.b, g971Var.b) && this.c == g971Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        hc71 hc71Var = this.b;
        int hashCode2 = (hashCode + (hc71Var == null ? 0 : hc71Var.hashCode())) * 31;
        i6 i6Var = this.c;
        return hashCode2 + (i6Var != null ? i6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.a + ", skip=" + this.b + ", transitionPolicy=" + this.c + Extension.C_BRAKE;
    }
}
