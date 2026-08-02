package defpackage;

import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class iyq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeatureTypeInternal.values().length];
        try {
            iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
