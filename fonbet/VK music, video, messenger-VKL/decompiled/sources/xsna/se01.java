package xsna;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.measurement.internal.zzah;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class se01 implements Runnable {
    public final /* synthetic */ zzcf b;
    public final /* synthetic */ bf01 c;

    public se01(bf01 bf01Var, zzcf zzcfVar) {
        this.c = bf01Var;
        this.b = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l;
        bf01 bf01Var = this.c;
        mb01 mb01Var = (mb01) bf01Var.b;
        mb01 mb01Var2 = (mb01) bf01Var.b;
        fj01 fj01Var = mb01Var.l;
        mb01.j(fj01Var);
        zzpa.zzc();
        mb01 mb01Var3 = (mb01) fj01Var.b;
        kwz0 kwz0Var = mb01Var3.h;
        k901 k901Var = mb01Var3.j;
        x901 x901Var = mb01Var3.i;
        if (kwz0Var.t(null, s701.p0)) {
            mb01.i(x901Var);
            if (x901Var.p().f(zzah.ANALYTICS_STORAGE)) {
                mb01.i(x901Var);
                mb01Var3.o.getClass();
                if (!x901Var.r(System.currentTimeMillis())) {
                    mb01.i(x901Var);
                    if (x901Var.r.a() != 0) {
                        mb01.i(x901Var);
                        l = Long.valueOf(x901Var.r.a());
                        zzcf zzcfVar = this.b;
                        if (l == null) {
                            sk01 sk01Var = mb01Var2.m;
                            mb01.i(sk01Var);
                            sk01Var.G(zzcfVar, l.longValue());
                            return;
                        } else {
                            try {
                                zzcfVar.zze(null);
                                return;
                            } catch (RemoteException e) {
                                k901 k901Var2 = mb01Var2.j;
                                mb01.k(k901Var2);
                                k901Var2.i.b(e, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                }
            } else {
                mb01.k(k901Var);
                k901Var.n.a("Analytics storage consent denied; will not get session id");
            }
        } else {
            mb01.k(k901Var);
            k901Var.n.a("getSessionId has been disabled.");
        }
        l = null;
        zzcf zzcfVar2 = this.b;
        if (l == null) {
        }
    }
}
