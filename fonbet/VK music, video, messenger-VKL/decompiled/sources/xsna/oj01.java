package xsna;

import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class oj01 {
    public zzgd a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ qj01 e;

    public /* synthetic */ oj01(qj01 qj01Var) {
        this.e = qj01Var;
    }

    public final boolean a(zzft zzftVar, long j) {
        exc0.i(zzftVar);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || ((((zzft) this.c.get(0)).zzd() / 1000) / 60) / 60 == ((zzftVar.zzd() / 1000) / 60) / 60) {
            long zzbw = this.d + zzftVar.zzbw();
            qj01 qj01Var = this.e;
            qj01Var.K();
            if (zzbw < Math.max(0, ((Integer) s701.j.a(null)).intValue())) {
                this.d = zzbw;
                this.c.add(zzftVar);
                this.b.add(Long.valueOf(j));
                int size = this.c.size();
                qj01Var.K();
                if (size < Math.max(1, ((Integer) s701.k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }
}
