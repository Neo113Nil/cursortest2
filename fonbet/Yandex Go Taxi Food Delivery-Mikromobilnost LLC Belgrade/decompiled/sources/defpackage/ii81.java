package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ii81 extends yn81 {
    public static final /* synthetic */ int E = 0;
    public final int[] A;
    public final yn81[] B;
    public final Object[] C;
    public final HashMap D;
    public final int a;
    public final zj61 w;
    public final int x;
    public final int y;
    public final int[] z;

    public ii81(ArrayList arrayList, zj61 zj61Var) {
        this.w = zj61Var;
        this.a = zj61Var.b.length;
        int size = arrayList.size();
        this.z = new int[size];
        this.A = new int[size];
        this.B = new yn81[size];
        this.C = new Object[size];
        this.D = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            xi81 xi81Var = (xi81) it.next();
            this.B[i3] = xi81Var.b();
            this.A[i3] = i;
            this.z[i3] = i2;
            i += this.B[i3].b();
            i2 += this.B[i3].a();
            this.C[i3] = xi81Var.a();
            this.D.put(this.C[i3], Integer.valueOf(i3));
            i3++;
        }
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.yn81
    public final int a(int i, int i2) {
        int[] iArr = this.A;
        int e = rf71.e(iArr, i + 1, false, false);
        int i3 = iArr[e];
        yn81[] yn81VarArr = this.B;
        int a = yn81VarArr[e].a(i - i3, i2 == 2 ? 0 : i2);
        if (a != -1) {
            return i3 + a;
        }
        int e2 = e(false, e);
        while (e2 != -1 && yn81VarArr[e2].c()) {
            e2 = e(false, e2);
        }
        if (e2 != -1) {
            return yn81VarArr[e2].b(false) + iArr[e2];
        }
        if (i2 == 2) {
            return b(false);
        }
        return -1;
    }

    @Override // defpackage.yn81
    public final int b(boolean z) {
        int i;
        int i2 = this.a;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.w.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            yn81[] yn81VarArr = this.B;
            if (!yn81VarArr[i].c()) {
                return yn81VarArr[i].b(z) + this.A[i];
            }
            i = e(z, i);
        } while (i != -1);
        return -1;
    }

    public final int d(boolean z, int i) {
        if (!z) {
            if (i < this.a - 1) {
                return i + 1;
            }
            return -1;
        }
        zj61 zj61Var = this.w;
        int i2 = zj61Var.c[i] + 1;
        int[] iArr = zj61Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int e(boolean z, int i) {
        if (z) {
            zj61 zj61Var = this.w;
            int i2 = zj61Var.c[i] - 1;
            if (i2 >= 0) {
                return zj61Var.b[i2];
            }
        } else if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // defpackage.yn81
    public final int b() {
        return this.x;
    }

    @Override // defpackage.yn81
    public final ie81 a(Object obj, ie81 ie81Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.D.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.A[intValue];
        this.B[intValue].a(obj3, ie81Var);
        ie81Var.c += i;
        ie81Var.b = obj;
        return ie81Var;
    }

    @Override // defpackage.yn81
    public final int a(int i, int i2, boolean z) {
        int[] iArr = this.A;
        int e = rf71.e(iArr, i + 1, false, false);
        int i3 = iArr[e];
        yn81[] yn81VarArr = this.B;
        int a = yn81VarArr[e].a(i - i3, i2 != 2 ? i2 : 0, z);
        if (a != -1) {
            return i3 + a;
        }
        int d = d(z, e);
        while (d != -1 && yn81VarArr[d].c()) {
            d = d(z, d);
        }
        if (d != -1) {
            return yn81VarArr[d].a(z) + iArr[d];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.yn81
    public final int a() {
        return this.y;
    }

    @Override // defpackage.yn81
    public final int a(boolean z) {
        if (this.a == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.w.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            yn81[] yn81VarArr = this.B;
            if (yn81VarArr[i].c()) {
                i = d(z, i);
            } else {
                return yn81VarArr[i].a(z) + this.A[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // defpackage.yn81
    public final uk81 a(int i, uk81 uk81Var, long j) {
        int[] iArr = this.A;
        int e = rf71.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = this.z[e];
        this.B[e].a(i - i2, uk81Var, j);
        Object obj = this.C[e];
        Object obj2 = uk81.J;
        Object obj3 = uk81Var.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        uk81Var.a = obj;
        uk81Var.G += i3;
        uk81Var.H += i3;
        return uk81Var;
    }

    @Override // defpackage.yn81
    public final ie81 a(int i, ie81 ie81Var, boolean z) {
        int[] iArr = this.z;
        int e = rf71.e(iArr, i + 1, false, false);
        int i2 = this.A[e];
        this.B[e].a(i - iArr[e], ie81Var, z);
        ie81Var.c += i2;
        if (z) {
            Object obj = this.C[e];
            Object obj2 = ie81Var.b;
            obj2.getClass();
            ie81Var.b = Pair.create(obj, obj2);
        }
        return ie81Var;
    }

    @Override // defpackage.yn81
    public final int a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.D.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (a = this.B[intValue].a(obj3)) == -1) {
            return -1;
        }
        return this.z[intValue] + a;
    }

    @Override // defpackage.yn81
    public final Object a(int i) {
        int[] iArr = this.z;
        int e = rf71.e(iArr, i + 1, false, false);
        return Pair.create(this.C[e], this.B[e].a(i - iArr[e]));
    }
}
