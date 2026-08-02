package defpackage;

import ru.yandex.tankerapp.models.dto.PaymentKitResultScreenClosing;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c3a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentKitResultScreenClosing.values().length];
        try {
            iArr[PaymentKitResultScreenClosing.Hide.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentKitResultScreenClosing.AfterDelay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentKitResultScreenClosing.Manually.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
