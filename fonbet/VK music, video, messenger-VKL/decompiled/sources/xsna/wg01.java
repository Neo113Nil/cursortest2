package xsna;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes13.dex */
public final class wg01 implements Runnable {
    public final /* synthetic */ zzcf b;
    public final /* synthetic */ zzaw c;
    public final /* synthetic */ String d;
    public final /* synthetic */ AppMeasurementDynamiteService e;

    public wg01(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzaw zzawVar, String str) {
        this.e = appMeasurementDynamiteService;
        this.b = zzcfVar;
        this.c = zzawVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 s = this.e.a.s();
        s.k();
        s.l();
        mb01 mb01Var = (mb01) s.b;
        sk01 sk01Var = mb01Var.m;
        mb01.i(sk01Var);
        int c = com.google.android.gms.common.a.b.c(((mb01) sk01Var.b).b, 12451000);
        zzcf zzcfVar = this.b;
        if (c == 0) {
            s.w(new qg01(s, this.c, this.d, zzcfVar));
            return;
        }
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.l.a("Not bundling data. Service unavailable or out of date");
        sk01 sk01Var2 = mb01Var.m;
        mb01.i(sk01Var2);
        sk01Var2.E(zzcfVar, new byte[0]);
    }
}
