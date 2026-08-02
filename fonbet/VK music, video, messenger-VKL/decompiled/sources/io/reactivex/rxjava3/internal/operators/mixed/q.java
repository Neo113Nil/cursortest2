package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapObservable.java */
/* loaded from: classes8.dex */
public final class q<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final x b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> c;

    /* compiled from: SingleFlatMapObservable.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements v<R>, z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8948264376121066672L;
        final v<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> mapper;

        public a(v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends t<? extends R>> lVar) {
            this.downstream = vVar;
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

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                t<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                t<? extends R> tVar = apply;
                if (h()) {
                    return;
                }
                tVar.subscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public q(x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = xVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        a aVar = new a(vVar, this.c);
        vVar.onSubscribe(aVar);
        this.b.subscribe(aVar);
    }
}
