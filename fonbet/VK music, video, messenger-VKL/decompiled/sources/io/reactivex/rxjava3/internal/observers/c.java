package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingFirstObserver.java */
/* loaded from: classes11.dex */
public final class c<T> extends CountDownLatch implements v<Object>, io.reactivex.rxjava3.disposables.c {
    public Object b;
    public Throwable c;
    public io.reactivex.rxjava3.disposables.c d;
    public volatile boolean e;

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.e = true;
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.e;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (this.b == null) {
            this.c = th;
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        if (this.b == null) {
            this.b = t;
            this.d.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        this.d = cVar;
        if (this.e) {
            cVar.dispose();
        }
    }
}
