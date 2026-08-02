package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.DeliveryBitmapTransformation;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class eci {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryBitmapTransformation.values().length];
        try {
            iArr[DeliveryBitmapTransformation.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
