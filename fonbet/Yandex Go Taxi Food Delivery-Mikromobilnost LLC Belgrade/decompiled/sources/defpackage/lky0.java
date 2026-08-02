package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lky0 implements qge {
    public static final lky0 q = new lky0(null, false, "", "", false, null, 0, 0, null, false, null, false, false, false, false, false);
    public final Drawable a;
    public final boolean b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final pky0 f;
    public final int g;
    public final int h;
    public final kky0 i;
    public final boolean j;
    public final kdc k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public lky0(Drawable drawable, boolean z, CharSequence charSequence, CharSequence charSequence2, boolean z2, pky0 pky0Var, int i, int i2, kky0 kky0Var, boolean z3, kdc kdcVar, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = drawable;
        this.b = z;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z2;
        this.f = pky0Var;
        this.g = i;
        this.h = i2;
        this.i = kky0Var;
        this.j = z3;
        this.k = kdcVar;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lky0)) {
            return false;
        }
        lky0 lky0Var = (lky0) obj;
        return jl40.l(this.a, lky0Var.a) && this.b == lky0Var.b && jl40.l(this.c, lky0Var.c) && jl40.l(this.d, lky0Var.d) && this.e == lky0Var.e && jl40.l(this.f, lky0Var.f) && this.g == lky0Var.g && this.h == lky0Var.h && jl40.l(this.i, lky0Var.i) && this.j == lky0Var.j && jl40.l(this.k, lky0Var.k) && this.l == lky0Var.l && this.m == lky0Var.m && this.n == lky0Var.n && this.o == lky0Var.o && this.p == lky0Var.p;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int e = unr0.e(smw0.b(smw0.b(unr0.e((drawable == null ? 0 : drawable.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        pky0 pky0Var = this.f;
        int b = oyr.b(this.h, oyr.b(this.g, (e + (pky0Var == null ? 0 : pky0Var.hashCode())) * 31, 31), 31);
        kky0 kky0Var = this.i;
        int e2 = unr0.e((b + (kky0Var == null ? 0 : kky0Var.hashCode())) * 31, 31, this.j);
        kdc kdcVar = this.k;
        return Boolean.hashCode(this.p) + unr0.e(unr0.e(unr0.e(unr0.e((e2 + (kdcVar != null ? kdcVar.hashCode() : 0)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextBlockItem(icon=");
        sb.append(this.a);
        sb.append(", rotateIcon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", withDivider=");
        sb.append(this.e);
        sb.append(", trail=");
        sb.append(this.f);
        sb.append(", minHeight=");
        vfc.u(this.g, this.h, ", verticalSpace=", ", action=", sb);
        sb.append(this.i);
        sb.append(", hasChevron=");
        sb.append(this.j);
        sb.append(", backgroundColor=");
        sb.append(this.k);
        sb.append(", isFirst=");
        sb.append(this.l);
        sb.append(", isLast=");
        nnm.v(", hasTopPadding=", ", hasBottomPadding=", sb, this.m, this.n);
        return smw0.k(", isHeader=", Extension.C_BRAKE, sb, this.o, this.p);
    }
}
