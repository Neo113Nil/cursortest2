package com.yandex.passport.common.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/common/ui/AppTheme;", "", "LIGHT", "DARK", "FOLLOW_SYSTEM", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppTheme[] $VALUES;
    public static final AppTheme DARK;
    public static final AppTheme FOLLOW_SYSTEM;
    public static final AppTheme LIGHT;

    static {
        AppTheme appTheme = new AppTheme("LIGHT", 0);
        LIGHT = appTheme;
        AppTheme appTheme2 = new AppTheme("DARK", 1);
        DARK = appTheme2;
        AppTheme appTheme3 = new AppTheme("FOLLOW_SYSTEM", 2);
        FOLLOW_SYSTEM = appTheme3;
        AppTheme[] appThemeArr = {appTheme, appTheme2, appTheme3};
        $VALUES = appThemeArr;
        $ENTRIES = kotlin.enums.a.a(appThemeArr);
    }

    public static AppTheme valueOf(String str) {
        return (AppTheme) Enum.valueOf(AppTheme.class, str);
    }

    public static AppTheme[] values() {
        return (AppTheme[]) $VALUES.clone();
    }
}
