package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeOnErrorNext.java */
/* loaded from: classes8.dex */
public final class z<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.o<? extends T>> c;

    /* compiled from: MaybeOnErrorNext.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 2026620218879969836L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.o<? extends T>> resumeFunction;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.z$a$a, reason: collision with other inner class name */
        public static final class C2129a<T> implements io.reactivex.rxjava3.core.m<T> {
            public final io.reactivex.rxjava3.core.m<? super T> b;
            public final a c;

            public C2129a(io.reactivex.rxjava3.core.m mVar, a aVar) {
                this.b = mVar;
                this.c = aVar;
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
                DisposableHelper.e(this.c, cVar);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSuccess(T t) {
                this.b.onSuccess(t);
            }
        }

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.functions.l<? super Throwable, ? extends io.reactivex.rxjava3.core.o<? extends T>> lVar) {
            this.downstream = mVar;
            this.resumeFunction = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.core.o<? extends T> apply = this.resumeFunction.apply(th);
                Objects.requireNonNull(apply, "The resumeFunction returned a null MaybeSource");
                io.reactivex.rxjava3.core.o<? extends T> oVar = apply;
                DisposableHelper.c(this, null);
                oVar.subscribe(new C2129a(this.downstream, this));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public z(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.l lVar) {
        super(kVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
