package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: SingleCreate.kt */
/* loaded from: classes9.dex */
public final class ntj0<T> extends ctj0<T> {
    public final Lambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public ntj0(izs<? super vtj0<T>, s3q0> izsVar) {
        this.a = (Lambda) izsVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        wtj0 wtj0Var = new wtj0(wuj0Var);
        wuj0Var.a(wtj0Var);
        try {
            this.a.invoke(wtj0Var);
        } catch (Throwable th) {
            wtj0Var.a(th);
        }
    }
}
