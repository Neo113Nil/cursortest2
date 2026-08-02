package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a9u0 {
    public final String a;
    public final String b;
    public final rr51 c;
    public final String d;

    public a9u0(String str, String str2, rr51 rr51Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = rr51Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9u0)) {
            return false;
        }
        a9u0 a9u0Var = (a9u0) obj;
        return jl40.l(this.a, a9u0Var.a) && jl40.l(this.b, a9u0Var.b) && jl40.l(this.c, a9u0Var.c) && jl40.l(this.d, a9u0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rr51 rr51Var = this.c;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("StatusScreenDataEntity(title=", this.a, ", subtitle=", this.b, ", bottomDivKitData=");
        v.append(this.c);
        v.append(", closeAction=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
