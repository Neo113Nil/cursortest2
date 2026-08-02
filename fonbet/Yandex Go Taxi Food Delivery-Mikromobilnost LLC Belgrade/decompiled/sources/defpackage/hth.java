package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hth extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jw40 e;

    public hth(String str, String str2, String str3, String str4, jw40 jw40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jw40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hth)) {
            return false;
        }
        hth hthVar = (hth) obj;
        return jl40.l(this.a, hthVar.a) && jl40.l(this.b, hthVar.b) && jl40.l(this.c, hthVar.c) && jl40.l(this.d, hthVar.d) && jl40.l(this.e, hthVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        jw40 jw40Var = this.e;
        return b + (jw40Var == null ? 0 : jw40Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("RoverActionFailed(type=", this.a, ", deliveryId=", this.b, ", requestId=");
        g8e.D(v, this.c, ", action=", this.d, ", dialog=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
