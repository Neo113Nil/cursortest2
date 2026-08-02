package com.yandex.quark.webchat.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/quark/webchat/navigation/NavigationEntry$Type", "", "Lcom/yandex/quark/webchat/navigation/NavigationEntry$Type;", "UNKNOWN", "CHAT", "CHAT_LIST", "SKILL", "CHAT_FOLDER", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationEntry$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationEntry$Type[] $VALUES;
    public static final NavigationEntry$Type CHAT;
    public static final NavigationEntry$Type CHAT_FOLDER;
    public static final NavigationEntry$Type CHAT_LIST;
    public static final NavigationEntry$Type SKILL;
    public static final NavigationEntry$Type UNKNOWN;

    static {
        NavigationEntry$Type navigationEntry$Type = new NavigationEntry$Type("UNKNOWN", 0);
        UNKNOWN = navigationEntry$Type;
        NavigationEntry$Type navigationEntry$Type2 = new NavigationEntry$Type("CHAT", 1);
        CHAT = navigationEntry$Type2;
        NavigationEntry$Type navigationEntry$Type3 = new NavigationEntry$Type("CHAT_LIST", 2);
        CHAT_LIST = navigationEntry$Type3;
        NavigationEntry$Type navigationEntry$Type4 = new NavigationEntry$Type("SKILL", 3);
        SKILL = navigationEntry$Type4;
        NavigationEntry$Type navigationEntry$Type5 = new NavigationEntry$Type("CHAT_FOLDER", 4);
        CHAT_FOLDER = navigationEntry$Type5;
        NavigationEntry$Type[] navigationEntry$TypeArr = {navigationEntry$Type, navigationEntry$Type2, navigationEntry$Type3, navigationEntry$Type4, navigationEntry$Type5};
        $VALUES = navigationEntry$TypeArr;
        $ENTRIES = a.a(navigationEntry$TypeArr);
    }

    public static NavigationEntry$Type valueOf(String str) {
        return (NavigationEntry$Type) Enum.valueOf(NavigationEntry$Type.class, str);
    }

    public static NavigationEntry$Type[] values() {
        return (NavigationEntry$Type[]) $VALUES.clone();
    }
}
