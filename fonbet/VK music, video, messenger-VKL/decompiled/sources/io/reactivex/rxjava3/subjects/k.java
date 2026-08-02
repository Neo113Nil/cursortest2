package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UnicastSubject.java */
/* loaded from: classes8.dex */
public final class k<T> extends j<T> {
    public final io.reactivex.rxjava3.internal.queue.b<T> b;
    public final AtomicReference<Runnable> d;
    public volatile boolean f;
    public volatile boolean g;
    public Throwable h;
    public boolean k;
    public final boolean e = true;
    public final AtomicReference<v<? super T>> c = new AtomicReference<>();
    public final AtomicBoolean i = new AtomicBoolean();
    public final a j = new a();

    /* compiled from: UnicastSubject.java */
    public final class a extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public a() {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            k.this.k = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            k.this.b.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (k.this.f) {
                return;
            }
            k.this.f = true;
            k.this.O0();
            k.this.c.lazySet(null);
            if (k.this.j.getAndIncrement() == 0) {
                k.this.c.lazySet(null);
                k kVar = k.this;
                if (kVar.k) {
                    return;
                }
                kVar.b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return k.this.f;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return k.this.b.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            return k.this.b.poll();
        }
    }

    public k(int i, Runnable runnable) {
        this.b = new io.reactivex.rxjava3.internal.queue.b<>(i);
        this.d = new AtomicReference<>(runnable);
    }

    public static <T> k<T> N0(int i, Runnable runnable) {
        io.reactivex.rxjava3.internal.functions.b.a(i, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new k<>(i, runnable);
    }

    public final void O0() {
        AtomicReference<Runnable> atomicReference = this.d;
        Runnable runnable = atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void P0() {
        Throwable th;
        if (this.j.getAndIncrement() != 0) {
            return;
        }
        v<? super T> vVar = this.c.get();
        int i = 1;
        int i2 = 1;
        while (vVar == null) {
            i2 = this.j.addAndGet(-i2);
            if (i2 == 0) {
                return;
            } else {
                vVar = this.c.get();
            }
        }
        if (this.k) {
            io.reactivex.rxjava3.internal.queue.b<T> bVar = this.b;
            boolean z = this.e;
            while (!this.f) {
                boolean z2 = this.g;
                if (!z && z2 && (th = this.h) != null) {
                    this.c.lazySet(null);
                    bVar.clear();
                    vVar.onError(th);
                    return;
                }
                vVar.onNext(null);
                if (z2) {
                    this.c.lazySet(null);
                    Throwable th2 = this.h;
                    if (th2 != null) {
                        vVar.onError(th2);
                        return;
                    } else {
                        vVar.onComplete();
                        return;
                    }
                }
                i = this.j.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            this.c.lazySet(null);
            return;
        }
        io.reactivex.rxjava3.internal.queue.b<T> bVar2 = this.b;
        boolean z3 = this.e;
        boolean z4 = true;
        int i3 = 1;
        while (!this.f) {
            boolean z5 = this.g;
            T poll = this.b.poll();
            boolean z6 = poll == null;
            if (z5) {
                if (!z3 && z4) {
                    Throwable th3 = this.h;
                    if (th3 != null) {
                        this.c.lazySet(null);
                        bVar2.clear();
                        vVar.onError(th3);
                        return;
                    }
                    z4 = false;
                }
                if (z6) {
                    this.c.lazySet(null);
                    Throwable th4 = this.h;
                    if (th4 != null) {
                        vVar.onError(th4);
                        return;
                    } else {
                        vVar.onComplete();
                        return;
                    }
                }
            }
            if (z6) {
                i3 = this.j.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                vVar.onNext(poll);
            }
        }
        this.c.lazySet(null);
        bVar2.clear();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (this.g || this.f) {
            return;
        }
        this.g = true;
        O0();
        P0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        if (this.g || this.f) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.h = th;
        this.g = true;
        O0();
        P0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onNext called with a null value.");
        if (this.g || this.f) {
            return;
        }
        this.b.offer(t);
        P0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.g || this.f) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        if (this.i.get() || !this.i.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("Only a single observer allowed.");
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(illegalStateException);
        } else {
            vVar.onSubscribe(this.j);
            this.c.lazySet(vVar);
            if (this.f) {
                this.c.lazySet(null);
            } else {
                P0();
            }
        }
    }
}
