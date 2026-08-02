package xsna;

import java.util.List;

/* compiled from: ProductsManagementBannerState.kt */
/* loaded from: classes18.dex */
public final class vsd0 {
    public final String a;
    public final String b;
    public final List<usd0> c;

    public vsd0(String str, String str2, List<usd0> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsd0)) {
            return false;
        }
        vsd0 vsd0Var = (vsd0) obj;
        return epx.f(this.a, vsd0Var.a) && epx.f(this.b, vsd0Var.b) && epx.f(this.c, vsd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsManagementModal(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actions=");
        return ms9.a(')', sb, this.c);
    }
}
