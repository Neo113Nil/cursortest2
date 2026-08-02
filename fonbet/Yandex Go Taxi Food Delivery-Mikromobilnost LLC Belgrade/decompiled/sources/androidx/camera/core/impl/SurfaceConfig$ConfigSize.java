package androidx.camera.core.impl;

import android.util.Size;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"androidx/camera/core/impl/SurfaceConfig$ConfigSize", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "", "id", CA20Status.STATUS_USER_I, "a", "()I", "Landroid/util/Size;", "relatedFixedSize", "Landroid/util/Size;", "b", "()Landroid/util/Size;", "VGA", "X_VGA", "S720P_16_9", "PREVIEW", "S1080P_4_3", "S1080P_16_9", "S1440P_4_3", "S1440P_16_9", "UHD", "RECORD", "MAXIMUM", "MAXIMUM_4_3", "MAXIMUM_16_9", "ULTRA_MAXIMUM", "NOT_SUPPORT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SurfaceConfig$ConfigSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurfaceConfig$ConfigSize[] $VALUES;
    public static final SurfaceConfig$ConfigSize MAXIMUM;
    public static final SurfaceConfig$ConfigSize MAXIMUM_16_9;
    public static final SurfaceConfig$ConfigSize MAXIMUM_4_3;
    public static final SurfaceConfig$ConfigSize NOT_SUPPORT;
    public static final SurfaceConfig$ConfigSize PREVIEW;
    public static final SurfaceConfig$ConfigSize RECORD;
    public static final SurfaceConfig$ConfigSize S1080P_16_9;
    public static final SurfaceConfig$ConfigSize S1080P_4_3;
    public static final SurfaceConfig$ConfigSize S1440P_16_9;
    public static final SurfaceConfig$ConfigSize S1440P_4_3;
    public static final SurfaceConfig$ConfigSize S720P_16_9;
    public static final SurfaceConfig$ConfigSize UHD;
    public static final SurfaceConfig$ConfigSize ULTRA_MAXIMUM;
    public static final SurfaceConfig$ConfigSize VGA;
    public static final SurfaceConfig$ConfigSize X_VGA;
    private final int id;
    private final Size relatedFixedSize;

    static {
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = new SurfaceConfig$ConfigSize("VGA", 0, 0, new Size(640, 480));
        VGA = surfaceConfig$ConfigSize;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2 = new SurfaceConfig$ConfigSize("X_VGA", 1, 1, new Size(1024, 768));
        X_VGA = surfaceConfig$ConfigSize2;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize3 = new SurfaceConfig$ConfigSize("S720P_16_9", 2, 2, new Size(1280, 720));
        S720P_16_9 = surfaceConfig$ConfigSize3;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize4 = new SurfaceConfig$ConfigSize("PREVIEW", 3, 3, null);
        PREVIEW = surfaceConfig$ConfigSize4;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize5 = new SurfaceConfig$ConfigSize("S1080P_4_3", 4, 4, new Size(1440, 1080));
        S1080P_4_3 = surfaceConfig$ConfigSize5;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize6 = new SurfaceConfig$ConfigSize("S1080P_16_9", 5, 5, new Size(1920, 1080));
        S1080P_16_9 = surfaceConfig$ConfigSize6;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize7 = new SurfaceConfig$ConfigSize("S1440P_4_3", 6, 6, new Size(1920, 1440));
        S1440P_4_3 = surfaceConfig$ConfigSize7;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize8 = new SurfaceConfig$ConfigSize("S1440P_16_9", 7, 7, new Size(HProv.ALG_TYPE_DH, 1440));
        S1440P_16_9 = surfaceConfig$ConfigSize8;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize9 = new SurfaceConfig$ConfigSize("UHD", 8, 8, new Size(3840, 2160));
        UHD = surfaceConfig$ConfigSize9;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize10 = new SurfaceConfig$ConfigSize("RECORD", 9, 9, null);
        RECORD = surfaceConfig$ConfigSize10;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize11 = new SurfaceConfig$ConfigSize("MAXIMUM", 10, 10, null);
        MAXIMUM = surfaceConfig$ConfigSize11;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize12 = new SurfaceConfig$ConfigSize("MAXIMUM_4_3", 11, 11, null);
        MAXIMUM_4_3 = surfaceConfig$ConfigSize12;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize13 = new SurfaceConfig$ConfigSize("MAXIMUM_16_9", 12, 12, null);
        MAXIMUM_16_9 = surfaceConfig$ConfigSize13;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize14 = new SurfaceConfig$ConfigSize("ULTRA_MAXIMUM", 13, 13, null);
        ULTRA_MAXIMUM = surfaceConfig$ConfigSize14;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize15 = new SurfaceConfig$ConfigSize("NOT_SUPPORT", 14, 14, null);
        NOT_SUPPORT = surfaceConfig$ConfigSize15;
        SurfaceConfig$ConfigSize[] surfaceConfig$ConfigSizeArr = {surfaceConfig$ConfigSize, surfaceConfig$ConfigSize2, surfaceConfig$ConfigSize3, surfaceConfig$ConfigSize4, surfaceConfig$ConfigSize5, surfaceConfig$ConfigSize6, surfaceConfig$ConfigSize7, surfaceConfig$ConfigSize8, surfaceConfig$ConfigSize9, surfaceConfig$ConfigSize10, surfaceConfig$ConfigSize11, surfaceConfig$ConfigSize12, surfaceConfig$ConfigSize13, surfaceConfig$ConfigSize14, surfaceConfig$ConfigSize15};
        $VALUES = surfaceConfig$ConfigSizeArr;
        $ENTRIES = kotlin.enums.a.a(surfaceConfig$ConfigSizeArr);
    }

    public SurfaceConfig$ConfigSize(String str, int i, int i2, Size size) {
        this.id = i2;
        this.relatedFixedSize = size;
    }

    public static SurfaceConfig$ConfigSize valueOf(String str) {
        return (SurfaceConfig$ConfigSize) Enum.valueOf(SurfaceConfig$ConfigSize.class, str);
    }

    public static SurfaceConfig$ConfigSize[] values() {
        return (SurfaceConfig$ConfigSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }
}
