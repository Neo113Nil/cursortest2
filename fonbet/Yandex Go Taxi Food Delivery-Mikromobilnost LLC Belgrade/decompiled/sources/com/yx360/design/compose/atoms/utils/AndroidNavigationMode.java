package com.yx360.design.compose.atoms.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yx360/design/compose/atoms/utils/AndroidNavigationMode;", "", "ThreeButtons", "TwoButtons", "Gesture", "Unknown", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidNavigationMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidNavigationMode[] $VALUES;
    public static final AndroidNavigationMode Gesture;
    public static final AndroidNavigationMode ThreeButtons;
    public static final AndroidNavigationMode TwoButtons;
    public static final AndroidNavigationMode Unknown;

    static {
        AndroidNavigationMode androidNavigationMode = new AndroidNavigationMode("ThreeButtons", 0);
        ThreeButtons = androidNavigationMode;
        AndroidNavigationMode androidNavigationMode2 = new AndroidNavigationMode("TwoButtons", 1);
        TwoButtons = androidNavigationMode2;
        AndroidNavigationMode androidNavigationMode3 = new AndroidNavigationMode("Gesture", 2);
        Gesture = androidNavigationMode3;
        AndroidNavigationMode androidNavigationMode4 = new AndroidNavigationMode("Unknown", 3);
        Unknown = androidNavigationMode4;
        AndroidNavigationMode[] androidNavigationModeArr = {androidNavigationMode, androidNavigationMode2, androidNavigationMode3, androidNavigationMode4};
        $VALUES = androidNavigationModeArr;
        $ENTRIES = kotlin.enums.a.a(androidNavigationModeArr);
    }

    public static AndroidNavigationMode valueOf(String str) {
        return (AndroidNavigationMode) Enum.valueOf(AndroidNavigationMode.class, str);
    }

    public static AndroidNavigationMode[] values() {
        return (AndroidNavigationMode[]) $VALUES.clone();
    }
}
