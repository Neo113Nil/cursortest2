package defpackage;

import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.tariffs.model.DeliveryInformationForm;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class bbi {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DeliveryInformationForm.FormType.values().length];
        try {
            iArr[DeliveryInformationForm.FormType.SHORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryInformationForm.FormType.MINIMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryInformationForm.FormType.REDUCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryInformationForm.FormType.FULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliveryPointFocusHolder$FocusTarget.values().length];
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.Porch.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.Floor.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.Comment.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.Apartment.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.DoorPhone.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DeliveryPointFocusHolder$FocusTarget.None.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
