package yads;

import android.util.Pair;

/* loaded from: classes10.dex */
public abstract class e extends w73 {
    public final int c;
    public final wz2 d;
    public final boolean e = false;

    public e(wz2 wz2Var) {
        this.d = wz2Var;
        this.c = wz2Var.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // yads.w73
    public final int a(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        int i = 0;
        if (this.e) {
            z = false;
        }
        if (z) {
            int[] iArr = this.d.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            yg2 yg2Var = (yg2) this;
            if (!yg2Var.j[i].c()) {
                return yg2Var.j[i].a(z) + yg2Var.i[i];
            }
            i = a(z, i);
        } while (i != -1);
        return -1;
    }

    @Override // yads.w73
    public final int b(boolean z) {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        if (z) {
            int[] iArr = this.d.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            yg2 yg2Var = (yg2) this;
            if (!yg2Var.j[i].c()) {
                return yg2Var.j[i].b(z) + yg2Var.i[i];
            }
            i = b(z, i);
        } while (i != -1);
        return -1;
    }

    @Override // yads.w73
    public final int a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        yg2 yg2Var = (yg2) this;
        Integer num = (Integer) yg2Var.l.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (a = yg2Var.j[intValue].a(obj3)) == -1) {
            return -1;
        }
        return yg2Var.h[intValue] + a;
    }

    public final int b(boolean z, int i) {
        if (z) {
            wz2 wz2Var = this.d;
            int i2 = wz2Var.c[i] - 1;
            if (i2 >= 0) {
                return wz2Var.b[i2];
            }
        } else if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // yads.w73
    public final int b(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        yg2 yg2Var = (yg2) this;
        int a = mc3.a(yg2Var.i, i + 1, false, false);
        int i3 = yg2Var.i[a];
        int b = yg2Var.j[a].b(i - i3, i2 != 2 ? i2 : 0, z);
        if (b != -1) {
            return i3 + b;
        }
        int b2 = b(z, a);
        while (b2 != -1 && yg2Var.j[b2].c()) {
            b2 = b(z, b2);
        }
        if (b2 != -1) {
            return yg2Var.j[b2].b(z) + yg2Var.i[b2];
        }
        if (i2 == 2) {
            return b(z);
        }
        return -1;
    }

    public final int a(boolean z, int i) {
        if (z) {
            wz2 wz2Var = this.d;
            int i2 = wz2Var.c[i] + 1;
            int[] iArr = wz2Var.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }
        if (i < this.c - 1) {
            return i + 1;
        }
        return -1;
    }

    @Override // yads.w73
    public final int a(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        yg2 yg2Var = (yg2) this;
        int a = mc3.a(yg2Var.i, i + 1, false, false);
        int i3 = yg2Var.i[a];
        int a2 = yg2Var.j[a].a(i - i3, i2 != 2 ? i2 : 0, z);
        if (a2 != -1) {
            return i3 + a2;
        }
        int a3 = a(z, a);
        while (a3 != -1 && yg2Var.j[a3].c()) {
            a3 = a(z, a3);
        }
        if (a3 != -1) {
            return yg2Var.j[a3].a(z) + yg2Var.i[a3];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        yg2 yg2Var = (yg2) this;
        int a = mc3.a(yg2Var.h, i + 1, false, false);
        int i2 = yg2Var.i[a];
        yg2Var.j[a].a(i - yg2Var.h[a], t73Var, z);
        t73Var.d += i2;
        if (z) {
            Object obj = yg2Var.k[a];
            Object obj2 = t73Var.c;
            obj2.getClass();
            t73Var.c = Pair.create(obj, obj2);
        }
        return t73Var;
    }

    @Override // yads.w73
    public final t73 a(Object obj, t73 t73Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        yg2 yg2Var = (yg2) this;
        Integer num = (Integer) yg2Var.l.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = yg2Var.i[intValue];
        yg2Var.j[intValue].a(obj3, t73Var);
        t73Var.d += i;
        t73Var.c = obj;
        return t73Var;
    }

    @Override // yads.w73
    public final Object a(int i) {
        yg2 yg2Var = (yg2) this;
        int a = mc3.a(yg2Var.h, i + 1, false, false);
        return Pair.create(yg2Var.k[a], yg2Var.j[a].a(i - yg2Var.h[a]));
    }

    @Override // yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        yg2 yg2Var = (yg2) this;
        int a = mc3.a(yg2Var.i, i + 1, false, false);
        int i2 = yg2Var.i[a];
        int i3 = yg2Var.h[a];
        yg2Var.j[a].a(i - i2, v73Var, j);
        Object obj = yg2Var.k[a];
        if (!v73.s.equals(v73Var.b)) {
            obj = Pair.create(obj, v73Var.b);
        }
        v73Var.b = obj;
        v73Var.p += i3;
        v73Var.q += i3;
        return v73Var;
    }
}
