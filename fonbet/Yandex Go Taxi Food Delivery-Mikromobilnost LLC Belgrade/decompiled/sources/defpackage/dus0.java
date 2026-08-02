package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class dus0 {
    public final sus0 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final m6w j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public dus0(sus0 sus0Var) {
        this.a = sus0Var;
        this.b = sus0Var.a;
        int i = sus0Var.b;
        this.c = i;
        this.d = sus0Var.c;
        this.e = sus0Var.w;
        this.h = i;
        this.i = -1;
        this.j = new m6w();
    }

    public final yss a(int i) {
        ArrayList arrayList = this.a.B;
        int g = uus0.g(i, this.c, arrayList);
        if (g >= 0) {
            return (yss) arrayList.get(g);
        }
        yss yssVar = new yss(i);
        arrayList.add(-(g + 1), yssVar);
        return yssVar;
    }

    public final Object b(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return did.a;
    }

    public final void c() {
        this.f = true;
        if (this.a.x <= 0) {
            lid.a("Unexpected reader close()");
        }
        r0.x--;
        this.d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.b[(i * 5) + 1] & SelfTester_JCP.DECRYPT_CBC) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (!(this.g == this.h)) {
                lid.a("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : uus0.a(i2, iArr) + i2;
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
        int d = uus0.d(i, iArr);
        int i3 = i + 1;
        int i4 = d + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : did.a;
    }

    public final int i(int i) {
        return this.b[i * 5];
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & SelfTester_JCP.DECRYPT_CNT) != 0;
    }

    public final boolean k(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return did.a;
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
            return i3 != 0 ? this.d[iArr[i2 + 4]] : did.a;
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.d[uus0.c(i, iArr)];
        }
        return null;
    }

    public final int q(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (!(this.k == 0)) {
            lid.a("Cannot reposition while in an empty region");
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
                this.h = uus0.a(i3, iArr) + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (!(this.k == 0)) {
            lid.a("Cannot skip while in an empty region");
        }
        int i = this.g;
        int[] iArr = this.b;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.g = uus0.a(i, iArr) + i;
        return i2;
    }

    public final void t() {
        if (!(this.k == 0)) {
            lid.a("Cannot skip the enclosing group while in an empty region");
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
        return oyr.s(sb, this.h, ')');
    }

    public final void u() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int[] iArr = this.b;
            if (iArr[(i2 * 5) + 2] != i) {
                khe0.a("Invalid slot table detected");
            }
            int i3 = this.l;
            int i4 = this.m;
            m6w m6wVar = this.j;
            if (i3 == 0 && i4 == 0) {
                m6wVar.c(-1);
            } else {
                m6wVar.c(i3);
            }
            this.i = i2;
            this.h = uus0.a(i2, iArr) + i2;
            int i5 = i2 + 1;
            this.g = i5;
            this.l = uus0.d(i2, iArr);
            this.m = i2 >= this.c + (-1) ? this.e : iArr[(i5 * 5) + 4];
        }
    }
}
