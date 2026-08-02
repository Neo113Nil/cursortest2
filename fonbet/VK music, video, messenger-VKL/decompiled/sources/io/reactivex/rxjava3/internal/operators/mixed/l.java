package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapCompletable.java */
/* loaded from: classes11.dex */
public final class l<T> extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.q<T> b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;

    /* compiled from: ObservableSwitchMapCompletable.java */
    public static final class a<T> implements v<T>, io.reactivex.rxjava3.disposables.c {
        public static final C2137a h = new C2137a(null);
        public final io.reactivex.rxjava3.core.c b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference<C2137a> e = new AtomicReference<>();
        public volatile boolean f;
        public io.reactivex.rxjava3.disposables.c g;

        /* compiled from: ObservableSwitchMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.l$a$a, reason: collision with other inner class name */
        public static final class C2137a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c {
            private static final long serialVersionUID = -8003404460084760287L;
            final a<?> parent;

            public C2137a(a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?> aVar = this.parent;
                if (j.f(aVar.e, this) && aVar.f) {
                    aVar.d.e(aVar.b);
                }
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onError(Throwable th) {
                a<?> aVar = this.parent;
                AtomicReference<C2137a> atomicReference = aVar.e;
                AtomicThrowable atomicThrowable = aVar.d;
                if (!j.f(atomicReference, this)) {
                    io.reactivex.rxjava3.plugins.a.a(th);
                } else if (atomicThrowable.a(th)) {
                    aVar.g.dispose();
                    aVar.a();
                    atomicThrowable.e(aVar.b);
                }
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l lVar) {
            this.b = cVar;
            this.c = lVar;
        }

        public final void a() {
            AtomicReference<C2137a> atomicReference = this.e;
            C2137a c2137a = h;
            C2137a andSet = atomicReference.getAndSet(c2137a);
            if (andSet == null || andSet == c2137a) {
                return;
            }
            DisposableHelper.a(andSet);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.g.dispose();
            a();
            this.d.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.get() == h;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.f = true;
            if (this.e.get() == null) {
                this.d.e(this.b);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.d;
            if (atomicThrowable.a(th)) {
                a();
                atomicThrowable.e(this.b);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            AtomicReference<C2137a> atomicReference;
            C2137a c2137a;
            try {
                io.reactivex.rxjava3.core.e apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.e eVar = apply;
                C2137a c2137a2 = new C2137a(this);
                do {
                    atomicReference = this.e;
                    c2137a = atomicReference.get();
                    if (c2137a == h) {
                        return;
                    }
                } while (!k.h(atomicReference, c2137a, c2137a2));
                if (c2137a != null) {
                    DisposableHelper.a(c2137a);
                }
                eVar.subscribe(c2137a2);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.g, cVar)) {
                this.g = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public l(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = qVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.core.q<T> qVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar = this.c;
        if (p.a(qVar, lVar, cVar)) {
            return;
        }
        qVar.subscribe(new a(cVar, lVar));
    }
}
