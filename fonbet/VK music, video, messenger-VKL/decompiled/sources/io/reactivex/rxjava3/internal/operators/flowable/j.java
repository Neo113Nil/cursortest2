package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.fw3;
import xsna.jxm0;
import xsna.pvg0;

/* compiled from: FlowableCreate.java */
/* loaded from: classes11.dex */
public final class j<T> extends io.reactivex.rxjava3.core.g<T> {
    public final pvg0 c;
    public final BackpressureStrategy d;

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            a = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final io.reactivex.rxjava3.internal.queue.b<T> queue;
        final AtomicInteger wip;

        public c(axm0<? super T> axm0Var, int i) {
            super(axm0Var);
            this.queue = new io.reactivex.rxjava3.internal.queue.b<>(i);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final void j() {
            m();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final void k() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final boolean l(Throwable th) {
            if (this.done || this.serial.h()) {
                return false;
            }
            this.error = th;
            this.done = true;
            m();
            return true;
        }

        public final void m() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            axm0<? super T> axm0Var = this.downstream;
            io.reactivex.rxjava3.internal.queue.b<T> bVar = this.queue;
            int i = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.serial.h()) {
                        bVar.clear();
                        return;
                    }
                    boolean z = this.done;
                    T poll = bVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            e(th);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    axm0Var.onNext(poll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.serial.h()) {
                        bVar.clear();
                        return;
                    }
                    boolean z3 = this.done;
                    boolean isEmpty = bVar.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.rxjava3.internal.util.b.d(this, j2);
                }
                i = this.wip.addAndGet(-i);
            } while (i != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b, io.reactivex.rxjava3.core.f
        public final void onComplete() {
            this.done = true;
            m();
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            if (this.done || this.serial.h()) {
                return;
            }
            if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
            } else {
                this.queue.offer(t);
                m();
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public e(axm0<? super T> axm0Var) {
            super(axm0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.h
        public final void m() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        public f(axm0<? super T> axm0Var) {
            super(axm0Var);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final void j() {
            m();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final void k() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b
        public final boolean l(Throwable th) {
            if (this.done || this.serial.h()) {
                return false;
            }
            this.error = th;
            this.done = true;
            m();
            return true;
        }

        public final void m() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            axm0<? super T> axm0Var = this.downstream;
            AtomicReference<T> atomicReference = this.queue;
            int i = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.serial.h()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            e(th);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    axm0Var.onNext(andSet);
                    j2++;
                }
                if (j2 == j) {
                    if (this.serial.h()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.done;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            e(th2);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.rxjava3.internal.util.b.d(this, j2);
                }
                i = this.wip.addAndGet(-i);
            } while (i != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.b, io.reactivex.rxjava3.core.f
        public final void onComplete() {
            this.done = true;
            m();
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            if (this.done || this.serial.h()) {
                return;
            }
            if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
            } else {
                this.queue.set(t);
                m();
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public g(axm0<? super T> axm0Var) {
            super(axm0Var);
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            long j;
            if (this.serial.h()) {
                return;
            }
            if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
                return;
            }
            this.downstream.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public abstract void m();

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            if (this.serial.h()) {
                return;
            }
            if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
            } else if (get() == 0) {
                m();
            } else {
                this.downstream.onNext(t);
                io.reactivex.rxjava3.internal.util.b.d(this, 1L);
            }
        }
    }

    public j(pvg0 pvg0Var, BackpressureStrategy backpressureStrategy) {
        this.c = pvg0Var;
        this.d = backpressureStrategy;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        int i = a.a[this.d.ordinal()];
        b cVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new c(axm0Var, io.reactivex.rxjava3.core.g.b) : new f(axm0Var) : new d(axm0Var) : new e(axm0Var) : new g(axm0Var);
        axm0Var.onSubscribe(cVar);
        try {
            this.c.subscribe(cVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            cVar.onError(th);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static abstract class b<T> extends AtomicLong implements io.reactivex.rxjava3.core.h<T>, jxm0 {
        private static final long serialVersionUID = 7326289992464377023L;
        final axm0<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        public b(axm0<? super T> axm0Var) {
            this.downstream = axm0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.serial;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            k();
        }

        public final void d() {
            if (this.serial.h()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                SequentialDisposable sequentialDisposable = this.serial;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
            }
        }

        public final boolean e(Throwable th) {
            if (this.serial.h()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                SequentialDisposable sequentialDisposable = this.serial;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                return true;
            } catch (Throwable th2) {
                SequentialDisposable sequentialDisposable2 = this.serial;
                sequentialDisposable2.getClass();
                DisposableHelper.a(sequentialDisposable2);
                throw th2;
            }
        }

        public final boolean g() {
            return this.serial.h();
        }

        public final void i(io.reactivex.rxjava3.disposables.c cVar) {
            SequentialDisposable sequentialDisposable = this.serial;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, cVar);
        }

        public boolean l(Throwable th) {
            return e(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            d();
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onError(Throwable th) {
            if (l(th)) {
                return;
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this, j);
                j();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return fw3.c(getClass().getSimpleName(), "{", super.toString(), "}");
        }

        public void j() {
        }

        public void k() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes8.dex */
    public static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(axm0<? super T> axm0Var) {
            super(axm0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.j.h
        public final void m() {
        }
    }
}
