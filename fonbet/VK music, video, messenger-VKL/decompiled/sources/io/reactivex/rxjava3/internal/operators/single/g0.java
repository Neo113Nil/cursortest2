package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: SingleTakeUntil.java */
/* loaded from: classes8.dex */
public final class g0<T, U> extends io.reactivex.rxjava3.core.x<T> {
    public final r b;
    public final io.reactivex.rxjava3.internal.operators.completable.b0 c;

    /* compiled from: SingleTakeUntil.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final b other = new b(this);

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.downstream = zVar;
        }

        public final void a(Throwable th) {
            io.reactivex.rxjava3.disposables.c andSet;
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            b bVar = this.other;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            b bVar = this.other;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            b bVar = this.other;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t);
            }
        }
    }

    /* compiled from: SingleTakeUntil.java */
    public static final class b extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final a<?> parent;

        public b(a<?> aVar) {
            this.parent = aVar;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            jxm0 jxm0Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (jxm0Var != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.a(new CancellationException());
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.parent.a(th);
        }

        @Override // xsna.axm0
        public final void onNext(Object obj) {
            if (SubscriptionHelper.a(this)) {
                this.parent.a(new CancellationException());
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.d(this, jxm0Var)) {
                jxm0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public g0(r rVar, io.reactivex.rxjava3.internal.operators.completable.b0 b0Var) {
        this.b = rVar;
        this.c = b0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        this.c.subscribe((axm0) aVar.other);
        this.b.subscribe(aVar);
    }
}
