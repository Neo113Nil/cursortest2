package defpackage;

import com.yandex.go.taxi.order.models.api.status.ImageType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class g880 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageType.values().length];
        try {
            iArr[ImageType.ICON_SPOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageType.PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
