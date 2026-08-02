package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gsf;

/* compiled from: ObservableSwitchMapMaybe.java */
/* loaded from: classes8.dex */
public final class m<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.q<T> b;
    public final gsf.a c;

    /* compiled from: ObservableSwitchMapMaybe.java */
    public static final class a<T, R> extends AtomicInteger implements v<T>, io.reactivex.rxjava3.disposables.c {
        public static final C2138a<Object> b = new C2138a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        volatile boolean done;
        final v<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.c upstream;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<C2138a<R>> inner = new AtomicReference<>();

        /* compiled from: ObservableSwitchMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.m$a$a, reason: collision with other inner class name */
        public static final class C2138a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            public C2138a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?, R> aVar = this.parent;
                AtomicReference<C2138a<R>> atomicReference = aVar.inner;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.g();
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                AtomicReference<C2138a<R>> atomicReference = aVar.inner;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        io.reactivex.rxjava3.plugins.a.a(th);
                        return;
                    }
                }
                if (aVar.errors.a(th)) {
                    if (!aVar.delayErrors) {
                        aVar.upstream.dispose();
                        aVar.d();
                    }
                    aVar.g();
                }
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                this.item = r;
                this.parent.g();
            }
        }

        public a(v vVar, gsf.a aVar) {
            this.downstream = vVar;
            this.mapper = aVar;
        }

        public final void d() {
            AtomicReference<C2138a<R>> atomicReference = this.inner;
            C2138a<Object> c2138a = b;
            C2138a<Object> c2138a2 = (C2138a) atomicReference.getAndSet(c2138a);
            if (c2138a2 == null || c2138a2 == c2138a) {
                return;
            }
            DisposableHelper.a(c2138a2);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            d();
            this.errors.d();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicReference<C2138a<R>> atomicReference = this.inner;
            int i = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    atomicThrowable.f(vVar);
                    return;
                }
                boolean z = this.done;
                C2138a<R> c2138a = atomicReference.get();
                boolean z2 = c2138a == null;
                if (z && z2) {
                    atomicThrowable.f(vVar);
                    return;
                }
                if (z2 || c2138a.item == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c2138a, null) && atomicReference.get() == c2138a) {
                    }
                    vVar.onNext(c2138a.item);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (!this.delayErrors) {
                    d();
                }
                this.done = true;
                g();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            C2138a<Object> c2138a = b;
            C2138a<R> c2138a2 = this.inner.get();
            if (c2138a2 != null) {
                DisposableHelper.a(c2138a2);
            }
            try {
                io.reactivex.rxjava3.core.o<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.o<? extends R> oVar = apply;
                C2138a<R> c2138a3 = new C2138a<>(this);
                while (true) {
                    C2138a<R> c2138a4 = this.inner.get();
                    if (c2138a4 == c2138a) {
                        return;
                    }
                    AtomicReference<C2138a<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(c2138a4, c2138a3)) {
                        if (atomicReference.get() != c2138a4) {
                            break;
                        }
                    }
                    oVar.subscribe(c2138a3);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.dispose();
                this.inner.getAndSet(c2138a);
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

    public m(io.reactivex.rxjava3.core.q qVar, gsf.a aVar) {
        this.b = qVar;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        io.reactivex.rxjava3.core.q<T> qVar = this.b;
        gsf.a aVar = this.c;
        if (p.b(qVar, aVar, vVar)) {
            return;
        }
        qVar.subscribe(new a(vVar, aVar));
    }
}
