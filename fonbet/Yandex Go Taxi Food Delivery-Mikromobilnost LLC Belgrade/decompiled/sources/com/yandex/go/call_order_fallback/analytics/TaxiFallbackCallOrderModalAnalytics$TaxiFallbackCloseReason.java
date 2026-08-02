package com.yandex.go.call_order_fallback.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/call_order_fallback/analytics/TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason", "", "Lcom/yandex/go/call_order_fallback/analytics/TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cross", "Auto", "BackButton", "call_order_fallback"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason[] $VALUES;
    public static final TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason Auto;
    public static final TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason BackButton;
    public static final TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason Cross;
    private final String eventValue;

    static {
        TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason = new TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason("Cross", 0, "cross");
        Cross = taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason;
        TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason2 = new TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason("Auto", 1, "auto");
        Auto = taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason2;
        TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason3 = new TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason("BackButton", 2, "back_button");
        BackButton = taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason3;
        TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason[] taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReasonArr = {taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason, taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason2, taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason3};
        $VALUES = taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(taxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReasonArr);
    }

    public TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason valueOf(String str) {
        return (TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason) Enum.valueOf(TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason.class, str);
    }

    public static TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason[] values() {
        return (TaxiFallbackCallOrderModalAnalytics$TaxiFallbackCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
