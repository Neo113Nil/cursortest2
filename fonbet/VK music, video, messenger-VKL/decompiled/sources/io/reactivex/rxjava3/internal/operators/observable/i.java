package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.Collection;
import java.util.Objects;

/* compiled from: ObservableBufferExactBoundary.java */
/* loaded from: classes11.dex */
public final class i<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.core.q c;
    public final io.reactivex.rxjava3.functions.n<U> d;

    /* compiled from: ObservableBufferExactBoundary.java */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.observers.a<B> {
        public final b<T, U, B> c;

        public a(b<T, U, B> bVar) {
            this.c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.c.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(B b) {
            b<T, U, B> bVar = this.c;
            bVar.getClass();
            try {
                U u = bVar.g.get();
                Objects.requireNonNull(u, "The buffer supplied is null");
                U u2 = u;
                synchronized (bVar) {
                    try {
                        U u3 = bVar.k;
                        if (u3 == null) {
                            return;
                        }
                        bVar.k = u2;
                        bVar.c(u3, bVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                bVar.dispose();
                bVar.c.onError(th2);
            }
        }
    }

    /* compiled from: ObservableBufferExactBoundary.java */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.observers.i<T, U, U> implements io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> g;
        public final io.reactivex.rxjava3.core.t<B> h;
        public io.reactivex.rxjava3.disposables.c i;
        public a j;
        public U k;

        public b(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.n nVar, io.reactivex.rxjava3.core.q qVar) {
            super(eVar, new io.reactivex.rxjava3.internal.queue.a());
            this.g = nVar;
            this.h = qVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.i
        public final void a(io.reactivex.rxjava3.core.v vVar, Object obj) {
            this.c.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.dispose();
            this.i.dispose();
            if (b()) {
                this.d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u = this.k;
                    if (u == null) {
                        return;
                    }
                    this.k = null;
                    this.d.offer(u);
                    this.f = true;
                    if (b()) {
                        io.reactivex.rxjava3.internal.util.i.b(this.d, this.c, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            dispose();
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.k;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.i, cVar)) {
                this.i = cVar;
                try {
                    U u = this.g.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.k = u;
                    a aVar = new a(this);
                    this.j = aVar;
                    this.c.onSubscribe(this);
                    if (this.e) {
                        return;
                    }
                    this.h.subscribe(aVar);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.e = true;
                    cVar.dispose();
                    EmptyDisposable.b(th, this.c);
                }
            }
        }
    }

    public i(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.q qVar2, ArrayListSupplier arrayListSupplier) {
        super(qVar);
        this.c = qVar2;
        this.d = arrayListSupplier;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        this.b.subscribe(new b(new io.reactivex.rxjava3.observers.e(vVar), this.d, this.c));
    }
}
