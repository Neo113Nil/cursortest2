package xsna;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ma01 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ma01(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                vjq vjqVar = (vjq) this.c;
                olk0 olk0Var = (olk0) this.d;
                vjqVar.f.a(olk0Var);
                vjqVar.g.a(olk0Var);
                break;
            case 1:
                ((fh01) this.d).c.V1((lvf0) this.c);
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.d;
                sk01 sk01Var = appMeasurementDynamiteService.a.m;
                mb01.i(sk01Var);
                zzcf zzcfVar = (zzcf) this.c;
                mb01 mb01Var = appMeasurementDynamiteService.a;
                sk01Var.B(zzcfVar, mb01Var.B != null && mb01Var.B.booleanValue());
                break;
        }
    }

    public /* synthetic */ ma01(vjq vjqVar, olk0 olk0Var) {
        this.b = 0;
        this.c = vjqVar;
        this.d = olk0Var;
    }
}
