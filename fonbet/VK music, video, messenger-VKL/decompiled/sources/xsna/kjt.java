package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class kjt<T> implements uki0<T> {
    public final gzs<T> a;
    public final izs<T, T> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public T b;
        public int c = -2;
        public final /* synthetic */ kjt<T> d;

        public a(kjt<T> kjtVar) {
            this.d = kjtVar;
        }

        public final void a() {
            int i = this.c;
            kjt<T> kjtVar = this.d;
            T invoke = i == -2 ? kjtVar.a.invoke() : kjtVar.b.invoke(this.b);
            this.b = invoke;
            this.c = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c < 0) {
                a();
            }
            return this.c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c < 0) {
                a();
            }
            if (this.c == 0) {
                throw new NoSuchElementException();
            }
            T t = this.b;
            this.c = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kjt(gzs<? extends T> gzsVar, izs<? super T, ? extends T> izsVar) {
        this.a = gzsVar;
        this.b = izsVar;
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
