package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeFilterSingle.java */
/* loaded from: classes8.dex */
public final class l<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.m<? super T> c;

    /* compiled from: MaybeFilterSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final io.reactivex.rxjava3.functions.m<? super T> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.functions.m<? super T> mVar2) {
            this.b = mVar;
            this.c = mVar2;
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

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            try {
                if (this.c.test(t)) {
                    mVar.onSuccess(t);
                } else {
                    mVar.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }
    }

    public l(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.m mVar) {
        this.b = xVar;
        this.c = mVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
