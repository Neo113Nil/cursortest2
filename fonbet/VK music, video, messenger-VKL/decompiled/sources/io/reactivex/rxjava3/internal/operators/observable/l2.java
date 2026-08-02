package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn.java */
/* loaded from: classes11.dex */
public final class l2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: ObservableSubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8094547886072529208L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.downstream = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    public final class b implements Runnable {
        public final a<T> b;

        public b(a<T> aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l2.this.b.subscribe(this.b);
        }
    }

    public l2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.onSubscribe(aVar);
        DisposableHelper.e(aVar, this.c.c(new b(aVar)));
    }
}
