package xsna;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public final class ns90 extends jv80 {
    public final y8l b;
    public final String c;

    public ns90(y8l y8lVar, String str) {
        super(str);
        this.b = y8lVar;
        this.c = str;
    }

    @Override // xsna.jv80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns90)) {
            return false;
        }
        ns90 ns90Var = (ns90) obj;
        return epx.f(this.b, ns90Var.b) && epx.f(this.c, ns90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentItem(decorationType=");
        sb.append(this.b);
        sb.append(", key=");
        return ho8.a(sb, this.c, ')');
    }
}
