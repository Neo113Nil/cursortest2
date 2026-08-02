package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class u2o0<T> implements uki0<T>, mmo<T> {
    public final uki0<T> a;
    public final int b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public int b;
        public final Iterator<T> c;

        public a(u2o0<T> u2o0Var) {
            this.b = u2o0Var.b;
            this.c = u2o0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b > 0 && this.c.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.b;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.b = i - 1;
            return this.c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u2o0(uki0<? extends T> uki0Var, int i) {
        this.a = uki0Var;
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException(uqi.a("count must be non-negative, but was ", i, JwtParser.SEPARATOR_CHAR).toString());
        }
    }

    @Override // xsna.mmo
    public final uki0<T> a(int i) {
        return i >= this.b ? this : new u2o0(this.a, i);
    }

    @Override // xsna.mmo
    public final uki0<T> b(int i) {
        int i2 = this.b;
        return i >= i2 ? ghp.a : new vtm0(this.a, i, i2);
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
