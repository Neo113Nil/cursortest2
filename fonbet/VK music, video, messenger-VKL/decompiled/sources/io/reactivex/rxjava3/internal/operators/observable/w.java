package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* compiled from: ObservableDematerialize.java */
/* loaded from: classes8.dex */
public final class w<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.p<R>> c;

    /* compiled from: ObservableDematerialize.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super R> b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.p<R>> c;
        public boolean d;
        public io.reactivex.rxjava3.disposables.c e;

        public a(io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.p<R>> lVar) {
            this.b = vVar;
            this.c = lVar;
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
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.d) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.d = true;
                this.b.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.d) {
                if (t instanceof io.reactivex.rxjava3.core.p) {
                    io.reactivex.rxjava3.core.p pVar = (io.reactivex.rxjava3.core.p) t;
                    if (pVar.a instanceof NotificationLite.b) {
                        io.reactivex.rxjava3.plugins.a.a(pVar.c());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.rxjava3.core.p<R> apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.p<R> pVar2 = apply;
                Object obj = pVar2.a;
                if (obj instanceof NotificationLite.b) {
                    this.e.dispose();
                    onError(pVar2.c());
                } else if (obj == null) {
                    this.e.dispose();
                    onComplete();
                } else {
                    if (obj == null || (obj instanceof NotificationLite.b)) {
                        obj = null;
                    }
                    this.b.onNext(obj);
                }
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

    public w(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar) {
        super(qVar);
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
