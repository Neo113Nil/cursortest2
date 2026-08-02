package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: DisposableLambdaObserver.java */
/* loaded from: classes11.dex */
public final class e<T> implements v<T>, io.reactivex.rxjava3.disposables.c {
    public final v<? super T> b;
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;
    public final io.reactivex.rxjava3.functions.a d;
    public io.reactivex.rxjava3.disposables.c e;

    public e(v<? super T> vVar, io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar, io.reactivex.rxjava3.functions.a aVar) {
        this.b = vVar;
        this.c = fVar;
        this.d = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cVar != disposableHelper) {
            this.e = disposableHelper;
            try {
                this.d.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.e.h();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cVar != disposableHelper) {
            this.e = disposableHelper;
            this.b.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cVar == disposableHelper) {
            io.reactivex.rxjava3.plugins.a.a(th);
        } else {
            this.e = disposableHelper;
            this.b.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        this.b.onNext(t);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        v<? super T> vVar = this.b;
        try {
            this.c.accept(cVar);
            if (DisposableHelper.f(this.e, cVar)) {
                this.e = cVar;
                vVar.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            cVar.dispose();
            this.e = DisposableHelper.DISPOSED;
            EmptyDisposable.b(th, vVar);
        }
    }
}
