package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jlb implements plb {
    public final String a;
    public final String b;
    public final String c;
    public final akb d;

    public jlb(String str, String str2, String str3, akb akbVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb)) {
            return false;
        }
        jlb jlbVar = (jlb) obj;
        return jl40.l(this.a, jlbVar.a) && jl40.l(this.b, jlbVar.b) && jl40.l(this.c, jlbVar.c) && this.d.equals(jlbVar.d);
    }

    @Override // defpackage.plb
    public final snb getAnalytics() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckoutStatusError(tripId=", this.a, ", orderId=", this.b, ", requestId=");
        v.append(this.c);
        v.append(", analytics=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
