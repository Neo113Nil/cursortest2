package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class k2d0 {
    public final String a;
    public final String b;
    public final List c;
    public final Set d;

    public k2d0(String str, String str2, List list, Set set) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2d0)) {
            return false;
        }
        k2d0 k2d0Var = (k2d0) obj;
        return jl40.l(this.a, k2d0Var.a) && jl40.l(this.b, k2d0Var.b) && this.c.equals(k2d0Var.c) && jl40.l(this.d, k2d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusExperiments(testIdsWithBucketNumber=");
        sb.append(this.a);
        sb.append(", triggeredTestIdsWithBucketNumber=");
        sb.append(this.b);
        sb.append(", testIds=");
        sb.append(this.c);
        sb.append(", flags=");
        return qv10.s(sb, this.d, ')');
    }
}
