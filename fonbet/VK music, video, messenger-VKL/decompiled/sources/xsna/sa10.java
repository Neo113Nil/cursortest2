package xsna;

import java.util.List;

/* compiled from: MarketPriorityBlockModel.kt */
/* loaded from: classes17.dex */
public final class sa10 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public sa10(List list, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa10)) {
            return false;
        }
        sa10 sa10Var = (sa10) obj;
        return epx.f(this.a, sa10Var.a) && this.b == sa10Var.b && this.c == sa10Var.c && this.d == sa10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceItems(items=");
        mr.c(", isPaginationAvailable=", sb, this.a);
        sb.append(this.b);
        sb.append(", isPaginationShimmer=");
        sb.append(this.c);
        sb.append(", isPaginationError=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
