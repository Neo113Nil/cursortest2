package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.w2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleDelayWithObservable.java */
/* loaded from: classes8.dex */
public final class f<T, U> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final w2 c;

    /* compiled from: SingleDelayWithObservable.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<U>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.core.b0<T> source;

        public a(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.z zVar) {
            this.downstream = zVar;
            this.source = xVar;
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
            if (this.done) {
                return;
            }
            this.done = true;
            this.source.subscribe(new io.reactivex.rxjava3.internal.observers.j(this, this.downstream));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(U u) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public f(io.reactivex.rxjava3.core.x xVar, w2 w2Var) {
        this.b = xVar;
        this.c = w2Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.c.subscribe(new a(this.b, zVar));
    }
}
