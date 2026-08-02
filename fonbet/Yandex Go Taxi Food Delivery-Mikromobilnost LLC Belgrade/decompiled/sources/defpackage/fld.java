package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fld {
    public final String a;
    public final List b;
    public final List c;

    public fld(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fld)) {
            return false;
        }
        fld fldVar = (fld) obj;
        return this.a.equals(fldVar.a) && this.b.equals(fldVar.b) && this.c.equals(fldVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsGroup(title=");
        sb.append(this.a);
        sb.append(", ids=");
        sb.append(this.b);
        sb.append(", paymentPromos=");
        return unr0.t(sb, this.c, ')');
    }
}
