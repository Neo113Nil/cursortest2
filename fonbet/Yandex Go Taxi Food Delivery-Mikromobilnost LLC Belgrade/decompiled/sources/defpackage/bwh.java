package defpackage;

import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.states.DeliveryShowNotificationState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class bwh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryShowNotificationState.ShowState.values().length];
        try {
            iArr[DeliveryShowNotificationState.ShowState.NEED_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryShowNotificationState.ShowState.SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryShowNotificationState.ShowState.NOT_SHOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
