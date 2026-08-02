package xsna;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class rh01 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq d;
    public final /* synthetic */ zzcf e;
    public final /* synthetic */ yh01 f;

    public rh01(yh01 yh01Var, String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar, zzcf zzcfVar) {
        this.f = yh01Var;
        this.b = str;
        this.c = str2;
        this.d = zzqVar;
        this.e = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzq zzqVar = this.d;
        String str = this.c;
        String str2 = this.b;
        zzcf zzcfVar = this.e;
        yh01 yh01Var = this.f;
        mb01 mb01Var = (mb01) yh01Var.b;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                v701 v701Var = yh01Var.g;
                if (v701Var == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.c("Failed to get conditional properties; not connected to service", str2, str);
                } else {
                    arrayList = sk01.t(v701Var.l0(str2, str, zzqVar));
                    yh01Var.v();
                }
            } catch (RemoteException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.d("Failed to get conditional properties; remote exception", str2, str, e);
            }
        } finally {
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            sk01Var.C(zzcfVar, arrayList);
        }
    }
}
