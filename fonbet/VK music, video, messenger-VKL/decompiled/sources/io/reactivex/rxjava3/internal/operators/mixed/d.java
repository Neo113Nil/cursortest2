package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.d0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ggj0;
import xsna.jxm0;

/* compiled from: FlowableSwitchMapSingle.java */
/* loaded from: classes8.dex */
public final class d<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final d0 c;
    public final ggj0 d;

    /* compiled from: FlowableSwitchMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public static final C2133a<Object> b = new C2133a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super R> downstream;
        long emitted;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> mapper;
        jxm0 upstream;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<C2133a<R>> inner = new AtomicReference<>();

        /* compiled from: FlowableSwitchMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.d$a$a, reason: collision with other inner class name */
        public static final class C2133a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            public C2133a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                AtomicReference<C2133a<R>> atomicReference = aVar.inner;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        io.reactivex.rxjava3.plugins.a.a(th);
                        return;
                    }
                }
                if (aVar.errors.a(th)) {
                    if (!aVar.delayErrors) {
                        aVar.upstream.cancel();
                        aVar.d();
                    }
                    aVar.g();
                }
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                this.item = r;
                this.parent.g();
            }
        }

        public a(axm0 axm0Var, ggj0 ggj0Var) {
            this.downstream = axm0Var;
            this.mapper = ggj0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            d();
            this.errors.d();
        }

        public final void d() {
            AtomicReference<C2133a<R>> atomicReference = this.inner;
            C2133a<Object> c2133a = b;
            C2133a<Object> c2133a2 = (C2133a) atomicReference.getAndSet(c2133a);
            if (c2133a2 == null || c2133a2 == c2133a) {
                return;
            }
            DisposableHelper.a(c2133a2);
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<? super R> axm0Var = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicReference<C2133a<R>> atomicReference = this.inner;
            AtomicLong atomicLong = this.requested;
            long j = this.emitted;
            int i = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    atomicThrowable.g(axm0Var);
                    return;
                }
                boolean z = this.done;
                C2133a<R> c2133a = atomicReference.get();
                boolean z2 = c2133a == null;
                if (z && z2) {
                    atomicThrowable.g(axm0Var);
                    return;
                }
                if (z2 || c2133a.item == null || j == atomicLong.get()) {
                    this.emitted = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c2133a, null) && atomicReference.get() == c2133a) {
                    }
                    axm0Var.onNext(c2133a.item);
                    j++;
                }
            }
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            g();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (!this.delayErrors) {
                    d();
                }
                this.done = true;
                g();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            C2133a<Object> c2133a = b;
            C2133a<R> c2133a2 = this.inner.get();
            if (c2133a2 != null) {
                DisposableHelper.a(c2133a2);
            }
            try {
                b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                b0<? extends R> b0Var = apply;
                C2133a<R> c2133a3 = new C2133a<>(this);
                while (true) {
                    C2133a<R> c2133a4 = this.inner.get();
                    if (c2133a4 == c2133a) {
                        return;
                    }
                    AtomicReference<C2133a<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(c2133a4, c2133a3)) {
                        if (atomicReference.get() != c2133a4) {
                            break;
                        }
                    }
                    b0Var.subscribe(c2133a3);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.cancel();
                this.inner.getAndSet(c2133a);
                onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                jxm0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
            g();
        }
    }

    public d(d0 d0Var, ggj0 ggj0Var) {
        this.c = d0Var;
        this.d = ggj0Var;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d));
    }
}
