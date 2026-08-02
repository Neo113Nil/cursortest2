package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.LinkedHashMap;
import xsna.gnw0;
import xsna.qu50;

/* compiled from: ObservableCollectSingle.java */
/* loaded from: classes8.dex */
public final class m<T, U> extends io.reactivex.rxjava3.core.x<U> implements io.reactivex.rxjava3.internal.fuseable.f<U> {
    public final io.reactivex.rxjava3.core.q b;
    public final gnw0 c;
    public final qu50 d;

    /* compiled from: ObservableCollectSingle.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super U> b;
        public final io.reactivex.rxjava3.functions.b<? super U, ? super T> c;
        public final U d;
        public io.reactivex.rxjava3.disposables.c e;
        public boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.z zVar, Object obj, qu50 qu50Var) {
            this.b = zVar;
            this.c = qu50Var;
            this.d = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.onSuccess(this.d);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                this.c.accept(this.d, t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.e, cVar)) {
                this.e = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public m(io.reactivex.rxjava3.core.q qVar, gnw0 gnw0Var, qu50 qu50Var) {
        this.b = qVar;
        this.c = gnw0Var;
        this.d = qu50Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<U> b() {
        return new l(this.b, this.c, this.d);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super U> zVar) {
        try {
            this.c.getClass();
            this.b.subscribe(new a(zVar, new LinkedHashMap(), this.d));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
