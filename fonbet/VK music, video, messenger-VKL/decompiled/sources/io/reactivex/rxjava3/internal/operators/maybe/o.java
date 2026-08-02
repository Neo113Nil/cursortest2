package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatten.java */
/* loaded from: classes8.dex */
public final class o<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> c;

    /* compiled from: MaybeFlatten.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.rxjava3.core.m<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: MaybeFlatten.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.o$a$a, reason: collision with other inner class name */
        public final class C2128a implements io.reactivex.rxjava3.core.m<R> {
            public C2128a() {
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a.this.downstream.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(a.this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                a.this.downstream.onSuccess(r);
            }
        }

        public a(io.reactivex.rxjava3.core.m<? super R> mVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> lVar) {
            this.downstream = mVar;
            this.mapper = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            this.upstream.dispose();
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
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                io.reactivex.rxjava3.core.o<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.o<? extends R> oVar = apply;
                if (h()) {
                    return;
                }
                oVar.subscribe(new C2128a());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public o(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.functions.l lVar) {
        super(kVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super R> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
