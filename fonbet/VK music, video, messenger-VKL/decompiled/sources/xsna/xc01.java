package xsna;

import com.google.android.gms.measurement.internal.zzaw;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class xc01 implements Callable {
    public final /* synthetic */ cd01 b;

    public xc01(cd01 cd01Var, zzaw zzawVar, String str) {
        this.b = cd01Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        qj01 qj01Var = this.b.a;
        qj01Var.a();
        cg01 cg01Var = qj01Var.i;
        qj01.I(cg01Var);
        cg01Var.k();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
