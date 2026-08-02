package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableLastSingle.java */
/* loaded from: classes8.dex */
public final class i1<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.q b;

    /* compiled from: ObservableLastSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;
        public T d;

        public a(io.reactivex.rxjava3.core.z zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.c = DisposableHelper.DISPOSED;
            T t = this.d;
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            if (t == null) {
                zVar.onError(new NoSuchElementException());
            } else {
                this.d = null;
                zVar.onSuccess(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.c = DisposableHelper.DISPOSED;
            this.d = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.d = t;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public i1(io.reactivex.rxjava3.core.q qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
