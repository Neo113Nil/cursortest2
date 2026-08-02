package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzac;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class ob01 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractSafeParcelable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ob01(Object obj, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.b = i;
        this.d = obj;
        this.c = abstractSafeParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cd01 cd01Var = (cd01) this.d;
                qj01 qj01Var = cd01Var.a;
                qj01 qj01Var2 = cd01Var.a;
                qj01Var.a();
                zzac zzacVar = (zzac) this.c;
                if (zzacVar.d.zza() != null) {
                    qj01Var2.getClass();
                    String str = zzacVar.b;
                    exc0.i(str);
                    com.google.android.gms.measurement.internal.zzq z = qj01Var2.z(str);
                    if (z != null) {
                        qj01Var2.r(zzacVar, z);
                        break;
                    }
                } else {
                    qj01Var2.getClass();
                    String str2 = zzacVar.b;
                    exc0.i(str2);
                    com.google.android.gms.measurement.internal.zzq z2 = qj01Var2.z(str2);
                    if (z2 != null) {
                        qj01Var2.o(zzacVar, z2);
                        break;
                    }
                }
                break;
            default:
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) this.c;
                yh01 yh01Var = (yh01) this.d;
                mb01 mb01Var = (mb01) yh01Var.b;
                v701 v701Var = yh01Var.g;
                if (v701Var == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        v701Var.E0(zzqVar);
                        mb01Var.p().q();
                        yh01Var.o(v701Var, null, zzqVar);
                        yh01Var.v();
                        break;
                    } catch (RemoteException e) {
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.i.b(e, "Failed to send app launch to the service");
                    }
                }
        }
    }
}
