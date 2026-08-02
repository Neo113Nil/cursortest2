package ru.ok.android.webrtc.signaling.sensor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor;

@CallInternalApi
/* loaded from: classes9.dex */
public final class NetworkAvailabilitySensor {

    @Deprecated
    public static final String LOG_TAG = "OVC_ST_Helper_1";
    public final Context a;
    public final RTCLog b;
    public volatile Listener c;
    public final NetworkAvailabilitySensor$initializeNetworkCallback$1 d;

    public interface Listener {
        void onNetworkAvailable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkAvailabilitySensor(Context context, RTCLog rTCLog) {
        this.a = context;
        this.b = rTCLog;
        NetworkAvailabilitySensor$initializeNetworkCallback$1 networkAvailabilitySensor$initializeNetworkCallback$1 = null;
        try {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor$initializeNetworkCallback$1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(Network network) {
                        RTCLog rTCLog2;
                        NetworkAvailabilitySensor.Listener listener;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "Network available " + network);
                        listener = NetworkAvailabilitySensor.this.c;
                        if (listener != null) {
                            listener.onNetworkAvailable();
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onBlockedStatusChanged(Network network, boolean z) {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "NT blocked " + network + " blocked=" + z);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "NT caps update " + network + " caps=" + networkCapabilities);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "NT updated " + network + " props=" + linkProperties);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLosing(Network network, int i) {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "NT losing " + network + ". mttl=" + i);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network) {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "NT lost " + network);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onUnavailable() {
                        RTCLog rTCLog2;
                        rTCLog2 = NetworkAvailabilitySensor.this.b;
                        rTCLog2.log(NetworkAvailabilitySensor.LOG_TAG, "Network unavailable");
                    }
                };
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), networkCallback);
                networkAvailabilitySensor$initializeNetworkCallback$1 = networkCallback;
            }
        } catch (Throwable th) {
            this.b.logException(LOG_TAG, "Can't set up callback", th);
        }
        this.d = networkAvailabilitySensor$initializeNetworkCallback$1;
    }

    public final ConnectivityManager.NetworkCallback getNetworkCallback() {
        return this.d;
    }

    public final void release() {
        NetworkAvailabilitySensor$initializeNetworkCallback$1 networkAvailabilitySensor$initializeNetworkCallback$1 = this.d;
        if (networkAvailabilitySensor$initializeNetworkCallback$1 != null) {
            Object systemService = this.a.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(networkAvailabilitySensor$initializeNetworkCallback$1);
            }
        }
        this.c = null;
    }

    public final void setListener(Listener listener) {
        this.c = listener;
    }
}
