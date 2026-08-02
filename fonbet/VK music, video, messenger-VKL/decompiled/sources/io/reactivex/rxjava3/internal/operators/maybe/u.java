package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: MaybeMap.java */
/* loaded from: classes8.dex */
public final class u<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends R> c;

    /* compiled from: MaybeMap.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super R> b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends R> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m<? super R> mVar, io.reactivex.rxjava3.functions.l<? super T, ? extends R> lVar) {
            this.b = mVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            this.d = DisposableHelper.DISPOSED;
            cVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.core.m<? super R> mVar = this.b;
            try {
                R apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                mVar.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.l lVar) {
        super(kVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super R> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
