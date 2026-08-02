package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c37 {
    public final String a;
    public final String b;
    public final hhg c;
    public final boolean d;
    public final String e;

    public c37(String str, String str2, hhg hhgVar, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = hhgVar;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c37)) {
            return false;
        }
        c37 c37Var = (c37) obj;
        return jl40.l(this.a, c37Var.a) && jl40.l(this.b, c37Var.b) && jl40.l(this.c, c37Var.c) && this.d == c37Var.d && jl40.l(this.e, c37Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        String str2 = this.e;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ButtonState(title=", this.a, ", subtitle=", this.b, ", action=");
        v.append(this.c);
        v.append(", highlighted=");
        v.append(this.d);
        v.append(", metricaLabel=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
