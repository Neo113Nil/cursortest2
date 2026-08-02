package xsna;

/* compiled from: NonProfitOrganizationContent.kt */
/* loaded from: classes5.dex */
public final class bz20 {
    public final long a;
    public final int b;

    public bz20(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz20)) {
            return false;
        }
        bz20 bz20Var = (bz20) obj;
        return l5g.d(this.a, bz20Var.a) && this.b == bz20Var.b;
    }

    public final int hashCode() {
        int i = l5g.l;
        return ((Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31) - 1894130531;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalConfig(iconColor=");
        dn.h(this.a, ", descriptionResId=", sb);
        return h5s.c(this.b, ", testTag=NonProfitOrganizationIconTag)", sb);
    }
}
