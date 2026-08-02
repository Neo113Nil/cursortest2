package defpackage;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dq21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[UserPhotoUploadingEntryPoint.values().length];
        try {
            iArr[UserPhotoUploadingEntryPoint.MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.RESTORED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.NOTIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.IN_APP_NOTIFICATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[UserPhotoUploadingEntryPoint.SAFETY_CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[UserPhotoButtonAction.values().length];
        try {
            iArr2[UserPhotoButtonAction.DELETE_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[UserPhotoButtonAction.TAKE_SELFIE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[UserPhotoButtonAction.SELECT_PHOTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
