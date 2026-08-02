package yads;

import xsna.epx;
import xsna.sl9;

/* loaded from: classes10.dex */
public final class c13 implements Comparable {
    public final int b;
    public final int c;

    public c13(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c13 c13Var = (c13) obj;
        return epx.g(this.b * this.c, c13Var.b * c13Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c13)) {
            return false;
        }
        c13 c13Var = (c13) obj;
        return this.b == c13Var.b && this.c == c13Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return sl9.c(this.b, this.c, "Size(width=", ", height=", ")");
    }
}
