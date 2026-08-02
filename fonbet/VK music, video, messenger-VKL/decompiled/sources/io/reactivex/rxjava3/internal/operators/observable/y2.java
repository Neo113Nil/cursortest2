package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.f;
import java.util.Collection;

/* compiled from: ObservableToListSingle.java */
/* loaded from: classes8.dex */
public final class y2<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.core.x<U> implements io.reactivex.rxjava3.internal.fuseable.f<U> {
    public final io.reactivex.rxjava3.core.q b;
    public final a.h c = new a.h();

    /* compiled from: ObservableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super U> b;
        public U c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.z<? super U> zVar, U u) {
            this.b = zVar;
            this.c = u;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            U u = this.c;
            this.c = null;
            this.b.onSuccess(u);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.c = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.c.add(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public y2(io.reactivex.rxjava3.core.q qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<U> b() {
        return new x2(this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super U> zVar) {
        try {
            Object obj = this.c.get();
            f.a aVar = io.reactivex.rxjava3.internal.util.f.a;
            this.b.subscribe(new a(zVar, (Collection) obj));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
