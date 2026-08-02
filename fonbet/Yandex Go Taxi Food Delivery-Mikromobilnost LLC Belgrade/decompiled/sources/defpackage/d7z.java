package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import java.util.concurrent.Executor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public abstract class d7z {
    public static boolean a(LocationManager locationManager, String str) {
        return locationManager.hasProvider(str);
    }

    public static boolean b(Location location) {
        return location.isMock();
    }

    public static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
    }

    public static LocationRequest d(mcz mczVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(mczVar.b).setQuality(mczVar.a);
        long j = mczVar.c;
        if (j == -1) {
            j = mczVar.b;
        }
        return quality.setMinUpdateIntervalMillis(j).setDurationMillis(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED).setMaxUpdates(Integer.MAX_VALUE).setMinUpdateDistanceMeters(mczVar.d).setMaxUpdateDelayMillis(0L).build();
    }
}
