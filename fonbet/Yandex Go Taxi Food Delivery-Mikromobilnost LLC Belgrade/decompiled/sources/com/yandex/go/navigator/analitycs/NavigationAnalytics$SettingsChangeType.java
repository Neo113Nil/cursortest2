package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsChangeType", "", "Lcom/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsChangeType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "On", "Off", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationAnalytics$SettingsChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationAnalytics$SettingsChangeType[] $VALUES;
    public static final NavigationAnalytics$SettingsChangeType Off;
    public static final NavigationAnalytics$SettingsChangeType On;
    private final String eventValue;

    static {
        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType = new NavigationAnalytics$SettingsChangeType("On", 0, "on");
        On = navigationAnalytics$SettingsChangeType;
        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType2 = new NavigationAnalytics$SettingsChangeType("Off", 1, "off");
        Off = navigationAnalytics$SettingsChangeType2;
        NavigationAnalytics$SettingsChangeType[] navigationAnalytics$SettingsChangeTypeArr = {navigationAnalytics$SettingsChangeType, navigationAnalytics$SettingsChangeType2};
        $VALUES = navigationAnalytics$SettingsChangeTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigationAnalytics$SettingsChangeTypeArr);
    }

    public NavigationAnalytics$SettingsChangeType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NavigationAnalytics$SettingsChangeType valueOf(String str) {
        return (NavigationAnalytics$SettingsChangeType) Enum.valueOf(NavigationAnalytics$SettingsChangeType.class, str);
    }

    public static NavigationAnalytics$SettingsChangeType[] values() {
        return (NavigationAnalytics$SettingsChangeType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
