package xsna;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class wh01 implements Runnable {
    public final /* synthetic */ xh01 b;

    public wh01(xh01 xh01Var) {
        this.b = xh01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xh01 xh01Var = this.b;
        yh01 yh01Var = xh01Var.d;
        Context context = ((mb01) yh01Var.b).b;
        ((mb01) xh01Var.d.b).getClass();
        yh01.y(yh01Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
