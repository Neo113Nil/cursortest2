package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableAnySingle.java */
/* loaded from: classes8.dex */
public final class e<T> extends io.reactivex.rxjava3.core.x<Boolean> implements io.reactivex.rxjava3.internal.fuseable.f<Boolean> {
    public final io.reactivex.rxjava3.core.q b;
    public final io.reactivex.rxjava3.functions.m<? super T> c;

    /* compiled from: ObservableAnySingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super Boolean> b;
        public final io.reactivex.rxjava3.functions.m<? super T> c;
        public io.reactivex.rxjava3.disposables.c d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.z<? super Boolean> zVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            this.b = zVar;
            this.c = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.onSuccess(Boolean.FALSE);
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
            try {
                if (this.c.test(t)) {
                    this.e = true;
                    this.d.dispose();
                    this.b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public e(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.m mVar) {
        this.b = qVar;
        this.c = mVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<Boolean> b() {
        return new d(this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super Boolean> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
