package defpackage;

import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class cj21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[UseCaseConfigFactory$CaptureType.values().length];
        try {
            iArr[UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UseCaseConfigFactory$CaptureType.PREVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UseCaseConfigFactory$CaptureType.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[FeatureTypeInternal.values().length];
        try {
            iArr2[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
