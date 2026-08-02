package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableBuffer.java */
/* loaded from: classes8.dex */
public final class c<T, C extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, C> {
    public final int d;
    public final int e;
    public final io.reactivex.rxjava3.functions.n<C> f;

    /* compiled from: FlowableBuffer.java */
    public static final class a<T, C extends Collection<? super T>> implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public final axm0<? super C> b;
        public final io.reactivex.rxjava3.functions.n<C> c;
        public final int d;
        public C e;
        public jxm0 f;
        public boolean g;
        public int h;

        public a(axm0<? super C> axm0Var, int i, io.reactivex.rxjava3.functions.n<C> nVar) {
            this.b = axm0Var;
            this.d = i;
            this.c = nVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.f.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            C c = this.e;
            this.e = null;
            axm0<? super C> axm0Var = this.b;
            if (c != null) {
                axm0Var.onNext(c);
            }
            axm0Var.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.g) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.e = null;
            this.g = true;
            this.b.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.g) {
                return;
            }
            C c = this.e;
            if (c == null) {
                try {
                    C c2 = this.c.get();
                    Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                    c = c2;
                    this.e = c;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c.add(t);
            int i = this.h + 1;
            if (i != this.d) {
                this.h = i;
                return;
            }
            this.h = 0;
            this.e = null;
            this.b.onNext(c);
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
            if (SubscriptionHelper.e(j)) {
                this.f.request(io.reactivex.rxjava3.internal.util.b.c(j, this.d));
            }
        }
    }

    /* compiled from: FlowableBuffer.java */
    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = -7370244972039324525L;
        final io.reactivex.rxjava3.functions.n<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final axm0<? super C> downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        jxm0 upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        public b(axm0<? super C> axm0Var, int i, int i2, io.reactivex.rxjava3.functions.n<C> nVar) {
            this.downstream = axm0Var;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = nVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        public final boolean d() {
            return this.cancelled;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j = this.produced;
            if (j != 0) {
                io.reactivex.rxjava3.internal.util.b.d(this, j);
            }
            axm0<? super C> axm0Var = this.downstream;
            ArrayDeque<C> arrayDeque = this.buffers;
            if (arrayDeque.isEmpty()) {
                axm0Var.onComplete();
                return;
            }
            b<T, C> bVar = this;
            if (io.reactivex.rxjava3.internal.util.i.d(get(), axm0Var, arrayDeque, bVar, this)) {
                return;
            }
            while (true) {
                long j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    return;
                }
                long j3 = j2 | Long.MIN_VALUE;
                if (compareAndSet(j2, j3)) {
                    if (j2 != 0) {
                        io.reactivex.rxjava3.internal.util.i.d(j3, axm0Var, arrayDeque, bVar, this);
                        return;
                    }
                    return;
                }
                bVar = this;
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i = this.index;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C c = this.bufferSupplier.get();
                    Objects.requireNonNull(c, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(c);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t);
            }
            if (i2 == this.skip) {
                i2 = 0;
            }
            this.index = i2;
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            long j2;
            if (SubscriptionHelper.e(j)) {
                axm0<? super C> axm0Var = this.downstream;
                ArrayDeque<C> arrayDeque = this.buffers;
                do {
                    j2 = get();
                } while (!compareAndSet(j2, io.reactivex.rxjava3.internal.util.b.b(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
                if (j2 == Long.MIN_VALUE) {
                    io.reactivex.rxjava3.internal.util.i.d(j | Long.MIN_VALUE, axm0Var, arrayDeque, this, this);
                    return;
                }
                if (this.once.get() || !this.once.compareAndSet(false, true)) {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.b.c(this.skip, j));
                } else {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.b.b(this.size, io.reactivex.rxjava3.internal.util.b.c(this.skip, j - 1)));
                }
            }
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c$c, reason: collision with other inner class name */
    public static final class C2120c<T, C extends Collection<? super T>> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final io.reactivex.rxjava3.functions.n<C> bufferSupplier;
        boolean done;
        final axm0<? super C> downstream;
        int index;
        final int size;
        final int skip;
        jxm0 upstream;

        public C2120c(axm0<? super C> axm0Var, int i, int i2, io.reactivex.rxjava3.functions.n<C> nVar) {
            this.downstream = axm0Var;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = nVar;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c = this.buffer;
            this.buffer = null;
            if (c != null) {
                this.downstream.onNext(c);
            }
            this.downstream.onComplete();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            C c = this.buffer;
            int i = this.index;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C c2 = this.bufferSupplier.get();
                    Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                    c = c2;
                    this.buffer = c;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c != null) {
                c.add(t);
                if (c.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c);
                }
            }
            if (i2 == this.skip) {
                i2 = 0;
            }
            this.index = i2;
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.b.c(this.skip, j));
                    return;
                }
                this.upstream.request(io.reactivex.rxjava3.internal.util.b.b(io.reactivex.rxjava3.internal.util.b.c(j, this.size), io.reactivex.rxjava3.internal.util.b.c(this.skip - this.size, j - 1)));
            }
        }
    }

    public c(io.reactivex.rxjava3.core.g gVar, int i, ArrayListSupplier arrayListSupplier) {
        super(gVar);
        this.d = i;
        this.e = 1;
        this.f = arrayListSupplier;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super C> axm0Var) {
        io.reactivex.rxjava3.functions.n<C> nVar = this.f;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        int i = this.d;
        int i2 = this.e;
        if (i == i2) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, i, nVar));
        } else if (i2 > i) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new C2120c(axm0Var, i, i2, nVar));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, i, i2, nVar));
        }
    }
}
