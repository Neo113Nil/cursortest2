package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$AnswersAlignment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fxd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryState$Poll$Question$AnswersAlignment.values().length];
        try {
            iArr[DeliveryState$Poll$Question$AnswersAlignment.TRAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryState$Poll$Question$AnswersAlignment.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
