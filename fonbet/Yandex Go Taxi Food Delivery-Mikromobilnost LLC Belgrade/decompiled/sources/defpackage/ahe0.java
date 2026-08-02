package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ahe0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final bd e;

    public ahe0(String str, String str2, String str3, boolean z, bd bdVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahe0)) {
            return false;
        }
        ahe0 ahe0Var = (ahe0) obj;
        return this.a.equals(ahe0Var.a) && this.b.equals(ahe0Var.b) && this.c.equals(ahe0Var.c) && this.d == ahe0Var.d && jl40.l(this.e, ahe0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        bd bdVar = this.e;
        return e + (bdVar == null ? 0 : bdVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("PreGeoAuthOnboardingUiModel(titlePrefix=", this.a, ", titleHighlight=", this.b, ", buttonTitle=");
        tse0.y(this.c, ", reverseTitleOrder=", ", agreementBlock=", v, this.d);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
