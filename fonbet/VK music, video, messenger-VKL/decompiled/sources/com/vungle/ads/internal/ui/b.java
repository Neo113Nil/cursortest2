package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class b extends com.vungle.ads.internal.util.b {
    public final /* synthetic */ l a;

    public b(l lVar) {
        this.a = lVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        com.vungle.ads.internal.presenter.r rVar = this.a.a;
        Long l = (rVar == null || rVar.j) ? null : 1L;
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", "App is in background, status: " + l);
        if (l != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION, l.longValue(), this.a.e, null, 8);
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
    }
}
