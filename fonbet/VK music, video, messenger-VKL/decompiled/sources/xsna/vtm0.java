package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class vtm0<T> implements uki0<T>, mmo<T> {
    public final uki0<T> a;
    public final int b;
    public final int c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public final Iterator<T> b;
        public int c;
        public final /* synthetic */ vtm0<T> d;

        public a(vtm0<T> vtm0Var) {
            this.d = vtm0Var;
            this.b = vtm0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            vtm0<T> vtm0Var;
            Iterator<T> it;
            while (true) {
                int i = this.c;
                vtm0Var = this.d;
                int i2 = vtm0Var.b;
                it = this.b;
                if (i >= i2 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c++;
            }
            return this.c < vtm0Var.c && it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            vtm0<T> vtm0Var;
            Iterator<T> it;
            while (true) {
                int i = this.c;
                vtm0Var = this.d;
                int i2 = vtm0Var.b;
                it = this.b;
                if (i >= i2 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c++;
            }
            int i3 = this.c;
            if (i3 >= vtm0Var.c) {
                throw new NoSuchElementException();
            }
            this.c = i3 + 1;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vtm0(uki0<? extends T> uki0Var, int i, int i2) {
        this.a = uki0Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(lhg.a(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(efz.a(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // xsna.mmo
    public final uki0<T> a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new vtm0(this.a, i3, i + i3);
    }

    @Override // xsna.mmo
    public final uki0<T> b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? ghp.a : new vtm0(this.a, i3 + i, i2);
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
