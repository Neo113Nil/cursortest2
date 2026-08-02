package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWithLatestFrom.java */
/* loaded from: classes8.dex */
public final class c3<T, U, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.c<? super T, ? super U, ? extends R> c;
    public final io.reactivex.rxjava3.core.t<? extends U> d;

    /* compiled from: ObservableWithLatestFrom.java */
    public static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -312246233408980075L;
        final io.reactivex.rxjava3.functions.c<? super T, ? super U, ? extends R> combiner;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream = new AtomicReference<>();
        final AtomicReference<io.reactivex.rxjava3.disposables.c> other = new AtomicReference<>();

        public a(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.c cVar) {
            this.downstream = eVar;
            this.combiner = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a(this.other);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            DisposableHelper.a(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    R apply = this.combiner.apply(t, u);
                    Objects.requireNonNull(apply, "The combiner returned a null value");
                    this.downstream.onNext(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }
    }

    public c3(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.t tVar, io.reactivex.rxjava3.functions.c cVar) {
        super(qVar);
        this.c = cVar;
        this.d = tVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        io.reactivex.rxjava3.observers.e eVar = new io.reactivex.rxjava3.observers.e(vVar);
        a aVar = new a(eVar, this.c);
        eVar.onSubscribe(aVar);
        this.d.subscribe(new b(aVar));
        this.b.subscribe(aVar);
    }

    /* compiled from: ObservableWithLatestFrom.java */
    public final class b implements io.reactivex.rxjava3.core.v<U> {
        public final a<T, U, R> b;

        public b(a aVar) {
            this.b = aVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            a<T, U, R> aVar = this.b;
            DisposableHelper.a(aVar.upstream);
            aVar.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(U u) {
            this.b.lazySet(u);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.b.other, cVar);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }
    }
}
