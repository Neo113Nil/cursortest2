package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dbf0 {
    public final u8j0 a;
    public final boolean b;
    public final boolean c;
    public final e960 d;
    public final boolean e;
    public final List f;
    public final jj11 g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public dbf0(u8j0 u8j0Var, boolean z, boolean z2, y6a1 y6a1Var, e960 e960Var, boolean z3, List list, jj11 jj11Var, List list2, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = u8j0Var;
        this.b = z;
        this.c = z2;
        this.d = e960Var;
        this.e = z3;
        this.f = list;
        this.g = jj11Var;
        this.h = list2;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
    }

    public static dbf0 a(dbf0 dbf0Var, u8j0 u8j0Var, boolean z, boolean z2, y6a1 y6a1Var, e960 e960Var, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        y6a1 y6a1Var2;
        u8j0 u8j0Var2 = (i & 1) != 0 ? dbf0Var.a : u8j0Var;
        boolean z8 = (i & 2) != 0 ? dbf0Var.b : z;
        boolean z9 = (i & 4) != 0 ? dbf0Var.c : z2;
        if ((i & 8) != 0) {
            dbf0Var.getClass();
            y6a1Var2 = null;
        } else {
            y6a1Var2 = y6a1Var;
        }
        return new dbf0(u8j0Var2, z8, z9, y6a1Var2, (i & 16) != 0 ? dbf0Var.d : e960Var, (i & 32) != 0 ? dbf0Var.e : z3, dbf0Var.f, dbf0Var.g, (i & 256) != 0 ? dbf0Var.h : list, (i & 512) != 0 ? dbf0Var.i : z4, (i & 1024) != 0 ? dbf0Var.j : z5, (i & 2048) != 0 ? dbf0Var.k : z6, (i & 4096) != 0 ? dbf0Var.l : z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf0)) {
            return false;
        }
        dbf0 dbf0Var = (dbf0) obj;
        return this.a.equals(dbf0Var.a) && this.b == dbf0Var.b && this.c == dbf0Var.c && jl40.l(null, null) && jl40.l(this.d, dbf0Var.d) && this.e == dbf0Var.e && this.f.equals(dbf0Var.f) && jl40.l(this.g, dbf0Var.g) && jl40.l(this.h, dbf0Var.h) && this.i == dbf0Var.i && this.j == dbf0Var.j && this.k == dbf0Var.k && this.l == dbf0Var.l;
    }

    public final int hashCode() {
        int e = (unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c) + 0) * 31;
        e960 e960Var = this.d;
        int c = unr0.c(unr0.e((e + (e960Var == null ? 0 : e960Var.hashCode())) * 31, 31, this.e), 31, this.f);
        jj11 jj11Var = this.g;
        return Boolean.hashCode(this.l) + unr0.e(unr0.e(unr0.e(unr0.c((c + (jj11Var != null ? jj11Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsState(productsRequest=");
        sb.append(this.a);
        sb.append(", hasFullscreenToShow=");
        sb.append(this.b);
        sb.append(", isBottomSheetShowing=");
        sb.append(this.c);
        sb.append(", defaultPaymentMethod=");
        sb.append((Object) null);
        sb.append(", paymentSessionState=");
        sb.append(this.d);
        sb.append(", isPullRefreshIndicatorShowing=");
        sb.append(this.e);
        sb.append(", bottomBarItems=");
        sb.append(this.f);
        sb.append(", tsarButton=");
        sb.append(this.g);
        sb.append(", tokenizedCards=");
        nzs.p(sb, this.h, ", canShowEducationV2=", this.i, ", isDataStatusAfterLoading=");
        nnm.v(", spoilersVisible=", ", canShowSubtitleShimmerAnimation=", sb, this.j, this.k);
        return x4e.i(sb, this.l, Extension.C_BRAKE);
    }
}
