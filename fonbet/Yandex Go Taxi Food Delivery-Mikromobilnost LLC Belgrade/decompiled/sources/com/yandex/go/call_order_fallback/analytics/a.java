package com.yandex.go.call_order_fallback.analytics;

import defpackage.co40;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class a {
    public final co40 a;

    public a(co40 co40Var) {
        this.a = co40Var;
    }

    public final void a() {
        c(CallOrderFallbackAnalytics$CloseReason.AUTO);
    }

    public final void b() {
        c(CallOrderFallbackAnalytics$CloseReason.CROSS);
    }

    public final void c(CallOrderFallbackAnalytics$CloseReason callOrderFallbackAnalytics$CloseReason) {
        TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason analyticsValue = callOrderFallbackAnalytics$CloseReason.getAnalyticsValue();
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", analyticsValue.getEventValue());
        co40Var.a.a("TaxiFallbackCallOrderModal.Closed", hashMap, 1, new HashMap());
    }

    public final void d() {
        c(CallOrderFallbackAnalytics$CloseReason.BACK_BUTTON);
    }
}
