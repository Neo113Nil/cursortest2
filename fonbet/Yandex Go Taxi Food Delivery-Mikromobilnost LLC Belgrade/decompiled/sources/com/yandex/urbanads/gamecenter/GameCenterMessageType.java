package com.yandex.urbanads.gamecenter;

import defpackage.k4o;
import defpackage.vss;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/urbanads/gamecenter/GameCenterMessageType;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "vss", "DISMISS", "HAPTIC_FEEDBACK", "COINS_REFRESH_REQUIRED", "UNKNOWN", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameCenterMessageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GameCenterMessageType[] $VALUES;
    public static final GameCenterMessageType COINS_REFRESH_REQUIRED;
    public static final vss Companion;
    public static final GameCenterMessageType DISMISS;
    public static final GameCenterMessageType HAPTIC_FEEDBACK;
    public static final GameCenterMessageType UNKNOWN;
    private final String value;

    static {
        GameCenterMessageType gameCenterMessageType = new GameCenterMessageType("DISMISS", 0, "DISMISS");
        DISMISS = gameCenterMessageType;
        GameCenterMessageType gameCenterMessageType2 = new GameCenterMessageType("HAPTIC_FEEDBACK", 1, "HAPTIC_FEEDBACK");
        HAPTIC_FEEDBACK = gameCenterMessageType2;
        GameCenterMessageType gameCenterMessageType3 = new GameCenterMessageType("COINS_REFRESH_REQUIRED", 2, "COINS_REFRESH_REQUIRED");
        COINS_REFRESH_REQUIRED = gameCenterMessageType3;
        GameCenterMessageType gameCenterMessageType4 = new GameCenterMessageType("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = gameCenterMessageType4;
        GameCenterMessageType[] gameCenterMessageTypeArr = {gameCenterMessageType, gameCenterMessageType2, gameCenterMessageType3, gameCenterMessageType4};
        $VALUES = gameCenterMessageTypeArr;
        $ENTRIES = kotlin.enums.a.a(gameCenterMessageTypeArr);
        Companion = new vss();
    }

    public GameCenterMessageType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static GameCenterMessageType valueOf(String str) {
        return (GameCenterMessageType) Enum.valueOf(GameCenterMessageType.class, str);
    }

    public static GameCenterMessageType[] values() {
        return (GameCenterMessageType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
