package com.ybsdk.screens.initial.deeplink;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.nbp0;
import defpackage.tje;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class b {
    public final nbp0 a;
    public final com.ybsdk.feature.banners.api.interactors.a b;
    public final AppAnalyticsReporter c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final com.ybsdk.core.utils.c e = new com.ybsdk.core.utils.c();

    public b(nbp0 nbp0Var, com.ybsdk.feature.banners.api.interactors.a aVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = nbp0Var;
        this.b = aVar;
        this.c = appAnalyticsReporter;
    }

    public final void a(String str, String str2) {
        tje.N(this.a.b, null, null, new DeeplinkRemoteRequestsManager$markEvent$1(this, str2, str, null), 3);
    }
}
