package xsna;

import kotlin.Result;

/* compiled from: SingleMap.kt */
/* loaded from: classes9.dex */
public final class ruj0<T, R> extends ctj0<R> {
    public final gwj0 a;
    public final izs<T, R> b;

    /* compiled from: SingleMap.kt */
    public static final class a implements wuj0<T> {
        public final /* synthetic */ wuj0<R> b;
        public final /* synthetic */ ruj0<T, R> c;

        public a(wuj0<R> wuj0Var, ruj0<T, R> ruj0Var) {
            this.b = wuj0Var;
            this.c = ruj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            this.b.a(hgnVar);
        }

        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            Object failure;
            try {
                failure = this.c.b.invoke(t);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            boolean z = failure instanceof Result.Failure;
            wuj0<R> wuj0Var = this.b;
            if (!z) {
                wuj0Var.onSuccess(failure);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                wuj0Var.onError(a);
            }
        }
    }

    public ruj0(gwj0 gwj0Var, izs izsVar) {
        this.a = gwj0Var;
        this.b = izsVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<R> wuj0Var) {
        this.a.a(new a(wuj0Var, this));
    }
}
