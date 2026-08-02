package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ObservableGenerate.java */
/* loaded from: classes8.dex */
public final class y0<T, S> extends io.reactivex.rxjava3.core.q<T> {
    public final d1 c;
    public final a.v b = io.reactivex.rxjava3.internal.functions.a.i;
    public final a.l d = io.reactivex.rxjava3.internal.functions.a.d;

    /* compiled from: ObservableGenerate.java */
    public static final class a<T, S> implements io.reactivex.rxjava3.core.f<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.functions.f<? super S> c;
        public S d;
        public volatile boolean e;
        public boolean f;
        public boolean g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.v vVar, d1 d1Var, a.l lVar, Object obj) {
            this.b = vVar;
            this.c = lVar;
            this.d = obj;
        }

        public final void c(S s) {
            try {
                this.c.accept(s);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            if (this.g) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
            } else {
                this.g = true;
                this.b.onNext(t);
            }
        }
    }

    public y0(d1 d1Var) {
        this.c = d1Var;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        try {
            this.b.getClass();
            d1 d1Var = this.c;
            a aVar = new a(vVar, d1Var, this.d, null);
            vVar.onSubscribe(aVar);
            S s = aVar.d;
            if (aVar.e) {
                aVar.d = null;
                aVar.c(s);
                return;
            }
            while (!aVar.e) {
                aVar.g = false;
                try {
                    d1Var.getClass();
                    d1Var.b.accept(aVar);
                    if (aVar.f) {
                        aVar.e = true;
                        aVar.d = null;
                        aVar.c(s);
                        return;
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    aVar.d = null;
                    aVar.e = true;
                    aVar.onError(th);
                    aVar.c(s);
                    return;
                }
            }
            aVar.d = null;
            aVar.c(s);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th2);
        }
    }
}
