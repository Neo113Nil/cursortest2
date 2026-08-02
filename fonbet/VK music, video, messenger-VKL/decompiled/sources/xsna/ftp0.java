package xsna;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* compiled from: TwilightManager.java */
/* loaded from: classes11.dex */
public final class ftp0 {
    public static ftp0 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* compiled from: TwilightManager.java */
    public static class a {
        public boolean a;
        public long b;
    }

    public ftp0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static ftp0 a(@NonNull Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new ftp0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }
}
