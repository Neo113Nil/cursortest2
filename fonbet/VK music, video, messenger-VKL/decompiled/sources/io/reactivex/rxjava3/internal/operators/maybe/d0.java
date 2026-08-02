package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSwitchIfEmpty.java */
/* loaded from: classes8.dex */
public final class d0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.core.k c;

    /* compiled from: MaybeSwitchIfEmpty.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2223459372976438024L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final io.reactivex.rxjava3.core.o<? extends T> other;

        /* compiled from: MaybeSwitchIfEmpty.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.d0$a$a, reason: collision with other inner class name */
        public static final class C2124a<T> implements io.reactivex.rxjava3.core.m<T> {
            public final io.reactivex.rxjava3.core.m<? super T> b;
            public final a c;

            public C2124a(io.reactivex.rxjava3.core.m mVar, a aVar) {
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

        public a(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.m mVar) {
            this.downstream = mVar;
            this.other = kVar;
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
            io.reactivex.rxjava3.disposables.c cVar = get();
            if (cVar == DisposableHelper.DISPOSED || !compareAndSet(cVar, null)) {
                return;
            }
            this.other.subscribe(new C2124a(this.downstream, this));
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
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

    public d0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.k kVar2) {
        super(kVar);
        this.c = kVar2;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(this.c, mVar));
    }
}
