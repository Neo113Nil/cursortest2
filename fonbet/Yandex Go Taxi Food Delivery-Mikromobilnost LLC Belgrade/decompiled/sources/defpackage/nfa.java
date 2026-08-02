package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class nfa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethod$Type.values().length];
        try {
            iArr[PaymentMethod$Type.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethod$Type.YB_WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethod$Type.GOOGLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethod$Type.CORP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
