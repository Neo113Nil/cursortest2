package com.yandex.go.design.compose.theme;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/design/compose/theme/AppThemeType;", "", "Light", "Dark", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppThemeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppThemeType[] $VALUES;
    public static final AppThemeType Dark;
    public static final AppThemeType Light;

    static {
        AppThemeType appThemeType = new AppThemeType("Light", 0);
        Light = appThemeType;
        AppThemeType appThemeType2 = new AppThemeType("Dark", 1);
        Dark = appThemeType2;
        AppThemeType[] appThemeTypeArr = {appThemeType, appThemeType2};
        $VALUES = appThemeTypeArr;
        $ENTRIES = a.a(appThemeTypeArr);
    }

    public static AppThemeType valueOf(String str) {
        return (AppThemeType) Enum.valueOf(AppThemeType.class, str);
    }

    public static AppThemeType[] values() {
        return (AppThemeType[]) $VALUES.clone();
    }
}
