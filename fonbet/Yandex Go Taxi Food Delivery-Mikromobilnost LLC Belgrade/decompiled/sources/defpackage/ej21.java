package defpackage;

import androidx.camera.core.featuregroup.impl.UseCaseType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class ej21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UseCaseType.values().length];
        try {
            iArr[UseCaseType.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UseCaseType.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UseCaseType.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UseCaseType.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UseCaseType.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
