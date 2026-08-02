package com.yandex.plus.plaquesdk.theme;

import defpackage.k4o;
import defpackage.swy0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/plaquesdk/theme/ThemeType;", "", "Companion", "swy0", "LIGHT", "DARK", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final swy0 Companion;
    public static final ThemeType DARK;
    public static final ThemeType LIGHT;

    static {
        ThemeType themeType = new ThemeType("LIGHT", 0);
        LIGHT = themeType;
        ThemeType themeType2 = new ThemeType("DARK", 1);
        DARK = themeType2;
        ThemeType[] themeTypeArr = {themeType, themeType2};
        $VALUES = themeTypeArr;
        $ENTRIES = a.a(themeTypeArr);
        Companion = new swy0();
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }
}
