package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.yandex.mob.metrics.AndroidNetworkSettingsProvider$networkCallback$1;
import com.yandex.mob.okhttp.metrics.MobNetworkSettingsProvider$MobNetworkType;
import defpackage.cb2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class cb2 {
    public final ConnectivityManager a;
    public final r0 b = bvf0.c(null);
    public final AndroidNetworkSettingsProvider$networkCallback$1 c = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.mob.metrics.AndroidNetworkSettingsProvider$networkCallback$1
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities;
            super.onAvailable(network);
            cb2 cb2Var = cb2.this;
            ConnectivityManager connectivityManager = cb2Var.a;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || !network.equals(activeNetwork) || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return;
            }
            cb2Var.a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2;
            super.onCapabilitiesChanged(network, networkCapabilities);
            cb2 cb2Var = cb2.this;
            ConnectivityManager connectivityManager = cb2Var.a;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || !network.equals(activeNetwork) || (networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return;
            }
            cb2Var.a(networkCapabilities2);
        }
    };

    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.mob.metrics.AndroidNetworkSettingsProvider$networkCallback$1] */
    public cb2(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        hp20 hp20Var = new hp20(networkCapabilities.hasTransport(4), networkCapabilities.hasTransport(1) ? MobNetworkSettingsProvider$MobNetworkType.Wifi : networkCapabilities.hasTransport(0) ? MobNetworkSettingsProvider$MobNetworkType.Cellular : MobNetworkSettingsProvider$MobNetworkType.Other);
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, hp20Var);
    }
}
