package com.yandex.urbanads.gamecenter;

import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import defpackage.k4o;
import defpackage.uss;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/urbanads/gamecenter/GameCenterHapticType;", "", "", "value", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "", "durationMs", "J", "b", "()J", "", "amplitude", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "uss", "LIGHT", "MEDIUM", "HEAVY", "SUCCESS", "ERROR", "WARNING", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameCenterHapticType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GameCenterHapticType[] $VALUES;
    public static final uss Companion;
    public static final GameCenterHapticType ERROR;
    public static final GameCenterHapticType HEAVY;
    public static final GameCenterHapticType LIGHT;
    public static final GameCenterHapticType MEDIUM;
    public static final GameCenterHapticType SUCCESS;
    public static final GameCenterHapticType WARNING;
    private final int amplitude;
    private final long durationMs;
    private final String value;

    static {
        GameCenterHapticType gameCenterHapticType = new GameCenterHapticType(20L, "LIGHT", 0, 50, "light");
        LIGHT = gameCenterHapticType;
        GameCenterHapticType gameCenterHapticType2 = new GameCenterHapticType(30L, "MEDIUM", 1, 128, "medium");
        MEDIUM = gameCenterHapticType2;
        GameCenterHapticType gameCenterHapticType3 = new GameCenterHapticType(40L, "HEAVY", 2, 255, UserProfileJsNativeApi.HAPTIC_HEAVY_INTENSITY);
        HEAVY = gameCenterHapticType3;
        GameCenterHapticType gameCenterHapticType4 = new GameCenterHapticType(30L, "SUCCESS", 3, 100, "success");
        SUCCESS = gameCenterHapticType4;
        GameCenterHapticType gameCenterHapticType5 = new GameCenterHapticType(50L, "ERROR", 4, 200, "error");
        ERROR = gameCenterHapticType5;
        GameCenterHapticType gameCenterHapticType6 = new GameCenterHapticType(40L, "WARNING", 5, 150, "warning");
        WARNING = gameCenterHapticType6;
        GameCenterHapticType[] gameCenterHapticTypeArr = {gameCenterHapticType, gameCenterHapticType2, gameCenterHapticType3, gameCenterHapticType4, gameCenterHapticType5, gameCenterHapticType6};
        $VALUES = gameCenterHapticTypeArr;
        $ENTRIES = kotlin.enums.a.a(gameCenterHapticTypeArr);
        Companion = new uss();
    }

    public GameCenterHapticType(long j, String str, int i, int i2, String str2) {
        this.value = str2;
        this.durationMs = j;
        this.amplitude = i2;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static GameCenterHapticType valueOf(String str) {
        return (GameCenterHapticType) Enum.valueOf(GameCenterHapticType.class, str);
    }

    public static GameCenterHapticType[] values() {
        return (GameCenterHapticType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getAmplitude() {
        return this.amplitude;
    }

    /* renamed from: b, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
