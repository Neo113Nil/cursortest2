package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fk8 {
    public final List a;
    public final List b;
    public final int c;
    public final List d;

    public fk8(int i, List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk8)) {
            return false;
        }
        fk8 fk8Var = (fk8) obj;
        return this.a.equals(fk8Var.a) && jl40.l(this.b, fk8Var.b) && this.c == fk8Var.c && jl40.l(this.d, fk8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = qv10.v("CardNetworkPattern(intervals=", this.a, ", validLengths=", this.b, ", cvvLength=");
        v.append(this.c);
        v.append(", spaceIndexes=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
