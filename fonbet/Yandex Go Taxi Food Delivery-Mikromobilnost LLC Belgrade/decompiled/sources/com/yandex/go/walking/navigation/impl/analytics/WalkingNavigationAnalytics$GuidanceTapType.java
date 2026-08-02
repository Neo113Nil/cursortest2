package com.yandex.go.walking.navigation.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$GuidanceTapType", "", "Lcom/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$GuidanceTapType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "FinishInProgress", "Finish", "Swiped", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkingNavigationAnalytics$GuidanceTapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkingNavigationAnalytics$GuidanceTapType[] $VALUES;
    public static final WalkingNavigationAnalytics$GuidanceTapType Back;
    public static final WalkingNavigationAnalytics$GuidanceTapType Finish;
    public static final WalkingNavigationAnalytics$GuidanceTapType FinishInProgress;
    public static final WalkingNavigationAnalytics$GuidanceTapType Swiped;
    private final String eventValue;

    static {
        WalkingNavigationAnalytics$GuidanceTapType walkingNavigationAnalytics$GuidanceTapType = new WalkingNavigationAnalytics$GuidanceTapType("Back", 0, "back");
        Back = walkingNavigationAnalytics$GuidanceTapType;
        WalkingNavigationAnalytics$GuidanceTapType walkingNavigationAnalytics$GuidanceTapType2 = new WalkingNavigationAnalytics$GuidanceTapType("FinishInProgress", 1, "finish_in_progress");
        FinishInProgress = walkingNavigationAnalytics$GuidanceTapType2;
        WalkingNavigationAnalytics$GuidanceTapType walkingNavigationAnalytics$GuidanceTapType3 = new WalkingNavigationAnalytics$GuidanceTapType("Finish", 2, "finish");
        Finish = walkingNavigationAnalytics$GuidanceTapType3;
        WalkingNavigationAnalytics$GuidanceTapType walkingNavigationAnalytics$GuidanceTapType4 = new WalkingNavigationAnalytics$GuidanceTapType("Swiped", 3, "swiped");
        Swiped = walkingNavigationAnalytics$GuidanceTapType4;
        WalkingNavigationAnalytics$GuidanceTapType[] walkingNavigationAnalytics$GuidanceTapTypeArr = {walkingNavigationAnalytics$GuidanceTapType, walkingNavigationAnalytics$GuidanceTapType2, walkingNavigationAnalytics$GuidanceTapType3, walkingNavigationAnalytics$GuidanceTapType4};
        $VALUES = walkingNavigationAnalytics$GuidanceTapTypeArr;
        $ENTRIES = a.a(walkingNavigationAnalytics$GuidanceTapTypeArr);
    }

    public WalkingNavigationAnalytics$GuidanceTapType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WalkingNavigationAnalytics$GuidanceTapType valueOf(String str) {
        return (WalkingNavigationAnalytics$GuidanceTapType) Enum.valueOf(WalkingNavigationAnalytics$GuidanceTapType.class, str);
    }

    public static WalkingNavigationAnalytics$GuidanceTapType[] values() {
        return (WalkingNavigationAnalytics$GuidanceTapType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
