package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;
import xsna.jli0;

/* compiled from: ObservableZipIterable.java */
/* loaded from: classes8.dex */
public final class f3<T, U, V> extends io.reactivex.rxjava3.core.q<V> {
    public final io.reactivex.rxjava3.core.q<? extends T> b;
    public final jli0 c;
    public final io.reactivex.rxjava3.functions.c<? super T, ? super U, ? extends V> d;

    /* compiled from: ObservableZipIterable.java */
    public static final class a<T, U, V> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super V> b;
        public final Iterator<U> c;
        public final io.reactivex.rxjava3.functions.c<? super T, ? super U, ? extends V> d;
        public io.reactivex.rxjava3.disposables.c e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.v<? super V> vVar, Iterator<U> it, io.reactivex.rxjava3.functions.c<? super T, ? super U, ? extends V> cVar) {
            this.b = vVar;
            this.c = it;
            this.d = cVar;
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
            this.b.onComplete();
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
            io.reactivex.rxjava3.core.v<? super V> vVar = this.b;
            Iterator<U> it = this.c;
            if (this.f) {
                return;
            }
            try {
                U next = it.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V apply = this.d.apply(t, next);
                    Objects.requireNonNull(apply, "The zipper function returned a null value");
                    vVar.onNext(apply);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f = true;
                        this.e.dispose();
                        vVar.onComplete();
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.f = true;
                        this.e.dispose();
                        vVar.onError(th);
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    this.f = true;
                    this.e.dispose();
                    vVar.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                this.f = true;
                this.e.dispose();
                vVar.onError(th3);
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

    public f3(io.reactivex.rxjava3.core.q qVar, jli0 jli0Var, io.reactivex.rxjava3.functions.c cVar) {
        this.b = qVar;
        this.c = jli0Var;
        this.d = cVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super V> vVar) {
        try {
            Iterator<T> it = this.c.b.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<T> it2 = it;
            try {
                if (it2.hasNext()) {
                    this.b.subscribe(new a(vVar, it2, this.d));
                } else {
                    vVar.onSubscribe(EmptyDisposable.INSTANCE);
                    vVar.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th2);
        }
    }
}
