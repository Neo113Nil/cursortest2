package xsna;

import androidx.annotation.Nullable;

/* compiled from: Size.java */
/* loaded from: classes12.dex */
public final class jxj0 {
    public static final jxj0 c = new jxj0(-1, -1);
    public final int a;
    public final int b;

    static {
        new jxj0(0, 0);
        y2r0.L(0);
        y2r0.L(1);
    }

    public jxj0(int i, int i2) {
        fxc0.p((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof jxj0) {
            jxj0 jxj0Var = (jxj0) obj;
            if (this.a == jxj0Var.a && this.b == jxj0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
