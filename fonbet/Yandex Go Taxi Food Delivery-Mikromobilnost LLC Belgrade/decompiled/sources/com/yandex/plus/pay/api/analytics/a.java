package com.yandex.plus.pay.api.analytics;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import defpackage.tls;

/* loaded from: classes2.dex */
public final class a {
    public static PlusPayAnalyticsParams a(tls tlsVar) {
        PlusPayAnalyticsParams.a aVar = new PlusPayAnalyticsParams.a();
        tlsVar.invoke(aVar);
        return new PlusPayAnalyticsParams(aVar.a, null, aVar.b, null, aVar.c, aVar.d, null);
    }

    public static PlusPayAnalyticsParams b() {
        PlusPayAnalyticsParams.a aVar = new PlusPayAnalyticsParams.a();
        return new PlusPayAnalyticsParams(aVar.a, null, aVar.b, null, aVar.c, aVar.d, null);
    }
}
