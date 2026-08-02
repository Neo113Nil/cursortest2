package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSingle.java */
/* loaded from: classes8.dex */
public final class n<T, R> extends io.reactivex.rxjava3.core.k<R> {
    public final io.reactivex.rxjava3.core.k b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> c;

    /* compiled from: MaybeFlatMapSingle.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 4827726964688405508L;
        final io.reactivex.rxjava3.core.m<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> mapper;

        public a(io.reactivex.rxjava3.core.m<? super R> mVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> lVar) {
            this.downstream = mVar;
            this.mapper = lVar;
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
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                io.reactivex.rxjava3.core.b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.b0<? extends R> b0Var = apply;
                if (h()) {
                    return;
                }
                b0Var.subscribe(new b(this, this.downstream));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    /* compiled from: MaybeFlatMapSingle.java */
    public static final class b<R> implements io.reactivex.rxjava3.core.z<R> {
        public final a b;
        public final io.reactivex.rxjava3.core.m<? super R> c;

        public b(a aVar, io.reactivex.rxjava3.core.m mVar) {
            this.b = aVar;
            this.c = mVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this.b, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(R r) {
            this.c.onSuccess(r);
        }
    }

    public n(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = kVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super R> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
