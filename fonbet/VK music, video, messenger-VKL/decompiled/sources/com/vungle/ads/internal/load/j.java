package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;
import java.net.SocketTimeoutException;

/* loaded from: classes7.dex */
public class j extends g {
    public j(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d dVar, com.vungle.ads.internal.omsdk.c cVar, com.vungle.ads.internal.downloader.m mVar, PathProvider pathProvider, b bVar) {
        super(context, vungleApiClient, dVar, cVar, mVar, pathProvider, bVar);
    }

    public static final VungleError a(j jVar, Throwable th) {
        jVar.getClass();
        if (th instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.l());
        sb.append(" request fail: ");
        sb.append(th != null ? th.getMessage() : null);
        return new NetworkUnreachable(sb.toString());
    }

    @Override // com.vungle.ads.internal.load.g
    public final void k() {
        b bVar = this.g;
        VungleAdSize vungleAdSize = bVar.c;
        i3 i3Var = bVar.a;
        if (h().a(i3Var.b())) {
            a(new AdRetryActiveError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.m a = a(i3Var.b(), vungleAdSize);
        if (a != null) {
            a.a(new i(this, i3Var));
            return;
        }
        a(new NetworkUnreachable(l() + " is null").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
    }

    public String l() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public com.vungle.ads.internal.network.m a(String str, VungleAdSize vungleAdSize) {
        return h().a(str, vungleAdSize);
    }

    @Override // com.vungle.ads.internal.load.g
    public final void i() {
    }
}
