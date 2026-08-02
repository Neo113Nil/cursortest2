package com.ybsdk.feature.settings.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/settings/api/SettingsOpeningSource;", "", "<init>", "(Ljava/lang/String;I)V", "MENU", "TRANSFERS", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsOpeningSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingsOpeningSource[] $VALUES;
    public static final SettingsOpeningSource MENU = new SettingsOpeningSource("MENU", 0);
    public static final SettingsOpeningSource TRANSFERS = new SettingsOpeningSource("TRANSFERS", 1);

    private static final /* synthetic */ SettingsOpeningSource[] $values() {
        return new SettingsOpeningSource[]{MENU, TRANSFERS};
    }

    static {
        SettingsOpeningSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SettingsOpeningSource(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SettingsOpeningSource valueOf(String str) {
        return (SettingsOpeningSource) Enum.valueOf(SettingsOpeningSource.class, str);
    }

    public static SettingsOpeningSource[] values() {
        return (SettingsOpeningSource[]) $VALUES.clone();
    }
}
