package androidx.core.location;

import android.location.Location;
import defpackage.e9e;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LocationManagerCompat$CancellableLocationListener.lambda$onLocationChanged$1((e9e) obj2, (Location) obj);
                break;
            case 1:
                ((LocationManagerCompat$LocationListenerTransport) obj2).lambda$onLocationChanged$1((List) obj);
                break;
            default:
                ((LocationManagerCompat$LocationListenerTransport) obj2).lambda$onLocationChanged$0((Location) obj);
                break;
        }
    }
}
