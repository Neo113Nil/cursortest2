package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/mainscreen/superapp/shortcuts/navigation/onboarding/analytics/evgen/MainScreenOnboardingAnalytics$ClickTarget", "", "Lcom/yandex/go/mainscreen/superapp/shortcuts/navigation/onboarding/analytics/evgen/MainScreenOnboardingAnalytics$ClickTarget;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Shortcut", "Text", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MainScreenOnboardingAnalytics$ClickTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenOnboardingAnalytics$ClickTarget[] $VALUES;
    public static final MainScreenOnboardingAnalytics$ClickTarget Shortcut;
    public static final MainScreenOnboardingAnalytics$ClickTarget Text;
    private final String eventValue;

    static {
        MainScreenOnboardingAnalytics$ClickTarget mainScreenOnboardingAnalytics$ClickTarget = new MainScreenOnboardingAnalytics$ClickTarget("Shortcut", 0, "Shortcut");
        Shortcut = mainScreenOnboardingAnalytics$ClickTarget;
        MainScreenOnboardingAnalytics$ClickTarget mainScreenOnboardingAnalytics$ClickTarget2 = new MainScreenOnboardingAnalytics$ClickTarget("Text", 1, "Text");
        Text = mainScreenOnboardingAnalytics$ClickTarget2;
        MainScreenOnboardingAnalytics$ClickTarget[] mainScreenOnboardingAnalytics$ClickTargetArr = {mainScreenOnboardingAnalytics$ClickTarget, mainScreenOnboardingAnalytics$ClickTarget2};
        $VALUES = mainScreenOnboardingAnalytics$ClickTargetArr;
        $ENTRIES = a.a(mainScreenOnboardingAnalytics$ClickTargetArr);
    }

    public MainScreenOnboardingAnalytics$ClickTarget(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MainScreenOnboardingAnalytics$ClickTarget valueOf(String str) {
        return (MainScreenOnboardingAnalytics$ClickTarget) Enum.valueOf(MainScreenOnboardingAnalytics$ClickTarget.class, str);
    }

    public static MainScreenOnboardingAnalytics$ClickTarget[] values() {
        return (MainScreenOnboardingAnalytics$ClickTarget[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
