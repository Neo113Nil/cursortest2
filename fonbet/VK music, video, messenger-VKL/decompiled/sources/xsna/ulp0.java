package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class ulp0<T, R> implements uki0<R> {
    public final uki0<T> a;
    public final izs<T, R> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, gcy {
        public final Iterator<T> b;
        public final /* synthetic */ ulp0<T, R> c;

        public a(ulp0<T, R> ulp0Var) {
            this.c = ulp0Var;
            this.b = ulp0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.c.b.invoke(this.b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ulp0(uki0<? extends T> uki0Var, izs<? super T, ? extends R> izsVar) {
        this.a = uki0Var;
        this.b = izsVar;
    }

    @Override // xsna.uki0
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
