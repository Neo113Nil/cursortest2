package androidx.camera.core.featuregroup.impl.feature;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "", "DYNAMIC_RANGE", "FPS_RANGE", "VIDEO_STABILIZATION", "IMAGE_FORMAT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FeatureTypeInternal {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeatureTypeInternal[] $VALUES;
    public static final FeatureTypeInternal DYNAMIC_RANGE;
    public static final FeatureTypeInternal FPS_RANGE;
    public static final FeatureTypeInternal IMAGE_FORMAT;
    public static final FeatureTypeInternal VIDEO_STABILIZATION;

    static {
        FeatureTypeInternal featureTypeInternal = new FeatureTypeInternal("DYNAMIC_RANGE", 0);
        DYNAMIC_RANGE = featureTypeInternal;
        FeatureTypeInternal featureTypeInternal2 = new FeatureTypeInternal("FPS_RANGE", 1);
        FPS_RANGE = featureTypeInternal2;
        FeatureTypeInternal featureTypeInternal3 = new FeatureTypeInternal("VIDEO_STABILIZATION", 2);
        VIDEO_STABILIZATION = featureTypeInternal3;
        FeatureTypeInternal featureTypeInternal4 = new FeatureTypeInternal("IMAGE_FORMAT", 3);
        IMAGE_FORMAT = featureTypeInternal4;
        FeatureTypeInternal[] featureTypeInternalArr = {featureTypeInternal, featureTypeInternal2, featureTypeInternal3, featureTypeInternal4};
        $VALUES = featureTypeInternalArr;
        $ENTRIES = a.a(featureTypeInternalArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static FeatureTypeInternal valueOf(String str) {
        return (FeatureTypeInternal) Enum.valueOf(FeatureTypeInternal.class, str);
    }

    public static FeatureTypeInternal[] values() {
        return (FeatureTypeInternal[]) $VALUES.clone();
    }
}
