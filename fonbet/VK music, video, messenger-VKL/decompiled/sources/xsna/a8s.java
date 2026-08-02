package xsna;

import com.vk.metrics.trackers.CriticalException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import xsna.h5o0;

/* compiled from: ForkJoinMeasurableTaskDispatcher.kt */
/* loaded from: classes2.dex */
public final class a8s implements h5o0 {
    public final ConcurrentSkipListSet<mp10> a = new ConcurrentSkipListSet<>();
    public final c b = new c(this);
    public final ArrayList<ForkJoinTask<?>> c = new ArrayList<>();

    /* compiled from: ForkJoinMeasurableTaskDispatcher.kt */
    public static final class a implements h5o0.a {
        public final b<String> a;

        public a(String str, z7s z7sVar) {
            this.a = new b<>(str, z7sVar);
        }

        @Override // xsna.h5o0.a
        public final void a() {
            this.a.join();
        }
    }

    /* compiled from: ForkJoinMeasurableTaskDispatcher.kt */
    public static final class b<V> extends ForkJoinTask<V> {
        private final AtomicReference<V> atomicReference;
        private final AtomicBoolean isExecuted = new AtomicBoolean(false);
        private final Runnable runnable;

        public b(String str, z7s z7sVar) {
            this.runnable = z7sVar;
            this.atomicReference = new AtomicReference<>(str);
        }

        @Override // java.util.concurrent.ForkJoinTask
        public final boolean exec() {
            if (!this.isExecuted.compareAndSet(false, true)) {
                return false;
            }
            this.runnable.run();
            return true;
        }

        @Override // java.util.concurrent.ForkJoinTask
        public final V getRawResult() {
            return this.atomicReference.get();
        }

        @Override // java.util.concurrent.ForkJoinTask
        public final void setRawResult(V v) {
            this.atomicReference.set(v);
        }
    }

    /* compiled from: ForkJoinMeasurableTaskDispatcher.kt */
    public static final class c implements np10, Collection<mp10>, gcy {
        public final /* synthetic */ ConcurrentSkipListSet<mp10> b;

        public c(a8s a8sVar) {
            this.b = a8sVar.a;
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
        a aVar = new a(str, new z7s(iterable, str, runnable, this, 0));
        this.c.add(aVar.a);
        return aVar;
    }

    public final void d() {
        ArrayList<ForkJoinTask<?>> arrayList = this.c;
        try {
            ForkJoinTask.invokeAll(arrayList);
            arrayList.clear();
        } catch (Throwable th) {
            try {
                com.vk.metrics.eventtracking.b.a.a(new CriticalException("ForkJoinException", th));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    ForkJoinTask forkJoinTask = (ForkJoinTask) it.next();
                    forkJoinTask.cancel(true);
                    forkJoinTask.completeExceptionally(th);
                }
                throw th;
            } catch (Throwable th2) {
                arrayList.clear();
                throw th2;
            }
        }
    }

    public final long e() {
        Iterator<mp10> it = this.b.b.iterator();
        long j = 0;
        while (it.hasNext()) {
            mp10 next = it.next();
            j += next.d.toMillis(next.c);
        }
        return j;
    }
}
