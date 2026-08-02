package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class se3 implements Comparable {
    public final int b;
    public final int c;
    public final int d;

    public se3(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(se3 se3Var) {
        int i = this.b;
        int i2 = se3Var.b;
        if (i != i2) {
            return epx.g(i, i2);
        }
        int i3 = this.c;
        int i4 = se3Var.c;
        return i3 != i4 ? epx.g(i3, i4) : epx.g(this.d, se3Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return this.b == se3Var.b && this.c == se3Var.c && this.d == se3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + re3.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }
}
