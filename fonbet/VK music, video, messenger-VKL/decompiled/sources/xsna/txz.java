package xsna;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.vk.core.preference.Preference;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: LocationInfo.kt */
/* loaded from: classes.dex */
public final class txz {
    public static final long a;
    public static final long b;
    public static final Random c;

    static {
        long millis = TimeUnit.MINUTES.toMillis(5L);
        a = millis;
        b = millis - TimeUnit.SECONDS.toMillis(10L);
        c = new Random();
    }

    public static Location a(long j, Context context) {
        pro0.b();
        c63 c63Var = c63.a;
        if (!c63.f || !b()) {
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            AtomicReference atomicReference = new AtomicReference();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            asu0.a.getClass();
            asu0.n().submit(new pxz(locationManager, atomicReference, countDownLatch, 0));
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
            return (Location) atomicReference.get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean b() {
        return Preference.j().getBoolean("mytrackerLocationCrapEnabled", true);
    }

    public static JSONObject c(String str) {
        return yq.d("no_data_reason", str);
    }
}
