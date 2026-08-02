package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.ErrorType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class df00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.INCORRECT_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.MORE_TIP_EXPECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorType.LESS_TIP_EXPECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
