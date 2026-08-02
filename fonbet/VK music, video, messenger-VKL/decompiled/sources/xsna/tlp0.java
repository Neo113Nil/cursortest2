package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class tlp0<T, R> implements uki0<R> {
    public final uki0<T> a;
    public final wzs<Integer, T, R> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, gcy {
        public final Iterator<T> b;
        public int c;
        public final /* synthetic */ tlp0<T, R> d;

        public a(tlp0<T, R> tlp0Var) {
            this.d = tlp0Var;
            this.b = tlp0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            wzs<Integer, T, R> wzsVar = this.d.b;
            int i = this.c;
            this.c = i + 1;
            if (i >= 0) {
                return (R) wzsVar.invoke(Integer.valueOf(i), this.b.next());
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
    public tlp0(uki0<? extends T> uki0Var, wzs<? super Integer, ? super T, ? extends R> wzsVar) {
        this.a = uki0Var;
        this.b = wzsVar;
    }

    @Override // xsna.uki0
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
