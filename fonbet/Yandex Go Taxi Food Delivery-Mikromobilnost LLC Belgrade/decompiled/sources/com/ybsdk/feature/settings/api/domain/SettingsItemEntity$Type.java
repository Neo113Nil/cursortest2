package com.ybsdk.feature.settings.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/feature/settings/api/domain/SettingsItemEntity$Type", "", "Lcom/ybsdk/feature/settings/api/domain/SettingsItemEntity$Type;", "<init>", "(Ljava/lang/String;I)V", "SWITCH", "GOTO", "EDIT", "SOON", JCP.RAW_PREFIX, "THEME", "APP_ICON", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsItemEntity$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingsItemEntity$Type[] $VALUES;
    public static final SettingsItemEntity$Type SWITCH = new SettingsItemEntity$Type("SWITCH", 0);
    public static final SettingsItemEntity$Type GOTO = new SettingsItemEntity$Type("GOTO", 1);
    public static final SettingsItemEntity$Type EDIT = new SettingsItemEntity$Type("EDIT", 2);
    public static final SettingsItemEntity$Type SOON = new SettingsItemEntity$Type("SOON", 3);
    public static final SettingsItemEntity$Type NONE = new SettingsItemEntity$Type(JCP.RAW_PREFIX, 4);
    public static final SettingsItemEntity$Type THEME = new SettingsItemEntity$Type("THEME", 5);
    public static final SettingsItemEntity$Type APP_ICON = new SettingsItemEntity$Type("APP_ICON", 6);

    private static final /* synthetic */ SettingsItemEntity$Type[] $values() {
        return new SettingsItemEntity$Type[]{SWITCH, GOTO, EDIT, SOON, NONE, THEME, APP_ICON};
    }

    static {
        SettingsItemEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SettingsItemEntity$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SettingsItemEntity$Type valueOf(String str) {
        return (SettingsItemEntity$Type) Enum.valueOf(SettingsItemEntity$Type.class, str);
    }

    public static SettingsItemEntity$Type[] values() {
        return (SettingsItemEntity$Type[]) $VALUES.clone();
    }
}
