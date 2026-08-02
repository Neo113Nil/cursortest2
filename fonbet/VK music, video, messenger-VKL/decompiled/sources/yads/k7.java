package yads;

import xsna.efz;

/* loaded from: classes10.dex */
public final class k7 {
    public final t13 a;
    public final v13 b;
    public final long c;

    public k7(t13 t13Var, v13 v13Var, long j) {
        this.a = t13Var;
        this.b = v13Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.a == k7Var.a && this.b == k7Var.b && this.c == k7Var.c;
    }

    public final int hashCode() {
        t13 t13Var = this.a;
        int hashCode = (t13Var == null ? 0 : t13Var.hashCode()) * 31;
        v13 v13Var = this.b;
        return Long.hashCode(this.c) + ((hashCode + (v13Var != null ? v13Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        t13 t13Var = this.a;
        v13 v13Var = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder("AdPodSkip(transitionStrategy=");
        sb.append(t13Var);
        sb.append(", visibility=");
        sb.append(v13Var);
        sb.append(", delay=");
        return efz.b(j, ")", sb);
    }
}
