package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class h extends j {
    public h(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d dVar, com.vungle.ads.internal.omsdk.c cVar, com.vungle.ads.internal.downloader.m mVar, PathProvider pathProvider, b bVar) {
        super(context, vungleApiClient, dVar, cVar, mVar, pathProvider, bVar);
    }

    @Override // com.vungle.ads.internal.load.j
    public final com.vungle.ads.internal.network.m a(String str, VungleAdSize vungleAdSize) {
        return h().a(str, vungleAdSize, b().b());
    }

    @Override // com.vungle.ads.internal.load.j
    public final String l() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.g
    public final VungleError a(h0 h0Var) {
        VungleError a = super.a(h0Var);
        if (a != null) {
            return a;
        }
        if (h0Var.m() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }
}
