package defpackage;

import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class eym {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DuePickerButtonType.values().length];
        try {
            iArr[DuePickerButtonType.ON_DEMAND_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DuePickerButtonType.SCHEDULED_ORDER_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DuePickerButtonType.RETRY_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DuePickerButtonType.CLOSE_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
