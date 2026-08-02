package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSwitchIfEmptySingle.java */
/* loaded from: classes8.dex */
public final class e0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.k b;
    public final io.reactivex.rxjava3.core.x c;

    /* compiled from: MaybeSwitchIfEmptySingle.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 4603919676453758899L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.core.b0<? extends T> other;

        /* compiled from: MaybeSwitchIfEmptySingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.e0$a$a, reason: collision with other inner class name */
        public static final class C2125a<T> implements io.reactivex.rxjava3.core.z<T> {
            public final io.reactivex.rxjava3.core.z<? super T> b;
            public final a c;

            public C2125a(io.reactivex.rxjava3.core.z zVar, a aVar) {
                this.b = zVar;
                this.c = aVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this.c, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(T t) {
                this.b.onSuccess(t);
            }
        }

        public a(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.z zVar) {
            this.downstream = zVar;
            this.other = xVar;
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
            this.other.subscribe(new C2125a(this.downstream, this));
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

    public e0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.x xVar) {
        this.b = kVar;
        this.c = xVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(this.c, zVar));
    }
}
