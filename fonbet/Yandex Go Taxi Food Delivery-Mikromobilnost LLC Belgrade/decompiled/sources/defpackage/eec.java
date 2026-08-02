package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class eec {
    public final double a;
    public final ArrayList b;

    public eec(double d, ArrayList arrayList) {
        this.a = d;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eec)) {
            return false;
        }
        eec eecVar = (eec) obj;
        return Double.compare(this.a, eecVar.a) == 0 && this.b.equals(eecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckoutLinearGradientColor(angle=");
        sb.append(this.a);
        sb.append(", colors=");
        return smw0.m(sb, this.b, ')');
    }
}
