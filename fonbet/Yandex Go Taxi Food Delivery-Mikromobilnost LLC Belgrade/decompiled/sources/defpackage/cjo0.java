package defpackage;

import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class cjo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersPhotocontrolStatusResponse.PhotocontrolStatus.values().length];
        try {
            iArr[ScootersPhotocontrolStatusResponse.PhotocontrolStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPhotocontrolStatusResponse.PhotocontrolStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPhotocontrolStatusResponse.PhotocontrolStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersPhotocontrolStatusResponse.PhotocontrolStatus.IMPOSSIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
