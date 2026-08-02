package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1;
import defpackage.b160;
import defpackage.c160;
import defpackage.hgz;
import defpackage.u060;

/* loaded from: classes.dex */
public final class b160 extends e8e {
    public final ConnectivityManager f;
    public final NetworkStateTracker24$networkCallback$1 g;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public b160(Context context, t951 t951Var) {
        super(context, t951Var);
        this.f = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.g = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                hgz g = hgz.g();
                String str = c160.a;
                capabilities.toString();
                g.getClass();
                b160.this.b(new u060(capabilities.hasCapability(12), capabilities.hasCapability(16), !capabilities.hasCapability(11), capabilities.hasCapability(18)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                hgz g = hgz.g();
                String str = c160.a;
                g.getClass();
                b160 b160Var = b160.this;
                b160Var.b(c160.a(b160Var.f));
            }
        };
    }

    @Override // defpackage.e8e
    public final Object a() {
        return c160.a(this.f);
    }

    @Override // defpackage.e8e
    public final void c() {
        try {
            hgz g = hgz.g();
            String str = c160.a;
            g.getClass();
            this.f.registerDefaultNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            hgz.g().f(c160.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            hgz.g().f(c160.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.e8e
    public final void d() {
        try {
            hgz g = hgz.g();
            String str = c160.a;
            g.getClass();
            this.f.unregisterNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            hgz.g().f(c160.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            hgz.g().f(c160.a, "Received exception while unregistering network callback", e2);
        }
    }
}
