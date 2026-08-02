package xsna;

import java.util.List;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class ir1 {
    public final List a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ir1(List list, boolean z, int i, boolean z2, boolean z3) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1)) {
            return false;
        }
        ir1 ir1Var = (ir1) obj;
        return epx.f(this.a, ir1Var.a) && this.b == ir1Var.b && this.c == ir1Var.c && this.d == ir1Var.d && this.e == ir1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumsViewState(albums=");
        mr.c(", totalAlbums=", sb, this.a);
        sb.append(this.b);
        sb.append(", showTitle=");
        sb.append(this.c);
        sb.append(", showAllBtn=");
        sb.append(this.d);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
