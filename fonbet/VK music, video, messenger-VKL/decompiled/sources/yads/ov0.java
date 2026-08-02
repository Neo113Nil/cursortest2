package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class ov0 implements e13 {
    public final d13 a;
    public final fn b;
    public final int c;
    public final int d;
    public final String e;

    public ov0(int i, int i2, d13 d13Var, fn fnVar) {
        this.a = d13Var;
        this.b = fnVar;
        this.c = (i >= 0 || -1 == i) ? i : 0;
        this.d = (i2 >= 0 || -2 == i2) ? i2 : 0;
        this.e = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
    }

    @Override // yads.e13
    public final int a(Context context) {
        int i = this.d;
        return -2 == i ? om3.b(context) : i;
    }

    @Override // yads.e13
    public final d13 b() {
        return this.a;
    }

    @Override // yads.e13
    public final int c(Context context) {
        int i = this.c;
        return -1 == i ? om3.d(context) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ov0.class.equals(obj.getClass())) {
            ov0 ov0Var = (ov0) obj;
            if (this.c == ov0Var.c && this.d == ov0Var.d && this.a == ov0Var.a) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.e13
    public final int getHeight() {
        return this.d;
    }

    @Override // yads.e13
    public final int getWidth() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + k4.a(this.e, ((this.c * 31) + this.d) * 31, 31);
    }

    public final String toString() {
        return this.e;
    }

    @Override // yads.e13
    public final fn a() {
        return this.b;
    }
}
