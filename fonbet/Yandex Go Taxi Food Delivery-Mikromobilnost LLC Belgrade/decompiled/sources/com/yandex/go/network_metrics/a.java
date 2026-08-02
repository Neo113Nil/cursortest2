package com.yandex.go.network_metrics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.yandex.go.network_metrics.api.NetworkSettingsProvider$NetworkType;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l060;
import defpackage.tt2;
import defpackage.yw60;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class a implements yw60 {
    public final ConnectivityManager a;
    public final NetworkRequest b = new NetworkRequest.Builder().addTransportType(4).addTransportType(0).addTransportType(1).build();
    public final AtomicReference c = new AtomicReference(null);
    public final hbp0 d;
    public volatile AndroidNetworkSettingsProvider$onAppCreated$networkCallback$1 e;

    public a(Context context, tt2 tt2Var) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = new hbp0(new AndroidNetworkSettingsProvider$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    public final void d(NetworkCapabilities networkCapabilities) {
        boolean hasTransport = networkCapabilities.hasTransport(4);
        boolean hasTransport2 = networkCapabilities.hasTransport(1);
        boolean hasTransport3 = networkCapabilities.hasTransport(0);
        networkCapabilities.hasCapability(16);
        networkCapabilities.hasCapability(12);
        NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType = hasTransport2 ? NetworkSettingsProvider$NetworkType.Wifi : hasTransport3 ? NetworkSettingsProvider$NetworkType.Cellular : NetworkSettingsProvider$NetworkType.Other;
        hst hstVar = jst.e;
        this.c.set(new l060(hasTransport, networkSettingsProvider$NetworkType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.net.ConnectivityManager$NetworkCallback, com.yandex.go.network_metrics.AndroidNetworkSettingsProvider$onAppCreated$networkCallback$1] */
    @Override // defpackage.yw60
    public final void e() {
        this.d.a();
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            d(networkCapabilities);
        }
        ?? r0 = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.go.network_metrics.AndroidNetworkSettingsProvider$onAppCreated$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                NetworkCapabilities networkCapabilities2;
                super.onAvailable(network);
                a aVar = a.this;
                ConnectivityManager connectivityManager2 = aVar.a;
                Network activeNetwork = connectivityManager2.getActiveNetwork();
                if (activeNetwork == null || !jl40.l(network, activeNetwork) || (networkCapabilities2 = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null) {
                    return;
                }
                aVar.d(networkCapabilities2);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities2) {
                NetworkCapabilities networkCapabilities3;
                super.onCapabilitiesChanged(network, networkCapabilities2);
                a aVar = a.this;
                ConnectivityManager connectivityManager2 = aVar.a;
                Network activeNetwork = connectivityManager2.getActiveNetwork();
                if (activeNetwork == null || !jl40.l(network, activeNetwork) || (networkCapabilities3 = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null) {
                    return;
                }
                aVar.d(networkCapabilities3);
            }
        };
        this.a.registerNetworkCallback(this.b, (ConnectivityManager.NetworkCallback) r0);
        this.e = r0;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AndroidNetworkSettingsProvider";
    }

    @Override // defpackage.yw60
    public final void l() {
        this.d.b();
        AndroidNetworkSettingsProvider$onAppCreated$networkCallback$1 androidNetworkSettingsProvider$onAppCreated$networkCallback$1 = this.e;
        if (androidNetworkSettingsProvider$onAppCreated$networkCallback$1 != null) {
            try {
                this.a.unregisterNetworkCallback(androidNetworkSettingsProvider$onAppCreated$networkCallback$1);
            } catch (Exception e) {
                jst.e.x(e, "Failed to unregister network callback");
            }
        }
    }
}
