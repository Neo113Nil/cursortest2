package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bh71 {
    public final String a;
    public final List b;
    public final long c;

    public bh71(long j, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh71)) {
            return false;
        }
        bh71 bh71Var = (bh71) obj;
        return jl40.l(this.a, bh71Var.a) && jl40.l(this.b, bh71Var.b) && this.c == bh71Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, xvz.r("MediationPrefetchAdUnitSettings(adUnitId=", this.a, ", networks=", this.b, ", loadTimeoutMillis="));
    }
}
