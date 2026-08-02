package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class hfr<T> implements uki0<T> {
    public final uki0<T> a;
    public final boolean b;
    public final izs<T, Boolean> c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, gcy {
        public final Iterator<T> b;
        public int c = -1;
        public T d;
        public final /* synthetic */ hfr<T> e;

        public a(hfr<T> hfrVar) {
            this.e = hfrVar;
            this.b = hfrVar.a.iterator();
        }

        public final void a() {
            T next;
            hfr<T> hfrVar;
            do {
                Iterator<T> it = this.b;
                if (!it.hasNext()) {
                    this.c = 0;
                    return;
                } else {
                    next = it.next();
                    hfrVar = this.e;
                }
            } while (hfrVar.c.invoke(next).booleanValue() != hfrVar.b);
            this.d = next;
            this.c = 1;
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
    public hfr(uki0<? extends T> uki0Var, boolean z, izs<? super T, Boolean> izsVar) {
        this.a = uki0Var;
        this.b = z;
        this.c = izsVar;
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
