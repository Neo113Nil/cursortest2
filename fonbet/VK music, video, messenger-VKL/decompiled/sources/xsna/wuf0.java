package xsna;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.vk.location.common.LocationCommon;
import com.vk.sunrise.SunState;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import org.shredzone.commons.suncalc.SunTimes;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wuf0 implements Callable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ wuf0(yuf0 yuf0Var) {
        this.c = yuf0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Location location;
        List<String> allProviders;
        switch (this.b) {
            case 0:
                return ((yuf0) this.c).a("firebase");
            default:
                Context context = (Context) this.c;
                LocationCommon.a.getClass();
                if (LocationCommon.b(context) && LocationCommon.a(context)) {
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    location = null;
                    if (locationManager != null && (allProviders = locationManager.getAllProviders()) != null) {
                        Iterator<String> it = allProviders.iterator();
                        float f = Float.MAX_VALUE;
                        long j = 0;
                        while (it.hasNext()) {
                            try {
                                Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                                if (lastKnownLocation != null) {
                                    float accuracy = lastKnownLocation.getAccuracy();
                                    long time = lastKnownLocation.getTime();
                                    if (location == null || (time > j && accuracy < f)) {
                                        location = lastKnownLocation;
                                        f = accuracy;
                                        j = time;
                                    }
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                    }
                    if (location == null) {
                        LocationCommon.a.getClass();
                        location = LocationCommon.b;
                    }
                } else {
                    location = LocationCommon.b;
                }
                LocationCommon.a.getClass();
                if (epx.f(location, LocationCommon.b)) {
                    return SunState.UNKNOWN;
                }
                Date date = new Date();
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                calendar.setTime(date);
                SunTimes.b a = SunTimes.a();
                a.c(location.getLatitude(), location.getLongitude());
                SunTimes a2 = ((SunTimes.a) a.b(calendar.get(1), calendar.get(2) + 1, calendar.get(5))).a();
                Date b = a2.b();
                if (b == null) {
                    b = date;
                }
                Date c = a2.c();
                if (c == null) {
                    c = date;
                }
                return a2.d() ? SunState.DOWN : a2.e() ? SunState.UP : date.compareTo(b) < 0 ? SunState.DOWN : (date.compareTo(b) < 0 || date.compareTo(c) > 0) ? date.compareTo(c) > 0 ? SunState.DOWN : SunState.UNKNOWN : SunState.UP;
        }
    }

    public /* synthetic */ wuf0(z6n0 z6n0Var, Context context) {
        this.c = context;
    }
}
