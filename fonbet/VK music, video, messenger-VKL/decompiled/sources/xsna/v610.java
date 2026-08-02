package xsna;

import java.util.ArrayList;

/* compiled from: MarketLinkedContentPatch.kt */
/* loaded from: classes18.dex */
public final class v610 implements u610 {
    public final ArrayList a;
    public final int b;

    public v610(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v610)) {
            return false;
        }
        v610 v610Var = (v610) obj;
        return this.a.equals(v610Var.a) && this.b == v610Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataLoaded(data=");
        sb.append(this.a);
        sb.append(", totalCount=");
        return vu5.b(sb, this.b, ')');
    }
}
