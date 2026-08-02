package defpackage;

import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class o940 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalButtonResultType.values().length];
        try {
            iArr[ModalButtonResultType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalButtonResultType.CLOSE_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalButtonResultType.OPEN_PAYMENT_METHODS_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
