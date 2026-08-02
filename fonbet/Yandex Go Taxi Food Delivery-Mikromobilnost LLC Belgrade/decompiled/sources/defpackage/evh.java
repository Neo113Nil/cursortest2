package defpackage;

import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionInputType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class evh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryAddressCorrectionInputType.values().length];
        try {
            iArr[DeliveryAddressCorrectionInputType.APARTMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryAddressCorrectionInputType.PORCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryAddressCorrectionInputType.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryAddressCorrectionInputType.DOORPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DeliveryAddressCorrectionInputType.COMMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
