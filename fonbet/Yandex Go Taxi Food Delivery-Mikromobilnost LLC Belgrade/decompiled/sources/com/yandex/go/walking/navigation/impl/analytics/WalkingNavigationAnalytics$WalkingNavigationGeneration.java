package com.yandex.go.walking.navigation.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$WalkingNavigationGeneration", "", "Lcom/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$WalkingNavigationGeneration;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "First", "Second", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkingNavigationAnalytics$WalkingNavigationGeneration {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkingNavigationAnalytics$WalkingNavigationGeneration[] $VALUES;
    public static final WalkingNavigationAnalytics$WalkingNavigationGeneration First;
    public static final WalkingNavigationAnalytics$WalkingNavigationGeneration Second;
    private final String eventValue;

    static {
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = new WalkingNavigationAnalytics$WalkingNavigationGeneration("First", 0, "first");
        First = walkingNavigationAnalytics$WalkingNavigationGeneration;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration2 = new WalkingNavigationAnalytics$WalkingNavigationGeneration("Second", 1, "second");
        Second = walkingNavigationAnalytics$WalkingNavigationGeneration2;
        WalkingNavigationAnalytics$WalkingNavigationGeneration[] walkingNavigationAnalytics$WalkingNavigationGenerationArr = {walkingNavigationAnalytics$WalkingNavigationGeneration, walkingNavigationAnalytics$WalkingNavigationGeneration2};
        $VALUES = walkingNavigationAnalytics$WalkingNavigationGenerationArr;
        $ENTRIES = a.a(walkingNavigationAnalytics$WalkingNavigationGenerationArr);
    }

    public WalkingNavigationAnalytics$WalkingNavigationGeneration(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static WalkingNavigationAnalytics$WalkingNavigationGeneration valueOf(String str) {
        return (WalkingNavigationAnalytics$WalkingNavigationGeneration) Enum.valueOf(WalkingNavigationAnalytics$WalkingNavigationGeneration.class, str);
    }

    public static WalkingNavigationAnalytics$WalkingNavigationGeneration[] values() {
        return (WalkingNavigationAnalytics$WalkingNavigationGeneration[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
