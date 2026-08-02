package com.yandex.go.preorder.suggested.menu.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/preorder/suggested/menu/analytics/SuggestMenuLegacyAnalytics$PointType", "", "Lcom/yandex/go/preorder/suggested/menu/analytics/SuggestMenuLegacyAnalytics$PointType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Source", "Destination", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestMenuLegacyAnalytics$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestMenuLegacyAnalytics$PointType[] $VALUES;
    public static final SuggestMenuLegacyAnalytics$PointType Destination;
    public static final SuggestMenuLegacyAnalytics$PointType Source;
    private final String eventValue;

    static {
        SuggestMenuLegacyAnalytics$PointType suggestMenuLegacyAnalytics$PointType = new SuggestMenuLegacyAnalytics$PointType("Source", 0, "source");
        Source = suggestMenuLegacyAnalytics$PointType;
        SuggestMenuLegacyAnalytics$PointType suggestMenuLegacyAnalytics$PointType2 = new SuggestMenuLegacyAnalytics$PointType("Destination", 1, "destination");
        Destination = suggestMenuLegacyAnalytics$PointType2;
        SuggestMenuLegacyAnalytics$PointType[] suggestMenuLegacyAnalytics$PointTypeArr = {suggestMenuLegacyAnalytics$PointType, suggestMenuLegacyAnalytics$PointType2};
        $VALUES = suggestMenuLegacyAnalytics$PointTypeArr;
        $ENTRIES = a.a(suggestMenuLegacyAnalytics$PointTypeArr);
    }

    public SuggestMenuLegacyAnalytics$PointType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuggestMenuLegacyAnalytics$PointType valueOf(String str) {
        return (SuggestMenuLegacyAnalytics$PointType) Enum.valueOf(SuggestMenuLegacyAnalytics$PointType.class, str);
    }

    public static SuggestMenuLegacyAnalytics$PointType[] values() {
        return (SuggestMenuLegacyAnalytics$PointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
