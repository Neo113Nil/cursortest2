package com.yandex.passport.internal.ui.base;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ShowFragmentInfo$AnimationType {
    private static final /* synthetic */ ShowFragmentInfo$AnimationType[] $VALUES;
    public static final ShowFragmentInfo$AnimationType DIALOG;
    public static final ShowFragmentInfo$AnimationType NONE;
    public static final ShowFragmentInfo$AnimationType SLIDE;

    static {
        ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType = new ShowFragmentInfo$AnimationType("SLIDE", 0);
        SLIDE = showFragmentInfo$AnimationType;
        ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType2 = new ShowFragmentInfo$AnimationType("DIALOG", 1);
        DIALOG = showFragmentInfo$AnimationType2;
        ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType3 = new ShowFragmentInfo$AnimationType(JCP.RAW_PREFIX, 2);
        NONE = showFragmentInfo$AnimationType3;
        $VALUES = new ShowFragmentInfo$AnimationType[]{showFragmentInfo$AnimationType, showFragmentInfo$AnimationType2, showFragmentInfo$AnimationType3};
    }

    public static ShowFragmentInfo$AnimationType valueOf(String str) {
        return (ShowFragmentInfo$AnimationType) Enum.valueOf(ShowFragmentInfo$AnimationType.class, str);
    }

    public static ShowFragmentInfo$AnimationType[] values() {
        return (ShowFragmentInfo$AnimationType[]) $VALUES.clone();
    }
}
