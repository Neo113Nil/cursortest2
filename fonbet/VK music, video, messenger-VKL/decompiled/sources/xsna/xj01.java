package xsna;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes13.dex */
public final class xj01 implements Runnable {
    public final /* synthetic */ fh9 b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public xj01(AppMeasurementDynamiteService appMeasurementDynamiteService, fh9 fh9Var) {
        this.c = appMeasurementDynamiteService;
        this.b = fh9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf01 bf01Var = this.c.a.q;
        mb01.j(bf01Var);
        bf01Var.k();
        bf01Var.l();
        gd01 gd01Var = bf01Var.g;
        fh9 fh9Var = this.b;
        if (fh9Var != gd01Var) {
            exc0.k("EventInterceptor already set.", gd01Var == null);
        }
        bf01Var.g = fh9Var;
    }
}
