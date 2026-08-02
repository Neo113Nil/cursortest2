package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;

/* loaded from: classes7.dex */
public final class n extends g {
    public n(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d dVar, com.vungle.ads.internal.omsdk.c cVar, com.vungle.ads.internal.downloader.m mVar, PathProvider pathProvider, b bVar) {
        super(context, vungleApiClient, dVar, cVar, mVar, pathProvider, bVar);
    }

    @Override // com.vungle.ads.internal.load.g
    public final void i() {
        com.vungle.ads.internal.model.i k;
        h0 h0Var = this.n;
        List list = (h0Var == null || (k = h0Var.k()) == null) ? null : k.q;
        if (list == null || !list.isEmpty()) {
            Lazy a = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new m(d()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) a.getValue()).a(new p((String) it.next()).b("win-notification").a(e()).a(), false);
                }
            }
        }
    }

    @Override // com.vungle.ads.internal.load.g
    public final void k() {
        p0 a = b().a();
        if (a == null) {
            a(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.q()) {
            try {
                String b = a.b();
                boolean z = u.a;
                t.a("RTA_DEBUGGER", String.valueOf(b));
                Lazy a2 = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new l(d()));
                if (b != null) {
                    new k((VungleApiClient) a2.getValue()).a(b);
                }
            } catch (Throwable unused) {
            }
        }
        h0 a3 = a.a();
        Integer c = a.c();
        if (c == null || c.intValue() != 2 || a3 == null) {
            a(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
        } else {
            a(a3, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
