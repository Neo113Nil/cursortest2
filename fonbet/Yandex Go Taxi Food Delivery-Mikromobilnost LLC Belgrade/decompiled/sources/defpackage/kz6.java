package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kz6 {
    public final String a;
    public final CharSequence b;
    public final pzu c;
    public final HubLeadingItemKind d;
    public final h111 e;
    public final m1a0 f;
    public final k0s g;

    public kz6(String str, CharSequence charSequence, pzu pzuVar, HubLeadingItemKind hubLeadingItemKind, h111 h111Var, m1a0 m1a0Var, k0s k0sVar) {
        this.a = str;
        this.b = charSequence;
        this.c = pzuVar;
        this.d = hubLeadingItemKind;
        this.e = h111Var;
        this.f = m1a0Var;
        this.g = k0sVar;
    }

    public static kz6 a(kz6 kz6Var, pzu pzuVar, h111 h111Var, m1a0 m1a0Var, int i) {
        String str = kz6Var.a;
        CharSequence charSequence = kz6Var.b;
        if ((i & 4) != 0) {
            pzuVar = kz6Var.c;
        }
        pzu pzuVar2 = pzuVar;
        HubLeadingItemKind hubLeadingItemKind = kz6Var.d;
        if ((i & 16) != 0) {
            h111Var = kz6Var.e;
        }
        h111 h111Var2 = h111Var;
        if ((i & 32) != 0) {
            m1a0Var = kz6Var.f;
        }
        k0s k0sVar = kz6Var.g;
        kz6Var.getClass();
        return new kz6(str, charSequence, pzuVar2, hubLeadingItemKind, h111Var2, m1a0Var, k0sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz6)) {
            return false;
        }
        kz6 kz6Var = (kz6) obj;
        return jl40.l(this.a, kz6Var.a) && jl40.l(this.b, kz6Var.b) && jl40.l(this.c, kz6Var.c) && this.d == kz6Var.d && jl40.l(this.e, kz6Var.e) && jl40.l(this.f, kz6Var.f) && jl40.l(this.g, kz6Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int b = smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        pzu pzuVar = this.c;
        int hashCode = (b + (pzuVar == null ? 0 : pzuVar.hashCode())) * 31;
        HubLeadingItemKind hubLeadingItemKind = this.d;
        int hashCode2 = (hashCode + (hubLeadingItemKind == null ? 0 : hubLeadingItemKind.hashCode())) * 31;
        h111 h111Var = this.e;
        int hashCode3 = (hashCode2 + (h111Var == null ? 0 : h111Var.hashCode())) * 31;
        m1a0 m1a0Var = this.f;
        int hashCode4 = (hashCode3 + (m1a0Var == null ? 0 : m1a0Var.hashCode())) * 31;
        k0s k0sVar = this.g;
        return hashCode4 + (k0sVar != null ? k0sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ButtonContainer(offerId=", this.a, ", buttonText=", ", action=");
        t.append(this.c);
        t.append(", leadingItemKind=");
        t.append(this.d);
        t.append(", paymentIconState=");
        t.append(this.e);
        t.append(", taxiPaymentInfo=");
        t.append(this.f);
        t.append(", trailingItem=");
        t.append(this.g);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
