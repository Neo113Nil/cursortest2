package xsna;

import java.util.List;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class nsi0 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public nsi0(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsi0)) {
            return false;
        }
        nsi0 nsi0Var = (nsi0) obj;
        return this.a.equals(nsi0Var.a) && this.b == nsi0Var.b && this.c == nsi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesViewState(sections=");
        mr.c(", hasMore=", sb, this.a);
        sb.append(this.b);
        sb.append(", isListViewType=");
        return n23.b(sb, this.c, ", paginationLoader=false)");
    }
}
