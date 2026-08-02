package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleDelayWithCompletable.java */
/* loaded from: classes8.dex */
public final class e<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.b0<T> b;
    public final io.reactivex.rxjava3.core.a c;

    /* compiled from: SingleDelayWithCompletable.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.core.b0<T> source;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.core.b0<T> b0Var) {
            this.downstream = zVar;
            this.source = b0Var;
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
            this.source.subscribe(new io.reactivex.rxjava3.internal.observers.j(this, this.downstream));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public e(io.reactivex.rxjava3.core.b0 b0Var, io.reactivex.rxjava3.core.a aVar) {
        this.b = b0Var;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.c.subscribe(new a(zVar, this.b));
    }
}
