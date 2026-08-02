package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nbr0 {
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

    public nbr0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbr0)) {
            return false;
        }
        nbr0 nbr0Var = (nbr0) obj;
        return jl40.l(this.a, nbr0Var.a) && jl40.l(this.b, nbr0Var.b) && jl40.l(this.c, nbr0Var.c) && jl40.l(this.d, nbr0Var.d) && jl40.l(this.e, nbr0Var.e) && jl40.l(this.f, nbr0Var.f) && jl40.l(this.g, nbr0Var.g) && jl40.l(this.h, nbr0Var.h) && jl40.l(this.i, nbr0Var.i) && jl40.l(this.j, nbr0Var.j) && jl40.l(this.k, nbr0Var.k) && jl40.l(this.l, nbr0Var.l) && jl40.l(this.m, nbr0Var.m) && jl40.l(this.n, nbr0Var.n) && jl40.l(this.o, nbr0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("SettingsPageTexts(title=", this.a, ", accountNameInputFieldTitle=", this.b, ", accountNameInputFieldError=");
        g8e.D(v, this.c, ", limitsItemTitle=", this.d, ", limitsItemSubtitle=");
        g8e.D(v, this.e, ", reportsItemTitle=", this.f, ", actionButtonSave=");
        g8e.D(v, this.g, ", actionButtonSaving=", this.h, ", actionButtonSaved=");
        g8e.D(v, this.i, ", removeAccountDialogTitle=", this.j, ", removeAccountDialogBody=");
        g8e.D(v, this.k, ", removeAccountNegativeButton=", this.l, ", removeAccountPositiveButton=");
        g8e.D(v, this.m, ", actionButtonRemoving=", this.n, ", removeAccountSuccessMessage=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }
}
