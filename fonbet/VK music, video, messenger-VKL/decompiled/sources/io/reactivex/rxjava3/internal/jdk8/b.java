package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.k;
import io.reactivex.rxjava3.core.m;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.Optional;

/* compiled from: SingleMapOptional.java */
/* loaded from: classes8.dex */
public final class b<T, R> extends k<R> {
    public final x<T> b;
    public final l<? super T, Optional<? extends R>> c;

    /* compiled from: SingleMapOptional.java */
    public static final class a<T, R> implements z<T>, c {
        public final m<? super R> b;
        public final l<? super T, Optional<? extends R>> c;
        public c d;

        public a(m<? super R> mVar, l<? super T, Optional<? extends R>> lVar) {
            this.b = mVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            c cVar = this.d;
            this.d = DisposableHelper.DISPOSED;
            cVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            m<? super R> mVar = this.b;
            try {
                Optional<? extends R> apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    mVar.onSuccess(optional.get());
                } else {
                    mVar.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }
    }

    public b(x<T> xVar, l<? super T, Optional<? extends R>> lVar) {
        this.b = xVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(m<? super R> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
