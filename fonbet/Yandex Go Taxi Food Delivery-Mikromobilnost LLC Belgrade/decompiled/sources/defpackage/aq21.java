package defpackage;

import com.yandex.go.data.entities.network.UserPhotoActionTypeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class aq21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserPhotoActionTypeDto.values().length];
        try {
            iArr[UserPhotoActionTypeDto.DELETE_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserPhotoActionTypeDto.SELECT_PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserPhotoActionTypeDto.TAKE_SELFIE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
