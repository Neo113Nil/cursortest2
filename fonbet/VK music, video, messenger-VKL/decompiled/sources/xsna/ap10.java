package xsna;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import xsna.h5o0;
import xsna.uli0;

/* compiled from: MeasurableTaskDispatcher.kt */
/* loaded from: classes.dex */
public abstract class ap10 implements h5o0 {
    public final TreeSet<mp10> a = new TreeSet<>();
    public final a b = new a(this);

    /* compiled from: MeasurableTaskDispatcher.kt */
    public static final class a implements np10, Collection<mp10>, gcy {
        public final /* synthetic */ TreeSet<mp10> b;

        public a(ap10 ap10Var) {
            this.b = ap10Var.a;
        }

        @Override // java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(mp10 mp10Var) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends mp10> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof mp10)) {
                return false;
            }
            return this.b.contains((mp10) obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return this.b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<mp10> iterator() {
            return this.b.iterator();
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
        public final boolean removeIf(Predicate<? super mp10> predicate) {
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

    @Override // xsna.h5o0
    public final np10 a() {
        return this.b;
    }

    @Override // xsna.h5o0
    public final h5o0.a c(String str, Iterable<? extends h5o0.a> iterable, Runnable runnable) {
        uli0.a aVar = new uli0.a();
        Iterator<? extends h5o0.a> it = iterable.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        runnable.run();
        this.a.add(new mp10(str, SystemClock.uptimeMillis() - uptimeMillis, TimeUnit.MILLISECONDS));
        s3q0 s3q0Var = s3q0.a;
        return aVar;
    }
}
