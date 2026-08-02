package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableOnBackpressureLatest.java */
/* loaded from: classes11.dex */
public final class i0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super T> downstream;
        Throwable error;
        jxm0 upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        public a(axm0<? super T> axm0Var) {
            this.downstream = axm0Var;
        }

        public final boolean a(boolean z, boolean z2, axm0<?> axm0Var, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                atomicReference.lazySet(null);
                axm0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            axm0Var.onComplete();
            return true;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<? super T> axm0Var = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (a(z, z2, axm0Var, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    axm0Var.onNext(andSet);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (a(this.done, atomicReference.get() == null, axm0Var, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    io.reactivex.rxjava3.internal.util.b.d(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            this.current.lazySet(t);
            d();
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
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                d();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var));
    }
}
