package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Objects;

/* compiled from: ObservableScanSeed.java */
/* loaded from: classes8.dex */
public final class f2<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.c<R, ? super T, R> c;
    public final a.r d;

    /* compiled from: ObservableScanSeed.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super R> b;
        public final io.reactivex.rxjava3.functions.c<R, ? super T, R> c;
        public R d;
        public io.reactivex.rxjava3.disposables.c e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.c<R, ? super T, R> cVar, R r) {
            this.b = vVar;
            this.c = cVar;
            this.d = r;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                R apply = this.c.apply(this.d, t);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.d = apply;
                this.b.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.e, cVar)) {
                this.e = cVar;
                io.reactivex.rxjava3.core.v<? super R> vVar = this.b;
                vVar.onSubscribe(this);
                vVar.onNext(this.d);
            }
        }
    }

    public f2(io.reactivex.rxjava3.core.q qVar, a.r rVar, io.reactivex.rxjava3.functions.c cVar) {
        super(qVar);
        this.c = cVar;
        this.d = rVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        try {
            U u = this.d.b;
            Objects.requireNonNull(u, "The seed supplied is null");
            this.b.subscribe(new a(vVar, this.c, u));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
