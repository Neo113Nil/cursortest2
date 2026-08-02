package io.reactivex.rxjava3.internal.operators.flowable;

import android.R;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableFlatMapSingle.java */
/* loaded from: classes8.dex */
public final class t<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> d;
    public final int e;

    /* compiled from: FlowableFlatMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final axm0<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.b0<? extends R>> mapper;
        final int maxConcurrency;
        jxm0 upstream;
        final boolean delayErrors = false;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.disposables.b set = new io.reactivex.rxjava3.disposables.b();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.rxjava3.internal.queue.b<R>> queue = new AtomicReference<>();

        /* compiled from: FlowableFlatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t$a$a, reason: collision with other inner class name */
        public final class C2122a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<R>, io.reactivex.rxjava3.disposables.c {
            private static final long serialVersionUID = -502562646270949838L;

            public C2122a() {
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
                a aVar = a.this;
                aVar.set.c(this);
                if (aVar.errors.a(th)) {
                    if (!aVar.delayErrors) {
                        aVar.upstream.cancel();
                        aVar.set.dispose();
                    } else if (aVar.maxConcurrency != Integer.MAX_VALUE) {
                        aVar.upstream.request(1L);
                    }
                    aVar.active.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.g();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                a aVar = a.this;
                aVar.set.c(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z = aVar.active.decrementAndGet() == 0;
                        if (aVar.requested.get() != 0) {
                            aVar.downstream.onNext(r);
                            io.reactivex.rxjava3.internal.queue.b<R> bVar = aVar.queue.get();
                            if (z && (bVar == null || bVar.isEmpty())) {
                                aVar.errors.g(aVar.downstream);
                                return;
                            } else {
                                io.reactivex.rxjava3.internal.util.b.d(aVar.requested, 1L);
                                if (aVar.maxConcurrency != Integer.MAX_VALUE) {
                                    aVar.upstream.request(1L);
                                }
                            }
                        } else {
                            io.reactivex.rxjava3.internal.queue.b<R> h = aVar.h();
                            synchronized (h) {
                                h.offer(r);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.g();
                    }
                }
                io.reactivex.rxjava3.internal.queue.b<R> h2 = aVar.h();
                synchronized (h2) {
                    h2.offer(r);
                }
                aVar.active.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.g();
            }
        }

        public a(axm0 axm0Var, io.reactivex.rxjava3.functions.l lVar, int i) {
            this.downstream = axm0Var;
            this.mapper = lVar;
            this.maxConcurrency = i;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
            this.errors.d();
        }

        public final void d() {
            io.reactivex.rxjava3.internal.queue.b<R> bVar = this.queue.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        
            if (r10 != r6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (r17.cancelled == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r17.delayErrors != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        
            if (r17.errors.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            d();
            r17.errors.g(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
        
            if (r2.get() != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        
            if (r7 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
        
            if (r7.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
        
            if (r6 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        
            if (r13 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        
            r17.errors.g(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0071, code lost:
        
            d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        
            if (r10 == 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        
            io.reactivex.rxjava3.internal.util.b.d(r17.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
        
            if (r17.maxConcurrency == Integer.MAX_VALUE) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00be, code lost:
        
            r17.upstream.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g() {
            axm0<? super R> axm0Var = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<io.reactivex.rxjava3.internal.queue.b<R>> atomicReference = this.queue;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (this.cancelled) {
                        d();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        d();
                        this.errors.g(this.downstream);
                        return;
                    }
                    boolean z2 = atomicInteger.get() == 0;
                    io.reactivex.rxjava3.internal.queue.b<R> bVar = atomicReference.get();
                    R poll = bVar != null ? bVar.poll() : null;
                    boolean z3 = poll == null;
                    if (z2 && z3) {
                        this.errors.g(axm0Var);
                        return;
                    } else {
                        if (z3) {
                            break;
                        }
                        axm0Var.onNext(poll);
                        j2++;
                    }
                }
            } while (i != 0);
        }

        public final io.reactivex.rxjava3.internal.queue.b<R> h() {
            io.reactivex.rxjava3.internal.queue.b<R> bVar = this.queue.get();
            if (bVar != null) {
                return bVar;
            }
            io.reactivex.rxjava3.internal.queue.b<R> bVar2 = new io.reactivex.rxjava3.internal.queue.b<>(io.reactivex.rxjava3.core.g.b);
            AtomicReference<io.reactivex.rxjava3.internal.queue.b<R>> atomicReference = this.queue;
            while (!atomicReference.compareAndSet(null, bVar2)) {
                if (atomicReference.get() != null) {
                    return this.queue.get();
                }
            }
            return bVar2;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.active.decrementAndGet();
            if (getAndIncrement() == 0) {
                g();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.a(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                if (getAndIncrement() == 0) {
                    g();
                }
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            try {
                io.reactivex.rxjava3.core.b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.b0<? extends R> b0Var = apply;
                this.active.getAndIncrement();
                C2122a c2122a = new C2122a();
                if (this.cancelled || !this.set.b(c2122a)) {
                    return;
                }
                b0Var.subscribe(c2122a);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    jxm0Var.request(Long.MAX_VALUE);
                } else {
                    jxm0Var.request(i);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                if (getAndIncrement() == 0) {
                    g();
                }
            }
        }
    }

    public t(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.functions.l lVar, int i) {
        super(gVar);
        this.d = lVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d, this.e));
    }
}
