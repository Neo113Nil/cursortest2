package defpackage;

/* loaded from: classes2.dex */
public final class ks60 {
    public final Object a;
    public final js60 b;
    public final int c;

    public ks60(Object obj, js60 js60Var, int i) {
        this.a = obj;
        this.b = js60Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks60)) {
            return false;
        }
        ks60 ks60Var = (ks60) obj;
        return this.a.equals(ks60Var.a) && this.b.equals(ks60Var.b) && this.c == ks60Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferIntroPlan(period=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", repetitionCount=");
        return oyr.s(sb, this.c, ')');
    }
}
