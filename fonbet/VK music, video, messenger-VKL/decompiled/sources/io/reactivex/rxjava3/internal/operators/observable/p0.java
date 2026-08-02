package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableFlattenIterable.java */
/* loaded from: classes8.dex */
public final class p0<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> c;

    /* compiled from: ObservableFlattenIterable.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super R> b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> lVar) {
            this.b = vVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper) {
                return;
            }
            this.d = disposableHelper;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.d = disposableHelper;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                for (R r : this.c.apply(t)) {
                    try {
                        try {
                            Objects.requireNonNull(r, "The iterator returned a null value");
                            this.b.onNext(r);
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            this.d.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        this.d.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                this.d.dispose();
                onError(th3);
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

    public p0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
