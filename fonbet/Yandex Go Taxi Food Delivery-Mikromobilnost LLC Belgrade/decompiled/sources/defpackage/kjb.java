package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjb {
    public final String a;
    public final List b;
    public final List c;

    public kjb(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjb)) {
            return false;
        }
        kjb kjbVar = (kjb) obj;
        return jl40.l(this.a, kjbVar.a) && jl40.l(this.b, kjbVar.b) && this.c.equals(kjbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsGroup(title=");
        sb.append(this.a);
        sb.append(", paymentMethods=");
        sb.append(this.b);
        sb.append(", paymentPromos=");
        return unr0.t(sb, this.c, ')');
    }
}
