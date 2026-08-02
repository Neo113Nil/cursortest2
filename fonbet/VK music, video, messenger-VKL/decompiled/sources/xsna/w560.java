package xsna;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class w560 {
    public static final String a = m100.d("NetworkStateTracker");

    public static final l560 a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            m100.c().b(a, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            z = networkCapabilities.hasCapability(16);
            return new l560(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z = false;
        return new l560(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
