package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableDoFinally.java */
/* loaded from: classes8.dex */
public final class h extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.functions.a c;

    /* compiled from: CompletableDoFinally.java */
    public static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.functions.a onFinally;
        io.reactivex.rxjava3.disposables.c upstream;

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }

        public final void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    io.reactivex.rxjava3.plugins.a.a(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
            d();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            d();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public h(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar, this.c));
    }
}
