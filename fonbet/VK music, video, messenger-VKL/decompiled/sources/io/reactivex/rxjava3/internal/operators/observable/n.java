package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCombineLatest.java */
/* loaded from: classes11.dex */
public final class n<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.t<? extends T>[] b;
    public final Iterable<? extends io.reactivex.rxjava3.core.t<? extends T>> c;
    public final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> d;
    public final int e;

    /* compiled from: ObservableCombineLatest.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final b<T, R> parent;

        public a(b<T, R> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        
            if (r4 == r2.length) goto L17;
         */
        @Override // io.reactivex.rxjava3.core.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onComplete() {
            b<T, R> bVar = this.parent;
            int i = this.index;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.latest;
                    if (objArr == null) {
                        return;
                    }
                    boolean z = objArr[i] == null;
                    if (!z) {
                        int i2 = bVar.complete + 1;
                        bVar.complete = i2;
                    }
                    bVar.done = true;
                    if (z) {
                        bVar.d();
                    }
                    bVar.g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        
            if (r3 == r5.length) goto L20;
         */
        @Override // io.reactivex.rxjava3.core.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th) {
            b<T, R> bVar = this.parent;
            int i = this.index;
            if (bVar.errors.a(th)) {
                boolean z = true;
                if (bVar.delayError) {
                    synchronized (bVar) {
                        try {
                            Object[] objArr = bVar.latest;
                            if (objArr == null) {
                                return;
                            }
                            boolean z2 = objArr[i] == null;
                            if (!z2) {
                                int i2 = bVar.complete + 1;
                                bVar.complete = i2;
                            }
                            bVar.done = true;
                            z = z2;
                        } finally {
                        }
                    }
                }
                if (z) {
                    bVar.d();
                }
                bVar.g();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            boolean z;
            b<T, R> bVar = this.parent;
            int i = this.index;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.latest;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i];
                    int i2 = bVar.active;
                    if (obj == null) {
                        i2++;
                        bVar.active = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        bVar.queue.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        bVar.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }
    }

    /* compiled from: ObservableCombineLatest.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> combiner;
        int complete;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        Object[] latest;
        final a<T, R>[] observers;
        final io.reactivex.rxjava3.internal.queue.b<Object[]> queue;
        final AtomicThrowable errors = new AtomicThrowable();
        final boolean delayError = false;

        public b(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.functions.l lVar, int i, int i2) {
            this.downstream = vVar;
            this.combiner = lVar;
            this.latest = new Object[i];
            a<T, R>[] aVarArr = new a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new a<>(this, i3);
            }
            this.observers = aVarArr;
            this.queue = new io.reactivex.rxjava3.internal.queue.b<>(i2);
        }

        public final void d() {
            for (a<T, R> aVar : this.observers) {
                aVar.getClass();
                DisposableHelper.a(aVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            d();
            g();
        }

        public final void e(io.reactivex.rxjava3.internal.queue.b<?> bVar) {
            synchronized (this) {
                this.latest = null;
            }
            bVar.clear();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.b<Object[]> bVar = this.queue;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            boolean z = this.delayError;
            int i = 1;
            while (!this.cancelled) {
                if (!z && this.errors.get() != null) {
                    d();
                    e(bVar);
                    this.errors.f(vVar);
                    return;
                }
                boolean z2 = this.done;
                Object[] poll = bVar.poll();
                boolean z3 = poll == null;
                if (z2 && z3) {
                    e(bVar);
                    this.errors.f(vVar);
                    return;
                }
                if (z3) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.combiner.apply(poll);
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        vVar.onNext(apply);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.errors.a(th);
                        d();
                        e(bVar);
                        this.errors.f(vVar);
                        return;
                    }
                }
            }
            e(bVar);
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        public void subscribe(io.reactivex.rxjava3.core.t<? extends T>[] tVarArr) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                tVarArr[i].subscribe(aVarArr[i]);
            }
        }
    }

    public n(io.reactivex.rxjava3.core.t[] tVarArr, Iterable iterable, io.reactivex.rxjava3.functions.l lVar, int i) {
        this.b = tVarArr;
        this.c = iterable;
        this.d = lVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        int length;
        io.reactivex.rxjava3.core.t<? extends T>[] tVarArr = this.b;
        if (tVarArr == null) {
            tVarArr = new io.reactivex.rxjava3.core.t[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.t<? extends T> tVar : this.c) {
                    if (length == tVarArr.length) {
                        io.reactivex.rxjava3.core.t<? extends T>[] tVarArr2 = new io.reactivex.rxjava3.core.t[(length >> 2) + length];
                        System.arraycopy(tVarArr, 0, tVarArr2, 0, length);
                        tVarArr = tVarArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(tVar, "The Iterator returned a null ObservableSource");
                    tVarArr[length] = tVar;
                    length = i;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th);
                return;
            }
        } else {
            length = tVarArr.length;
        }
        if (length != 0) {
            new b(vVar, this.d, length, this.e).subscribe(tVarArr);
        } else {
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onComplete();
        }
    }
}
