package com.yandex.go.call_order_fallback.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/call_order_fallback/analytics/CallOrderFallbackAnalytics$CloseReason", "", "Lcom/yandex/go/call_order_fallback/analytics/CallOrderFallbackAnalytics$CloseReason;", "Lcom/yandex/go/call_order_fallback/analytics/TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;", "analyticsValue", "Lcom/yandex/go/call_order_fallback/analytics/TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;", "a", "()Lcom/yandex/go/call_order_fallback/analytics/TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;", "CROSS", "AUTO", "BACK_BUTTON", "call_order_fallback"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CallOrderFallbackAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CallOrderFallbackAnalytics$CloseReason[] $VALUES;
    public static final CallOrderFallbackAnalytics$CloseReason AUTO;
    public static final CallOrderFallbackAnalytics$CloseReason BACK_BUTTON;
    public static final CallOrderFallbackAnalytics$CloseReason CROSS;
    private final TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason analyticsValue;

    static {
        CallOrderFallbackAnalytics$CloseReason callOrderFallbackAnalytics$CloseReason = new CallOrderFallbackAnalytics$CloseReason("CROSS", 0, TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason.Cross);
        CROSS = callOrderFallbackAnalytics$CloseReason;
        CallOrderFallbackAnalytics$CloseReason callOrderFallbackAnalytics$CloseReason2 = new CallOrderFallbackAnalytics$CloseReason("AUTO", 1, TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason.Auto);
        AUTO = callOrderFallbackAnalytics$CloseReason2;
        CallOrderFallbackAnalytics$CloseReason callOrderFallbackAnalytics$CloseReason3 = new CallOrderFallbackAnalytics$CloseReason("BACK_BUTTON", 2, TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason.BackButton);
        BACK_BUTTON = callOrderFallbackAnalytics$CloseReason3;
        CallOrderFallbackAnalytics$CloseReason[] callOrderFallbackAnalytics$CloseReasonArr = {callOrderFallbackAnalytics$CloseReason, callOrderFallbackAnalytics$CloseReason2, callOrderFallbackAnalytics$CloseReason3};
        $VALUES = callOrderFallbackAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(callOrderFallbackAnalytics$CloseReasonArr);
    }

    public CallOrderFallbackAnalytics$CloseReason(String str, int i, TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason) {
        this.analyticsValue = taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;
    }

    public static CallOrderFallbackAnalytics$CloseReason valueOf(String str) {
        return (CallOrderFallbackAnalytics$CloseReason) Enum.valueOf(CallOrderFallbackAnalytics$CloseReason.class, str);
    }

    public static CallOrderFallbackAnalytics$CloseReason[] values() {
        return (CallOrderFallbackAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason getAnalyticsValue() {
        return this.analyticsValue;
    }
}
