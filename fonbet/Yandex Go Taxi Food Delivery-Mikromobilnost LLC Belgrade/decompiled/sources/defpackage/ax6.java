package defpackage;

/* loaded from: classes13.dex */
public final class ax6 {
    public final c800 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final vw6 h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final String q;
    public final String r;

    public ax6(c800 c800Var, String str, String str2, String str3, String str4, boolean z, dw1 dw1Var, m470 m470Var, String str5, String str6, caj cajVar, boolean z2, vw6 vw6Var) {
        this.a = c800Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = vw6Var;
        this.j = "";
        this.k = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.q = "";
        this.r = "";
        if (z) {
            this.i = true;
            this.j = m470Var.a;
            this.k = m470Var.b;
        } else {
            if (dw1Var != null) {
                String str7 = dw1Var.c;
                String str8 = dw1Var.b;
                String str9 = dw1Var.a;
                if (str9.length() > 0 && str8.length() > 0 && str7.length() > 0) {
                    this.l = true;
                    this.m = str9;
                    this.n = str8;
                    this.o = str7;
                }
            }
            this.l = false;
        }
        if (!z2 && cajVar != null) {
            String str10 = cajVar.b;
            String str11 = cajVar.a;
            if (str11.length() > 0 && str10.length() > 0) {
                this.p = true;
                this.q = str11;
                this.r = str10;
                return;
            }
        }
        this.p = false;
    }
}
