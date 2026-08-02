package xsna;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;

/* compiled from: DelayedReloadObservable.kt */
/* loaded from: classes4.dex */
public final class btl<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.q<T> b;
    public final boolean c;
    public final io.reactivex.rxjava3.subjects.f<s3q0> d;
    public final io.reactivex.rxjava3.internal.operators.observable.x e;
    public final io.reactivex.rxjava3.internal.operators.observable.w2 f;
    public btl<T>.a g;

    /* compiled from: DelayedReloadObservable.kt */
    public final class a implements io.reactivex.rxjava3.core.v<s3q0>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;
        public io.reactivex.rxjava3.disposables.c d;
        public io.reactivex.rxjava3.disposables.c e;
        public final AtomicBoolean f = new AtomicBoolean(false);

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.b = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = this.e;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar3 = this.c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            return cVar != null && cVar.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.f.compareAndSet(false, true)) {
                this.b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.f.compareAndSet(false, true)) {
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(s3q0 s3q0Var) {
            if (this.f.get()) {
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.e = btl.this.b.subscribe(new xz(new lwh(this, 2), 20), new defpackage.z(new atl(1, this, a.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 18));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
                btl<T> btlVar = btl.this;
                this.d = btlVar.f.subscribe(new f40(new bhh(btlVar, 5), 14));
            }
        }
    }

    public btl(io.reactivex.rxjava3.core.q<T> qVar, long j, boolean z) {
        this.b = qVar;
        this.c = z;
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.d = fVar;
        a.p pVar = a.p.INSTANCE;
        Objects.requireNonNull(pVar, "collectionSupplier is null");
        this.e = new io.reactivex.rxjava3.internal.operators.observable.x(fVar, pVar);
        this.f = io.reactivex.rxjava3.core.q.B0(j, TimeUnit.MILLISECONDS);
    }

    public final void M0() {
        this.d.onNext(s3q0.a);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        if (!this.c) {
            this.g = new a(vVar);
        } else {
            this.e.subscribe(new a(vVar));
        }
    }
}
