package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsVoiceType", "", "Lcom/yandex/go/navigator/analitycs/NavigationAnalytics$SettingsVoiceType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TurnOffAll", "RoadEvents", "AllSounds", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationAnalytics$SettingsVoiceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationAnalytics$SettingsVoiceType[] $VALUES;
    public static final NavigationAnalytics$SettingsVoiceType AllSounds;
    public static final NavigationAnalytics$SettingsVoiceType RoadEvents;
    public static final NavigationAnalytics$SettingsVoiceType TurnOffAll;
    private final String eventValue;

    static {
        NavigationAnalytics$SettingsVoiceType navigationAnalytics$SettingsVoiceType = new NavigationAnalytics$SettingsVoiceType("TurnOffAll", 0, "turn_off_all");
        TurnOffAll = navigationAnalytics$SettingsVoiceType;
        NavigationAnalytics$SettingsVoiceType navigationAnalytics$SettingsVoiceType2 = new NavigationAnalytics$SettingsVoiceType("RoadEvents", 1, "road_events");
        RoadEvents = navigationAnalytics$SettingsVoiceType2;
        NavigationAnalytics$SettingsVoiceType navigationAnalytics$SettingsVoiceType3 = new NavigationAnalytics$SettingsVoiceType("AllSounds", 2, "all_sounds");
        AllSounds = navigationAnalytics$SettingsVoiceType3;
        NavigationAnalytics$SettingsVoiceType[] navigationAnalytics$SettingsVoiceTypeArr = {navigationAnalytics$SettingsVoiceType, navigationAnalytics$SettingsVoiceType2, navigationAnalytics$SettingsVoiceType3};
        $VALUES = navigationAnalytics$SettingsVoiceTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigationAnalytics$SettingsVoiceTypeArr);
    }

    public NavigationAnalytics$SettingsVoiceType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NavigationAnalytics$SettingsVoiceType valueOf(String str) {
        return (NavigationAnalytics$SettingsVoiceType) Enum.valueOf(NavigationAnalytics$SettingsVoiceType.class, str);
    }

    public static NavigationAnalytics$SettingsVoiceType[] values() {
        return (NavigationAnalytics$SettingsVoiceType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
