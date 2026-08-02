package defpackage;

import com.yandex.go.beginners.safety.photo.upload.domain.model.SafetyPhotoUploadScreenState$Type;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gyl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyPhotoUploadScreenState$Type.values().length];
        try {
            iArr[SafetyPhotoUploadScreenState$Type.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyPhotoUploadScreenState$Type.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyPhotoUploadScreenState$Type.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyPhotoUploadScreenState$Type.VALIDATION_FAIL_INTERMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SafetyPhotoUploadScreenState$Type.VALIDATION_FAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
