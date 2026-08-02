package xsna;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkCallback.kt */
/* loaded from: classes3.dex */
public final class j260 extends ConnectivityManager.NetworkCallback {
    public final uhl a;

    public j260(uhl uhlVar) {
        this.a = uhlVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.invoke(network, Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.a.invoke(network, Boolean.valueOf(networkCapabilities.hasTransport(4)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.invoke(network, Boolean.FALSE);
    }
}
