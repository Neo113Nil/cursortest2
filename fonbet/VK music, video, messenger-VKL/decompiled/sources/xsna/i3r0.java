package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* compiled from: Utils.java */
/* loaded from: classes13.dex */
public final class i3r0 {
    public static Boolean a;

    public static boolean a(@NonNull Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            a = Boolean.valueOf(z);
            return z;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            ra2 d = ra2.d();
            e.getMessage();
            d.a();
            return false;
        }
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
