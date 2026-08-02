package io.reactivex.rxjava3.internal.operators.observable;

import android.R;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMap.java */
/* loaded from: classes11.dex */
public final class n2<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> c;
    public final int d;

    /* compiled from: ObservableSwitchMap.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final b<T, R> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.l<R> queue;

        public a(b<T, R> bVar, long j, int i) {
            this.parent = bVar;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.d();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            b<T, R> bVar = this.parent;
            bVar.getClass();
            if (this.index == bVar.unique) {
                AtomicThrowable atomicThrowable = bVar.errors;
                atomicThrowable.getClass();
                if (io.reactivex.rxjava3.internal.util.f.a(atomicThrowable, th)) {
                    if (!bVar.delayErrors) {
                        bVar.upstream.dispose();
                        bVar.done = true;
                    }
                    this.done = true;
                    bVar.d();
                    return;
                }
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.d();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                    io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                    int a = gVar.a(7);
                    if (a == 1) {
                        this.queue = gVar;
                        this.done = true;
                        this.parent.d();
                        return;
                    } else if (a == 2) {
                        this.queue = gVar;
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
            }
        }
    }

    /* compiled from: ObservableSwitchMap.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public static final a<Object, Object> b;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> mapper;
        volatile long unique;
        io.reactivex.rxjava3.disposables.c upstream;
        final AtomicReference<a<T, R>> active = new AtomicReference<>();
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            b = aVar;
            DisposableHelper.a(aVar);
        }

        public b(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.functions.l lVar, int i) {
            this.downstream = vVar;
            this.mapper = lVar;
            this.bufferSize = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0010 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d() {
            io.reactivex.rxjava3.internal.fuseable.l<R> lVar;
            R r;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            AtomicReference<a<T, R>> atomicReference = this.active;
            boolean z = this.delayErrors;
            int i = 1;
            while (!this.cancelled) {
                if (this.done) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            Throwable th = this.errors.get();
                            if (th != null) {
                                vVar.onError(th);
                                return;
                            } else {
                                vVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.errors.get() != null) {
                        this.errors.f(vVar);
                        return;
                    } else if (z2) {
                        vVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (lVar = aVar.queue) != null) {
                    boolean z3 = false;
                    while (!this.cancelled) {
                        if (aVar == atomicReference.get()) {
                            if (!z && this.errors.get() != null) {
                                this.errors.f(vVar);
                                return;
                            }
                            boolean z4 = aVar.done;
                            try {
                                r = lVar.poll();
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.b(th2);
                                this.errors.a(th2);
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                                if (z) {
                                    DisposableHelper.a(aVar);
                                } else {
                                    a aVar2 = (a) this.active.getAndSet(b);
                                    if (aVar2 != null) {
                                        DisposableHelper.a(aVar2);
                                    }
                                    this.upstream.dispose();
                                    this.done = true;
                                }
                                z3 = true;
                                r = null;
                            }
                            boolean z5 = r == null;
                            if (z4 && z5) {
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            } else if (!z5) {
                                vVar.onNext(r);
                            } else if (!z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                    }
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            a aVar = (a) this.active.getAndSet(b);
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            a aVar;
            if (!this.done) {
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                if (io.reactivex.rxjava3.internal.util.f.a(atomicThrowable, th)) {
                    if (!this.delayErrors && (aVar = (a) this.active.getAndSet(b)) != null) {
                        DisposableHelper.a(aVar);
                    }
                    this.done = true;
                    d();
                    return;
                }
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            long j = this.unique + 1;
            this.unique = j;
            a<T, R> aVar = this.active.get();
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            try {
                io.reactivex.rxjava3.core.t<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The ObservableSource returned is null");
                io.reactivex.rxjava3.core.t<? extends R> tVar = apply;
                a<T, R> aVar2 = new a<>(this, j, this.bufferSize);
                while (true) {
                    a<T, R> aVar3 = this.active.get();
                    if (aVar3 == b) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.active;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    tVar.subscribe(aVar2);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public n2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, int i) {
        super(qVar);
        this.c = lVar;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> lVar = this.c;
        if (ObservableScalarXMap.a(tVar, vVar, lVar)) {
            return;
        }
        tVar.subscribe(new b(vVar, lVar, this.d));
    }
}
