package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleResumeNext.java */
/* loaded from: classes8.dex */
public final class e0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.b0<? extends T>> c;

    /* compiled from: SingleResumeNext.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -5314538511045349925L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.b0<? extends T>> nextFunction;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.b0<? extends T>> lVar) {
            this.downstream = zVar;
            this.nextFunction = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.core.b0<? extends T> apply = this.nextFunction.apply(th);
                Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                apply.subscribe(new io.reactivex.rxjava3.internal.observers.j(this, this.downstream));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public e0(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = xVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
