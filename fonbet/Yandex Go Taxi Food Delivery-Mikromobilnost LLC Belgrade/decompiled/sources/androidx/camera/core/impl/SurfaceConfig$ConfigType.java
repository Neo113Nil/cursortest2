package androidx.camera.core.impl;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/camera/core/impl/SurfaceConfig$ConfigType", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "PRIV", "YUV", "JPEG", "JPEG_R", "RAW", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SurfaceConfig$ConfigType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurfaceConfig$ConfigType[] $VALUES;
    public static final SurfaceConfig$ConfigType JPEG;
    public static final SurfaceConfig$ConfigType JPEG_R;
    public static final SurfaceConfig$ConfigType PRIV;
    public static final SurfaceConfig$ConfigType RAW;
    public static final SurfaceConfig$ConfigType YUV;

    static {
        SurfaceConfig$ConfigType surfaceConfig$ConfigType = new SurfaceConfig$ConfigType("PRIV", 0);
        PRIV = surfaceConfig$ConfigType;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType2 = new SurfaceConfig$ConfigType("YUV", 1);
        YUV = surfaceConfig$ConfigType2;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType3 = new SurfaceConfig$ConfigType("JPEG", 2);
        JPEG = surfaceConfig$ConfigType3;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType4 = new SurfaceConfig$ConfigType("JPEG_R", 3);
        JPEG_R = surfaceConfig$ConfigType4;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType5 = new SurfaceConfig$ConfigType("RAW", 4);
        RAW = surfaceConfig$ConfigType5;
        SurfaceConfig$ConfigType[] surfaceConfig$ConfigTypeArr = {surfaceConfig$ConfigType, surfaceConfig$ConfigType2, surfaceConfig$ConfigType3, surfaceConfig$ConfigType4, surfaceConfig$ConfigType5};
        $VALUES = surfaceConfig$ConfigTypeArr;
        $ENTRIES = kotlin.enums.a.a(surfaceConfig$ConfigTypeArr);
    }

    public static SurfaceConfig$ConfigType valueOf(String str) {
        return (SurfaceConfig$ConfigType) Enum.valueOf(SurfaceConfig$ConfigType.class, str);
    }

    public static SurfaceConfig$ConfigType[] values() {
        return (SurfaceConfig$ConfigType[]) $VALUES.clone();
    }
}
