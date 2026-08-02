package defpackage;

import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jki {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPointFocusHolder$FocusTarget.values().length];
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.Comment.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.Porch.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.Apartment.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.Floor.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.DoorPhone.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
