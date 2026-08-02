package xsna;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class u560 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ v560 a;

    public u560(v560 v560Var) {
        this.a = v560Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m100 c = m100.c();
        String str = w560.a;
        networkCapabilities.toString();
        c.getClass();
        this.a.b(new l560(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        m100 c = m100.c();
        String str = w560.a;
        c.getClass();
        v560 v560Var = this.a;
        v560Var.b(w560.a(v560Var.f));
    }
}
