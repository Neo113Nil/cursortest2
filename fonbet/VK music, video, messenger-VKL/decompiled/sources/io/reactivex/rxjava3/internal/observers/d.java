package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.m;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingMultiObserver.java */
/* loaded from: classes8.dex */
public final class d<T> extends CountDownLatch implements z<T>, io.reactivex.rxjava3.core.c, m<T> {
    public T b;
    public Throwable c;
    public io.reactivex.rxjava3.disposables.c d;
    public volatile boolean e;

    public d() {
        super(1);
    }

    public final void a(io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        try {
            if (getCount() != 0) {
                try {
                    await();
                } catch (InterruptedException e) {
                    this.e = true;
                    io.reactivex.rxjava3.disposables.c cVar = this.d;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    fVar2.accept(e);
                    return;
                }
            }
            Throwable th = this.c;
            if (th != null) {
                fVar2.accept(th);
                return;
            }
            T t = this.b;
            if (t != null) {
                fVar.accept(t);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(th2);
        }
    }

    public final T b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.e = true;
                io.reactivex.rxjava3.disposables.c cVar = this.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                throw io.reactivex.rxjava3.internal.util.f.f(e);
            }
        }
        Throwable th = this.c;
        if (th == null) {
            return this.b;
        }
        throw io.reactivex.rxjava3.internal.util.f.f(th);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.c = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        this.d = cVar;
        if (this.e) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(T t) {
        this.b = t;
        countDown();
    }
}
