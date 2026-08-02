package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableAndThenObservable.java */
/* loaded from: classes8.dex */
public final class a<R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.a b;
    public final t<? extends R> c;

    /* compiled from: CompletableAndThenObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.a$a, reason: collision with other inner class name */
    public static final class C2130a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements v<R>, io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -8948264376121066672L;
        final v<? super R> downstream;
        t<? extends R> other;

        public C2130a(t tVar, v vVar) {
            this.other = tVar;
            this.downstream = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            t<? extends R> tVar = this.other;
            if (tVar == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                tVar.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this, cVar);
        }
    }

    public a(io.reactivex.rxjava3.core.a aVar, t tVar) {
        this.b = aVar;
        this.c = tVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        C2130a c2130a = new C2130a(this.c, vVar);
        vVar.onSubscribe(c2130a);
        this.b.subscribe(c2130a);
    }
}
