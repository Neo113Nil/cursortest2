package defpackage;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class oob0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PickupFromPhotoPayload$Origin.values().length];
        try {
            iArr[PickupFromPhotoPayload$Origin.SUGGEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PickupFromPhotoPayload$Origin.CLARIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
