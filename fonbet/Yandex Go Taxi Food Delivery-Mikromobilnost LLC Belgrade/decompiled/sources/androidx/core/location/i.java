package androidx.core.location;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationManagerCompat$PreRGnssStatusTransport b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ i(LocationManagerCompat$PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport, Executor executor, int i) {
        this.a = i;
        this.b = locationManagerCompat$PreRGnssStatusTransport;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Executor executor = this.c;
        LocationManagerCompat$PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport = this.b;
        switch (i) {
            case 0:
                locationManagerCompat$PreRGnssStatusTransport.lambda$onStopped$1(executor);
                break;
            default:
                locationManagerCompat$PreRGnssStatusTransport.lambda$onStarted$0(executor);
                break;
        }
    }
}
