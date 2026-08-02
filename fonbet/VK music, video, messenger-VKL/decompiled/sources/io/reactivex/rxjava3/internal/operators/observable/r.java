package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.y34;

/* compiled from: ObservableDebounce.java */
/* loaded from: classes8.dex */
public final class r<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final y34 c;

    /* compiled from: ObservableDebounce.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.observers.e b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<U>> c;
        public io.reactivex.rxjava3.disposables.c d;
        public final AtomicReference<io.reactivex.rxjava3.disposables.c> e = new AtomicReference<>();
        public volatile long f;
        public boolean g;

        /* compiled from: ObservableDebounce.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.r$a$a, reason: collision with other inner class name */
        public static final class C2147a<T, U> extends io.reactivex.rxjava3.observers.a<U> {
            public final a<T, U> c;
            public final long d;
            public final T e;
            public boolean f;
            public final AtomicBoolean g = new AtomicBoolean();

            public C2147a(a<T, U> aVar, long j, T t) {
                this.c = aVar;
                this.d = j;
                this.e = t;
            }

            public final void a() {
                if (this.g.compareAndSet(false, true)) {
                    a<T, U> aVar = this.c;
                    long j = this.d;
                    T t = this.e;
                    if (j == aVar.f) {
                        aVar.b.onNext(t);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                if (this.f) {
                    return;
                }
                this.f = true;
                a();
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                if (this.f) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                } else {
                    this.f = true;
                    this.c.onError(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(U u) {
                if (this.f) {
                    return;
                }
                this.f = true;
                dispose();
                a();
            }
        }

        public a(io.reactivex.rxjava3.observers.e eVar, y34 y34Var) {
            this.b = eVar;
            this.c = y34Var;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
            DisposableHelper.a(this.e);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.e;
            io.reactivex.rxjava3.disposables.c cVar = atomicReference.get();
            if (cVar != DisposableHelper.DISPOSED) {
                C2147a c2147a = (C2147a) cVar;
                if (c2147a != null) {
                    c2147a.a();
                }
                DisposableHelper.a(atomicReference);
                this.b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this.e);
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.g) {
                return;
            }
            long j = this.f + 1;
            this.f = j;
            io.reactivex.rxjava3.disposables.c cVar = this.e.get();
            if (cVar != null) {
                cVar.dispose();
            }
            try {
                io.reactivex.rxjava3.core.t<U> apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The ObservableSource supplied is null");
                io.reactivex.rxjava3.core.t<U> tVar = apply;
                C2147a c2147a = new C2147a(this, j, t);
                AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.e;
                while (!atomicReference.compareAndSet(cVar, c2147a)) {
                    if (atomicReference.get() != cVar) {
                        return;
                    }
                }
                tVar.subscribe(c2147a);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                dispose();
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.q qVar, y34 y34Var) {
        super(qVar);
        this.c = y34Var;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(new io.reactivex.rxjava3.observers.e(vVar), this.c));
    }
}
