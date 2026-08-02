package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTakeUntilMaybe.java */
/* loaded from: classes8.dex */
public final class f0<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.core.o<U> c;

    /* compiled from: MaybeTakeUntilMaybe.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final C2126a<U> other = new C2126a<>(this);

        /* compiled from: MaybeTakeUntilMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.f0$a$a, reason: collision with other inner class name */
        public static final class C2126a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final a<?, U> parent;

            public C2126a(a<?, U> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSuccess(Object obj) {
                a<?, U> aVar = this.parent;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.downstream.onComplete();
                }
            }
        }

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.downstream = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.other);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t);
            }
        }
    }

    public f0(e eVar, io.reactivex.rxjava3.core.k kVar) {
        super(eVar);
        this.c = kVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        this.c.subscribe(aVar.other);
        this.b.subscribe(aVar);
    }
}
