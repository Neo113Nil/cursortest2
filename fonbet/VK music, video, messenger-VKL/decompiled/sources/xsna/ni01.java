package xsna;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes13.dex */
public final class ni01 implements Runnable {
    public final /* synthetic */ zzcf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ AppMeasurementDynamiteService f;

    public ni01(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f = appMeasurementDynamiteService;
        this.b = zzcfVar;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 s = this.f.a.s();
        s.k();
        s.l();
        s.w(new lg01(s, this.c, this.d, s.t(false), this.e, this.b));
    }
}
