package defpackage;

import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class ph81 implements kq71 {
    public static final ph81 b;
    public final t31 a;

    static {
        p481 p481Var = t31.b;
        b = new ph81(wk2.x);
    }

    public ph81(t31 t31Var) {
        this.a = t31.m(t31Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            t31 t31Var = this.a;
            if (i2 >= t31Var.size()) {
                return false;
            }
            le81 le81Var = (le81) t31Var.get(i2);
            boolean[] zArr = le81Var.x;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (le81Var.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph81.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ph81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
