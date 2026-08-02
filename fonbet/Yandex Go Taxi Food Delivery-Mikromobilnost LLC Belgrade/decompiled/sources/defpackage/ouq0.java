package defpackage;

import java.util.AbstractList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ouq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public ouq0(String str, String str2, String str3, String str4, String str5, AbstractList abstractList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = abstractList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouq0)) {
            return false;
        }
        ouq0 ouq0Var = (ouq0) obj;
        return jl40.l(this.a, ouq0Var.a) && jl40.l(this.b, ouq0Var.b) && jl40.l(this.c, ouq0Var.c) && jl40.l(this.d, ouq0Var.d) && jl40.l(this.e, ouq0Var.e) && jl40.l(this.f, ouq0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Service(name=", this.a, ", title=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", copyright=", this.d, ", legalInfo=");
        return tse0.j(this.e, ", links=", Extension.C_BRAKE, v, this.f);
    }
}
