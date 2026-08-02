package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.f;
import java.util.Collection;

/* compiled from: ObservableToList.java */
/* loaded from: classes8.dex */
public final class x2<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.functions.n<U> c;

    /* compiled from: ObservableToList.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super U> b;
        public io.reactivex.rxjava3.disposables.c c;
        public U d;

        public a(io.reactivex.rxjava3.core.v<? super U> vVar, U u) {
            this.b = vVar;
            this.d = u;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            U u = this.d;
            this.d = null;
            io.reactivex.rxjava3.core.v<? super U> vVar = this.b;
            vVar.onNext(u);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.d = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.d.add(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public x2(io.reactivex.rxjava3.core.q qVar, a.h hVar) {
        super(qVar);
        this.c = hVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        try {
            U u = this.c.get();
            if (u == null) {
                throw io.reactivex.rxjava3.internal.util.f.b("The collectionSupplier returned a null Collection.");
            }
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            this.b.subscribe(new a(vVar, u));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
