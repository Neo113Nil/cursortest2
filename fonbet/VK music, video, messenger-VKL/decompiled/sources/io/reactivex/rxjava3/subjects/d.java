package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BehaviorSubject.java */
/* loaded from: classes11.dex */
public final class d<T> extends j<T> {
    public static final a[] h = new a[0];
    public static final a[] i = new a[0];
    public final AtomicReference<Object> b;
    public final AtomicReference<a<T>[]> c;
    public final Lock d;
    public final Lock e;
    public final AtomicReference<Throwable> f;
    public long g;

    /* compiled from: BehaviorSubject.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.c, a.InterfaceC2159a<Object> {
        public final v<? super T> b;
        public final d<T> c;
        public boolean d;
        public boolean e;
        public io.reactivex.rxjava3.internal.util.a<Object> f;
        public boolean g;
        public volatile boolean h;
        public long i;

        public a(v<? super T> vVar, d<T> dVar) {
            this.b = vVar;
            this.c = dVar;
        }

        public final void a(long j, Object obj) {
            if (this.h) {
                return;
            }
            if (!this.g) {
                synchronized (this) {
                    try {
                        if (this.h) {
                            return;
                        }
                        if (this.i == j) {
                            return;
                        }
                        if (this.e) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.f = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.d = true;
                        this.g = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.R0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.h;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return this.h || NotificationLite.a(this.b, obj);
        }
    }

    public d(T t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock.readLock();
        this.e = reentrantReadWriteLock.writeLock();
        this.c = new AtomicReference<>(h);
        this.b = new AtomicReference<>(t);
        this.f = new AtomicReference<>();
    }

    public static <T> d<T> N0() {
        return new d<>(null);
    }

    public static <T> d<T> O0(T t) {
        Objects.requireNonNull(t, "defaultValue is null");
        return new d<>(t);
    }

    public final T P0() {
        T t = (T) this.b.get();
        if (NotificationLite.d(t) || (t instanceof NotificationLite.b)) {
            return null;
        }
        return t;
    }

    public final boolean Q0() {
        Object obj = this.b.get();
        return (obj == null || NotificationLite.d(obj) || (obj instanceof NotificationLite.b)) ? false : true;
    }

    public final void R0(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.c;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (aVarArr2[i2] == aVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = h;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i2);
                System.arraycopy(aVarArr2, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (c.d(this.f, io.reactivex.rxjava3.internal.util.f.a)) {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            Lock lock = this.e;
            lock.lock();
            this.g++;
            this.b.lazySet(notificationLite);
            lock.unlock();
            for (a<T> aVar : this.c.getAndSet(i)) {
                aVar.a(this.g, notificationLite);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        if (!b.h(this.f, th)) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        NotificationLite.b bVar = new NotificationLite.b(th);
        Lock lock = this.e;
        lock.lock();
        this.g++;
        this.b.lazySet(bVar);
        lock.unlock();
        for (a<T> aVar : this.c.getAndSet(i)) {
            aVar.a(this.g, bVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onNext called with a null value.");
        if (this.f.get() != null) {
            return;
        }
        Lock lock = this.e;
        lock.lock();
        this.g++;
        this.b.lazySet(t);
        lock.unlock();
        for (a<T> aVar : this.c.get()) {
            aVar.a(this.g, t);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.f.get() != null) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        a<T> aVar2 = new a<>(vVar, this);
        vVar.onSubscribe(aVar2);
        AtomicReference<a<T>[]> atomicReference = this.c;
        while (true) {
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == i) {
                Throwable th = this.f.get();
                if (th == io.reactivex.rxjava3.internal.util.f.a) {
                    vVar.onComplete();
                    return;
                } else {
                    vVar.onError(th);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar2.h) {
                R0(aVar2);
                return;
            }
            if (aVar2.h) {
                return;
            }
            synchronized (aVar2) {
                try {
                    if (aVar2.h) {
                        return;
                    }
                    if (aVar2.d) {
                        return;
                    }
                    d<T> dVar = aVar2.c;
                    Lock lock = dVar.d;
                    lock.lock();
                    aVar2.i = dVar.g;
                    Object obj = dVar.b.get();
                    lock.unlock();
                    aVar2.e = obj != null;
                    aVar2.d = true;
                    if (obj == null || aVar2.test(obj)) {
                        return;
                    }
                    while (!aVar2.h) {
                        synchronized (aVar2) {
                            try {
                                aVar = aVar2.f;
                                if (aVar == null) {
                                    aVar2.e = false;
                                    return;
                                }
                                aVar2.f = null;
                            } finally {
                            }
                        }
                        aVar.d(aVar2);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
