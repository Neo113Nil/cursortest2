package defpackage;

import com.yandex.go.domain.entities.UserPhotoButtonAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gcp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserPhotoButtonAction.values().length];
        try {
            iArr[UserPhotoButtonAction.DELETE_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserPhotoButtonAction.TAKE_SELFIE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserPhotoButtonAction.SELECT_PHOTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
