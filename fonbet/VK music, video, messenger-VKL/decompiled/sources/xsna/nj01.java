package xsna;

import com.google.android.gms.measurement.internal.zzah;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class nj01 implements Callable {
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq b;
    public final /* synthetic */ qj01 c;

    public nj01(qj01 qj01Var, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.c = qj01Var;
        this.b = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        com.google.android.gms.measurement.internal.zzq zzqVar = this.b;
        String str = zzqVar.b;
        exc0.i(str);
        qj01 qj01Var = this.c;
        xwz0 L = qj01Var.L(str);
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (L.f(zzahVar) && xwz0.b(zzqVar.w).f(zzahVar)) {
            return qj01Var.J(zzqVar).G();
        }
        qj01Var.e().q.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
