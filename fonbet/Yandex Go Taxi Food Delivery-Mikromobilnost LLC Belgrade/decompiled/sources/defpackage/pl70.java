package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pl70 {
    public final String a;
    public final String b;
    public final Integer c;
    public final kdc d;
    public final kdc e;
    public final qj70 f;

    public pl70(String str, String str2, Integer num, kdc kdcVar, kdc kdcVar2, qj70 qj70Var) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = kdcVar;
        this.e = kdcVar2;
        this.f = qj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl70)) {
            return false;
        }
        pl70 pl70Var = (pl70) obj;
        return jl40.l(this.a, pl70Var.a) && jl40.l(this.b, pl70Var.b) && jl40.l(this.c, pl70Var.c) && jl40.l(this.d, pl70Var.d) && jl40.l(this.e, pl70Var.e) && jl40.l(this.f, pl70Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        kdc kdcVar = this.d;
        int hashCode4 = (hashCode3 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.e;
        return this.f.hashCode() + ((hashCode4 + (kdcVar2 != null ? kdcVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(title=", this.a, ", subtitle=", this.b, ", backgroundColor=");
        v.append(this.c);
        v.append(", titleColor=");
        v.append(this.d);
        v.append(", subtitleColor=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public pl70() {
        this("", null, null, null, null, pj70.a);
    }
}
