package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$SummaryTariffUnselected", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryTariffUnselected;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UserClick", "UnavailablePaymentMethod", "TariffNotCompatibleWithRequirment", "TariffUnavailable", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$SummaryTariffUnselected {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$SummaryTariffUnselected[] $VALUES;
    public static final SummaryAnalytics$SummaryTariffUnselected TariffNotCompatibleWithRequirment;
    public static final SummaryAnalytics$SummaryTariffUnselected TariffUnavailable;
    public static final SummaryAnalytics$SummaryTariffUnselected UnavailablePaymentMethod;
    public static final SummaryAnalytics$SummaryTariffUnselected UserClick;
    private final String eventValue;

    static {
        SummaryAnalytics$SummaryTariffUnselected summaryAnalytics$SummaryTariffUnselected = new SummaryAnalytics$SummaryTariffUnselected("UserClick", 0, "user_click");
        UserClick = summaryAnalytics$SummaryTariffUnselected;
        SummaryAnalytics$SummaryTariffUnselected summaryAnalytics$SummaryTariffUnselected2 = new SummaryAnalytics$SummaryTariffUnselected("UnavailablePaymentMethod", 1, "unavailable_payment_method");
        UnavailablePaymentMethod = summaryAnalytics$SummaryTariffUnselected2;
        SummaryAnalytics$SummaryTariffUnselected summaryAnalytics$SummaryTariffUnselected3 = new SummaryAnalytics$SummaryTariffUnselected("TariffNotCompatibleWithRequirment", 2, "tariff_not_compatible_with_requirment");
        TariffNotCompatibleWithRequirment = summaryAnalytics$SummaryTariffUnselected3;
        SummaryAnalytics$SummaryTariffUnselected summaryAnalytics$SummaryTariffUnselected4 = new SummaryAnalytics$SummaryTariffUnselected("TariffUnavailable", 3, "tariff_unavailable");
        TariffUnavailable = summaryAnalytics$SummaryTariffUnselected4;
        SummaryAnalytics$SummaryTariffUnselected[] summaryAnalytics$SummaryTariffUnselectedArr = {summaryAnalytics$SummaryTariffUnselected, summaryAnalytics$SummaryTariffUnselected2, summaryAnalytics$SummaryTariffUnselected3, summaryAnalytics$SummaryTariffUnselected4};
        $VALUES = summaryAnalytics$SummaryTariffUnselectedArr;
        $ENTRIES = a.a(summaryAnalytics$SummaryTariffUnselectedArr);
    }

    public SummaryAnalytics$SummaryTariffUnselected(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$SummaryTariffUnselected valueOf(String str) {
        return (SummaryAnalytics$SummaryTariffUnselected) Enum.valueOf(SummaryAnalytics$SummaryTariffUnselected.class, str);
    }

    public static SummaryAnalytics$SummaryTariffUnselected[] values() {
        return (SummaryAnalytics$SummaryTariffUnselected[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
