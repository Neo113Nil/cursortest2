package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cth extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final jw40 d;

    public cth(String str, String str2, String str3, jw40 jw40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jw40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cth)) {
            return false;
        }
        cth cthVar = (cth) obj;
        return jl40.l(this.a, cthVar.a) && jl40.l(this.b, cthVar.b) && jl40.l(this.c, cthVar.c) && jl40.l(this.d, cthVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jw40 jw40Var = this.d;
        return b + (jw40Var == null ? 0 : jw40Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderEditSubmitted(type=", this.a, ", requestId=", this.b, ", deliveryId=");
        v.append(this.c);
        v.append(", dialog=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
