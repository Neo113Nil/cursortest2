package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.network.RealNetworkObserver$networkCallback$1;
import coil.util.SystemCallbacks;
import defpackage.cdi0;

/* loaded from: classes10.dex */
public final class cdi0 implements ux50 {
    public final ConnectivityManager a;
    public final SystemCallbacks b;
    public final RealNetworkObserver$networkCallback$1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.net.ConnectivityManager$NetworkCallback, coil.network.RealNetworkObserver$networkCallback$1] */
    public cdi0(ConnectivityManager connectivityManager, SystemCallbacks systemCallbacks) {
        this.a = connectivityManager;
        this.b = systemCallbacks;
        ?? r3 = new ConnectivityManager.NetworkCallback() { // from class: coil.network.RealNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                cdi0.b(cdi0.this, network, true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                cdi0.b(cdi0.this, network, false);
            }
        };
        this.c = r3;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) r3);
    }

    public static final void b(cdi0 cdi0Var, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = cdi0Var.a.getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (jl40.l(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = cdi0Var.a.getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        cdi0Var.b.onConnectivityChange(z3);
    }

    @Override // defpackage.ux50
    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ux50
    public final void shutdown() {
        this.a.unregisterNetworkCallback(this.c);
    }
}
