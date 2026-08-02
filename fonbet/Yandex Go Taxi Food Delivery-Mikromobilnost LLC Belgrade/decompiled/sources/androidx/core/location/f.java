package androidx.core.location;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationManagerCompat$LocationListenerTransport b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport, String str, int i) {
        this.a = i;
        this.b = locationManagerCompat$LocationListenerTransport;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport = this.b;
        switch (i) {
            case 0:
                locationManagerCompat$LocationListenerTransport.lambda$onProviderEnabled$4(str);
                break;
            default:
                locationManagerCompat$LocationListenerTransport.lambda$onProviderDisabled$5(str);
                break;
        }
    }
}
