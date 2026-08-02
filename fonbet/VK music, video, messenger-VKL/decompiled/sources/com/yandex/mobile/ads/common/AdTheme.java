package com.yandex.mobile.ads.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;
    private static final /* synthetic */ AdTheme[] c;
    private static final /* synthetic */ zrp d;
    private final String b;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", "light");
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", "dark");
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        c = adThemeArr;
        d = new asp(adThemeArr);
    }

    private AdTheme(int i, String str, String str2) {
        this.b = str2;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) c.clone();
    }
}
