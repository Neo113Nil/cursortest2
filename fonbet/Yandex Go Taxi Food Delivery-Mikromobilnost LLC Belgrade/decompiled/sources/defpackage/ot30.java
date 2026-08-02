package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseButtonStyle;

/* loaded from: classes6.dex */
public final class ot30 {
    public final String a;
    public final String b;
    public final MtPurchaseButtonStyle c;
    public final nt30 d;

    public ot30(String str, String str2, MtPurchaseButtonStyle mtPurchaseButtonStyle, nt30 nt30Var) {
        this.a = str;
        this.b = str2;
        this.c = mtPurchaseButtonStyle;
        this.d = nt30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot30)) {
            return false;
        }
        ot30 ot30Var = (ot30) obj;
        return this.a.equals(ot30Var.a) && jl40.l(this.b, ot30Var.b) && this.c == ot30Var.c && jl40.l(this.d, ot30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtPurchaseButtonUiState(id=", this.a, ", text=", this.b, ", style=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
