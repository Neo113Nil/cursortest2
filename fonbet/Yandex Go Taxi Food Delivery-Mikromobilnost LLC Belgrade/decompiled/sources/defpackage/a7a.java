package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a7a implements g7a {
    public final String a;
    public final String b;

    public a7a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a)) {
            return false;
        }
        a7a a7aVar = (a7a) obj;
        return jl40.l(this.a, a7aVar.a) && jl40.l(this.b, a7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PurchasePassesThenCreateOrder(passId=", this.a, ", offerId=", this.b, Extension.C_BRAKE);
    }
}
