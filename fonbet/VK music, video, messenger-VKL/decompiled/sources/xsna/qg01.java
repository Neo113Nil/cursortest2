package xsna;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzaw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class qg01 implements Runnable {
    public final /* synthetic */ zzaw b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzcf d;
    public final /* synthetic */ yh01 e;

    public qg01(yh01 yh01Var, zzaw zzawVar, String str, zzcf zzcfVar) {
        this.e = yh01Var;
        this.b = zzawVar;
        this.c = str;
        this.d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcf zzcfVar = this.d;
        yh01 yh01Var = this.e;
        mb01 mb01Var = (mb01) yh01Var.b;
        byte[] bArr = null;
        try {
            try {
                v701 v701Var = yh01Var.g;
                if (v701Var == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = v701Var.u1(this.b, this.c);
                    yh01Var.v();
                }
            } catch (RemoteException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(e, "Failed to send event to the service to bundle");
            }
        } finally {
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            sk01Var.E(zzcfVar, bArr);
        }
    }
}
