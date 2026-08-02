package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: SingleFlatMap.kt */
/* loaded from: classes9.dex */
public final class euj0<T, R> extends ctj0<R> {
    public final ctj0<T> a;
    public final Lambda b;

    /* compiled from: SingleFlatMap.kt */
    public final class a implements hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);

        public a(euj0 euj0Var) {
        }

        @Override // xsna.hgn
        public final void dispose() {
            hgn andSet;
            if (!this.b.compareAndSet(false, true) || (andSet = this.c.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }
    }

    /* compiled from: SingleFlatMap.kt */
    public static final class b implements wuj0<T>, hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);
        public final AtomicReference<hgn> d = new AtomicReference<>(null);
        public final /* synthetic */ wuj0<R> e;
        public final /* synthetic */ euj0<T, R> f;

        public b(wuj0<R> wuj0Var, euj0<T, R> euj0Var) {
            this.e = wuj0Var;
            this.f = euj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            AtomicReference<hgn> atomicReference;
            do {
                atomicReference = this.c;
                if (atomicReference.compareAndSet(null, hgnVar)) {
                    break;
                }
            } while (atomicReference.get() == null);
            if (this.b.get()) {
                hgn andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                hgn andSet2 = this.d.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
            this.e.a(this);
        }

        @Override // xsna.hgn
        public final void dispose() {
            if (this.b.compareAndSet(false, true)) {
                hgn andSet = this.c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                hgn andSet2 = this.d.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.e.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            Object failure;
            if (this.b.compareAndSet(false, true)) {
                euj0<T, R> euj0Var = this.f;
                a aVar = new a(euj0Var);
                this.d.set(aVar);
                duj0 duj0Var = new duj0(aVar, this.e);
                AtomicBoolean atomicBoolean = aVar.b;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    failure = (ctj0) euj0Var.b.invoke(t);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    ctj0 ctj0Var = (ctj0) failure;
                    if (!atomicBoolean.get()) {
                        ctj0Var.a(duj0Var);
                    }
                }
                Throwable a = Result.a(failure);
                if (a == null || atomicBoolean.get()) {
                    return;
                }
                duj0Var.onError(a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public euj0(ctj0<T> ctj0Var, izs<? super T, ? extends ctj0<R>> izsVar) {
        this.a = ctj0Var;
        this.b = (Lambda) izsVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<R> wuj0Var) {
        this.a.a(new b(wuj0Var, this));
    }
}
