package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class cor<T, R, E> implements uki0<E> {
    public final uki0<T> a;
    public final izs<T, R> b;
    public final izs<R, Iterator<E>> c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, gcy {
        public final Iterator<T> b;
        public Iterator<? extends E> c;
        public int d;
        public final /* synthetic */ cor<T, R, E> e;

        public a(cor<T, R, E> corVar) {
            this.e = corVar;
            this.b = corVar.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.c;
            if (it2 != null && it2.hasNext()) {
                this.d = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.b;
                if (!it3.hasNext()) {
                    this.d = 2;
                    this.c = null;
                    return false;
                }
                T next = it3.next();
                cor<T, R, E> corVar = this.e;
                it = (Iterator) corVar.c.invoke(corVar.b.invoke(next));
            } while (!it.hasNext());
            this.c = it;
            this.d = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.d;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.d = 0;
            return this.c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cor(uki0<? extends T> uki0Var, izs<? super T, ? extends R> izsVar, izs<? super R, ? extends Iterator<? extends E>> izsVar2) {
        this.a = uki0Var;
        this.b = izsVar;
        this.c = izsVar2;
    }

    @Override // xsna.uki0
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
