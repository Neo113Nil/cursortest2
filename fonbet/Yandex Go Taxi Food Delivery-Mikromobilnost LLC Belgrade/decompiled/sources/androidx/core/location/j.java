package androidx.core.location;

import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import defpackage.d7z;
import defpackage.kgb1;
import defpackage.mcz;
import defpackage.u9z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class j {
    public static final WeakHashMap a = new WeakHashMap();

    public static void a(LocationManager locationManager, LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport) {
        WeakReference weakReference = (WeakReference) a.put(locationManagerCompat$LocationListenerTransport.getKey(), new WeakReference(locationManagerCompat$LocationListenerTransport));
        LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport2 = weakReference != null ? (LocationManagerCompat$LocationListenerTransport) weakReference.get() : null;
        if (locationManagerCompat$LocationListenerTransport2 != null) {
            locationManagerCompat$LocationListenerTransport2.unregister();
            locationManager.removeUpdates(locationManagerCompat$LocationListenerTransport2);
        }
    }

    public static void b(LocationManager locationManager, LocationListenerCompat locationListenerCompat) {
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            try {
                Iterator it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport = (LocationManagerCompat$LocationListenerTransport) ((WeakReference) it.next()).get();
                    if (locationManagerCompat$LocationListenerTransport != null) {
                        u9z key = locationManagerCompat$LocationListenerTransport.getKey();
                        if (key.b == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(key);
                            locationManagerCompat$LocationListenerTransport.unregister();
                            locationManager.removeUpdates(locationManagerCompat$LocationListenerTransport);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a.remove((u9z) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    public static void c(LocationManager locationManager, String str, mcz mczVar, Executor executor, LocationListenerCompat locationListenerCompat) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            mczVar.getClass();
            d7z.c(locationManager, str, d7z.d(mczVar), executor, locationListenerCompat);
        } else if (i < 30 || !kgb1.c(locationManager, str, mczVar, executor, locationListenerCompat)) {
            LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport = new LocationManagerCompat$LocationListenerTransport(new u9z(str, locationListenerCompat), executor);
            if (com.yandex.passport.internal.ui.c.L(locationManager, str, mczVar, locationManagerCompat$LocationListenerTransport)) {
                return;
            }
            synchronized (a) {
                locationManager.requestLocationUpdates(str, mczVar.b, mczVar.d, locationManagerCompat$LocationListenerTransport, Looper.getMainLooper());
                a(locationManager, locationManagerCompat$LocationListenerTransport);
            }
        }
    }
}
