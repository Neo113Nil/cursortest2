package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class apj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final tlx0 f;
    public final boolean g;
    public final idj0 h;
    public final zoj0 i;
    public final String j;
    public final gmw0 k;
    public final Boolean l;
    public final List m;
    public final boolean n;

    public apj0(String str, String str2, String str3, String str4, boolean z, tlx0 tlx0Var, boolean z2, idj0 idj0Var, zoj0 zoj0Var, String str5, gmw0 gmw0Var, Boolean bool, List list, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = tlx0Var;
        this.g = z2;
        this.h = idj0Var;
        this.i = zoj0Var;
        this.j = str5;
        this.k = gmw0Var;
        this.l = bool;
        this.m = list;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apj0)) {
            return false;
        }
        apj0 apj0Var = (apj0) obj;
        return jl40.l(this.a, apj0Var.a) && jl40.l(this.b, apj0Var.b) && this.c.equals(apj0Var.c) && jl40.l(this.d, apj0Var.d) && this.e == apj0Var.e && jl40.l(this.f, apj0Var.f) && this.g == apj0Var.g && jl40.l(this.h, apj0Var.h) && this.i.equals(apj0Var.i) && jl40.l(this.j, apj0Var.j) && jl40.l(this.k, apj0Var.k) && this.l.equals(apj0Var.l) && jl40.l(this.m, apj0Var.m) && this.n == apj0Var.n;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        tlx0 tlx0Var = this.f;
        int e2 = unr0.e((e + (tlx0Var == null ? 0 : tlx0Var.hashCode())) * 31, 31, this.g);
        idj0 idj0Var = this.h;
        int hashCode = (this.i.hashCode() + ((e2 + (idj0Var == null ? 0 : idj0Var.hashCode())) * 31)) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gmw0 gmw0Var = this.k;
        int hashCode3 = (this.l.hashCode() + ((hashCode2 + (gmw0Var == null ? 0 : gmw0Var.hashCode())) * 31)) * 31;
        List list = this.m;
        return Boolean.hashCode(this.n) + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementsListItem(name=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", isSelected=");
        v.append(this.e);
        v.append(", tariffRedirect=");
        v.append(this.f);
        v.append(", groupOpen=");
        v.append(this.g);
        v.append(", badge=");
        v.append(this.h);
        v.append(", trail=");
        v.append(this.i);
        v.append(", optionBigImageUrl=");
        v.append(this.j);
        v.append(", compoundSelectRequirement=");
        v.append(this.k);
        v.append(", isAvailable=");
        v.append(this.l);
        v.append(", optionsNames=");
        v.append(this.m);
        v.append(", isGlued=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
