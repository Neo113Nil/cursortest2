package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ObservableAll.java */
/* loaded from: classes8.dex */
public final class b<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Boolean> {
    public final io.reactivex.rxjava3.functions.m<? super T> c;

    /* compiled from: ObservableAll.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super Boolean> b;
        public final io.reactivex.rxjava3.functions.m<? super T> c;
        public io.reactivex.rxjava3.disposables.c d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.v<? super Boolean> vVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            this.b = vVar;
            this.c = mVar;
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
            if (this.e) {
                return;
            }
            this.e = true;
            Boolean bool = Boolean.TRUE;
            io.reactivex.rxjava3.core.v<? super Boolean> vVar = this.b;
            vVar.onNext(bool);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.e = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            try {
                if (this.c.test(t)) {
                    return;
                }
                this.e = true;
                this.d.dispose();
                Boolean bool = Boolean.FALSE;
                io.reactivex.rxjava3.core.v<? super Boolean> vVar = this.b;
                vVar.onNext(bool);
                vVar.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d.dispose();
                onError(th);
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

    public b(io.reactivex.rxjava3.core.t tVar, a.o oVar) {
        super(tVar);
        this.c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Boolean> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
