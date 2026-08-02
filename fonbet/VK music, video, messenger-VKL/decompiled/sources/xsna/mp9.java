package xsna;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes11.dex */
public interface mp9 extends z670 {

    /* compiled from: CancellableContinuationImpl.kt */
    public static final class a implements mp9 {
        public final izs<Throwable, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super Throwable, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.mp9
        public final void a(Throwable th) {
            this.b.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.b.getClass().getSimpleName() + '@' + y6l.a(this) + ']';
        }
    }

    void a(Throwable th);
}
