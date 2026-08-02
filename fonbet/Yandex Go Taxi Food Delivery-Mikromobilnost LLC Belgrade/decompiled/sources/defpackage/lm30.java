package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;

/* loaded from: classes6.dex */
public final class lm30 {
    public final CharSequence a;
    public final String b;
    public final MtHubLeadingItemKind c;
    public final h111 d;
    public final m1a0 e;
    public final w6g0 f;

    public lm30(CharSequence charSequence, String str, MtHubLeadingItemKind mtHubLeadingItemKind, h111 h111Var, m1a0 m1a0Var, w6g0 w6g0Var) {
        this.a = charSequence;
        this.b = str;
        this.c = mtHubLeadingItemKind;
        this.d = h111Var;
        this.e = m1a0Var;
        this.f = w6g0Var;
    }

    public static lm30 a(lm30 lm30Var, h111 h111Var, m1a0 m1a0Var) {
        CharSequence charSequence = lm30Var.a;
        String str = lm30Var.b;
        MtHubLeadingItemKind mtHubLeadingItemKind = lm30Var.c;
        w6g0 w6g0Var = lm30Var.f;
        lm30Var.getClass();
        return new lm30(charSequence, str, mtHubLeadingItemKind, h111Var, m1a0Var, w6g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm30)) {
            return false;
        }
        lm30 lm30Var = (lm30) obj;
        return jl40.l(this.a, lm30Var.a) && jl40.l(this.b, lm30Var.b) && this.c == lm30Var.c && jl40.l(this.d, lm30Var.d) && jl40.l(this.e, lm30Var.e) && jl40.l(this.f, lm30Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        MtHubLeadingItemKind mtHubLeadingItemKind = this.c;
        int hashCode = (b + (mtHubLeadingItemKind == null ? 0 : mtHubLeadingItemKind.hashCode())) * 31;
        h111 h111Var = this.d;
        int hashCode2 = (hashCode + (h111Var == null ? 0 : h111Var.hashCode())) * 31;
        m1a0 m1a0Var = this.e;
        int hashCode3 = (hashCode2 + (m1a0Var == null ? 0 : m1a0Var.hashCode())) * 31;
        w6g0 w6g0Var = this.f;
        return hashCode3 + (w6g0Var != null ? w6g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MtHubButtonContainer(buttonText=" + ((Object) this.a) + ", deeplink=" + this.b + ", leadingItemKind=" + this.c + ", paymentIconState=" + this.d + ", taxiPaymentInfo=" + this.e + ", qrDeeplink=" + this.f + Extension.C_BRAKE;
    }
}
