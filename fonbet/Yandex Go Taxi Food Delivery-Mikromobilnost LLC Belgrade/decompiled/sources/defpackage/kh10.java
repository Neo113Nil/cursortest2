package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kh10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    public kh10(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        this.q = str17;
        this.r = str18;
        this.s = str19;
        this.t = str20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh10)) {
            return false;
        }
        kh10 kh10Var = (kh10) obj;
        return jl40.l(this.a, kh10Var.a) && jl40.l(this.b, kh10Var.b) && jl40.l(this.c, kh10Var.c) && jl40.l(this.d, kh10Var.d) && jl40.l(this.e, kh10Var.e) && jl40.l(this.f, kh10Var.f) && jl40.l(this.g, kh10Var.g) && jl40.l(this.h, kh10Var.h) && jl40.l(this.i, kh10Var.i) && jl40.l(this.j, kh10Var.j) && jl40.l(this.k, kh10Var.k) && jl40.l(this.l, kh10Var.l) && jl40.l(this.m, kh10Var.m) && jl40.l(this.n, kh10Var.n) && jl40.l(this.o, kh10Var.o) && jl40.l(this.p, kh10Var.p) && jl40.l(this.q, kh10Var.q) && jl40.l(this.r, kh10Var.r) && jl40.l(this.s, kh10Var.s) && jl40.l(this.t, kh10Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder v = b64.v("MemberDetailsPageTexts(title=", this.a, ", nameInputTitle=", this.b, ", nameInputError=");
        g8e.D(v, this.c, ", phoneInputTitle=", this.d, ", phoneInputError=");
        g8e.D(v, this.e, ", limitsMemberTitle=", this.f, ", limitsMemberSubtitle=");
        g8e.D(v, this.g, ", memberLimitInputTitle=", this.h, ", memberLimitInputError=");
        g8e.D(v, this.i, ", openContactsTitle=", this.j, ", actionButtonSave=");
        g8e.D(v, this.k, ", actionButtonSaved=", this.l, ", actionButtonSaving=");
        g8e.D(v, this.m, ", actionButtonRemoving=", this.n, ", removeMemberDialogTitle=");
        g8e.D(v, this.o, ", removeMemberDialogDescription=", this.p, ", removeMemberDialogKeep=");
        g8e.D(v, this.q, ", removeMemberDialogRemove=", this.r, ", unregisteredPhoneDialogShare=");
        return g8e.r(v, this.s, ", unregisteredPhoneDialogClose=", this.t, Extension.C_BRAKE);
    }
}
