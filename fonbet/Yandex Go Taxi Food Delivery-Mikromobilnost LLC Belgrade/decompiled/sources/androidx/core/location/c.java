package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import defpackage.bxt;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ c(Object obj, Executor executor, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = executor;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.w;
        Executor executor = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((LocationManagerCompat$GnssMeasurementsTransport) obj2).lambda$onGnssMeasurementsReceived$0(executor, (GnssMeasurementsEvent) obj);
                break;
            case 1:
                ((LocationManagerCompat$GpsStatusTransport) obj2).lambda$onGpsStatusChanged$3(executor, (bxt) obj);
                break;
            default:
                ((LocationManagerCompat$PreRGnssStatusTransport) obj2).lambda$onSatelliteStatusChanged$3(executor, (GnssStatus) obj);
                break;
        }
    }
}
