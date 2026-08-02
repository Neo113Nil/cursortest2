package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class fu30 {
    public final String a;
    public final String b;
    public final MtTransportType c;
    public final kdc d;
    public final rr30 e;
    public final ovi0 f;
    public final ks30 g;

    public fu30(String str, String str2, MtTransportType mtTransportType, kdc kdcVar, rr30 rr30Var, ovi0 ovi0Var, ks30 ks30Var) {
        this.a = str;
        this.b = str2;
        this.c = mtTransportType;
        this.d = kdcVar;
        this.e = rr30Var;
        this.f = ovi0Var;
        this.g = ks30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu30)) {
            return false;
        }
        fu30 fu30Var = (fu30) obj;
        return jl40.l(this.a, fu30Var.a) && this.b.equals(fu30Var.b) && this.c == fu30Var.c && jl40.l(this.d, fu30Var.d) && jl40.l(this.e, fu30Var.e) && jl40.l(this.f, fu30Var.f) && this.g.equals(fu30Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        kdc kdcVar = this.d;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        rr30 rr30Var = this.e;
        int hashCode3 = (hashCode2 + (rr30Var == null ? 0 : rr30Var.hashCode())) * 31;
        ovi0 ovi0Var = this.f;
        return this.g.hashCode() + ((hashCode3 + (ovi0Var != null ? ovi0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtPurchaseOptionUiState(id=", this.a, ", title=", this.b, ", transportType=");
        v.append(this.c);
        v.append(", transportColor=");
        v.append(this.d);
        v.append(", iconBackgroundColor=");
        v.append(this.e);
        v.append(", iconTag=");
        v.append(this.f);
        v.append(", purchase=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
