package defpackage;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class ppc0 {
    public final int a;
    public final ArrayList b;

    public ppc0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppc0)) {
            return false;
        }
        ppc0 ppc0Var = (ppc0) obj;
        return this.a == ppc0Var.a && this.b.equals(ppc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaquePredicateTree(rootNodeId=");
        sb.append(this.a);
        sb.append(", nodes=");
        return smw0.m(sb, this.b, ')');
    }
}
