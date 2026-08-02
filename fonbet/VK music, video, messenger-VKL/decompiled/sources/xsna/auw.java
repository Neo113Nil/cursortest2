package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class auw<T> implements uki0<xtw<? extends T>> {
    public final uki0<T> a;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<xtw<? extends T>>, gcy {
        public final Iterator<T> b;
        public int c;

        public a(auw<T> auwVar) {
            this.b = auwVar.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.c;
            this.c = i + 1;
            if (i >= 0) {
                return new xtw(i, this.b.next());
            }
            e43.t();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public auw(uki0<? extends T> uki0Var) {
        this.a = uki0Var;
    }

    @Override // xsna.uki0
    public final Iterator<xtw<T>> iterator() {
        return new a(this);
    }
}
