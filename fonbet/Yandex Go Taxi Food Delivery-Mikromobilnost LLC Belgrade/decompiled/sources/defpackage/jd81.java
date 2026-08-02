package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import yads.cy2;

/* loaded from: classes7.dex */
public final class jd81 implements a271 {
    public final cy2 a;
    public final int b;
    public final int c;
    public final String d;

    public jd81(int i, int i2, cy2 cy2Var) {
        this.a = cy2Var;
        this.b = (i >= 0 || -1 == i) ? i : 0;
        this.c = (i2 >= 0 || -2 == i2) ? i2 : 0;
        this.d = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
    }

    public final int a(Context context) {
        int i = this.c;
        return -2 == i ? sj71.d(context) : i;
    }

    public final int b(Context context) {
        int i = this.b;
        return -1 == i ? sj71.g(context) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jd81.class.equals(obj.getClass())) {
            jd81 jd81Var = (jd81) obj;
            if (this.b == jd81Var.b && this.c == jd81Var.c && this.a == jd81Var.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + z2a1.a(((this.b * 31) + this.c) * 31, this.d);
    }

    public final String toString() {
        return this.d;
    }
}
