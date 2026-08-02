package com.google.firebase.crashlytics.internal.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class SettingsCacheBehavior {
    private static final /* synthetic */ SettingsCacheBehavior[] $VALUES;
    public static final SettingsCacheBehavior IGNORE_CACHE_EXPIRATION;
    public static final SettingsCacheBehavior SKIP_CACHE_LOOKUP;
    public static final SettingsCacheBehavior USE_CACHE;

    static {
        SettingsCacheBehavior settingsCacheBehavior = new SettingsCacheBehavior("USE_CACHE", 0);
        USE_CACHE = settingsCacheBehavior;
        SettingsCacheBehavior settingsCacheBehavior2 = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        SKIP_CACHE_LOOKUP = settingsCacheBehavior2;
        SettingsCacheBehavior settingsCacheBehavior3 = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        IGNORE_CACHE_EXPIRATION = settingsCacheBehavior3;
        $VALUES = new SettingsCacheBehavior[]{settingsCacheBehavior, settingsCacheBehavior2, settingsCacheBehavior3};
    }

    public static SettingsCacheBehavior valueOf(String str) {
        return (SettingsCacheBehavior) Enum.valueOf(SettingsCacheBehavior.class, str);
    }

    public static SettingsCacheBehavior[] values() {
        return (SettingsCacheBehavior[]) $VALUES.clone();
    }
}
