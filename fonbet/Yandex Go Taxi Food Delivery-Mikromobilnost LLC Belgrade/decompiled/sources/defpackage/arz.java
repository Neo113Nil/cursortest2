package defpackage;

import com.yandex.go.safety.center.lost_item.data.Image$ImageType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class arz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Image$ImageType.values().length];
        try {
            iArr[Image$ImageType.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Image$ImageType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Image$ImageType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
