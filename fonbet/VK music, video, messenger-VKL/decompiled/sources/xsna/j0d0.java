package xsna;

import xsna.m0d0;

/* compiled from: PrefetchTask.kt */
/* loaded from: classes12.dex */
public final class j0d0 implements Comparable<j0d0> {
    public final m0d0.a b;
    public final int c;
    public final int d;
    public final int e;

    public j0d0(m0d0.a aVar, int i, int i2, int i3) {
        this.b = aVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0d0 j0d0Var) {
        return epx.g(this.d, j0d0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0d0)) {
            return false;
        }
        j0d0 j0d0Var = (j0d0) obj;
        return epx.f(this.b, j0d0Var.b) && this.c == j0d0Var.c && this.d == j0d0Var.d && this.e == j0d0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrefetchTask(callback=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append(", priority=");
        sb.append(this.d);
        sb.append(", generation=");
        return vu5.b(sb, this.e, ')');
    }
}
