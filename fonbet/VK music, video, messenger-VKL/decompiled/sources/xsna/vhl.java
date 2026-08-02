package xsna;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: DefaultLocalTunnelDetector.kt */
/* loaded from: classes3.dex */
public final class vhl extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ gzs<s3q0> a;

    public vhl(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.a.invoke();
    }
}
