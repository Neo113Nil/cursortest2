package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class v2o0<T> implements uki0<T> {
    public final uki0<T> a;
    public final izs<T, Boolean> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public final Iterator<T> b;
        public int c = -1;
        public T d;
        public final /* synthetic */ v2o0<T> e;

        public a(v2o0<T> v2o0Var) {
            this.e = v2o0Var;
            this.b = v2o0Var.a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.b;
            if (it.hasNext()) {
                T next = it.next();
                if (this.e.b.invoke(next).booleanValue()) {
                    this.c = 1;
                    this.d = next;
                    return;
                }
            }
            this.c = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c == -1) {
                a();
            }
            return this.c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c == -1) {
                a();
            }
            if (this.c == 0) {
                throw new NoSuchElementException();
            }
            T t = this.d;
            this.d = null;
            this.c = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v2o0(uki0<? extends T> uki0Var, izs<? super T, Boolean> izsVar) {
        this.a = uki0Var;
        this.b = izsVar;
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
