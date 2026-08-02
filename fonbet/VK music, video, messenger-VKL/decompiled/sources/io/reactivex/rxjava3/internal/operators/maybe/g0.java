package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: MaybeTakeUntilPublisher.java */
/* loaded from: classes8.dex */
public final class g0<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final ffe0<U> c;

    /* compiled from: MaybeTakeUntilPublisher.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final C2127a<U> other = new C2127a<>(this);

        /* compiled from: MaybeTakeUntilPublisher.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.g0$a$a, reason: collision with other inner class name */
        public static final class C2127a<U> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final a<?, U> parent;

            public C2127a(a<?, U> aVar) {
                this.parent = aVar;
            }

            @Override // xsna.axm0
            public final void onComplete() {
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onComplete();
                }
            }

            @Override // xsna.axm0
            public final void onError(Throwable th) {
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            }

            @Override // xsna.axm0
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onComplete();
                }
            }

            @Override // xsna.axm0
            public final void onSubscribe(jxm0 jxm0Var) {
                if (SubscriptionHelper.d(this, jxm0Var)) {
                    jxm0Var.request(Long.MAX_VALUE);
                }
            }
        }

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.downstream = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            SubscriptionHelper.a(this.other);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            SubscriptionHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            SubscriptionHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.processors.c cVar) {
        super(kVar);
        this.c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        this.c.subscribe(aVar.other);
        this.b.subscribe(aVar);
    }
}
