package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTakeUntil.java */
/* loaded from: classes8.dex */
public final class p2<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.core.q c;

    /* compiled from: ObservableTakeUntil.java */
    public static final class a<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 1418547743690811973L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();
        final a<T, U>.C2146a otherObserver = new C2146a();
        final AtomicThrowable error = new AtomicThrowable();

        /* compiled from: ObservableTakeUntil.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p2$a$a, reason: collision with other inner class name */
        public final class C2146a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public C2146a() {
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                a aVar = a.this;
                DisposableHelper.a(aVar.upstream);
                io.reactivex.rxjava3.internal.util.g.a(aVar.downstream, aVar, aVar.error);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                a aVar = a.this;
                DisposableHelper.a(aVar.upstream);
                io.reactivex.rxjava3.internal.util.g.b(aVar.downstream, th, aVar, aVar.error);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(U u) {
                DisposableHelper.a(this);
                a aVar = a.this;
                DisposableHelper.a(aVar.upstream);
                io.reactivex.rxjava3.internal.util.g.a(aVar.downstream, aVar, aVar.error);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.downstream = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this.otherObserver);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            DisposableHelper.a(this.otherObserver);
            io.reactivex.rxjava3.internal.util.g.a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this.otherObserver);
            io.reactivex.rxjava3.internal.util.g.b(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            io.reactivex.rxjava3.internal.util.g.c(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    public p2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.q qVar2) {
        super(qVar);
        this.c = qVar2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.onSubscribe(aVar);
        this.c.subscribe(aVar.otherObserver);
        this.b.subscribe(aVar);
    }
}
