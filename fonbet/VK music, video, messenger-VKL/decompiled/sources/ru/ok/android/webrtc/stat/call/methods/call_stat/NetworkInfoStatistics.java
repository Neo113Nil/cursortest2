package ru.ok.android.webrtc.stat.call.methods.call_stat;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* loaded from: classes9.dex */
public final class NetworkInfoStatistics {

    @Deprecated
    public static final String LOG_TAG = "NetworkInfoStatistics";

    @Deprecated
    public static final String NETWORK_TYPE_CELLULAR = "cellular";

    @Deprecated
    public static final String NETWORK_TYPE_UNKNOWN = "unknown";

    @Deprecated
    public static final String NETWORK_TYPE_VPN = "vpn";

    @Deprecated
    public static final String NETWORK_TYPE_WIFI = "wifi";
    public final ConnectivityManager a;
    public final RTCLog b;

    public NetworkInfoStatistics(ConnectivityManager connectivityManager, RTCLog rTCLog) {
        this.a = connectivityManager;
        this.b = rTCLog;
    }

    public final String a() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.a.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = this.a.getNetworkCapabilities(activeNetwork)) == null) ? "unknown" : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }

    public final void addStats(EventItemsMap eventItemsMap) {
        String str;
        try {
            str = a();
        } catch (Throwable th) {
            this.b.reportException(LOG_TAG, "Can't get network state", new IllegalStateException("get.network.state.error", th));
            str = "unknown";
        }
        eventItemsMap.set(StatCustomFieldKey.NETWORK_TYPE, str);
    }
}
