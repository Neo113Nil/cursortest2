package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class p8o0 {
    public final CharSequence a;
    public final CharSequence b;
    public final d8o0 c;
    public final nvi0 d;
    public final e8o0 e;
    public final List f;
    public final g8o0 g;
    public final m8o0 h;
    public final o8o0 i;
    public final h8o0 j;
    public final boolean k;

    public p8o0(CharSequence charSequence, CharSequence charSequence2, d8o0 d8o0Var, nvi0 nvi0Var, e8o0 e8o0Var, List list, g8o0 g8o0Var, m8o0 m8o0Var, o8o0 o8o0Var, h8o0 h8o0Var, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = d8o0Var;
        this.d = nvi0Var;
        this.e = e8o0Var;
        this.f = list;
        this.g = g8o0Var;
        this.h = m8o0Var;
        this.i = o8o0Var;
        this.j = h8o0Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8o0)) {
            return false;
        }
        p8o0 p8o0Var = (p8o0) obj;
        if (!jl40.l(this.a, p8o0Var.a) || !jl40.l(this.b, p8o0Var.b) || !jl40.l(this.c, p8o0Var.c)) {
            return false;
        }
        nvi0 nvi0Var = p8o0Var.d;
        nvi0 nvi0Var2 = this.d;
        if (nvi0Var2 == null) {
            if (nvi0Var == null) {
                l = true;
            }
            l = false;
        } else {
            if (nvi0Var != null) {
                l = jl40.l(nvi0Var2, nvi0Var);
            }
            l = false;
        }
        return l && jl40.l(this.e, p8o0Var.e) && jl40.l(this.f, p8o0Var.f) && jl40.l(this.g, p8o0Var.g) && jl40.l(this.h, p8o0Var.h) && jl40.l(this.i, p8o0Var.i) && jl40.l(this.j, p8o0Var.j) && this.k == p8o0Var.k;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        d8o0 d8o0Var = this.c;
        int hashCode = (b + (d8o0Var == null ? 0 : d8o0Var.hashCode())) * 31;
        nvi0 nvi0Var = this.d;
        int hashCode2 = (hashCode + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31;
        e8o0 e8o0Var = this.e;
        int c = unr0.c((hashCode2 + (e8o0Var == null ? 0 : e8o0Var.hashCode())) * 31, 31, this.f);
        g8o0 g8o0Var = this.g;
        int hashCode3 = (this.i.hashCode() + ((this.h.hashCode() + ((c + (g8o0Var == null ? 0 : g8o0Var.hashCode())) * 31)) * 31)) * 31;
        h8o0 h8o0Var = this.j;
        return Boolean.hashCode(this.k) + ((hashCode3 + (h8o0Var != null ? h8o0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        nvi0 nvi0Var = this.d;
        if (nvi0Var == null) {
            str = "null";
        } else {
            str = "Promo(image=" + nvi0Var + Extension.C_BRAKE;
        }
        StringBuilder r = vfc.r(this.a, this.b, "ScootersPackagesPurchaseUiState(title=", ", subtitle=", ", badge=");
        r.append(this.c);
        r.append(", promo=");
        r.append(str);
        r.append(", context=");
        r.append(this.e);
        r.append(", packages=");
        r.append(this.f);
        r.append(", details=");
        r.append(this.g);
        r.append(", paymentMethodButton=");
        r.append(this.h);
        r.append(", purchaseButton=");
        r.append(this.i);
        r.append(", legalTerms=");
        r.append(this.j);
        r.append(", inProgress=");
        return x4e.i(r, this.k, Extension.C_BRAKE);
    }
}
