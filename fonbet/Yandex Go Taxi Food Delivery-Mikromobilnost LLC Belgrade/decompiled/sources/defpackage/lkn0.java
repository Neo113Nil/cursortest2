package defpackage;

import ru.yandex.taxi.scooters.data.model.ButtonAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class lkn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonAction.values().length];
        try {
            iArr[ButtonAction.TRY_AGAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonAction.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonAction.PAYMENT_METHODS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
