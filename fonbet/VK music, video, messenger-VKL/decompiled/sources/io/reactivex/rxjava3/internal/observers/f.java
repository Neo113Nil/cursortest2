package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.m;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureMultiObserver.java */
/* loaded from: classes8.dex */
public final class f<T> extends CountDownLatch implements m<T>, z<T>, io.reactivex.rxjava3.core.c, Future<T>, io.reactivex.rxjava3.disposables.c {
    public T b;
    public Throwable c;
    public final AtomicReference<io.reactivex.rxjava3.disposables.c> d;

    public f() {
        super(1);
        this.d = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.d;
            io.reactivex.rxjava3.disposables.c cVar = atomicReference.get();
            if (cVar == this || cVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
            while (!atomicReference.compareAndSet(cVar, disposableHelper)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            if (cVar != null) {
                cVar.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.c;
        if (th == null) {
            return this.b;
        }
        throw new ExecutionException(th);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return DisposableHelper.b(this.d.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
    public final void onComplete() {
        AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.d;
        io.reactivex.rxjava3.disposables.c cVar = atomicReference.get();
        if (cVar == DisposableHelper.DISPOSED) {
            return;
        }
        while (!atomicReference.compareAndSet(cVar, this) && atomicReference.get() == cVar) {
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        while (true) {
            AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.d;
            io.reactivex.rxjava3.disposables.c cVar = atomicReference.get();
            if (cVar == DisposableHelper.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.c = th;
            while (!atomicReference.compareAndSet(cVar, this)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        DisposableHelper.e(this.d, cVar);
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.d;
        io.reactivex.rxjava3.disposables.c cVar = atomicReference.get();
        if (cVar == DisposableHelper.DISPOSED) {
            return;
        }
        this.b = t;
        while (!atomicReference.compareAndSet(cVar, this) && atomicReference.get() == cVar) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(io.reactivex.rxjava3.internal.util.f.e(j, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.c;
            if (th == null) {
                return this.b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
    }
}
