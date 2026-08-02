package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kzt0 {
    public final int a;
    public lzt0[] b;
    public int c;

    public kzt0(int i) {
        this.a = 16;
        int highestOneBit = Integer.highestOneBit(16);
        this.b = new lzt0[highestOneBit != 16 ? highestOneBit << 1 : highestOneBit];
        this.c = -1;
    }

    public final void a(int i, int i2) {
        int i3;
        if (i2 == 0 || i > (i3 = this.c)) {
            return;
        }
        b(i3 + 1 + i2);
        lzt0[] lzt0VarArr = this.b;
        int i4 = i + i2;
        f73.g(lzt0VarArr, i4, lzt0VarArr, i, this.c + 1);
        Arrays.fill(this.b, i, i4, (Object) null);
        this.c += i2;
    }

    public final void b(int i) {
        lzt0[] lzt0VarArr = this.b;
        if (lzt0VarArr.length < i) {
            int i2 = 16;
            if (i >= 16 && (i2 = Integer.highestOneBit(i)) != i) {
                i2 <<= 1;
            }
            this.b = (lzt0[]) Arrays.copyOf(lzt0VarArr, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        r1.f = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lzt0 c(int i, int i2) {
        int i3 = i2 + 1;
        int i4 = this.c;
        if (i3 > i4) {
            return null;
        }
        while (true) {
            lzt0 lzt0Var = this.b[i3];
            if (lzt0Var == null || !lzt0Var.a()) {
                return null;
            }
            if (lzt0Var.b() || lzt0Var.a == i) {
                break;
            }
            if (i3 == i4) {
                return null;
            }
            i3++;
        }
    }

    public final lzt0 d(int i, int i2) {
        lzt0 lzt0Var;
        do {
            i2--;
            if (-1 < i2 && (lzt0Var = this.b[i2]) != null && lzt0Var.a()) {
                if (lzt0Var.b()) {
                    break;
                }
            } else {
                return null;
            }
        } while (lzt0Var.a != i);
        lzt0Var.f = i2;
        return lzt0Var;
    }

    public final lzt0 e(int i) {
        if (i > new d6w(0, this.c, 1).b || i < 0) {
            return null;
        }
        return this.b[i];
    }

    public final void f(int i, int i2) {
        int i3 = this.c + 1;
        if (i2 > i3) {
            i2 = i3;
        }
        while (i < i2) {
            lzt0 lzt0Var = this.b[i];
            if (lzt0Var != null) {
                lzt0Var.e = false;
                lzt0Var.f = -1;
                lzt0Var.d = Integer.MIN_VALUE;
                lzt0Var.b = -1;
                lzt0Var.c = -1;
                lzt0Var.a = -1;
            }
            i++;
        }
    }

    public final void g(int i) {
        int i2 = this.c;
        if (i > i2) {
            return;
        }
        while (true) {
            lzt0 lzt0Var = this.b[i];
            if (lzt0Var == null || lzt0Var.b() || !lzt0Var.a()) {
                return;
            }
            lzt0Var.a = -1;
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h(int i, int i2) {
        int i3;
        if (i2 == 0 || i > (i3 = this.c)) {
            return;
        }
        int i4 = i + i2;
        int i5 = i3 + 1;
        if (i4 >= i5) {
            f(i, i5);
            this.c = i - 1;
            return;
        }
        lzt0[] lzt0VarArr = this.b;
        f73.g(lzt0VarArr, i, lzt0VarArr, i4, i5);
        int i6 = this.c + 1;
        f(i6 - i2, i6);
        this.c -= i2;
    }

    public final lzt0 i(int i) {
        lzt0 lzt0Var = this.b[i];
        if (lzt0Var != null) {
            return lzt0Var;
        }
        w511.f(oyr.i(i, "no item at index "));
        return null;
    }

    public final lzt0 j(int i, int i2) {
        lzt0 i3;
        do {
            i2--;
            if (-1 < i2) {
                i3 = i(i2);
                if (!i3.a()) {
                    xfo.g(oyr.i(i2, "index="));
                } else if (i3.b()) {
                    break;
                }
            }
            return null;
        } while (i3.a != i);
        i3.f = i2;
        return i3;
    }

    public kzt0() {
        this(0);
    }
}
