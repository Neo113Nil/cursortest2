package xsna;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: SparseArrayCompat.jvm.kt */
/* loaded from: classes11.dex */
public final class wik0<E> implements Cloneable {
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public wik0() {
        this(0);
    }

    public final void a(int i, E e) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            h(i, e);
            return;
        }
        if (i2 >= this.b.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.b = Arrays.copyOf(this.b, i6);
            this.c = Arrays.copyOf(this.c, i6);
        }
        this.b[i2] = i;
        this.c[i2] = e;
        this.d = i2 + 1;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final wik0<E> clone() {
        wik0<E> wik0Var = (wik0) super.clone();
        wik0Var.b = (int[]) this.b.clone();
        wik0Var.c = (Object[]) this.c.clone();
        return wik0Var;
    }

    public final boolean f(int i) {
        return ey2.b(this.d, i, this.b) >= 0;
    }

    public final E g(int i) {
        E e;
        int b = ey2.b(this.d, i, this.b);
        if (b < 0 || (e = (E) this.c[b]) == m200.j) {
            return null;
        }
        return e;
    }

    public final void h(int i, E e) {
        int b = ey2.b(this.d, i, this.b);
        if (b >= 0) {
            this.c[b] = e;
            return;
        }
        int i2 = ~b;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == m200.j) {
                this.b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (i3 >= this.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.b = Arrays.copyOf(this.b, i7);
            this.c = Arrays.copyOf(this.c, i7);
        }
        int i8 = this.d;
        if (i8 - i2 != 0) {
            int[] iArr = this.b;
            int i9 = i2 + 1;
            jw5.e(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.c;
            jw5.h(objArr2, i9, objArr2, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = e;
        this.d++;
    }

    public final E i(int i) {
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.b[i3]);
            sb.append(B5.U);
            E i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public wik0(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new Object[i5];
    }
}
