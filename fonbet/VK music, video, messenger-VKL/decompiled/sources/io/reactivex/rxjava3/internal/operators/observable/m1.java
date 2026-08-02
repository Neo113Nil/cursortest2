package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* compiled from: ObservableObserveOn.java */
/* loaded from: classes11.dex */
public final class m1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.core.w c;
    public final boolean d;
    public final int e;

    /* compiled from: ObservableObserveOn.java */
    public static final class a<T> extends BasicIntQueueDisposable<T> implements io.reactivex.rxjava3.core.v<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        Throwable error;
        boolean outputFused;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;
        io.reactivex.rxjava3.disposables.c upstream;
        final w.c worker;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, w.c cVar, boolean z, int i) {
            this.downstream = vVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.outputFused = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, io.reactivex.rxjava3.core.v<? super T> vVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.disposed = true;
                if (th != null) {
                    vVar.onError(th);
                } else {
                    vVar.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th != null) {
                this.disposed = true;
                this.queue.clear();
                vVar.onError(th);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.disposed = true;
            vVar.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.worker.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                    io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                    int a = gVar.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.worker.a(this);
                            return;
                        }
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() throws Throwable {
            return this.queue.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        
            if (r3 != 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            if (!this.outputFused) {
                io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
                io.reactivex.rxjava3.core.v<? super T> vVar = this.downstream;
                int i = 1;
                while (!b(this.done, lVar.isEmpty(), vVar)) {
                    while (true) {
                        boolean z = this.done;
                        try {
                            T poll = lVar.poll();
                            boolean z2 = poll == null;
                            if (b(z, z2, vVar)) {
                                return;
                            }
                            if (z2) {
                                break;
                            } else {
                                vVar.onNext(poll);
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.a.b(th);
                            this.disposed = true;
                            this.upstream.dispose();
                            lVar.clear();
                            vVar.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                return;
            }
            int i2 = 1;
            while (!this.disposed) {
                boolean z3 = this.done;
                Throwable th2 = this.error;
                if (!this.delayError && z3 && th2 != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z3) {
                    this.disposed = true;
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        this.downstream.onError(th3);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
    }

    public m1(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar, boolean z, int i) {
        super(qVar);
        this.c = wVar;
        this.d = z;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.core.w wVar = this.c;
        boolean z = wVar instanceof io.reactivex.rxjava3.internal.schedulers.k;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (z) {
            tVar.subscribe(vVar);
        } else {
            tVar.subscribe(new a(vVar, wVar.a(), this.d, this.e));
        }
    }
}
