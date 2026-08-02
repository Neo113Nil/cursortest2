package com.yandex.go.preorder.summary.tariff_details.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/preorder/summary/tariff_details/analytics/TariffCardSource;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SOURCE_SUMMARY", "SOURCE_SWIPE_FROM_OTHER_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TariffCardSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffCardSource[] $VALUES;
    public static final TariffCardSource SOURCE_SUMMARY;
    public static final TariffCardSource SOURCE_SWIPE_FROM_OTHER_CARD;
    private final String analyticsName;

    static {
        TariffCardSource tariffCardSource = new TariffCardSource("SOURCE_SUMMARY", 0, "selector");
        SOURCE_SUMMARY = tariffCardSource;
        TariffCardSource tariffCardSource2 = new TariffCardSource("SOURCE_SWIPE_FROM_OTHER_CARD", 1, "card");
        SOURCE_SWIPE_FROM_OTHER_CARD = tariffCardSource2;
        TariffCardSource[] tariffCardSourceArr = {tariffCardSource, tariffCardSource2};
        $VALUES = tariffCardSourceArr;
        $ENTRIES = a.a(tariffCardSourceArr);
    }

    public TariffCardSource(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static TariffCardSource valueOf(String str) {
        return (TariffCardSource) Enum.valueOf(TariffCardSource.class, str);
    }

    public static TariffCardSource[] values() {
        return (TariffCardSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
