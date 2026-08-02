package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class idy0 {
    public static Context b;
    public final Context a;

    public idy0(Context context) {
        this.a = context;
        b = context;
    }

    public final boolean a() {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                    if (networkCapabilities.hasTransport(3)) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("SdkAppContext: can't check network state "), th);
            return false;
        }
    }
}
