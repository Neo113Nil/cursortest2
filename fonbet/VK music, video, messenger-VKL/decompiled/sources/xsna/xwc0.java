package xsna;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.uwf;

/* compiled from: PreCachingAlgorithmDecorator.java */
/* loaded from: classes13.dex */
public final class xwc0<T extends uwf> extends nc {
    public final z570 c;
    public final m900<Integer, Set<? extends kwf<T>>> d;
    public final ReentrantReadWriteLock e;
    public final ExecutorService f;

    /* compiled from: PreCachingAlgorithmDecorator.java */
    public class a implements Runnable {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            xwc0.this.i0(this.b);
        }
    }

    public xwc0(z570 z570Var) {
        super(0);
        this.d = new m900<>(5);
        this.e = new ReentrantReadWriteLock();
        this.f = Executors.newCachedThreadPool();
        this.c = z570Var;
    }

    @Override // xsna.ys1
    public final void I() {
        this.c.I();
        this.d.evictAll();
    }

    @Override // xsna.ys1
    public final Set<? extends kwf<T>> K(float f) {
        int i = (int) f;
        Set<? extends kwf<T>> i0 = i0(i);
        int i2 = i + 1;
        Integer valueOf = Integer.valueOf(i2);
        m900<Integer, Set<? extends kwf<T>>> m900Var = this.d;
        Set<? extends kwf<T>> set = m900Var.get(valueOf);
        ExecutorService executorService = this.f;
        if (set == null) {
            executorService.execute(new a(i2));
        }
        int i3 = i - 1;
        if (m900Var.get(Integer.valueOf(i3)) == null) {
            executorService.execute(new a(i3));
        }
        return i0;
    }

    @Override // xsna.ys1
    public final boolean R(T t) {
        boolean R = this.c.R(t);
        if (R) {
            this.d.evictAll();
        }
        return R;
    }

    @Override // xsna.ys1
    public final boolean a(Collection<T> collection) {
        boolean a2 = this.c.a(collection);
        if (a2) {
            this.d.evictAll();
        }
        return a2;
    }

    @Override // xsna.ys1
    public final int g() {
        return this.c.c;
    }

    @Override // xsna.ys1
    public final Collection<T> getItems() {
        return this.c.getItems();
    }

    public final Set<? extends kwf<T>> i0(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        reentrantReadWriteLock.readLock().lock();
        Integer valueOf = Integer.valueOf(i);
        m900<Integer, Set<? extends kwf<T>>> m900Var = this.d;
        Set<? extends kwf<T>> set = m900Var.get(valueOf);
        reentrantReadWriteLock.readLock().unlock();
        if (set == null) {
            reentrantReadWriteLock.writeLock().lock();
            set = m900Var.get(Integer.valueOf(i));
            if (set == null) {
                set = this.c.K(i);
                m900Var.put(Integer.valueOf(i), set);
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        return set;
    }
}
