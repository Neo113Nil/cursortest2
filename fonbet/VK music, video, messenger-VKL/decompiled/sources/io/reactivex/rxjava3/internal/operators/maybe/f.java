package io.reactivex.rxjava3.internal.operators.maybe;

import android.R;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import xsna.uq;

/* compiled from: MaybeDematerialize.java */
/* loaded from: classes8.dex */
public final class f<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {
    public final uq c;

    /* compiled from: MaybeDematerialize.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super R> b;
        public final io.reactivex.rxjava3.functions.l<? super T, io.reactivex.rxjava3.core.p<R>> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m mVar, uq uqVar) {
            this.b = mVar;
            this.c = uqVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.core.m<? super R> mVar = this.b;
            try {
                io.reactivex.rxjava3.core.p<R> apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.p<R> pVar = apply;
                R r = (Object) pVar.a;
                if (r == null || (r instanceof NotificationLite.b)) {
                    if (r == null) {
                        mVar.onComplete();
                        return;
                    } else {
                        mVar.onError(pVar.c());
                        return;
                    }
                }
                if (r == null || (r instanceof NotificationLite.b)) {
                    r = null;
                }
                mVar.onSuccess(r);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }
    }

    public f(io.reactivex.rxjava3.core.k kVar, uq uqVar) {
        super(kVar);
        this.c = uqVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super R> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
