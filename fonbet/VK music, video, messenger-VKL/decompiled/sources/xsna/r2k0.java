package xsna;

import androidx.compose.runtime.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class r2k0 {
    public final v2k0 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final s9x j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public r2k0(v2k0 v2k0Var) {
        this.a = v2k0Var;
        this.b = v2k0Var.b;
        int i = v2k0Var.c;
        this.c = i;
        this.d = v2k0Var.d;
        this.e = v2k0Var.e;
        this.h = i;
        this.i = -1;
        this.j = new s9x();
    }

    public final rgt a(int i) {
        ArrayList<rgt> arrayList = this.a.j;
        int f = x2k0.f(arrayList, i, this.c);
        if (f >= 0) {
            return arrayList.get(f);
        }
        rgt rgtVar = new rgt(i);
        arrayList.add(-(f + 1), rgtVar);
        return rgtVar;
    }

    public final Object b(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return a.C0011a.a;
    }

    public final void c() {
        this.f = true;
        v2k0 v2k0Var = this.a;
        v2k0Var.getClass();
        if (this.a != v2k0Var || v2k0Var.f <= 0) {
            androidx.compose.runtime.b.a("Unexpected reader close()");
        }
        v2k0Var.f--;
        this.d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.b[(i * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (!(this.g == this.h)) {
                androidx.compose.runtime.b.a("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : x2k0.a(i2, iArr) + i2;
            int b = this.j.b();
            if (b < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = b;
                this.m = i2 >= i3 - 1 ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.g;
        if (i < this.h) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int g() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object h(int i, int i2) {
        int[] iArr = this.b;
        int c = x2k0.c(i, iArr);
        int i3 = i + 1;
        int i4 = c + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : a.C0011a.a;
    }

    public final int i(int i) {
        return this.b[i * 5];
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i) {
        return (this.b[(i * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    public final boolean l(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return a.C0011a.a;
        }
        this.n = true;
        Object[] objArr = this.d;
        this.l = i + 1;
        return objArr[i];
    }

    public final Object n(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.d[iArr[i2 + 4]] : a.C0011a.a;
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int q(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (!(this.k == 0)) {
            androidx.compose.runtime.b.a("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.i) {
            this.i = i3;
            if (i3 < 0) {
                this.h = i2;
            } else {
                this.h = x2k0.a(i3, iArr) + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (!(this.k == 0)) {
            androidx.compose.runtime.b.a("Cannot skip while in an empty region");
        }
        int i = this.g;
        int[] iArr = this.b;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.g = x2k0.a(i, iArr) + i;
        return i2;
    }

    public final void t() {
        if (!(this.k == 0)) {
            androidx.compose.runtime.b.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return vu5.b(sb, this.h, ')');
    }

    public final void u() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int[] iArr = this.b;
            if (!(iArr[(i2 * 5) + 2] == i)) {
                gxc0.a("Invalid slot table detected");
            }
            int i3 = this.l;
            int i4 = this.m;
            s9x s9xVar = this.j;
            if (i3 == 0 && i4 == 0) {
                s9xVar.c(-1);
            } else {
                s9xVar.c(i3);
            }
            this.i = i2;
            this.h = x2k0.a(i2, iArr) + i2;
            int i5 = i2 + 1;
            this.g = i5;
            this.l = x2k0.c(i2, iArr);
            this.m = i2 >= this.c - 1 ? this.e : iArr[(i5 * 5) + 4];
        }
    }
}
