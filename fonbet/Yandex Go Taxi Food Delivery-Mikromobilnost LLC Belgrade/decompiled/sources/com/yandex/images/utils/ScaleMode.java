package com.yandex.images.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class ScaleMode {
    private static final /* synthetic */ ScaleMode[] $VALUES;
    public static final ScaleMode CENTER_CROP;
    public static final ScaleMode FIT_CENTER;

    static {
        ScaleMode scaleMode = new ScaleMode("CENTER_CROP", 0);
        CENTER_CROP = scaleMode;
        ScaleMode scaleMode2 = new ScaleMode("FIT_CENTER", 1);
        FIT_CENTER = scaleMode2;
        $VALUES = new ScaleMode[]{scaleMode, scaleMode2};
    }

    public static ScaleMode valueOf(String str) {
        return (ScaleMode) Enum.valueOf(ScaleMode.class, str);
    }

    public static ScaleMode[] values() {
        return (ScaleMode[]) $VALUES.clone();
    }
}
