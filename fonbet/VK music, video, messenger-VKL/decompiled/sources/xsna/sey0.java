package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Lambda;

/* compiled from: NetworkConnectionObserver.kt */
/* loaded from: classes2.dex */
public final class sey0 {
    public final Context a;
    public final bpn0 b = new bpn0(new a());

    /* compiled from: NetworkConnectionObserver.kt */
    public static final class a extends Lambda implements gzs<ConnectivityManager> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ConnectivityManager invoke() {
            return (ConnectivityManager) sey0.this.a.getSystemService("connectivity");
        }
    }

    public sey0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r0.hasTransport(3) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Network activeNetwork;
        Boolean bool;
        NetworkCapabilities networkCapabilities;
        boolean z;
        bpn0 bpn0Var = this.b;
        ConnectivityManager connectivityManager = (ConnectivityManager) bpn0Var.getValue();
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) bpn0Var.getValue();
            if (connectivityManager2 == null || (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null) {
                bool = null;
            } else {
                if (networkCapabilities.hasCapability(12)) {
                    z = true;
                    if (!networkCapabilities.hasTransport(1)) {
                        if (!networkCapabilities.hasTransport(4)) {
                            if (!networkCapabilities.hasTransport(0)) {
                            }
                        }
                    }
                    bool = Boolean.valueOf(z);
                }
                z = false;
                bool = Boolean.valueOf(z);
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
