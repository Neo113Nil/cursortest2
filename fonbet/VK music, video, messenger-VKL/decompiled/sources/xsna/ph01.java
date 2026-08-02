package xsna;

import com.google.android.gms.measurement.internal.zzac;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ph01 implements Runnable {
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zzac d;
    public final /* synthetic */ yh01 e;

    public ph01(yh01 yh01Var, com.google.android.gms.measurement.internal.zzq zzqVar, boolean z, zzac zzacVar) {
        this.e = yh01Var;
        this.b = zzqVar;
        this.c = z;
        this.d = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 yh01Var = this.e;
        v701 v701Var = yh01Var.g;
        if (v701Var != null) {
            yh01Var.o(v701Var, this.c ? null : this.d, this.b);
            yh01Var.v();
        } else {
            k901 k901Var = ((mb01) yh01Var.b).j;
            mb01.k(k901Var);
            k901Var.i.a("Discarding data. Failed to send conditional user property to service");
        }
    }
}
