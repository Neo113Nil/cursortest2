package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CameraCaptureMetaData$AeMode {
    private static final /* synthetic */ CameraCaptureMetaData$AeMode[] $VALUES;
    public static final CameraCaptureMetaData$AeMode OFF;
    public static final CameraCaptureMetaData$AeMode ON;
    public static final CameraCaptureMetaData$AeMode ON_ALWAYS_FLASH;
    public static final CameraCaptureMetaData$AeMode ON_AUTO_FLASH;
    public static final CameraCaptureMetaData$AeMode ON_AUTO_FLASH_REDEYE;
    public static final CameraCaptureMetaData$AeMode ON_EXTERNAL_FLASH;
    public static final CameraCaptureMetaData$AeMode UNKNOWN;

    static {
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode = new CameraCaptureMetaData$AeMode("UNKNOWN", 0);
        UNKNOWN = cameraCaptureMetaData$AeMode;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode2 = new CameraCaptureMetaData$AeMode("OFF", 1);
        OFF = cameraCaptureMetaData$AeMode2;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode3 = new CameraCaptureMetaData$AeMode("ON", 2);
        ON = cameraCaptureMetaData$AeMode3;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode4 = new CameraCaptureMetaData$AeMode("ON_AUTO_FLASH", 3);
        ON_AUTO_FLASH = cameraCaptureMetaData$AeMode4;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode5 = new CameraCaptureMetaData$AeMode("ON_ALWAYS_FLASH", 4);
        ON_ALWAYS_FLASH = cameraCaptureMetaData$AeMode5;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode6 = new CameraCaptureMetaData$AeMode("ON_AUTO_FLASH_REDEYE", 5);
        ON_AUTO_FLASH_REDEYE = cameraCaptureMetaData$AeMode6;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode7 = new CameraCaptureMetaData$AeMode("ON_EXTERNAL_FLASH", 6);
        ON_EXTERNAL_FLASH = cameraCaptureMetaData$AeMode7;
        $VALUES = new CameraCaptureMetaData$AeMode[]{cameraCaptureMetaData$AeMode, cameraCaptureMetaData$AeMode2, cameraCaptureMetaData$AeMode3, cameraCaptureMetaData$AeMode4, cameraCaptureMetaData$AeMode5, cameraCaptureMetaData$AeMode6, cameraCaptureMetaData$AeMode7};
    }

    public static CameraCaptureMetaData$AeMode valueOf(String str) {
        return (CameraCaptureMetaData$AeMode) Enum.valueOf(CameraCaptureMetaData$AeMode.class, str);
    }

    public static CameraCaptureMetaData$AeMode[] values() {
        return (CameraCaptureMetaData$AeMode[]) $VALUES.clone();
    }
}
