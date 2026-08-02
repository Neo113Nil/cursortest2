package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p7a {
    public final tsa a;
    public final hfa0 b;
    public final n9a c;
    public final ow9 d;

    public p7a(tsa tsaVar, hfa0 hfa0Var, n9a n9aVar, ow9 ow9Var) {
        this.a = tsaVar;
        this.b = hfa0Var;
        this.c = n9aVar;
        this.d = ow9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7a)) {
            return false;
        }
        p7a p7aVar = (p7a) obj;
        return jl40.l(this.a, p7aVar.a) && jl40.l(this.b, p7aVar.b) && jl40.l(this.c, p7aVar.c) && jl40.l(this.d, p7aVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        n9a n9aVar = this.c;
        int hashCode2 = (hashCode + (n9aVar == null ? 0 : n9aVar.hashCode())) * 31;
        ow9 ow9Var = this.d;
        return hashCode2 + (ow9Var != null ? ow9Var.hashCode() : 0);
    }

    public final String toString() {
        return "CacheKey(stationNumber=" + this.a + ", paymentOptions=" + this.b + ", chargersOfferToggle=" + this.c + ", discount=" + this.d + Extension.C_BRAKE;
    }
}
