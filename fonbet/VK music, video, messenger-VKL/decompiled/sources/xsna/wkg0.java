package xsna;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import xsna.ff;

/* compiled from: SlidingWindow.kt */
/* loaded from: classes8.dex */
public final class wkg0<T> extends ff<T> implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: SlidingWindow.kt */
    public static final class a extends we<T> {
        public int b;
        public int c;
        public final /* synthetic */ wkg0<T> d;

        public a(wkg0<T> wkg0Var) {
            this.d = wkg0Var;
            this.b = wkg0Var.size();
            this.c = wkg0Var.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.we
        public final void computeNext() {
            if (this.b == 0) {
                done();
                return;
            }
            wkg0<T> wkg0Var = this.d;
            setNext(wkg0Var.b[this.c]);
            this.c = (this.c + 1) % wkg0Var.c;
            this.b--;
        }
    }

    public wkg0(Object[] objArr, int i) {
        this.b = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.c = objArr.length;
            this.e = i;
        } else {
            StringBuilder b = ji.b(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            b.append(objArr.length);
            throw new IllegalArgumentException(b.toString().toString());
        }
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > size()) {
            StringBuilder b = ji.b(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            b.append(size());
            throw new IllegalArgumentException(b.toString().toString());
        }
        if (i > 0) {
            int i2 = this.d;
            int i3 = this.c;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.b;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.d = i4;
            this.e = size() - i;
        }
    }

    @Override // xsna.ff, java.util.List
    public final T get(int i) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.b(i, size);
        return (T) this.b[(this.d + i) % this.c];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.e;
    }

    @Override // xsna.ff, xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // xsna.qd, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
        }
        int size = size();
        int i = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr = this.b;
            if (i3 >= size || i >= this.c) {
                break;
            }
            tArr[i3] = objArr[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = objArr[i2];
            i3++;
            i2++;
        }
        if (size < tArr.length) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qd, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
