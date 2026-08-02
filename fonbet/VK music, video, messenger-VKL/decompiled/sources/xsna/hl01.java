package xsna;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes13.dex */
public final class hl01 implements Runnable {
    public final /* synthetic */ zzcf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ AppMeasurementDynamiteService e;

    public hl01(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.e = appMeasurementDynamiteService;
        this.b = zzcfVar;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 s = this.e.a.s();
        s.k();
        s.l();
        s.w(new rh01(s, this.c, this.d, s.t(false), this.b));
    }
}
