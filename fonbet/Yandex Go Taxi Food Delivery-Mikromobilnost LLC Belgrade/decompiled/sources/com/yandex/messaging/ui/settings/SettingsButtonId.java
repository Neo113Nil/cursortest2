package com.yandex.messaging.ui.settings;

import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import defpackage.y6r0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/ui/settings/SettingsButtonId;", "", "Companion", "y6r0", "SavedMessages", "Folders", "DebugPanel", "Notifications", "Theme", "ChatListCompactMode", "PrivatePolicy", "Contacts", "SupportChat", "Help", "AboutApp", "Logout", "Login", "YandexId", "InviteLink", "Calls", "PhoneNumber", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SettingsButtonId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingsButtonId[] $VALUES;
    public static final SettingsButtonId AboutApp;
    public static final SettingsButtonId Calls;
    public static final SettingsButtonId ChatListCompactMode;
    public static final y6r0 Companion;
    public static final SettingsButtonId Contacts;
    public static final SettingsButtonId DebugPanel;
    public static final SettingsButtonId Folders;
    public static final SettingsButtonId Help;
    public static final SettingsButtonId InviteLink;
    public static final SettingsButtonId Login;
    public static final SettingsButtonId Logout;
    public static final SettingsButtonId Notifications;
    public static final SettingsButtonId PhoneNumber;
    public static final SettingsButtonId PrivatePolicy;
    public static final SettingsButtonId SavedMessages;
    public static final SettingsButtonId SupportChat;
    public static final SettingsButtonId Theme;
    public static final SettingsButtonId YandexId;
    private static final Map<String, SettingsButtonId> map;

    static {
        SettingsButtonId settingsButtonId = new SettingsButtonId("SavedMessages", 0);
        SavedMessages = settingsButtonId;
        SettingsButtonId settingsButtonId2 = new SettingsButtonId("Folders", 1);
        Folders = settingsButtonId2;
        SettingsButtonId settingsButtonId3 = new SettingsButtonId("DebugPanel", 2);
        DebugPanel = settingsButtonId3;
        SettingsButtonId settingsButtonId4 = new SettingsButtonId("Notifications", 3);
        Notifications = settingsButtonId4;
        SettingsButtonId settingsButtonId5 = new SettingsButtonId("Theme", 4);
        Theme = settingsButtonId5;
        SettingsButtonId settingsButtonId6 = new SettingsButtonId("ChatListCompactMode", 5);
        ChatListCompactMode = settingsButtonId6;
        SettingsButtonId settingsButtonId7 = new SettingsButtonId("PrivatePolicy", 6);
        PrivatePolicy = settingsButtonId7;
        SettingsButtonId settingsButtonId8 = new SettingsButtonId("Contacts", 7);
        Contacts = settingsButtonId8;
        SettingsButtonId settingsButtonId9 = new SettingsButtonId("SupportChat", 8);
        SupportChat = settingsButtonId9;
        SettingsButtonId settingsButtonId10 = new SettingsButtonId("Help", 9);
        Help = settingsButtonId10;
        SettingsButtonId settingsButtonId11 = new SettingsButtonId("AboutApp", 10);
        AboutApp = settingsButtonId11;
        SettingsButtonId settingsButtonId12 = new SettingsButtonId("Logout", 11);
        Logout = settingsButtonId12;
        SettingsButtonId settingsButtonId13 = new SettingsButtonId("Login", 12);
        Login = settingsButtonId13;
        SettingsButtonId settingsButtonId14 = new SettingsButtonId("YandexId", 13);
        YandexId = settingsButtonId14;
        SettingsButtonId settingsButtonId15 = new SettingsButtonId("InviteLink", 14);
        InviteLink = settingsButtonId15;
        SettingsButtonId settingsButtonId16 = new SettingsButtonId("Calls", 15);
        Calls = settingsButtonId16;
        SettingsButtonId settingsButtonId17 = new SettingsButtonId("PhoneNumber", 16);
        PhoneNumber = settingsButtonId17;
        SettingsButtonId[] settingsButtonIdArr = {settingsButtonId, settingsButtonId2, settingsButtonId3, settingsButtonId4, settingsButtonId5, settingsButtonId6, settingsButtonId7, settingsButtonId8, settingsButtonId9, settingsButtonId10, settingsButtonId11, settingsButtonId12, settingsButtonId13, settingsButtonId14, settingsButtonId15, settingsButtonId16, settingsButtonId17};
        $VALUES = settingsButtonIdArr;
        k4o a = kotlin.enums.a.a(settingsButtonIdArr);
        $ENTRIES = a;
        Companion = new y6r0();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(((SettingsButtonId) obj).name(), obj);
        }
        map = linkedHashMap;
    }

    public static SettingsButtonId valueOf(String str) {
        return (SettingsButtonId) Enum.valueOf(SettingsButtonId.class, str);
    }

    public static SettingsButtonId[] values() {
        return (SettingsButtonId[]) $VALUES.clone();
    }
}
