package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableDelay.java */
/* loaded from: classes8.dex */
public final class k<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;

    /* compiled from: FlowableDelay.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public final axm0<? super T> b;
        public final long c;
        public final TimeUnit d;
        public final w.c e;
        public jxm0 f;

        /* compiled from: FlowableDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k$a$a, reason: collision with other inner class name */
        public final class RunnableC2121a implements Runnable {
            public RunnableC2121a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.b.onComplete();
                } finally {
                    aVar.e.dispose();
                }
            }
        }

        /* compiled from: FlowableDelay.java */
        public final class b implements Runnable {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.b.onError(this.b);
                } finally {
                    aVar.e.dispose();
                }
            }
        }

        /* compiled from: FlowableDelay.java */
        public final class c implements Runnable {
            public final T b;

            public c(T t) {
                this.b = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.b.onNext(this.b);
            }
        }

        public a(axm0 axm0Var, long j, TimeUnit timeUnit, w.c cVar) {
            this.b = axm0Var;
            this.c = j;
            this.d = timeUnit;
            this.e = cVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.f.cancel();
            this.e.dispose();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.e.b(new RunnableC2121a(), this.c, this.d);
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.e.b(new b(th), 0L, this.d);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.e.b(new c(t), this.c, this.d);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.f, jxm0Var)) {
                this.f = jxm0Var;
                this.b.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            this.f.request(j);
        }
    }

    public k(io.reactivex.rxjava3.core.g gVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        super(gVar);
        this.d = j;
        this.e = timeUnit;
        this.f = wVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(new io.reactivex.rxjava3.subscribers.a(axm0Var), this.d, this.e, this.f.a()));
    }
}
