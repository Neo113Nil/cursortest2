package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cpc0 {
    public final String a;
    public final List b;
    public final List c;

    public cpc0(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpc0)) {
            return false;
        }
        cpc0 cpc0Var = (cpc0) obj;
        return this.a.equals(cpc0Var.a) && jl40.l(this.b, cpc0Var.b) && jl40.l(this.c, cpc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InSetPredicate(argName=");
        sb.append(this.a);
        sb.append(", intSet=");
        sb.append(this.b);
        sb.append(", stringSet=");
        return unr0.t(sb, this.c, ')');
    }
}
