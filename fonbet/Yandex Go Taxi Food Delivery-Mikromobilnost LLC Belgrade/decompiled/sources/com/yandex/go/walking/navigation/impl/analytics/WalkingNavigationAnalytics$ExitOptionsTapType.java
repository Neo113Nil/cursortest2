package com.yandex.go.walking.navigation.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$ExitOptionsTapType", "", "Lcom/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$ExitOptionsTapType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FinishInProgress", "ContinueBackground", "GrayZone", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkingNavigationAnalytics$ExitOptionsTapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkingNavigationAnalytics$ExitOptionsTapType[] $VALUES;
    public static final WalkingNavigationAnalytics$ExitOptionsTapType ContinueBackground;
    public static final WalkingNavigationAnalytics$ExitOptionsTapType FinishInProgress;
    public static final WalkingNavigationAnalytics$ExitOptionsTapType GrayZone;
    private final String eventValue;

    static {
        WalkingNavigationAnalytics$ExitOptionsTapType walkingNavigationAnalytics$ExitOptionsTapType = new WalkingNavigationAnalytics$ExitOptionsTapType("FinishInProgress", 0, "finish_in_progress");
        FinishInProgress = walkingNavigationAnalytics$ExitOptionsTapType;
        WalkingNavigationAnalytics$ExitOptionsTapType walkingNavigationAnalytics$ExitOptionsTapType2 = new WalkingNavigationAnalytics$ExitOptionsTapType("ContinueBackground", 1, "continue_background");
        ContinueBackground = walkingNavigationAnalytics$ExitOptionsTapType2;
        WalkingNavigationAnalytics$ExitOptionsTapType walkingNavigationAnalytics$ExitOptionsTapType3 = new WalkingNavigationAnalytics$ExitOptionsTapType("GrayZone", 2, "gray_zone");
        GrayZone = walkingNavigationAnalytics$ExitOptionsTapType3;
        WalkingNavigationAnalytics$ExitOptionsTapType[] walkingNavigationAnalytics$ExitOptionsTapTypeArr = {walkingNavigationAnalytics$ExitOptionsTapType, walkingNavigationAnalytics$ExitOptionsTapType2, walkingNavigationAnalytics$ExitOptionsTapType3};
        $VALUES = walkingNavigationAnalytics$ExitOptionsTapTypeArr;
        $ENTRIES = a.a(walkingNavigationAnalytics$ExitOptionsTapTypeArr);
    }

    public WalkingNavigationAnalytics$ExitOptionsTapType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WalkingNavigationAnalytics$ExitOptionsTapType valueOf(String str) {
        return (WalkingNavigationAnalytics$ExitOptionsTapType) Enum.valueOf(WalkingNavigationAnalytics$ExitOptionsTapType.class, str);
    }

    public static WalkingNavigationAnalytics$ExitOptionsTapType[] values() {
        return (WalkingNavigationAnalytics$ExitOptionsTapType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
