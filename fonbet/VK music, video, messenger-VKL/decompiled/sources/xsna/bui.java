package xsna;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CompositeNetworkCallback.kt */
/* loaded from: classes11.dex */
public final class bui extends ConnectivityManager.NetworkCallback {
    public final CopyOnWriteArrayList<ConnectivityManager.NetworkCallback> a = new CopyOnWriteArrayList<>();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<ConnectivityManager.NetworkCallback> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onBlockedStatusChanged(network, z);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onLinkPropertiesChanged(network, linkProperties);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onLosing(network, i);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
        }
    }
}
