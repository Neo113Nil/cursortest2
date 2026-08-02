package xsna;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: SingleFrom.kt */
/* loaded from: classes11.dex */
public final class iuj0<T> extends ctj0<T> {
    public final Lambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public iuj0(gzs<? extends T> gzsVar) {
        this.a = (Lambda) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        Object failure;
        iqj0 iqj0Var = new iqj0();
        wuj0Var.a(iqj0Var);
        if (iqj0Var.b) {
            return;
        }
        try {
            failure = this.a.invoke();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure) && !iqj0Var.b) {
            wuj0Var.onSuccess(failure);
        }
        Throwable a = Result.a(failure);
        if (a == null || iqj0Var.b) {
            return;
        }
        wuj0Var.onError(a);
    }
}
