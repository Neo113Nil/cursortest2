package com.yandex.go.settings.presentation.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/settings/presentation/models/AppSettingsTransitionMode;", "", "Forward", "Reverse", "None", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSettingsTransitionMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppSettingsTransitionMode[] $VALUES;
    public static final AppSettingsTransitionMode Forward;
    public static final AppSettingsTransitionMode None;
    public static final AppSettingsTransitionMode Reverse;

    static {
        AppSettingsTransitionMode appSettingsTransitionMode = new AppSettingsTransitionMode("Forward", 0);
        Forward = appSettingsTransitionMode;
        AppSettingsTransitionMode appSettingsTransitionMode2 = new AppSettingsTransitionMode("Reverse", 1);
        Reverse = appSettingsTransitionMode2;
        AppSettingsTransitionMode appSettingsTransitionMode3 = new AppSettingsTransitionMode("None", 2);
        None = appSettingsTransitionMode3;
        AppSettingsTransitionMode[] appSettingsTransitionModeArr = {appSettingsTransitionMode, appSettingsTransitionMode2, appSettingsTransitionMode3};
        $VALUES = appSettingsTransitionModeArr;
        $ENTRIES = a.a(appSettingsTransitionModeArr);
    }

    public static AppSettingsTransitionMode valueOf(String str) {
        return (AppSettingsTransitionMode) Enum.valueOf(AppSettingsTransitionMode.class, str);
    }

    public static AppSettingsTransitionMode[] values() {
        return (AppSettingsTransitionMode[]) $VALUES.clone();
    }
}
