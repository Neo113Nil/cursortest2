package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pq10 {
    public final String a;
    public final u8j0 b;

    public pq10(u8j0 u8j0Var, String str) {
        this.a = str;
        this.b = u8j0Var;
    }

    public static pq10 a(pq10 pq10Var, u8j0 u8j0Var) {
        String str = pq10Var.a;
        pq10Var.getClass();
        return new pq10(u8j0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq10)) {
            return false;
        }
        pq10 pq10Var = (pq10) obj;
        return jl40.l(this.a, pq10Var.a) && jl40.l(this.b, pq10Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        u8j0 u8j0Var = this.b;
        return hashCode + (u8j0Var != null ? u8j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MerchantOffersTestSearchState(query=" + this.a + ", searchRequest=" + this.b + Extension.C_BRAKE;
    }

    public pq10() {
        this(null, null);
    }
}
