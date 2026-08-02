package xsna;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class v560 extends k6j<l560> {
    public final ConnectivityManager f;
    public final u560 g;

    public v560(Context context, hwx0 hwx0Var) {
        super(context, hwx0Var);
        this.f = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.g = new u560(this);
    }

    @Override // xsna.k6j
    public final l560 a() {
        return w560.a(this.f);
    }

    @Override // xsna.k6j
    public final void c() {
        try {
            m100 c = m100.c();
            String str = w560.a;
            c.getClass();
            this.f.registerDefaultNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            m100.c().b(w560.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            m100.c().b(w560.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // xsna.k6j
    public final void d() {
        try {
            m100 c = m100.c();
            String str = w560.a;
            c.getClass();
            this.f.unregisterNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            m100.c().b(w560.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            m100.c().b(w560.a, "Received exception while unregistering network callback", e2);
        }
    }
}
