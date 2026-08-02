package com.yandex.go.settings.presentation.models;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/settings/presentation/models/SettingsItemId;", "", "", "analyticsId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "THEME", "LANGUAGE", "HAPTIC", "HIDE_BALANCE", "TRAFFIC", "LOCATION_DIAGNOSTIC", "IN_APP_ONLY", "DONT_SMS", "PROMO_PUSHES", "LIVE_LOCATION", "DONT_CALL", "NOTIFICATIONS", "LOGOUT", "TESTING_ENTRY_POINT", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SettingsItemId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingsItemId[] $VALUES;
    public static final SettingsItemId DONT_CALL;
    public static final SettingsItemId DONT_SMS;
    public static final SettingsItemId HAPTIC;
    public static final SettingsItemId HIDE_BALANCE;
    public static final SettingsItemId IN_APP_ONLY;
    public static final SettingsItemId LANGUAGE;
    public static final SettingsItemId LIVE_LOCATION;
    public static final SettingsItemId LOCATION_DIAGNOSTIC;
    public static final SettingsItemId LOGOUT;
    public static final SettingsItemId NOTIFICATIONS;
    public static final SettingsItemId PROMO_PUSHES;
    public static final SettingsItemId TESTING_ENTRY_POINT;
    public static final SettingsItemId THEME;
    public static final SettingsItemId TRAFFIC;
    private final String analyticsId;

    static {
        SettingsItemId settingsItemId = new SettingsItemId("THEME", 0, DivkitThemeChangeListener.THEME_VARIABLE_NAME);
        THEME = settingsItemId;
        SettingsItemId settingsItemId2 = new SettingsItemId("LANGUAGE", 1, "language");
        LANGUAGE = settingsItemId2;
        SettingsItemId settingsItemId3 = new SettingsItemId("HAPTIC", 2, "haptic");
        HAPTIC = settingsItemId3;
        SettingsItemId settingsItemId4 = new SettingsItemId("HIDE_BALANCE", 3, "hide_balance");
        HIDE_BALANCE = settingsItemId4;
        SettingsItemId settingsItemId5 = new SettingsItemId("TRAFFIC", 4, "traffic");
        TRAFFIC = settingsItemId5;
        SettingsItemId settingsItemId6 = new SettingsItemId("LOCATION_DIAGNOSTIC", 5, "location_diagnostic");
        LOCATION_DIAGNOSTIC = settingsItemId6;
        SettingsItemId settingsItemId7 = new SettingsItemId("IN_APP_ONLY", 6, "in_app_only");
        IN_APP_ONLY = settingsItemId7;
        SettingsItemId settingsItemId8 = new SettingsItemId("DONT_SMS", 7, "dont_sms");
        DONT_SMS = settingsItemId8;
        SettingsItemId settingsItemId9 = new SettingsItemId("PROMO_PUSHES", 8, "promo_pushes");
        PROMO_PUSHES = settingsItemId9;
        SettingsItemId settingsItemId10 = new SettingsItemId("LIVE_LOCATION", 9, "live_location");
        LIVE_LOCATION = settingsItemId10;
        SettingsItemId settingsItemId11 = new SettingsItemId("DONT_CALL", 10, "dont_call");
        DONT_CALL = settingsItemId11;
        SettingsItemId settingsItemId12 = new SettingsItemId("NOTIFICATIONS", 11, "notifications");
        NOTIFICATIONS = settingsItemId12;
        SettingsItemId settingsItemId13 = new SettingsItemId("LOGOUT", 12, "logout");
        LOGOUT = settingsItemId13;
        SettingsItemId settingsItemId14 = new SettingsItemId("TESTING_ENTRY_POINT", 13, "testing_entry_point");
        TESTING_ENTRY_POINT = settingsItemId14;
        SettingsItemId[] settingsItemIdArr = {settingsItemId, settingsItemId2, settingsItemId3, settingsItemId4, settingsItemId5, settingsItemId6, settingsItemId7, settingsItemId8, settingsItemId9, settingsItemId10, settingsItemId11, settingsItemId12, settingsItemId13, settingsItemId14};
        $VALUES = settingsItemIdArr;
        $ENTRIES = a.a(settingsItemIdArr);
    }

    public SettingsItemId(String str, int i, String str2) {
        this.analyticsId = str2;
    }

    public static SettingsItemId valueOf(String str) {
        return (SettingsItemId) Enum.valueOf(SettingsItemId.class, str);
    }

    public static SettingsItemId[] values() {
        return (SettingsItemId[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsId() {
        return this.analyticsId;
    }
}
