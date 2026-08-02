package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* compiled from: ObservableMap.java */
/* loaded from: classes11.dex */
public final class j1<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends U> c;

    /* compiled from: ObservableMap.java */
    public static final class a<T, U> extends io.reactivex.rxjava3.internal.observers.a<T, U> {
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends U> g;

        public a(io.reactivex.rxjava3.core.v<? super U> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar) {
            super(vVar);
            this.g = lVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.b;
            if (i != 0) {
                vVar.onNext(null);
                return;
            }
            try {
                U apply = this.g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                vVar.onNext(apply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final U poll() throws Throwable {
            T poll = this.d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public j1(io.reactivex.rxjava3.core.t<T> tVar, io.reactivex.rxjava3.functions.l<? super T, ? extends U> lVar) {
        super(tVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
