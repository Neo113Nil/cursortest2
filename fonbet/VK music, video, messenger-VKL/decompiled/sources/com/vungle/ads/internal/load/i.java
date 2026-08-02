package com.vungle.ads.internal.load;

import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.o;
import com.vungle.ads.internal.protos.Sdk;
import xsna.e0;
import xsna.ir40;

/* loaded from: classes7.dex */
public final class i implements com.vungle.ads.internal.network.a {
    public final /* synthetic */ j a;
    public final /* synthetic */ i3 b;

    public i(j jVar, i3 i3Var) {
        this.a = jVar;
        this.b = i3Var;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        j jVar = this.a;
        ((com.vungle.ads.internal.executor.d) jVar.c).b.execute(new ir40(jVar, this.b, oVar, 4));
    }

    public static final void a(j jVar, i3 i3Var, o oVar) {
        if (jVar.h().b(i3Var.b()) > 0) {
            jVar.a(new AdRetryError().setLogEntry$vungle_ads_release(jVar.e()).logError$vungle_ads_release());
            return;
        }
        if (oVar != null && !oVar.c()) {
            jVar.a(new APIFailedStatusCodeError(jVar.l() + " API: " + oVar.b()).setLogEntry$vungle_ads_release(jVar.e()).logError$vungle_ads_release());
            return;
        }
        h0 h0Var = oVar != null ? (h0) oVar.a() : null;
        if ((h0Var != null ? h0Var.c() : null) == null) {
            jVar.a(new AdResponseEmptyError(jVar.l() + " ad response is empty").setLogEntry$vungle_ads_release(jVar.e()).logError$vungle_ads_release());
            return;
        }
        jVar.a(h0Var, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        j jVar = this.a;
        ((com.vungle.ads.internal.executor.d) jVar.c).b.execute(new e0(12, jVar, th));
    }

    public static final void a(j jVar, Throwable th) {
        jVar.a(j.a(jVar, th).setLogEntry$vungle_ads_release(jVar.e()).logError$vungle_ads_release());
    }
}
