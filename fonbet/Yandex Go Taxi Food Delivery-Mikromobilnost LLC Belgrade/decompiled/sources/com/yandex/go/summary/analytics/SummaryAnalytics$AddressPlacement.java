package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$AddressPlacement", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$AddressPlacement;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Map", "AddressHeader", "FullDetailCard", "AddressOnTop", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$AddressPlacement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$AddressPlacement[] $VALUES;
    public static final SummaryAnalytics$AddressPlacement AddressHeader;
    public static final SummaryAnalytics$AddressPlacement AddressOnTop;
    public static final SummaryAnalytics$AddressPlacement FullDetailCard;
    public static final SummaryAnalytics$AddressPlacement Map;
    private final String eventValue;

    static {
        SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement = new SummaryAnalytics$AddressPlacement("Map", 0, PolicyMappingsExtension.MAP);
        Map = summaryAnalytics$AddressPlacement;
        SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement2 = new SummaryAnalytics$AddressPlacement("AddressHeader", 1, "address_header");
        AddressHeader = summaryAnalytics$AddressPlacement2;
        SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement3 = new SummaryAnalytics$AddressPlacement("FullDetailCard", 2, "full_detail_card");
        FullDetailCard = summaryAnalytics$AddressPlacement3;
        SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement4 = new SummaryAnalytics$AddressPlacement("AddressOnTop", 3, "address_on_top");
        AddressOnTop = summaryAnalytics$AddressPlacement4;
        SummaryAnalytics$AddressPlacement[] summaryAnalytics$AddressPlacementArr = {summaryAnalytics$AddressPlacement, summaryAnalytics$AddressPlacement2, summaryAnalytics$AddressPlacement3, summaryAnalytics$AddressPlacement4};
        $VALUES = summaryAnalytics$AddressPlacementArr;
        $ENTRIES = a.a(summaryAnalytics$AddressPlacementArr);
    }

    public SummaryAnalytics$AddressPlacement(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$AddressPlacement valueOf(String str) {
        return (SummaryAnalytics$AddressPlacement) Enum.valueOf(SummaryAnalytics$AddressPlacement.class, str);
    }

    public static SummaryAnalytics$AddressPlacement[] values() {
        return (SummaryAnalytics$AddressPlacement[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
