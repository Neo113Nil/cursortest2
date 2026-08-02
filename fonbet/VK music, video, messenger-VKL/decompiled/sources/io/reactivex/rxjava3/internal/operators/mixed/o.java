package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapSingle.java */
/* loaded from: classes11.dex */
public final class o<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.q<T> b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> c;

    /* compiled from: ObservableSwitchMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements v<T>, io.reactivex.rxjava3.disposables.c {
        public static final C2139a<Object> b = new C2139a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        volatile boolean done;
        final v<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.c upstream;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<C2139a<R>> inner = new AtomicReference<>();

        /* compiled from: ObservableSwitchMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.o$a$a, reason: collision with other inner class name */
        public static final class C2139a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            public C2139a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (!n.h(aVar.inner, this)) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                } else if (aVar.errors.a(th)) {
                    if (!aVar.delayErrors) {
                        aVar.upstream.dispose();
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

        public a(v vVar, io.reactivex.rxjava3.functions.l lVar) {
            this.downstream = vVar;
            this.mapper = lVar;
        }

        public final void d() {
            AtomicReference<C2139a<R>> atomicReference = this.inner;
            C2139a<Object> c2139a = b;
            C2139a<Object> c2139a2 = (C2139a) atomicReference.getAndSet(c2139a);
            if (c2139a2 == null || c2139a2 == c2139a) {
                return;
            }
            DisposableHelper.a(c2139a2);
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
            AtomicReference<C2139a<R>> atomicReference = this.inner;
            int i = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    atomicThrowable.f(vVar);
                    return;
                }
                boolean z = this.done;
                C2139a<R> c2139a = atomicReference.get();
                boolean z2 = c2139a == null;
                if (z && z2) {
                    atomicThrowable.f(vVar);
                    return;
                }
                if (z2 || c2139a.item == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c2139a, null) && atomicReference.get() == c2139a) {
                    }
                    vVar.onNext(c2139a.item);
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
            C2139a<Object> c2139a = b;
            C2139a<R> c2139a2 = this.inner.get();
            if (c2139a2 != null) {
                DisposableHelper.a(c2139a2);
            }
            try {
                b0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                b0<? extends R> b0Var = apply;
                C2139a<R> c2139a3 = new C2139a<>(this);
                while (true) {
                    C2139a<R> c2139a4 = this.inner.get();
                    if (c2139a4 == c2139a) {
                        return;
                    }
                    AtomicReference<C2139a<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(c2139a4, c2139a3)) {
                        if (atomicReference.get() != c2139a4) {
                            break;
                        }
                    }
                    b0Var.subscribe(c2139a3);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.dispose();
                this.inner.getAndSet(c2139a);
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

    public o(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = qVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        io.reactivex.rxjava3.core.q<T> qVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> lVar = this.c;
        if (p.c(qVar, lVar, vVar)) {
            return;
        }
        qVar.subscribe(new a(vVar, lVar));
    }
}
