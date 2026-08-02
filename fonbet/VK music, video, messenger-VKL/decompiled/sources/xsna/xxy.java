package xsna;

import kotlin.Result;
import kotlinx.coroutines.DispatchException;

/* compiled from: Builders.common.kt */
/* loaded from: classes8.dex */
public final class xxy extends yok0 {
    public final spj<s3q0> e;

    public xxy(kotlin.coroutines.d dVar, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        super(dVar, true, false);
        this.e = s7s0.a(this, this, wzsVar);
    }

    @Override // xsna.pyx
    public final void o0() {
        try {
            upj.b(s3q0.a, s7s0.c(this.e));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            resumeWith(new Result.Failure(th));
            throw th;
        }
    }
}
