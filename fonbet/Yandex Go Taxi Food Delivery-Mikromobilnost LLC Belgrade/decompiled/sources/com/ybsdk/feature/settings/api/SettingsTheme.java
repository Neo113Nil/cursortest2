package com.ybsdk.feature.settings.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/settings/api/SettingsTheme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "SYSTEM", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SettingsTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingsTheme[] $VALUES;
    public static final SettingsTheme LIGHT = new SettingsTheme("LIGHT", 0);
    public static final SettingsTheme DARK = new SettingsTheme("DARK", 1);
    public static final SettingsTheme SYSTEM = new SettingsTheme("SYSTEM", 2);

    private static final /* synthetic */ SettingsTheme[] $values() {
        return new SettingsTheme[]{LIGHT, DARK, SYSTEM};
    }

    static {
        SettingsTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SettingsTheme(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SettingsTheme valueOf(String str) {
        return (SettingsTheme) Enum.valueOf(SettingsTheme.class, str);
    }

    public static SettingsTheme[] values() {
        return (SettingsTheme[]) $VALUES.clone();
    }
}
