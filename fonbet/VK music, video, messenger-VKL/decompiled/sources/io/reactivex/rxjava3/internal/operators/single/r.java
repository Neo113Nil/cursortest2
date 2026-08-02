package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMap.java */
/* loaded from: classes11.dex */
public final class r<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> c;

    /* compiled from: SingleFlatMap.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 3258103020495908596L;
        final io.reactivex.rxjava3.core.z<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> mapper;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.r$a$a, reason: collision with other inner class name */
        public static final class C2155a<R> implements io.reactivex.rxjava3.core.z<R> {
            public final a b;
            public final io.reactivex.rxjava3.core.z<? super R> c;

            public C2155a(a aVar, io.reactivex.rxjava3.core.z zVar) {
                this.b = aVar;
                this.c = zVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                this.c.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this.b, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                this.c.onSuccess(r);
            }
        }

        public a(io.reactivex.rxjava3.core.z<? super R> zVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> lVar) {
            this.downstream = zVar;
            this.mapper = lVar;
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
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                io.reactivex.rxjava3.core.b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The single returned by the mapper is null");
                io.reactivex.rxjava3.core.b0<? extends R> b0Var = apply;
                if (h()) {
                    return;
                }
                b0Var.subscribe(new C2155a(this, this.downstream));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.c = lVar;
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
