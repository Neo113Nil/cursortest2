package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fbi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryFormType.values().length];
        try {
            iArr[DeliveryFormType.MINIMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryFormType.REDUCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryFormType.FULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryFormType.SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
