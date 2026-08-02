package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$ChoicesType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class byd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryState$Poll$Question$ChoicesType.values().length];
        try {
            iArr[DeliveryState$Poll$Question$ChoicesType.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryState$Poll$Question$ChoicesType.MULTI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
