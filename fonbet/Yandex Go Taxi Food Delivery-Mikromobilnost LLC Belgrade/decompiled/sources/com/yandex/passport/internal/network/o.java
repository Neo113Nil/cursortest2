package com.yandex.passport.internal.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import defpackage.dy40;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class o extends dy40 {
    public final ConnectivityManager l;
    public final NetworkRequest m;
    public final NetworkStatusLiveData$LollipopNetworkStatusLiveData$networkCallback$1 n;

    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.passport.internal.network.NetworkStatusLiveData$LollipopNetworkStatusLiveData$networkCallback$1] */
    public o(Context context) {
        Object systemService = context.getSystemService("connectivity");
        this.l = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.m = new NetworkRequest.Builder().build();
        this.n = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.passport.internal.network.NetworkStatusLiveData$LollipopNetworkStatusLiveData$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                o oVar = o.this;
                oVar.m(Boolean.valueOf(oVar.n()));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                o oVar = o.this;
                oVar.m(Boolean.valueOf(oVar.n()));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
                o oVar = o.this;
                oVar.m(Boolean.valueOf(oVar.n()));
            }
        };
    }

    @Override // androidx.lifecycle.v
    public final void h() {
        ConnectivityManager connectivityManager = this.l;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(this.m, this.n);
        }
        m(Boolean.valueOf(n()));
    }

    @Override // androidx.lifecycle.v
    public final void i() {
        ConnectivityManager connectivityManager = this.l;
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.n);
        }
    }

    public final boolean n() {
        Object failure;
        try {
            ConnectivityManager connectivityManager = this.l;
            failure = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        NetworkInfo networkInfo = (NetworkInfo) (failure instanceof Result.Failure ? null : failure);
        if (networkInfo != null) {
            return networkInfo.isConnected();
        }
        return false;
    }
}
