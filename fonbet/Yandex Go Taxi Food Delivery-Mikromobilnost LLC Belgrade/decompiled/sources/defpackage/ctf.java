package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ctf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final kq4 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;

    public ctf(String str, String str2, String str3, String str4, String str5, kq4 kq4Var, String str6, boolean z, String str7, List list, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = kq4Var;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.j = list;
        this.k = str8;
        this.l = str9;
    }

    public static ctf a(ctf ctfVar, String str) {
        return new ctf(ctfVar.a, ctfVar.b, ctfVar.c, ctfVar.d, str, ctfVar.f, ctfVar.g, ctfVar.h, ctfVar.i, ctfVar.j, ctfVar.k, ctfVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctf)) {
            return false;
        }
        ctf ctfVar = (ctf) obj;
        return jl40.l(this.a, ctfVar.a) && jl40.l(this.b, ctfVar.b) && this.c.equals(ctfVar.c) && jl40.l(this.d, ctfVar.d) && this.e.equals(ctfVar.e) && jl40.l(this.f, ctfVar.f) && jl40.l(this.g, ctfVar.g) && this.h == ctfVar.h && jl40.l(this.i, ctfVar.i) && jl40.l(this.j, ctfVar.j) && jl40.l(this.k, ctfVar.k) && jl40.l(this.l, ctfVar.l);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        kq4 kq4Var = this.f;
        int hashCode = (b2 + (kq4Var == null ? 0 : kq4Var.hashCode())) * 31;
        String str2 = this.g;
        int e = unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h);
        String str3 = this.i;
        int hashCode2 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DKPaymentMethod(methodType=", this.a, ", methodBank=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", methodIconUrl=");
        v.append(this.e);
        v.append(", amount=");
        v.append(this.f);
        v.append(", memberId=");
        tse0.y(this.g, ", isFamily=", ", titleTrailingIconUrl=", v, this.h);
        tse0.x(this.i, ", restrictions=", ", errorRespCode=", v, this.j);
        return g8e.r(v, this.k, ", payload=", this.l, Extension.C_BRAKE);
    }
}
