package xsna;

/* compiled from: SelectionProductListItem.kt */
/* loaded from: classes18.dex */
public final class lei0 implements hfz {
    public final kei0 b;

    public lei0(kei0 kei0Var) {
        this.b = kei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lei0) && epx.f(this.b, ((lei0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        StringBuilder sb = new StringBuilder();
        kei0 kei0Var = this.b;
        sb.append(kei0Var.a.b);
        sb.append('_');
        sb.append(kei0Var.a.c.b);
        return Integer.valueOf(sb.toString().hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectionProductListItem(product=" + this.b + ')';
    }
}
