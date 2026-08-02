package androidx.camera.core.impl;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"androidx/camera/core/impl/SurfaceConfig$ConfigSource", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSource;", "FEATURE_COMBINATION_TABLE", "CAPTURE_SESSION_TABLES", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SurfaceConfig$ConfigSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurfaceConfig$ConfigSource[] $VALUES;
    public static final SurfaceConfig$ConfigSource CAPTURE_SESSION_TABLES;
    public static final SurfaceConfig$ConfigSource FEATURE_COMBINATION_TABLE;

    static {
        SurfaceConfig$ConfigSource surfaceConfig$ConfigSource = new SurfaceConfig$ConfigSource("FEATURE_COMBINATION_TABLE", 0);
        FEATURE_COMBINATION_TABLE = surfaceConfig$ConfigSource;
        SurfaceConfig$ConfigSource surfaceConfig$ConfigSource2 = new SurfaceConfig$ConfigSource("CAPTURE_SESSION_TABLES", 1);
        CAPTURE_SESSION_TABLES = surfaceConfig$ConfigSource2;
        SurfaceConfig$ConfigSource[] surfaceConfig$ConfigSourceArr = {surfaceConfig$ConfigSource, surfaceConfig$ConfigSource2};
        $VALUES = surfaceConfig$ConfigSourceArr;
        $ENTRIES = kotlin.enums.a.a(surfaceConfig$ConfigSourceArr);
    }

    public static SurfaceConfig$ConfigSource valueOf(String str) {
        return (SurfaceConfig$ConfigSource) Enum.valueOf(SurfaceConfig$ConfigSource.class, str);
    }

    public static SurfaceConfig$ConfigSource[] values() {
        return (SurfaceConfig$ConfigSource[]) $VALUES.clone();
    }
}
