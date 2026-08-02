package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class jmo<T> implements uki0<T>, mmo<T> {
    public final uki0<T> a;
    public final int b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public final Iterator<T> b;
        public int c;

        public a(jmo<T> jmoVar) {
            this.b = jmoVar.a.iterator();
            this.c = jmoVar.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.c;
                it = this.b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.c;
                it = this.b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jmo(uki0<? extends T> uki0Var, int i) {
        this.a = uki0Var;
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException(uqi.a("count must be non-negative, but was ", i, JwtParser.SEPARATOR_CHAR).toString());
        }
    }

    @Override // xsna.mmo
    public final uki0<T> a(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new u2o0(this, i) : new vtm0(this.a, i2, i3);
    }

    @Override // xsna.mmo
    public final uki0<T> b(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new jmo(this, i) : new jmo(this.a, i2);
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
