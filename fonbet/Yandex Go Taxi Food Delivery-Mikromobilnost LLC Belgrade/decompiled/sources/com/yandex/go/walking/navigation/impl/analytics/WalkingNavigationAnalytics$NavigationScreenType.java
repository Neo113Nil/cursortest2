package com.yandex.go.walking.navigation.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$NavigationScreenType", "", "Lcom/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$NavigationScreenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "InProgress", "Finished", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkingNavigationAnalytics$NavigationScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkingNavigationAnalytics$NavigationScreenType[] $VALUES;
    public static final WalkingNavigationAnalytics$NavigationScreenType Finished;
    public static final WalkingNavigationAnalytics$NavigationScreenType InProgress;
    private final String eventValue;

    static {
        WalkingNavigationAnalytics$NavigationScreenType walkingNavigationAnalytics$NavigationScreenType = new WalkingNavigationAnalytics$NavigationScreenType("InProgress", 0, "in_progress");
        InProgress = walkingNavigationAnalytics$NavigationScreenType;
        WalkingNavigationAnalytics$NavigationScreenType walkingNavigationAnalytics$NavigationScreenType2 = new WalkingNavigationAnalytics$NavigationScreenType("Finished", 1, UgcLiveVideoData.UgcLiveStatus.FINISHED);
        Finished = walkingNavigationAnalytics$NavigationScreenType2;
        WalkingNavigationAnalytics$NavigationScreenType[] walkingNavigationAnalytics$NavigationScreenTypeArr = {walkingNavigationAnalytics$NavigationScreenType, walkingNavigationAnalytics$NavigationScreenType2};
        $VALUES = walkingNavigationAnalytics$NavigationScreenTypeArr;
        $ENTRIES = a.a(walkingNavigationAnalytics$NavigationScreenTypeArr);
    }

    public WalkingNavigationAnalytics$NavigationScreenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WalkingNavigationAnalytics$NavigationScreenType valueOf(String str) {
        return (WalkingNavigationAnalytics$NavigationScreenType) Enum.valueOf(WalkingNavigationAnalytics$NavigationScreenType.class, str);
    }

    public static WalkingNavigationAnalytics$NavigationScreenType[] values() {
        return (WalkingNavigationAnalytics$NavigationScreenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
