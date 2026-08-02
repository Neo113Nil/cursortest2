package xsna;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class adp0 {
    public final int a;
    public final m6d0 b;
    public final boolean c;
    public final String d;

    public adp0(int i, m6d0 m6d0Var, boolean z, String str) {
        this.a = i;
        this.b = m6d0Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adp0)) {
            return false;
        }
        adp0 adp0Var = (adp0) obj;
        return this.a == adp0Var.a && epx.f(this.b, adp0Var.b) && this.c == adp0Var.c && epx.f(this.d, adp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalCartSummary(totalItemsCount=");
        sb.append(this.a);
        sb.append(", totalPrice=");
        sb.append(this.b);
        sb.append(", isMinPriceReached=");
        sb.append(this.c);
        sb.append(", minPriceNotReachedText=");
        return ho8.a(sb, this.d, ')');
    }
}
