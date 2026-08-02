package com.yandex.urbanads.internal.flex;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.k4o;
import defpackage.wf21;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/urbanads/internal/flex/UrbanAdsTheme;", "", "", UrbanAdsBottomSheetFragment.THEME_ID, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "wf21", "LIGHT", "DARK", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UrbanAdsTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrbanAdsTheme[] $VALUES;
    public static final wf21 Companion;
    public static final UrbanAdsTheme DARK;
    public static final UrbanAdsTheme LIGHT;
    private final String themeId;

    static {
        UrbanAdsTheme urbanAdsTheme = new UrbanAdsTheme("LIGHT", 0, "light");
        LIGHT = urbanAdsTheme;
        UrbanAdsTheme urbanAdsTheme2 = new UrbanAdsTheme("DARK", 1, "dark");
        DARK = urbanAdsTheme2;
        UrbanAdsTheme[] urbanAdsThemeArr = {urbanAdsTheme, urbanAdsTheme2};
        $VALUES = urbanAdsThemeArr;
        $ENTRIES = kotlin.enums.a.a(urbanAdsThemeArr);
        Companion = new wf21();
    }

    public UrbanAdsTheme(String str, int i, String str2) {
        this.themeId = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static UrbanAdsTheme valueOf(String str) {
        return (UrbanAdsTheme) Enum.valueOf(UrbanAdsTheme.class, str);
    }

    public static UrbanAdsTheme[] values() {
        return (UrbanAdsTheme[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getThemeId() {
        return this.themeId;
    }
}
