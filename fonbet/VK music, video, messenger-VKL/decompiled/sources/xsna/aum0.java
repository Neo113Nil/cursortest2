package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import xsna.hh50;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public interface aum0 {

    /* compiled from: SubcomposeLayout.kt */
    public static final class a implements Collection<Object>, gcy {
        public final gh50<Object> b;

        public a(int i) {
            int i2 = wx80.a;
            this.b = new gh50<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.b.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.b.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.b.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.b.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            gh50<Object> gh50Var = this.b;
            gh50Var.getClass();
            return new hh50.a(new hh50(gh50Var));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.b.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.b.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.b.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.b.g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
