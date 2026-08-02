package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableElementAtMaybe.java */
/* loaded from: classes8.dex */
public final class e0<T> extends io.reactivex.rxjava3.core.k<T> implements io.reactivex.rxjava3.internal.fuseable.f<T> {
    public final io.reactivex.rxjava3.core.q b;

    /* compiled from: ObservableElementAtMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;
        public long d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.m mVar) {
            this.b = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.e = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            long j = this.d;
            if (j != 0) {
                this.d = j + 1;
                return;
            }
            this.e = true;
            this.c.dispose();
            this.b.onSuccess(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public e0(io.reactivex.rxjava3.core.q qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<T> b() {
        return new d0(this.b, null, false);
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar));
    }
}
