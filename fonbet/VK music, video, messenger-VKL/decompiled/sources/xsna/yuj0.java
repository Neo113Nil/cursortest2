package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* compiled from: SingleOnErrorReturn.kt */
/* loaded from: classes11.dex */
public final class yuj0<T> extends ctj0<T> {
    public final gwj0 a;
    public final izs<Throwable, T> b;

    /* compiled from: SingleOnErrorReturn.kt */
    public static final class a implements wuj0<T>, hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);
        public final /* synthetic */ wuj0<T> d;
        public final /* synthetic */ yuj0<T> e;

        public a(wuj0<T> wuj0Var, yuj0<T> yuj0Var) {
            this.d = wuj0Var;
            this.e = yuj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            this.d.a(hgnVar);
        }

        @Override // xsna.hgn
        public final void dispose() {
            hgn andSet;
            if (!this.b.compareAndSet(false, true) || (andSet = this.c.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            Object failure;
            if (this.b.compareAndSet(false, true)) {
                try {
                    failure = this.e.b.invoke(th);
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                boolean z = failure instanceof Result.Failure;
                wuj0<T> wuj0Var = this.d;
                if (!z) {
                    wuj0Var.onSuccess(failure);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    wuj0Var.onError(a);
                }
            }
        }

        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            if (this.b.compareAndSet(false, true)) {
                this.d.onSuccess(t);
            }
        }
    }

    public yuj0(gwj0 gwj0Var, izs izsVar) {
        this.a = gwj0Var;
        this.b = izsVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        this.a.a(new a(wuj0Var, this));
    }
}
