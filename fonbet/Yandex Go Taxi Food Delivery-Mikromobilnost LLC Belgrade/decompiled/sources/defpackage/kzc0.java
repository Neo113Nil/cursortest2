package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class kzc0 extends a9z0 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final las0 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final a9z0[] h;
    public final Object[] i;
    public final HashMap j;

    public kzc0(a9z0[] a9z0VarArr, Object[] objArr, las0 las0Var) {
        this.c = las0Var;
        this.b = ((kas0) las0Var).b.length;
        int length = a9z0VarArr.length;
        this.h = a9z0VarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = a9z0VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            a9z0 a9z0Var = a9z0VarArr[i];
            this.h[i4] = a9z0Var;
            this.g[i4] = i2;
            this.f[i4] = i3;
            i2 += a9z0Var.p();
            i3 += this.h[i4].i();
            this.j.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.a9z0
    public final int a(boolean z) {
        if (this.b != 0) {
            int i = 0;
            if (z) {
                int[] iArr = ((kas0) this.c).b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                a9z0[] a9z0VarArr = this.h;
                if (!a9z0VarArr[i].q()) {
                    return a9z0VarArr[i].a(z) + this.g[i];
                }
                i = r(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final int b(Object obj) {
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b = this.h[intValue].b(obj3)) != -1) {
                return this.f[intValue] + b;
            }
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final int c(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (z) {
                int[] iArr = ((kas0) this.c).b;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                a9z0[] a9z0VarArr = this.h;
                if (!a9z0VarArr[i].q()) {
                    return a9z0VarArr[i].c(z) + this.g[i];
                }
                i = s(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int d = tw21.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        a9z0[] a9z0VarArr = this.h;
        int e = a9z0VarArr[d].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (e != -1) {
            return i3 + e;
        }
        int r = r(d, z);
        while (r != -1 && a9z0VarArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return a9z0VarArr[r].a(z) + iArr[r];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        int[] iArr = this.f;
        int d = tw21.d(iArr, i + 1, false, false);
        int i2 = this.g[d];
        this.h[d].g(i - iArr[d], y8z0Var, z);
        y8z0Var.c += i2;
        if (z) {
            Object obj = this.i[d];
            Object obj2 = y8z0Var.b;
            obj2.getClass();
            y8z0Var.b = Pair.create(obj, obj2);
        }
        return y8z0Var;
    }

    @Override // defpackage.a9z0
    public final y8z0 h(Object obj, y8z0 y8z0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.g[intValue];
        this.h[intValue].h(obj3, y8z0Var);
        y8z0Var.c += i;
        y8z0Var.b = obj;
        return y8z0Var;
    }

    @Override // defpackage.a9z0
    public final int i() {
        return this.e;
    }

    @Override // defpackage.a9z0
    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int d = tw21.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        a9z0[] a9z0VarArr = this.h;
        int l = a9z0VarArr[d].l(i - i3, i2 != 2 ? i2 : 0, z);
        if (l != -1) {
            return i3 + l;
        }
        int s = s(d, z);
        while (s != -1 && a9z0VarArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return a9z0VarArr[s].c(z) + iArr[s];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final Object m(int i) {
        int[] iArr = this.f;
        int d = tw21.d(iArr, i + 1, false, false);
        return Pair.create(this.i[d], this.h[d].m(i - iArr[d]));
    }

    @Override // defpackage.a9z0
    public final z8z0 n(int i, z8z0 z8z0Var, long j) {
        int[] iArr = this.g;
        int d = tw21.d(iArr, i + 1, false, false);
        int i2 = iArr[d];
        int i3 = this.f[d];
        this.h[d].n(i - i2, z8z0Var, j);
        Object obj = this.i[d];
        Object obj2 = z8z0.p;
        Object obj3 = z8z0Var.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        z8z0Var.a = obj;
        z8z0Var.m += i3;
        z8z0Var.n += i3;
        return z8z0Var;
    }

    @Override // defpackage.a9z0
    public final int p() {
        return this.d;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        kas0 kas0Var = (kas0) this.c;
        int i2 = kas0Var.c[i] + 1;
        int[] iArr = kas0Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int s(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        kas0 kas0Var = (kas0) this.c;
        int i2 = kas0Var.c[i] - 1;
        if (i2 >= 0) {
            return kas0Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kzc0(Collection collection, las0 las0Var) {
        this(r0, r1, las0Var);
        a9z0[] a9z0VarArr = new a9z0[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            a9z0VarArr[i2] = ((zf10) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zf10) it2.next()).getUid();
            i++;
        }
    }
}
