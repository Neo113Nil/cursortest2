package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kud0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final xfb0 i;
    public final boolean j;
    public final xaq0 k;

    public kud0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, xfb0 xfb0Var, boolean z3, xaq0 xaq0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = xfb0Var;
        this.j = z3;
        this.k = xaq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kud0)) {
            return false;
        }
        kud0 kud0Var = (kud0) obj;
        return this.a.equals(kud0Var.a) && this.b.equals(kud0Var.b) && this.c.equals(kud0Var.c) && this.d.equals(kud0Var.d) && this.e.equals(kud0Var.e) && this.f.equals(kud0Var.f) && this.g == kud0Var.g && this.h == kud0Var.h && this.i.equals(kud0Var.i) && this.j == kud0Var.j && jl40.l(this.k, kud0Var.k);
    }

    public final int hashCode() {
        int e = unr0.e((this.i.hashCode() + unr0.e(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
        xaq0 xaq0Var = this.k;
        return e + (xaq0Var == null ? 0 : xaq0Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("PointConfig(porch=", this.a, ", apartment=", this.b, ", floor=");
        g8e.D(v, this.c, ", doorphone=", this.d, ", comment=");
        g8e.D(v, this.e, ", contact=", this.f, ", shouldHidePhoneSelection=");
        nnm.v(", shouldHideDetailsScreen=", ", phoneSelectionScreenConfig=", v, this.g, this.h);
        v.append(this.i);
        v.append(", isContactBoundToPoint=");
        v.append(this.j);
        v.append(", selectContactButtonConfig=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
