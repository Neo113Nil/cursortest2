package defpackage;

import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o9l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressClarificationCloseReason.values().length];
        try {
            iArr[AddressClarificationCloseReason.MOVE_PIN_OUT_AREA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressClarificationCloseReason.DONE_PRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
