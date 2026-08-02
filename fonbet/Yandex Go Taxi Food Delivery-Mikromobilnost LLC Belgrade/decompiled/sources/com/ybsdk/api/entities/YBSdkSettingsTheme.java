package com.ybsdk.api.entities;

import defpackage.k4o;
import defpackage.wh51;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/api/entities/YBSdkSettingsTheme;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "wh51", "LIGHT", "DARK", "SYSTEM", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YBSdkSettingsTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBSdkSettingsTheme[] $VALUES;
    public static final wh51 Companion;
    private static final YBSdkSettingsTheme DEFAULT_SETTINGS_THEME;
    public static final YBSdkSettingsTheme SYSTEM;
    public static final YBSdkSettingsTheme LIGHT = new YBSdkSettingsTheme("LIGHT", 0);
    public static final YBSdkSettingsTheme DARK = new YBSdkSettingsTheme("DARK", 1);

    private static final /* synthetic */ YBSdkSettingsTheme[] $values() {
        return new YBSdkSettingsTheme[]{LIGHT, DARK, SYSTEM};
    }

    static {
        YBSdkSettingsTheme yBSdkSettingsTheme = new YBSdkSettingsTheme("SYSTEM", 2);
        SYSTEM = yBSdkSettingsTheme;
        YBSdkSettingsTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new wh51();
        DEFAULT_SETTINGS_THEME = yBSdkSettingsTheme;
    }

    private YBSdkSettingsTheme(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBSdkSettingsTheme valueOf(String str) {
        return (YBSdkSettingsTheme) Enum.valueOf(YBSdkSettingsTheme.class, str);
    }

    public static YBSdkSettingsTheme[] values() {
        return (YBSdkSettingsTheme[]) $VALUES.clone();
    }
}
