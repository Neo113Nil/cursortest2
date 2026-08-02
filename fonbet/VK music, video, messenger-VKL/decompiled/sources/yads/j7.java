package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class j7 {
    public final long a;
    public final k7 b;
    public final l7 c;

    public j7(long j, k7 k7Var, l7 l7Var) {
        this.a = j;
        this.b = k7Var;
        this.c = l7Var;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.a == j7Var.a && epx.f(this.b, j7Var.b) && this.c == j7Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        k7 k7Var = this.b;
        int hashCode2 = (hashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        l7 l7Var = this.c;
        return hashCode2 + (l7Var != null ? l7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.a + ", skip=" + this.b + ", transitionPolicy=" + this.c + ")";
    }
}
