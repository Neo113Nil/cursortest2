package xsna;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class tc01 implements Runnable {
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq b;
    public final /* synthetic */ cd01 c;

    public tc01(cd01 cd01Var, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.c = cd01Var;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj01 qj01Var = this.c.a;
        qj01Var.a();
        qj01Var.d().k();
        qj01Var.b();
        com.google.android.gms.measurement.internal.zzq zzqVar = this.b;
        exc0.f(zzqVar.b);
        qj01Var.J(zzqVar);
    }
}
