package xsna;

/* compiled from: CircularArray.kt */
/* loaded from: classes11.dex */
public final class edc<E> {
    public E[] a;
    public int b;
    public int c;
    public int d;

    public edc(int i) {
        if (!(i >= 1)) {
            alk.B("capacity must be >= 1");
            throw null;
        }
        if (!(i <= 1073741824)) {
            alk.B("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.d = i - 1;
        this.a = (E[]) new Object[i];
    }

    public final void a(E e) {
        E[] eArr = this.a;
        int i = this.c;
        eArr[i] = e;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = eArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            E[] eArr2 = (E[]) new Object[i5];
            jw5.h(eArr, 0, eArr2, i3, length);
            jw5.h(this.a, i4, eArr2, 0, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public final void b() {
        int d = d();
        if (d <= 0) {
            return;
        }
        if (d > d()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.a.length;
        int i = this.b;
        if (d < length - i) {
            length = i + d;
        }
        while (i < length) {
            this.a[i] = null;
            i++;
        }
        int i2 = this.b;
        int i3 = length - i2;
        int i4 = d - i3;
        this.b = this.d & (i2 + i3);
        if (i4 > 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                this.a[i5] = null;
            }
            this.b = i4;
        }
    }

    public final E c() {
        int i = this.b;
        if (i == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.a;
        E e = eArr[i];
        eArr[i] = null;
        this.b = (i + 1) & this.d;
        return e;
    }

    public final int d() {
        return (this.c - this.b) & this.d;
    }
}
