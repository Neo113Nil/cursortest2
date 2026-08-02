package com.yandex.go.navigator.analitycs;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsSoundType", "", "Lcom/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsSoundType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Low", "Medium", "High", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationAnalytics$SettingsSoundType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationAnalytics$SettingsSoundType[] $VALUES;
    public static final NavigationAnalytics$SettingsSoundType High;
    public static final NavigationAnalytics$SettingsSoundType Low;
    public static final NavigationAnalytics$SettingsSoundType Medium;
    private final String eventValue;

    static {
        NavigationAnalytics$SettingsSoundType navigationAnalytics$SettingsSoundType = new NavigationAnalytics$SettingsSoundType("Low", 0, Constants.LOW);
        Low = navigationAnalytics$SettingsSoundType;
        NavigationAnalytics$SettingsSoundType navigationAnalytics$SettingsSoundType2 = new NavigationAnalytics$SettingsSoundType("Medium", 1, "medium");
        Medium = navigationAnalytics$SettingsSoundType2;
        NavigationAnalytics$SettingsSoundType navigationAnalytics$SettingsSoundType3 = new NavigationAnalytics$SettingsSoundType("High", 2, Constants.HIGH);
        High = navigationAnalytics$SettingsSoundType3;
        NavigationAnalytics$SettingsSoundType[] navigationAnalytics$SettingsSoundTypeArr = {navigationAnalytics$SettingsSoundType, navigationAnalytics$SettingsSoundType2, navigationAnalytics$SettingsSoundType3};
        $VALUES = navigationAnalytics$SettingsSoundTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigationAnalytics$SettingsSoundTypeArr);
    }

    public NavigationAnalytics$SettingsSoundType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NavigationAnalytics$SettingsSoundType valueOf(String str) {
        return (NavigationAnalytics$SettingsSoundType) Enum.valueOf(NavigationAnalytics$SettingsSoundType.class, str);
    }

    public static NavigationAnalytics$SettingsSoundType[] values() {
        return (NavigationAnalytics$SettingsSoundType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
