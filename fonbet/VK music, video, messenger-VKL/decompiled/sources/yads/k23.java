package yads;

import xsna.odj;
import xsna.rzl;

/* loaded from: classes10.dex */
public final class k23 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public k23(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i3 * i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k23)) {
            return false;
        }
        k23 k23Var = (k23) obj;
        return this.a == k23Var.a && this.b == k23Var.b && this.c == k23Var.c && this.d == k23Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + re3.a(this.c, re3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return rzl.a(this.c, this.d, ", height=", ")", odj.a(this.a, this.b, "SmartCenter(x=", ", y=", ", width="));
    }
}
