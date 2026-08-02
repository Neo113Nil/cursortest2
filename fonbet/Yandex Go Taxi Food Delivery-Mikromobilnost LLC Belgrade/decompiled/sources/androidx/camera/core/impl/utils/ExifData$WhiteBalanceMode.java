package androidx.camera.core.impl.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ExifData$WhiteBalanceMode {
    private static final /* synthetic */ ExifData$WhiteBalanceMode[] $VALUES;
    public static final ExifData$WhiteBalanceMode AUTO;
    public static final ExifData$WhiteBalanceMode MANUAL;

    static {
        ExifData$WhiteBalanceMode exifData$WhiteBalanceMode = new ExifData$WhiteBalanceMode("AUTO", 0);
        AUTO = exifData$WhiteBalanceMode;
        ExifData$WhiteBalanceMode exifData$WhiteBalanceMode2 = new ExifData$WhiteBalanceMode("MANUAL", 1);
        MANUAL = exifData$WhiteBalanceMode2;
        $VALUES = new ExifData$WhiteBalanceMode[]{exifData$WhiteBalanceMode, exifData$WhiteBalanceMode2};
    }

    public static ExifData$WhiteBalanceMode valueOf(String str) {
        return (ExifData$WhiteBalanceMode) Enum.valueOf(ExifData$WhiteBalanceMode.class, str);
    }

    public static ExifData$WhiteBalanceMode[] values() {
        return (ExifData$WhiteBalanceMode[]) $VALUES.clone();
    }
}
