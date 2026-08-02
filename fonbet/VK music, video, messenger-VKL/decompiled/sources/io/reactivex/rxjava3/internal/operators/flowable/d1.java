package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableZip.java */
/* loaded from: classes8.dex */
public final class d1<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final ffe0<? extends T>[] c;
    public final a.b d;
    public final int e;

    /* compiled from: FlowableZip.java */
    public static final class a<T, R> extends AtomicInteger implements jxm0 {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors = false;
        final axm0<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final b<T, R>[] subscribers;
        final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> zipper;

        public a(axm0 axm0Var, a.b bVar, int i, int i2) {
            this.downstream = axm0Var;
            this.zipper = bVar;
            b<T, R>[] bVarArr = new b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new b<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = bVarArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            d();
        }

        public final void d() {
            for (b<T, R> bVar : this.subscribers) {
                bVar.getClass();
                SubscriptionHelper.a(bVar);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0109, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x012a, code lost:
        
            if (r12 == r18) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
        
            r0 = r3.length;
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
        
            if (r6 >= r0) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
        
            r3[r6].request(r12);
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0140, code lost:
        
            if (r8 == Long.MAX_VALUE) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0142, code lost:
        
            r20.requested.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0148, code lost:
        
            r7 = addAndGet(-r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c2, code lost:
        
            if (r8 != r12) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c6, code lost:
        
            if (r20.cancelled == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
        
            if (r20.delayErrors != false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
        
            if (r20.errors.get() == null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
        
            d();
            r20.errors.g(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00e1, code lost:
        
            if (r6 >= r4) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00e3, code lost:
        
            r0 = r3[r6];
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
        
            if (r5[r6] != null) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00e9, code lost:
        
            r10 = r0.done;
            r0 = r0.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00ed, code lost:
        
            if (r0 == null) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x010d, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x010e, code lost:
        
            if (r0 != null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
        
            if (r10 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0116, code lost:
        
            if (r11 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0118, code lost:
        
            d();
            r20.errors.g(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0120, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0121, code lost:
        
            if (r11 != false) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
        
            r5[r6] = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0125, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0112, code lost:
        
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00ef, code lost:
        
            r0 = r0.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00f4, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f5, code lost:
        
            io.reactivex.rxjava3.exceptions.a.b(r0);
            r20.errors.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
        
            if (r20.delayErrors == false) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x010a, code lost:
        
            r0 = null;
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0101, code lost:
        
            d();
            r20.errors.g(r2);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g() {
            long j;
            T t;
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<? super R> axm0Var = this.downstream;
            b<T, R>[] bVarArr = this.subscribers;
            int length = bVarArr.length;
            Object[] objArr = this.current;
            int i = 1;
            do {
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    if (j2 == j3) {
                        j = 0;
                        break;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        d();
                        this.errors.g(axm0Var);
                        return;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        b<T, R> bVar = bVarArr[i2];
                        if (objArr[i2] == null) {
                            boolean z2 = bVar.done;
                            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = bVar.queue;
                            if (lVar != null) {
                                try {
                                    t = lVar.poll();
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.a.b(th);
                                    this.errors.a(th);
                                    if (!this.delayErrors) {
                                        d();
                                        this.errors.g(axm0Var);
                                        return;
                                    } else {
                                        t = null;
                                        z2 = true;
                                    }
                                }
                            } else {
                                t = null;
                            }
                            boolean z3 = t == null;
                            if (z2 && z3) {
                                d();
                                this.errors.g(axm0Var);
                                return;
                            } else if (z3) {
                                z = true;
                            } else {
                                objArr[i2] = t;
                            }
                        }
                    }
                    j = 0;
                    if (z) {
                        break;
                    }
                    try {
                        R apply = this.zipper.apply(objArr.clone());
                        Objects.requireNonNull(apply, "The zipper returned a null value");
                        axm0Var.onNext(apply);
                        j3++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        d();
                        this.errors.a(th2);
                        this.errors.g(axm0Var);
                        return;
                    }
                }
            } while (i != 0);
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                g();
            }
        }

        public void subscribe(ffe0<? extends T>[] ffe0VarArr, int i) {
            b<T, R>[] bVarArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                ffe0VarArr[i2].subscribe(bVarArr[i2]);
            }
        }
    }

    /* compiled from: FlowableZip.java */
    public static final class b<T, R> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final a<T, R> parent;
        final int prefetch;
        long produced;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;

        public b(a<T, R> aVar, int i) {
            this.parent = aVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            SubscriptionHelper.a(this);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            this.parent.g();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            a<T, R> aVar = this.parent;
            if (aVar.errors.a(th)) {
                this.done = true;
                aVar.g();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.g();
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.d(this, jxm0Var)) {
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = iVar;
                        this.done = true;
                        this.parent.g();
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = a;
                        this.queue = iVar;
                        jxm0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                jxm0Var.request(this.prefetch);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 < this.limit) {
                    this.produced = j2;
                } else {
                    this.produced = 0L;
                    get().request(j2);
                }
            }
        }
    }

    public d1(ffe0[] ffe0VarArr, a.b bVar, int i) {
        this.c = ffe0VarArr;
        this.d = bVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        ffe0<? extends T>[] ffe0VarArr = this.c;
        ffe0VarArr.getClass();
        int length = ffe0VarArr.length;
        if (length == 0) {
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onComplete();
        } else {
            a aVar = new a(axm0Var, this.d, length, this.e);
            axm0Var.onSubscribe(aVar);
            aVar.subscribe(ffe0VarArr, length);
        }
    }
}
