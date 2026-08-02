package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes8.dex */
public class RadioUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    private RadioUtils() {
    }

    @CalledByNative
    private static int getCellDataActivity() {
        TraceEvent scoped = TraceEvent.scoped("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone")).getDataActivity();
                if (scoped != null) {
                    scoped.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (scoped == null) {
                    return -1;
                }
                scoped.close();
                return -1;
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    private static int getCellSignalLevel() {
        TraceEvent scoped = TraceEvent.scoped("RadioUtils::getCellSignalLevel");
        try {
            int i = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (scoped != null) {
                scoped.close();
            }
            return i;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static boolean haveAccessNetworkState() {
        if (sHaveAccessNetworkState == null) {
            sHaveAccessNetworkState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        if (sHaveAccessWifiState == null) {
            sHaveAccessWifiState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    @CalledByNative
    private static boolean isSupported() {
        return haveAccessNetworkState() && haveAccessWifiState();
    }

    @CalledByNative
    private static boolean isWifiConnected() {
        TraceEvent scoped = TraceEvent.scoped("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (scoped != null) {
                scoped.close();
            }
            return hasTransport;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
