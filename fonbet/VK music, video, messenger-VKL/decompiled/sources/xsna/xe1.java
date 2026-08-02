package xsna;

import java.util.List;

/* compiled from: AlbumChooseViewState.kt */
/* loaded from: classes7.dex */
public final class xe1 implements lm50 {
    public final boolean b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public xe1(boolean z, boolean z2, List list, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe1)) {
            return false;
        }
        xe1 xe1Var = (xe1) obj;
        return this.b == xe1Var.b && this.c == xe1Var.c && epx.f(this.d, xe1Var.d) && this.e == xe1Var.e && this.f == xe1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(fw3.a(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumChooseViewState(isPaginationEnabled=");
        sb.append(this.b);
        sb.append(", isLoadingVisible=");
        sb.append(this.c);
        sb.append(", albums=");
        mr.c(", hasAnyChanges=", sb, this.d);
        sb.append(this.e);
        sb.append(", isRedesignEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
