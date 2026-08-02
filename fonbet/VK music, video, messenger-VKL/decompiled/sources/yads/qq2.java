package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes10.dex */
public final class qq2 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ rq2 c;

    public qq2(rq2 rq2Var) {
        this.c = rq2Var;
    }

    public final /* synthetic */ void a() {
        rq2 rq2Var = this.c;
        if (rq2Var.f != null) {
            rq2Var.a();
        }
    }

    public final void b() {
        rq2 rq2Var = this.c;
        if (rq2Var.f == null || (rq2Var.e & 3) == 0) {
            return;
        }
        rq2Var.a();
    }

    public final void c() {
        this.c.d.post(new xsna.o1(this, 18));
    }

    public final void d() {
        this.c.d.post(new xsna.ep0(this, 14));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        if (this.a && this.b == hasCapability) {
            if (hasCapability) {
                d();
            }
        } else {
            this.a = true;
            this.b = hasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
