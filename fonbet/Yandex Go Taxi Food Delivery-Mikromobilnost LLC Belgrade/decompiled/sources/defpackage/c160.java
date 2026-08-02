package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class c160 {
    public static final String a = hgz.o("NetworkStateTracker");

    public static final u060 a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities networkCapabilities;
        String str = a;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                hgz.g().f(str, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                z = networkCapabilities.hasCapability(16);
                return new u060(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
            z = false;
            return new u060(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        } catch (SecurityException e2) {
            hgz.g().f(str, "Unable to get active network state", e2);
            return new u060(false, false, false, true);
        }
    }
}
