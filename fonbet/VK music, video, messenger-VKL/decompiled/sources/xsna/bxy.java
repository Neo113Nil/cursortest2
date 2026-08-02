package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: LazyStaggeredGridLaneInfo.kt */
/* loaded from: classes11.dex */
public final class bxy {
    public int a;
    public int[] b = new int[16];
    public final sk3<a> c = new sk3<>();

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    public static final class a {
        public final int a;
        public int[] b;

        public a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }
    }

    public static int h(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((a) list.get(i3)).a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean a(int i, int i2) {
        int f = f(i);
        return f == i2 || f == -1 || f == -2;
    }

    public final void b(int i, int i2) {
        if (i > 131072) {
            xzw.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            jw5.i(i2, 0, 12, this.b, iArr2);
            this.b = iArr2;
        }
    }

    public final void c(int i) {
        sk3<a> sk3Var;
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int max = Math.max(i - (this.b.length / 2), 0);
            this.a = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                int[] iArr = this.b;
                if (i4 < iArr.length) {
                    jw5.e(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), this.b.length, 0);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.b;
                if (iArr3.length + i5 < 131072) {
                    b(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        jw5.e(i5, 0, iArr3.length - i5, iArr3, iArr3);
                    }
                    int[] iArr4 = this.b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i5), 0);
                }
            }
        } else {
            b(i3 + 1, 0);
        }
        while (true) {
            sk3Var = this.c;
            if (sk3Var.isEmpty() || sk3Var.first().a >= this.a) {
                break;
            } else {
                sk3Var.removeFirst();
            }
        }
        while (!sk3Var.isEmpty() && sk3Var.last().a > this.a + this.b.length) {
            sk3Var.removeLast();
        }
    }

    public final int d(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!a(i, i2));
        return i;
    }

    public final int[] e(int i) {
        sk3<a> sk3Var = this.c;
        a aVar = (a) j5g.b0(h(i, sk3Var), sk3Var);
        if (aVar != null) {
            return aVar.b;
        }
        return null;
    }

    public final int f(int i) {
        int i2 = this.a;
        if (i < i2) {
            return -1;
        }
        if (i >= this.b.length + i2) {
            return -1;
        }
        return r1[i - i2] - 1;
    }

    public final void g() {
        jw5.o(0, 0, 6, this.b);
        this.c.clear();
    }

    public final void i(int i, int i2) {
        if (!(i >= 0)) {
            xzw.a("Negative lanes are not supported");
        }
        c(i);
        this.b[i - this.a] = i2 + 1;
    }
}
