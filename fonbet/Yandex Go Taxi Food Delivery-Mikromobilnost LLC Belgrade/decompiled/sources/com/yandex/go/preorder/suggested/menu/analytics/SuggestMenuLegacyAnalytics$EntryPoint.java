package com.yandex.go.preorder.suggested.menu.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/preorder/suggested/menu/analytics/SuggestMenuLegacyAnalytics$EntryPoint", "", "Lcom/yandex/go/preorder/suggested/menu/analytics/SuggestMenuLegacyAnalytics$EntryPoint;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LongTap", "Dots", "SuperAppHeader", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestMenuLegacyAnalytics$EntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestMenuLegacyAnalytics$EntryPoint[] $VALUES;
    public static final SuggestMenuLegacyAnalytics$EntryPoint Dots;
    public static final SuggestMenuLegacyAnalytics$EntryPoint LongTap;
    public static final SuggestMenuLegacyAnalytics$EntryPoint SuperAppHeader;
    private final String eventValue;

    static {
        SuggestMenuLegacyAnalytics$EntryPoint suggestMenuLegacyAnalytics$EntryPoint = new SuggestMenuLegacyAnalytics$EntryPoint("LongTap", 0, "long_tap");
        LongTap = suggestMenuLegacyAnalytics$EntryPoint;
        SuggestMenuLegacyAnalytics$EntryPoint suggestMenuLegacyAnalytics$EntryPoint2 = new SuggestMenuLegacyAnalytics$EntryPoint("Dots", 1, "dots");
        Dots = suggestMenuLegacyAnalytics$EntryPoint2;
        SuggestMenuLegacyAnalytics$EntryPoint suggestMenuLegacyAnalytics$EntryPoint3 = new SuggestMenuLegacyAnalytics$EntryPoint("SuperAppHeader", 2, "super_app_header");
        SuperAppHeader = suggestMenuLegacyAnalytics$EntryPoint3;
        SuggestMenuLegacyAnalytics$EntryPoint[] suggestMenuLegacyAnalytics$EntryPointArr = {suggestMenuLegacyAnalytics$EntryPoint, suggestMenuLegacyAnalytics$EntryPoint2, suggestMenuLegacyAnalytics$EntryPoint3};
        $VALUES = suggestMenuLegacyAnalytics$EntryPointArr;
        $ENTRIES = a.a(suggestMenuLegacyAnalytics$EntryPointArr);
    }

    public SuggestMenuLegacyAnalytics$EntryPoint(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SuggestMenuLegacyAnalytics$EntryPoint valueOf(String str) {
        return (SuggestMenuLegacyAnalytics$EntryPoint) Enum.valueOf(SuggestMenuLegacyAnalytics$EntryPoint.class, str);
    }

    public static SuggestMenuLegacyAnalytics$EntryPoint[] values() {
        return (SuggestMenuLegacyAnalytics$EntryPoint[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
