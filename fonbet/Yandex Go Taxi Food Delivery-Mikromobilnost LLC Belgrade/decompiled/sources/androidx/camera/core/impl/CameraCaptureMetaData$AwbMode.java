package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CameraCaptureMetaData$AwbMode {
    private static final /* synthetic */ CameraCaptureMetaData$AwbMode[] $VALUES;
    public static final CameraCaptureMetaData$AwbMode AUTO;
    public static final CameraCaptureMetaData$AwbMode CLOUDY_DAYLIGHT;
    public static final CameraCaptureMetaData$AwbMode DAYLIGHT;
    public static final CameraCaptureMetaData$AwbMode FLUORESCENT;
    public static final CameraCaptureMetaData$AwbMode INCANDESCENT;
    public static final CameraCaptureMetaData$AwbMode OFF;
    public static final CameraCaptureMetaData$AwbMode SHADE;
    public static final CameraCaptureMetaData$AwbMode TWILIGHT;
    public static final CameraCaptureMetaData$AwbMode UNKNOWN;
    public static final CameraCaptureMetaData$AwbMode WARM_FLUORESCENT;

    static {
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode = new CameraCaptureMetaData$AwbMode("UNKNOWN", 0);
        UNKNOWN = cameraCaptureMetaData$AwbMode;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode2 = new CameraCaptureMetaData$AwbMode("OFF", 1);
        OFF = cameraCaptureMetaData$AwbMode2;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode3 = new CameraCaptureMetaData$AwbMode("AUTO", 2);
        AUTO = cameraCaptureMetaData$AwbMode3;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode4 = new CameraCaptureMetaData$AwbMode("INCANDESCENT", 3);
        INCANDESCENT = cameraCaptureMetaData$AwbMode4;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode5 = new CameraCaptureMetaData$AwbMode("FLUORESCENT", 4);
        FLUORESCENT = cameraCaptureMetaData$AwbMode5;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode6 = new CameraCaptureMetaData$AwbMode("WARM_FLUORESCENT", 5);
        WARM_FLUORESCENT = cameraCaptureMetaData$AwbMode6;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode7 = new CameraCaptureMetaData$AwbMode("DAYLIGHT", 6);
        DAYLIGHT = cameraCaptureMetaData$AwbMode7;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode8 = new CameraCaptureMetaData$AwbMode("CLOUDY_DAYLIGHT", 7);
        CLOUDY_DAYLIGHT = cameraCaptureMetaData$AwbMode8;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode9 = new CameraCaptureMetaData$AwbMode("TWILIGHT", 8);
        TWILIGHT = cameraCaptureMetaData$AwbMode9;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode10 = new CameraCaptureMetaData$AwbMode("SHADE", 9);
        SHADE = cameraCaptureMetaData$AwbMode10;
        $VALUES = new CameraCaptureMetaData$AwbMode[]{cameraCaptureMetaData$AwbMode, cameraCaptureMetaData$AwbMode2, cameraCaptureMetaData$AwbMode3, cameraCaptureMetaData$AwbMode4, cameraCaptureMetaData$AwbMode5, cameraCaptureMetaData$AwbMode6, cameraCaptureMetaData$AwbMode7, cameraCaptureMetaData$AwbMode8, cameraCaptureMetaData$AwbMode9, cameraCaptureMetaData$AwbMode10};
    }

    public static CameraCaptureMetaData$AwbMode valueOf(String str) {
        return (CameraCaptureMetaData$AwbMode) Enum.valueOf(CameraCaptureMetaData$AwbMode.class, str);
    }

    public static CameraCaptureMetaData$AwbMode[] values() {
        return (CameraCaptureMetaData$AwbMode[]) $VALUES.clone();
    }
}
