package xsna;

import android.util.Log;
import com.google.android.gms.measurement.internal.zzah;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class uc01 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uc01(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                qj01 qj01Var = ((cd01) this.d).a;
                qj01Var.a();
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) this.c;
                qj01Var.d().k();
                qj01Var.b();
                exc0.f(zzqVar.b);
                xwz0 b = xwz0.b(zzqVar.w);
                String str = zzqVar.b;
                xwz0 L = qj01Var.L(str);
                qj01Var.e().q.c("Setting consent, package, consent", str, b);
                qj01Var.s(str, b);
                if (b.g(L, (zzah[]) b.a.keySet().toArray(new zzah[0]))) {
                    qj01Var.q(zzqVar);
                    break;
                }
                break;
            default:
                try {
                    ((klk0) this.d).b((HashSet) this.c);
                    break;
                } catch (Exception e) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
                    return;
                }
        }
    }
}
