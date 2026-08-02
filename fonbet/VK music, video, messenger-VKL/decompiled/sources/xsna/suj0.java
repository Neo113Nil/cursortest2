package xsna;

import ru.rustore.sdk.reactive.core.CompositeException;

/* compiled from: SingleMapError.kt */
/* loaded from: classes9.dex */
public final class suj0<T> extends ctj0<T> {
    public final jwj0 a;
    public final izs<Throwable, Throwable> b;

    /* compiled from: SingleMapError.kt */
    public static final class a implements wuj0<T> {
        public final /* synthetic */ wuj0<T> b;
        public final /* synthetic */ suj0<T> c;

        public a(wuj0<T> wuj0Var, suj0<T> suj0Var) {
            this.b = wuj0Var;
            this.c = suj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            this.b.a(hgnVar);
        }

        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            Throwable compositeException;
            try {
                compositeException = this.c.b.invoke(th);
            } catch (Throwable th2) {
                compositeException = new CompositeException(mnh0.A(th2), (Throwable) rl3.O(new Throwable[]{th}));
            }
            this.b.onError(compositeException);
        }

        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public suj0(jwj0 jwj0Var, izs izsVar) {
        this.a = jwj0Var;
        this.b = izsVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        this.a.a(new a(wuj0Var, this));
    }
}
