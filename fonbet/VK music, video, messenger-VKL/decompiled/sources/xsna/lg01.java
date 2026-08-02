package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class lg01 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zzcf f;
    public final /* synthetic */ yh01 g;

    public lg01(yh01 yh01Var, String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar, boolean z, zzcf zzcfVar) {
        this.g = yh01Var;
        this.b = str;
        this.c = str2;
        this.d = zzqVar;
        this.e = z;
        this.f = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzq zzqVar = this.d;
        String str = this.b;
        zzcf zzcfVar = this.f;
        yh01 yh01Var = this.g;
        mb01 mb01Var = (mb01) yh01Var.b;
        Bundle bundle = new Bundle();
        try {
            try {
                v701 v701Var = yh01Var.g;
                String str2 = this.c;
                if (v701Var == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.c("Failed to get user properties; not connected to service", str, str2);
                    sk01 sk01Var = mb01Var.m;
                    mb01.i(sk01Var);
                    sk01Var.D(zzcfVar, bundle);
                    return;
                }
                List<zzkw> j1 = v701Var.j1(str, str2, this.e, zzqVar);
                Bundle bundle2 = new Bundle();
                if (j1 != null) {
                    for (zzkw zzkwVar : j1) {
                        String str3 = zzkwVar.f;
                        String str4 = zzkwVar.c;
                        if (str3 != null) {
                            bundle2.putString(str4, str3);
                        } else {
                            Long l = zzkwVar.e;
                            if (l != null) {
                                bundle2.putLong(str4, l.longValue());
                            } else {
                                Double d = zzkwVar.h;
                                if (d != null) {
                                    bundle2.putDouble(str4, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    yh01Var.v();
                    sk01 sk01Var2 = mb01Var.m;
                    mb01.i(sk01Var2);
                    sk01Var2.D(zzcfVar, bundle2);
                } catch (RemoteException e) {
                    e = e;
                    bundle = bundle2;
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.i.c("Failed to get user properties; remote exception", str, e);
                    sk01 sk01Var3 = mb01Var.m;
                    mb01.i(sk01Var3);
                    sk01Var3.D(zzcfVar, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle = bundle2;
                    sk01 sk01Var4 = mb01Var.m;
                    mb01.i(sk01Var4);
                    sk01Var4.D(zzcfVar, bundle);
                    throw th;
                }
            } catch (RemoteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
