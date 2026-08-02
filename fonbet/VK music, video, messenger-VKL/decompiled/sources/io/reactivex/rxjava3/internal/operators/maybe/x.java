package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeObserveOn.java */
/* loaded from: classes8.dex */
public final class x<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: MaybeObserveOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.w scheduler;
        T value;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = mVar;
            this.scheduler = wVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.value = t;
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t == null) {
                this.downstream.onComplete();
            } else {
                this.value = null;
                this.downstream.onSuccess(t);
            }
        }
    }

    public x(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.w wVar) {
        super(kVar);
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
