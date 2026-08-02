package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SingleDoFinally.java */
/* loaded from: classes8.dex */
public final class j<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.a c;

    /* compiled from: SingleDoFinally.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.functions.a onFinally;
        io.reactivex.rxjava3.disposables.c upstream;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.functions.a aVar) {
            this.downstream = zVar;
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

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            d();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
            d();
        }
    }

    public j(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.a aVar) {
        this.b = xVar;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
