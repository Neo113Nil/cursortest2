package xsna;

import com.google.android.gms.measurement.internal.zzkw;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class yc01 implements Runnable {
    public final /* synthetic */ zzkw b;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq c;
    public final /* synthetic */ cd01 d;

    public yc01(cd01 cd01Var, zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.d = cd01Var;
        this.b = zzkwVar;
        this.c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj01 qj01Var = this.d.a;
        qj01Var.a();
        zzkw zzkwVar = this.b;
        Object zza = zzkwVar.zza();
        com.google.android.gms.measurement.internal.zzq zzqVar = this.c;
        if (zza == null) {
            qj01Var.p(zzkwVar, zzqVar);
        } else {
            qj01Var.t(zzkwVar, zzqVar);
        }
    }
}
