package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapCompletable.java */
/* loaded from: classes8.dex */
public final class s<T> extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;

    /* compiled from: SingleFlatMapCompletable.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> mapper;

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar) {
            this.downstream = cVar;
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

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                io.reactivex.rxjava3.core.e apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.e eVar = apply;
                if (h()) {
                    return;
                }
                eVar.subscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    public s(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = xVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(cVar, this.c);
        cVar.onSubscribe(aVar);
        this.b.subscribe(aVar);
    }
}
