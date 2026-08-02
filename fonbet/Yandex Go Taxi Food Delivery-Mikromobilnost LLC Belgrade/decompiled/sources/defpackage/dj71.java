package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class dj71 {
    public final vc71 a;
    public final vc71 b;
    public final boolean c;
    public final String d;

    public dj71(vc71 vc71Var, vc71 vc71Var2, boolean z, String str) {
        this.a = vc71Var;
        this.b = vc71Var2;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj71)) {
            return false;
        }
        dj71 dj71Var = (dj71) obj;
        return jl40.l(this.a, dj71Var.a) && jl40.l(this.b, dj71Var.b) && this.c == dj71Var.c && jl40.l(this.d, dj71Var.d);
    }

    public final int hashCode() {
        vc71 vc71Var = this.a;
        int hashCode = (vc71Var == null ? 0 : vc71Var.hashCode()) * 31;
        vc71 vc71Var2 = this.b;
        int e = unr0.e((hashCode + (vc71Var2 == null ? 0 : vc71Var2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisingInfoHolder(gmsAdvertisingInfo=");
        sb.append(this.a);
        sb.append(", hmsAdvertisingInfo=");
        sb.append(this.b);
        sb.append(", gmsAdvertisingReset=");
        return n.m(", appSetId=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
