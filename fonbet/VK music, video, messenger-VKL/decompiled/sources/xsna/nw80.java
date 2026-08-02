package xsna;

/* compiled from: OrderListViewState.kt */
/* loaded from: classes18.dex */
public final class nw80 implements lm50 {
    public final c3p0 b;
    public final com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a c;

    public nw80(c3p0 c3p0Var, com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a aVar) {
        this.b = c3p0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw80)) {
            return false;
        }
        nw80 nw80Var = (nw80) obj;
        return epx.f(this.b, nw80Var.b) && epx.f(this.c, nw80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "OrderListViewState(toolbar=" + this.b + ", content=" + this.c + ')';
    }
}
