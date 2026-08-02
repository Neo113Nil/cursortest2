package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableAndThenCompletable.java */
/* loaded from: classes11.dex */
public final class b extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.core.e c;

    /* compiled from: CompletableAndThenCompletable.java */
    public static final class a implements io.reactivex.rxjava3.core.c {
        public final C2119b b;
        public final io.reactivex.rxjava3.core.c c;

        public a(C2119b c2119b, io.reactivex.rxjava3.core.c cVar) {
            this.b = c2119b;
            this.c = cVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.c.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this.b, cVar);
        }
    }

    /* compiled from: CompletableAndThenCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.b$b, reason: collision with other inner class name */
    public static final class C2119b extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -4101678820158072998L;
        final io.reactivex.rxjava3.core.c actualObserver;
        final io.reactivex.rxjava3.core.e next;

        public C2119b(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.core.e eVar) {
            this.actualObserver = cVar;
            this.next = eVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.next.subscribe(new a(this, this.actualObserver));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    public b(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.e eVar) {
        this.b = aVar;
        this.c = eVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new C2119b(cVar, this.c));
    }
}
