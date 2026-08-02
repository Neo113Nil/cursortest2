package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hmw0 extends jmw0 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final idj0 g;
    public final List h;
    public final koj0 i;
    public final vg70 j;
    public final List k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final k1b0 p;
    public final String q;
    public final String r;
    public final fgh s;
    public final String t;
    public final tej0 u;
    public final oej0 v;
    public final String w;
    public final gbj0 x;

    public hmw0(String str, String str2, String str3, String str4, idj0 idj0Var, List list, koj0 koj0Var, vg70 vg70Var, List list2, boolean z, int i, boolean z2, boolean z3, k1b0 k1b0Var, String str5, String str6, fgh fghVar, String str7, tej0 tej0Var, oej0 oej0Var, String str8, gbj0 gbj0Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = idj0Var;
        this.h = list;
        this.i = koj0Var;
        this.j = vg70Var;
        this.k = list2;
        this.l = z;
        this.m = i;
        this.n = z2;
        this.o = z3;
        this.p = k1b0Var;
        this.q = str5;
        this.r = str6;
        this.s = fghVar;
        this.t = str7;
        this.u = tej0Var;
        this.v = oej0Var;
        this.w = str8;
        this.x = gbj0Var;
    }

    public static hmw0 v(hmw0 hmw0Var, List list, vg70 vg70Var, int i, boolean z, boolean z2, k1b0 k1b0Var, String str, String str2, int i2) {
        String str3 = hmw0Var.c;
        String str4 = hmw0Var.d;
        String str5 = hmw0Var.e;
        String str6 = hmw0Var.f;
        idj0 idj0Var = hmw0Var.g;
        List list2 = (i2 & 32) != 0 ? hmw0Var.h : list;
        koj0 koj0Var = hmw0Var.i;
        vg70 vg70Var2 = (i2 & 128) != 0 ? hmw0Var.j : vg70Var;
        List list3 = (i2 & 256) != 0 ? hmw0Var.k : EmptyList.a;
        boolean z3 = hmw0Var.l;
        int i3 = (i2 & 1024) != 0 ? hmw0Var.m : i;
        k1b0 k1b0Var2 = (i2 & 8192) != 0 ? hmw0Var.p : k1b0Var;
        String str7 = hmw0Var.q;
        String str8 = (32768 & i2) != 0 ? hmw0Var.r : str;
        fgh fghVar = hmw0Var.s;
        String str9 = (i2 & 131072) != 0 ? hmw0Var.t : str2;
        tej0 tej0Var = hmw0Var.u;
        oej0 oej0Var = hmw0Var.v;
        String str10 = hmw0Var.w;
        gbj0 gbj0Var = hmw0Var.x;
        hmw0Var.getClass();
        return new hmw0(str3, str4, str5, str6, idj0Var, list2, koj0Var, vg70Var2, list3, z3, i3, z, z2, k1b0Var2, str7, str8, fghVar, str9, tej0Var, oej0Var, str10, gbj0Var);
    }

    @Override // defpackage.lmw0
    public final idj0 a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmw0)) {
            return false;
        }
        hmw0 hmw0Var = (hmw0) obj;
        return jl40.l(this.c, hmw0Var.c) && jl40.l(this.d, hmw0Var.d) && jl40.l(this.e, hmw0Var.e) && jl40.l(this.f, hmw0Var.f) && jl40.l(this.g, hmw0Var.g) && jl40.l(this.h, hmw0Var.h) && jl40.l(this.i, hmw0Var.i) && jl40.l(this.j, hmw0Var.j) && jl40.l(this.k, hmw0Var.k) && this.l == hmw0Var.l && this.m == hmw0Var.m && this.n == hmw0Var.n && this.o == hmw0Var.o && jl40.l(this.p, hmw0Var.p) && jl40.l(this.q, hmw0Var.q) && jl40.l(this.r, hmw0Var.r) && jl40.l(this.s, hmw0Var.s) && jl40.l(this.t, hmw0Var.t) && jl40.l(this.u, hmw0Var.u) && jl40.l(this.v, hmw0Var.v) && jl40.l(this.w, hmw0Var.w) && jl40.l(this.x, hmw0Var.x);
    }

    @Override // defpackage.lmw0
    public final String getDescription() {
        return this.e;
    }

    @Override // defpackage.lmw0
    public final String getLabel() {
        return this.d;
    }

    @Override // defpackage.lmw0
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.lmw0
    public final List h() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        idj0 idj0Var = this.g;
        int hashCode2 = (this.p.hashCode() + unr0.e(unr0.e(oyr.b(this.m, unr0.e(unr0.c((this.j.hashCode() + ((this.i.hashCode() + unr0.c((hashCode + (idj0Var == null ? 0 : idj0Var.hashCode())) * 31, 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o)) * 31;
        String str2 = this.q;
        int b2 = ly3.b(unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.r), 31, this.s.a);
        String str3 = this.t;
        int hashCode3 = (b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        tej0 tej0Var = this.u;
        int hashCode4 = (hashCode3 + (tej0Var == null ? 0 : tej0Var.hashCode())) * 31;
        oej0 oej0Var = this.v;
        int hashCode5 = (hashCode4 + (oej0Var == null ? 0 : oej0Var.hashCode())) * 31;
        String str4 = this.w;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        gbj0 gbj0Var = this.x;
        return hashCode6 + (gbj0Var != null ? gbj0Var.hashCode() : 0);
    }

    @Override // defpackage.lmw0
    public final koj0 l() {
        return this.i;
    }

    @Override // defpackage.jmw0
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.jmw0
    public final boolean n() {
        return this.o;
    }

    @Override // defpackage.jmw0
    public final int o() {
        return this.m;
    }

    @Override // defpackage.jmw0
    public final List r() {
        return this.k;
    }

    @Override // defpackage.jmw0
    public final vg70 s() {
        return this.j;
    }

    public final String toString() {
        StringBuilder v = b64.v("DefaultOptionsRequirement(name=", this.c, ", label=", this.d, ", description=");
        g8e.D(v, this.e, ", driverName=", this.f, ", badge=");
        v.append(this.g);
        v.append(", restrictedToClasses=");
        v.append(this.h);
        v.append(", images=");
        v.append(this.i);
        v.append(", optionsInfo=");
        v.append(this.j);
        v.append(", optionDropSequence=");
        nzs.p(v, this.k, ", isMultiSelect=", this.l, ", maxWeight=");
        tse0.z(v, this.m, ", glued=", this.n, ", gluedOptional=");
        v.append(this.o);
        v.append(", persistenceType=");
        v.append(this.p);
        v.append(", subLabel=");
        g8e.D(v, this.q, ", unavailableText=", this.r, ", defaultOptions=");
        v.append(this.s);
        v.append(", unsetOrderButton=");
        v.append(this.t);
        v.append(", communication=");
        v.append(this.u);
        v.append(", comment=");
        v.append(this.v);
        v.append(", accessibilityAlert=");
        v.append(this.w);
        v.append(", actions=");
        v.append(this.x);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // defpackage.jmw0
    public final boolean u() {
        return this.l;
    }
}
