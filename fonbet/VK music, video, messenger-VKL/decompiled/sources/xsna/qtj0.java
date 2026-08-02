package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* compiled from: SingleDoOnDispose.kt */
/* loaded from: classes11.dex */
public final class qtj0<T> extends ctj0<T> {
    public final gwj0 a;
    public final SendMetricsEventJobService.c b;

    /* compiled from: SingleDoOnDispose.kt */
    public static final class a implements wuj0<T>, hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);
        public final /* synthetic */ wuj0<T> d;
        public final /* synthetic */ qtj0<T> e;

        public a(wuj0<T> wuj0Var, qtj0<T> qtj0Var) {
            this.d = wuj0Var;
            this.e = qtj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            AtomicReference<hgn> atomicReference;
            hgn andSet;
            do {
                atomicReference = this.c;
                if (atomicReference.compareAndSet(null, hgnVar)) {
                    break;
                }
            } while (atomicReference.get() == null);
            if (this.b.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.d.a(this);
        }

        @Override // xsna.hgn
        public final void dispose() {
            Object failure;
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.e.b.invoke();
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                AtomicReference<hgn> atomicReference = this.c;
                if (a != null) {
                    hgn andSet = atomicReference.getAndSet(null);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    this.d.onError(a);
                }
                if (failure instanceof Result.Failure) {
                    return;
                }
                hgn andSet2 = atomicReference.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.d.onError(th);
            }
        }

        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            if (this.b.compareAndSet(false, true)) {
                this.d.onSuccess(t);
            }
        }
    }

    public qtj0(gwj0 gwj0Var, SendMetricsEventJobService.c cVar) {
        this.a = gwj0Var;
        this.b = cVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        this.a.a(new a(wuj0Var, this));
    }
}
