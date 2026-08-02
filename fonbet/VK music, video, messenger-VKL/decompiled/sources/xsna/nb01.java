package xsna;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class nb01 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public nb01(cd01 cd01Var, zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.e = cd01Var;
        this.d = zzacVar;
        this.c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                qj01 qj01Var = ((cd01) this.e).a;
                qj01Var.a();
                zzac zzacVar = (zzac) this.d;
                Object zza = zzacVar.d.zza();
                com.google.android.gms.measurement.internal.zzq zzqVar = this.c;
                if (zza == null) {
                    qj01Var.o(zzacVar, zzqVar);
                    return;
                } else {
                    qj01Var.r(zzacVar, zzqVar);
                    return;
                }
            default:
                com.google.android.gms.measurement.internal.zzq zzqVar2 = this.c;
                zzcf zzcfVar = (zzcf) this.d;
                yh01 yh01Var = (yh01) this.e;
                mb01 mb01Var = (mb01) yh01Var.b;
                String str = null;
                try {
                    try {
                        x901 x901Var = mb01Var.i;
                        mb01.i(x901Var);
                        if (x901Var.p().f(zzah.ANALYTICS_STORAGE)) {
                            v701 v701Var = yh01Var.g;
                            if (v701Var == null) {
                                k901 k901Var = mb01Var.j;
                                mb01.k(k901Var);
                                k901Var.i.a("Failed to get app instance id");
                            } else {
                                str = v701Var.f0(zzqVar2);
                                if (str != null) {
                                    bf01 bf01Var = mb01Var.q;
                                    mb01.j(bf01Var);
                                    bf01Var.j.set(str);
                                    x901 x901Var2 = mb01Var.i;
                                    mb01.i(x901Var2);
                                    x901Var2.i.b(str);
                                }
                                yh01Var.v();
                            }
                        } else {
                            k901 k901Var2 = mb01Var.j;
                            mb01.k(k901Var2);
                            k901Var2.n.a("Analytics storage consent denied; will not get app instance id");
                            bf01 bf01Var2 = mb01Var.q;
                            mb01.j(bf01Var2);
                            bf01Var2.j.set(null);
                            x901 x901Var3 = mb01Var.i;
                            mb01.i(x901Var3);
                            x901Var3.i.b(null);
                        }
                    } catch (RemoteException e) {
                        k901 k901Var3 = mb01Var.j;
                        mb01.k(k901Var3);
                        k901Var3.i.b(e, "Failed to get app instance id");
                    }
                    return;
                } finally {
                    sk01 sk01Var = mb01Var.m;
                    mb01.i(sk01Var);
                    sk01Var.H(null, zzcfVar);
                }
        }
    }

    public nb01(yh01 yh01Var, com.google.android.gms.measurement.internal.zzq zzqVar, zzcf zzcfVar) {
        this.e = yh01Var;
        this.c = zzqVar;
        this.d = zzcfVar;
    }
}
