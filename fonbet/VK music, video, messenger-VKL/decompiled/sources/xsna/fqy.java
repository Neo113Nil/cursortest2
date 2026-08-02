package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Lazy;

/* compiled from: LazyCollectionWrapper.kt */
/* loaded from: classes.dex */
public final class fqy<E> implements Collection<E>, gcy {
    public final Collection<Lazy<E>> b;

    /* compiled from: LazyCollectionWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends we<E> {
        public final Iterator<Lazy<E>> b;

        public a(fqy<E> fqyVar) {
            this.b = fqyVar.b.iterator();
        }

        @Override // xsna.we
        public final void computeNext() {
            Iterator<Lazy<E>> it = this.b;
            if (it.hasNext()) {
                setNext(it.next().getValue());
            } else {
                done();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fqy(Collection<? extends Lazy<? extends E>> collection) {
        this.b = collection;
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Collection<Lazy<E>> collection = this.b;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (epx.f((Lazy) it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            Collection<Lazy<E>> collection3 = this.b;
            if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                if (epx.f((Lazy) it.next(), obj)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.size();
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
