package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pd9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final lv90 e;
    public final String f;

    public pd9(String str, String str2, String str3, String str4, lv90 lv90Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lv90Var;
        this.f = str5;
    }

    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd9)) {
            return false;
        }
        pd9 pd9Var = (pd9) obj;
        return this.a.equals(pd9Var.a) && jl40.l(this.b, pd9Var.b) && this.c.equals(pd9Var.c) && jl40.l(this.d, pd9Var.d) && jl40.l(this.e, pd9Var.e) && jl40.l(this.f, pd9Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangePaymentModalData(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", targetPayment=");
        v.append(this.e);
        v.append(", experimentId=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
