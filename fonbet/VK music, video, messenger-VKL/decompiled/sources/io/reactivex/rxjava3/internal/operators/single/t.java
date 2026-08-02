package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapMaybe.java */
/* loaded from: classes8.dex */
public final class t<T, R> extends io.reactivex.rxjava3.core.k<R> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> c;

    /* compiled from: SingleFlatMapMaybe.java */
    public static final class a<R> implements io.reactivex.rxjava3.core.m<R> {
        public final b b;
        public final io.reactivex.rxjava3.core.m<? super R> c;

        public a(b bVar, io.reactivex.rxjava3.core.m mVar) {
            this.b = bVar;
            this.c = mVar;
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.c.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this.b, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(R r) {
            this.c.onSuccess(r);
        }
    }

    /* compiled from: SingleFlatMapMaybe.java */
    public static final class b<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -5843758257109742742L;
        final io.reactivex.rxjava3.core.m<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> mapper;

        public b(io.reactivex.rxjava3.core.m<? super R> mVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> lVar) {
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

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                io.reactivex.rxjava3.core.o<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.o<? extends R> oVar = apply;
                if (h()) {
                    return;
                }
                oVar.subscribe(new a(this, this.downstream));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    public t(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.c = lVar;
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super R> mVar) {
        this.b.subscribe(new b(mVar, this.c));
    }
}
