package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class fmw0 implements lmw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final idj0 e;
    public final List f;
    public final koj0 g;
    public final k1b0 h;
    public final String i;
    public final String j;
    public final String k;
    public final tej0 l;
    public final oej0 m;
    public final String n;
    public final gbj0 o;
    public final boolean p;

    public fmw0(String str, String str2, String str3, String str4, idj0 idj0Var, List list, koj0 koj0Var, k1b0 k1b0Var, String str5, String str6, String str7, tej0 tej0Var, oej0 oej0Var, String str8, gbj0 gbj0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = idj0Var;
        this.f = list;
        this.g = koj0Var;
        this.h = k1b0Var;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = tej0Var;
        this.m = oej0Var;
        this.n = str8;
        this.o = gbj0Var;
        this.p = z;
    }

    @Override // defpackage.lmw0
    public final idj0 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmw0)) {
            return false;
        }
        fmw0 fmw0Var = (fmw0) obj;
        return jl40.l(this.a, fmw0Var.a) && jl40.l(this.b, fmw0Var.b) && jl40.l(this.c, fmw0Var.c) && jl40.l(this.d, fmw0Var.d) && jl40.l(this.e, fmw0Var.e) && jl40.l(this.f, fmw0Var.f) && jl40.l(this.g, fmw0Var.g) && jl40.l(this.h, fmw0Var.h) && jl40.l(this.i, fmw0Var.i) && jl40.l(this.j, fmw0Var.j) && jl40.l(this.k, fmw0Var.k) && jl40.l(this.l, fmw0Var.l) && jl40.l(this.m, fmw0Var.m) && jl40.l(this.n, fmw0Var.n) && jl40.l(this.o, fmw0Var.o) && this.p == fmw0Var.p;
    }

    @Override // defpackage.lmw0
    public final String getDescription() {
        return this.c;
    }

    @Override // defpackage.lmw0
    public final String getLabel() {
        return this.b;
    }

    @Override // defpackage.lmw0
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.lmw0
    public final List h() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        idj0 idj0Var = this.e;
        int hashCode2 = (this.h.hashCode() + ((this.g.hashCode() + unr0.c((hashCode + (idj0Var == null ? 0 : idj0Var.hashCode())) * 31, 31, this.f)) * 31)) * 31;
        String str2 = this.i;
        int b2 = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        int hashCode3 = (b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        tej0 tej0Var = this.l;
        int hashCode4 = (hashCode3 + (tej0Var == null ? 0 : tej0Var.hashCode())) * 31;
        oej0 oej0Var = this.m;
        int hashCode5 = (hashCode4 + (oej0Var == null ? 0 : oej0Var.hashCode())) * 31;
        String str4 = this.n;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        gbj0 gbj0Var = this.o;
        return Boolean.hashCode(this.p) + ((hashCode6 + (gbj0Var != null ? gbj0Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.lmw0
    public final koj0 l() {
        return this.g;
    }

    public final String toString() {
        StringBuilder v = b64.v("BooleanRequirement(name=", this.a, ", label=", this.b, ", description=");
        g8e.D(v, this.c, ", driverName=", this.d, ", badge=");
        v.append(this.e);
        v.append(", restrictedToClasses=");
        v.append(this.f);
        v.append(", images=");
        v.append(this.g);
        v.append(", persistenceType=");
        v.append(this.h);
        v.append(", subLabel=");
        g8e.D(v, this.i, ", unavailableText=", this.j, ", unsetOrderButton=");
        v.append(this.k);
        v.append(", communication=");
        v.append(this.l);
        v.append(", comment=");
        v.append(this.m);
        v.append(", accessibilityAlert=");
        v.append(this.n);
        v.append(", actions=");
        v.append(this.o);
        v.append(", invertedUi=");
        v.append(this.p);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
