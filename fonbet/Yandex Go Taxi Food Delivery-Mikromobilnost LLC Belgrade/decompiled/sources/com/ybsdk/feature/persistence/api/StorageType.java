package com.ybsdk.feature.persistence.api;

import defpackage.k4o;
import defpackage.sb2;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/persistence/api/StorageType;", "", "prefsName", "", "needCleanup", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPrefsName$feature_persistence_release", "()Ljava/lang/String;", "getNeedCleanup$feature_persistence_release", "()Z", "ENVIRONMENT", "AUTH_ENCRYPTED", "AUTH_COMMON", "LOCAL_CONFIG", "REMOTE_CONFIG", "PERMISSIONS", "PERMISSIONS_ONCE_PER_INSTALL", "TRANSFERS", "PIN", "PIN_STATE_FLAGS", "DEVICE_ID", "REPLENISH", "PUSH_NOTIFICATIONS", "COMMON", "COMMON_WITHOUT_CLEANUP", "THEME", "PRIZES", "NFC", "HARMONY", "DEBUG_PANEL", "SHORTCUTS", "DEV_SETTINGS", "RATE", "PRODUCTS_SCREEN_STORAGE", "SKELETON_UPDATE_STATE", "APP_ICON", "PFM_SETTINGS", "SAVINGS_DASHBOARD_V4", "WALLET_LOYALTY_WIDGET", "SESSIONS_WITHOUT_FULLSCREEN", "CBDC", "feature-persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StorageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StorageType[] $VALUES;
    public static final StorageType PERMISSIONS;
    public static final StorageType PIN_STATE_FLAGS;
    public static final StorageType PUSH_NOTIFICATIONS;
    public static final StorageType REPLENISH;
    public static final StorageType TRANSFERS;
    private final boolean needCleanup;
    private final String prefsName;
    public static final StorageType ENVIRONMENT = new StorageType("ENVIRONMENT", 0, sb2.o(sb2.t), false);
    public static final StorageType AUTH_ENCRYPTED = new StorageType("AUTH_ENCRYPTED", 1, "auth", false);
    public static final StorageType AUTH_COMMON = new StorageType("AUTH_COMMON", 2, sb2.o(sb2.k), false);
    public static final StorageType LOCAL_CONFIG = new StorageType("LOCAL_CONFIG", 3, sb2.o(sb2.l), false);
    public static final StorageType REMOTE_CONFIG = new StorageType("REMOTE_CONFIG", 4, sb2.o(sb2.q), false, 2, null);
    public static final StorageType PERMISSIONS_ONCE_PER_INSTALL = new StorageType("PERMISSIONS_ONCE_PER_INSTALL", 6, "com.yb.core.permissions_once_per_install", false);
    public static final StorageType PIN = new StorageType("PIN", 8, sb2.o(sb2.e), false);
    public static final StorageType DEVICE_ID = new StorageType("DEVICE_ID", 10, sb2.o(sb2.i), false);
    public static final StorageType COMMON = new StorageType("COMMON", 13, sb2.o(sb2.n), false, 2, null);
    public static final StorageType COMMON_WITHOUT_CLEANUP = new StorageType("COMMON_WITHOUT_CLEANUP", 14, sb2.o(sb2.m), false);
    public static final StorageType THEME = new StorageType("THEME", 15, sb2.o(sb2.d), false);
    public static final StorageType PRIZES = new StorageType("PRIZES", 16, sb2.o(sb2.p), false, 2, null);
    public static final StorageType NFC = new StorageType("NFC", 17, sb2.o(sb2.u), false);
    public static final StorageType HARMONY = new StorageType("HARMONY", 18, "com.yb.harmony", false);
    public static final StorageType DEBUG_PANEL = new StorageType("DEBUG_PANEL", 19, sb2.o(sb2.h), false);
    public static final StorageType SHORTCUTS = new StorageType("SHORTCUTS", 20, sb2.o(sb2.f), false);
    public static final StorageType DEV_SETTINGS = new StorageType("DEV_SETTINGS", 21, "ru.yandex.fintech.dev_settings", false);
    public static final StorageType RATE = new StorageType("RATE", 22, sb2.o(sb2.j), false);
    public static final StorageType PRODUCTS_SCREEN_STORAGE = new StorageType("PRODUCTS_SCREEN_STORAGE", 23, sb2.o(sb2.s), false);
    public static final StorageType SKELETON_UPDATE_STATE = new StorageType("SKELETON_UPDATE_STATE", 24, "skeleton_update_state", false);
    public static final StorageType APP_ICON = new StorageType("APP_ICON", 25, "com.yb.app_icon", false);
    public static final StorageType PFM_SETTINGS = new StorageType("PFM_SETTINGS", 26, "com.yb.pfm_settings", false);
    public static final StorageType SAVINGS_DASHBOARD_V4 = new StorageType("SAVINGS_DASHBOARD_V4", 27, "com.yb.savings_dashboard_v4", false);
    public static final StorageType WALLET_LOYALTY_WIDGET = new StorageType("WALLET_LOYALTY_WIDGET", 28, "com.yb.wallet_loyalty_widget", false);
    public static final StorageType SESSIONS_WITHOUT_FULLSCREEN = new StorageType("SESSIONS_WITHOUT_FULLSCREEN", 29, "com.yb.sessions_without_fullscreen", false);
    public static final StorageType CBDC = new StorageType("CBDC", 30, "com.yb.app_cbdc", true);

    private static final /* synthetic */ StorageType[] $values() {
        return new StorageType[]{ENVIRONMENT, AUTH_ENCRYPTED, AUTH_COMMON, LOCAL_CONFIG, REMOTE_CONFIG, PERMISSIONS, PERMISSIONS_ONCE_PER_INSTALL, TRANSFERS, PIN, PIN_STATE_FLAGS, DEVICE_ID, REPLENISH, PUSH_NOTIFICATIONS, COMMON, COMMON_WITHOUT_CLEANUP, THEME, PRIZES, NFC, HARMONY, DEBUG_PANEL, SHORTCUTS, DEV_SETTINGS, RATE, PRODUCTS_SCREEN_STORAGE, SKELETON_UPDATE_STATE, APP_ICON, PFM_SETTINGS, SAVINGS_DASHBOARD_V4, WALLET_LOYALTY_WIDGET, SESSIONS_WITHOUT_FULLSCREEN, CBDC};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        PERMISSIONS = new StorageType("PERMISSIONS", 5, sb2.o(sb2.r), false, 2, defaultConstructorMarker);
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z = false;
        TRANSFERS = new StorageType("TRANSFERS", 7, sb2.o(sb2.c), z, i, defaultConstructorMarker2);
        PIN_STATE_FLAGS = new StorageType("PIN_STATE_FLAGS", 9, "com.yb.app_pin_state_flags", z, i, defaultConstructorMarker2);
        REPLENISH = new StorageType("REPLENISH", 11, sb2.o(sb2.g), z, i, defaultConstructorMarker2);
        PUSH_NOTIFICATIONS = new StorageType("PUSH_NOTIFICATIONS", 12, sb2.o(sb2.v), false, 2, defaultConstructorMarker);
        StorageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    public /* synthetic */ StorageType(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StorageType valueOf(String str) {
        return (StorageType) Enum.valueOf(StorageType.class, str);
    }

    public static StorageType[] values() {
        return (StorageType[]) $VALUES.clone();
    }

    /* renamed from: getNeedCleanup$feature_persistence_release, reason: from getter */
    public final boolean getNeedCleanup() {
        return this.needCleanup;
    }

    /* renamed from: getPrefsName$feature_persistence_release, reason: from getter */
    public final String getPrefsName() {
        return this.prefsName;
    }

    private StorageType(String str, int i, String str2, boolean z) {
        this.prefsName = str2;
        this.needCleanup = z;
    }
}
