package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/api/PassportTheme;", "", "LIGHT", "DARK", "LIGHT_CUSTOM", "FOLLOW_SYSTEM", "passport-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportTheme[] $VALUES;
    public static final PassportTheme DARK;
    public static final PassportTheme FOLLOW_SYSTEM;
    public static final PassportTheme LIGHT;
    public static final PassportTheme LIGHT_CUSTOM;

    static {
        PassportTheme passportTheme = new PassportTheme("LIGHT", 0);
        LIGHT = passportTheme;
        PassportTheme passportTheme2 = new PassportTheme("DARK", 1);
        DARK = passportTheme2;
        PassportTheme passportTheme3 = new PassportTheme("LIGHT_CUSTOM", 2);
        LIGHT_CUSTOM = passportTheme3;
        PassportTheme passportTheme4 = new PassportTheme("FOLLOW_SYSTEM", 3);
        FOLLOW_SYSTEM = passportTheme4;
        PassportTheme[] passportThemeArr = {passportTheme, passportTheme2, passportTheme3, passportTheme4};
        $VALUES = passportThemeArr;
        $ENTRIES = kotlin.enums.a.a(passportThemeArr);
    }

    public static PassportTheme valueOf(String str) {
        return (PassportTheme) Enum.valueOf(PassportTheme.class, str);
    }

    public static PassportTheme[] values() {
        return (PassportTheme[]) $VALUES.clone();
    }
}
