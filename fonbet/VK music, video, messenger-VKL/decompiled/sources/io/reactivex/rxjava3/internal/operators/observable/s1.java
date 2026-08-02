package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishSelector.java */
/* loaded from: classes8.dex */
public final class s1<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super io.reactivex.rxjava3.core.q<T>, ? extends io.reactivex.rxjava3.core.t<R>> c;

    /* compiled from: ObservablePublishSelector.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T> {
        public final io.reactivex.rxjava3.subjects.f<T> b;
        public final b c;

        public a(io.reactivex.rxjava3.subjects.f fVar, b bVar) {
            this.b = fVar;
            this.c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.b.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.c, cVar);
        }
    }

    /* compiled from: ObservablePublishSelector.java */
    public static final class b<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<R>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 854110278590336484L;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        io.reactivex.rxjava3.disposables.c upstream;

        public b(io.reactivex.rxjava3.core.v<? super R> vVar) {
            this.downstream = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            DisposableHelper.a(this);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public s1(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        try {
            io.reactivex.rxjava3.core.t<R> apply = this.c.apply(fVar);
            Objects.requireNonNull(apply, "The selector returned a null ObservableSource");
            io.reactivex.rxjava3.core.t<R> tVar = apply;
            b bVar = new b(vVar);
            tVar.subscribe(bVar);
            this.b.subscribe(new a(fVar, bVar));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
