package com.yandex.messaging.auth;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/auth/AuthTheme;", "", "Light", "Dark", "LightCustom", "FollowSystem", "messaging-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AuthTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthTheme[] $VALUES;
    public static final AuthTheme Dark;
    public static final AuthTheme FollowSystem;
    public static final AuthTheme Light;
    public static final AuthTheme LightCustom;

    static {
        AuthTheme authTheme = new AuthTheme("Light", 0);
        Light = authTheme;
        AuthTheme authTheme2 = new AuthTheme("Dark", 1);
        Dark = authTheme2;
        AuthTheme authTheme3 = new AuthTheme("LightCustom", 2);
        LightCustom = authTheme3;
        AuthTheme authTheme4 = new AuthTheme("FollowSystem", 3);
        FollowSystem = authTheme4;
        AuthTheme[] authThemeArr = {authTheme, authTheme2, authTheme3, authTheme4};
        $VALUES = authThemeArr;
        $ENTRIES = a.a(authThemeArr);
    }

    public static AuthTheme valueOf(String str) {
        return (AuthTheme) Enum.valueOf(AuthTheme.class, str);
    }

    public static AuthTheme[] values() {
        return (AuthTheme[]) $VALUES.clone();
    }
}
