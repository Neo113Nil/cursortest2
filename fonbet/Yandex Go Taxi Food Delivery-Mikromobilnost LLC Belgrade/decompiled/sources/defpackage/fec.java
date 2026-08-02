package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fec {
    public final double a;
    public final hec b;
    public final iec c;
    public final ArrayList d;

    public fec(double d, hec hecVar, iec iecVar, ArrayList arrayList) {
        this.a = d;
        this.b = hecVar;
        this.c = iecVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fec)) {
            return false;
        }
        fec fecVar = (fec) obj;
        return Double.compare(this.a, fecVar.a) == 0 && this.b.equals(fecVar.b) && this.c.equals(fecVar.c) && this.d.equals(fecVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckoutRadialGradientColor(angle=");
        sb.append(this.a);
        sb.append(", relativeCenter=");
        sb.append(this.b);
        sb.append(", relativeRadius=");
        sb.append(this.c);
        sb.append(", colors=");
        return smw0.m(sb, this.d, ')');
    }
}
