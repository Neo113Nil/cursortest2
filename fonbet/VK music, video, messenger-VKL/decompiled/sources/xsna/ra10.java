package xsna;

import java.util.ArrayList;

/* compiled from: MarketPriorityBlockModel.kt */
/* loaded from: classes17.dex */
public final class ra10 {
    public final ArrayList a;
    public final ArrayList b;
    public final boolean c;
    public final boolean d;

    public ra10(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra10)) {
            return false;
        }
        ra10 ra10Var = (ra10) obj;
        return this.a.equals(ra10Var.a) && this.b.equals(ra10Var.b) && this.c == ra10Var.c && this.d == ra10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodItems(items=");
        kr.d(this.a, sb, ", albums=");
        kr.d(this.b, sb, ", isPaginationShimmer=");
        sb.append(this.c);
        sb.append(", isPaginationError=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
