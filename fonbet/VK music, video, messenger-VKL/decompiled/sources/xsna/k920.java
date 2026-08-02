package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class k920<T1, T2, V> implements uki0<V> {
    public final i5g a;
    public final i5g b;
    public final wzs<T1, T2, V> c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<V>, gcy {
        public final Iterator<T1> b;
        public final Iterator<T2> c;
        public final /* synthetic */ k920<T1, T2, V> d;

        public a(k920<T1, T2, V> k920Var) {
            this.d = k920Var;
            this.b = k920Var.a.a.iterator();
            this.c = k920Var.b.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext() && this.c.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) this.d.c.invoke(this.b.next(), this.c.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k920(i5g i5gVar, i5g i5gVar2, wzs wzsVar) {
        this.a = i5gVar;
        this.b = i5gVar2;
        this.c = wzsVar;
    }

    @Override // xsna.uki0
    public final Iterator<V> iterator() {
        return new a(this);
    }
}
