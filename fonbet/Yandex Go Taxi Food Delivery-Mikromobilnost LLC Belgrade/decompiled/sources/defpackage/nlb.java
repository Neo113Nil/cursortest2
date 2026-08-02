package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nlb implements plb {
    public final String a;
    public final akb b;

    public nlb(String str, akb akbVar) {
        this.a = str;
        this.b = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlb)) {
            return false;
        }
        nlb nlbVar = (nlb) obj;
        return jl40.l(this.a, nlbVar.a) && this.b.equals(nlbVar.b);
    }

    @Override // defpackage.plb
    public final snb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentDeclined(tripId=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
