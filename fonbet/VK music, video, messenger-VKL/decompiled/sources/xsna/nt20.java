package xsna;

import com.vk.log.L;
import kotlin.Result;

/* compiled from: MlEnhanceToolDelegate.kt */
/* loaded from: classes15.dex */
public final class nt20 implements izs<Throwable, s3q0> {
    public final /* synthetic */ gzg0 b;

    public nt20(gzg0 gzg0Var) {
        this.b = gzg0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        Throwable th2 = th;
        L.i(th2);
        this.b.resumeWith(new Result.Failure(th2));
        return s3q0.a;
    }
}
