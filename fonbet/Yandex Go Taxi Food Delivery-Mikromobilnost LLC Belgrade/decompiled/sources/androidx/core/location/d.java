package androidx.core.location;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ d(Object obj, Executor executor, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = executor;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        Executor executor = this.b;
        Object obj = this.w;
        switch (i) {
            case 0:
                ((LocationManagerCompat$GnssMeasurementsTransport) obj).lambda$onStatusChanged$1(executor, i2);
                break;
            case 1:
                ((LocationManagerCompat$GpsStatusTransport) obj).lambda$onGpsStatusChanged$2(executor, i2);
                break;
            default:
                ((LocationManagerCompat$PreRGnssStatusTransport) obj).lambda$onFirstFix$2(executor, i2);
                break;
        }
    }
}
