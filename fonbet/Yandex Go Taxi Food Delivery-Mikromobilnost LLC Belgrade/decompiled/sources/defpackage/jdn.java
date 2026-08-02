package defpackage;

import ru.yandex.taxi.eatskit.dto.PaymentMethodType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jdn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethod$Type.values().length];
        try {
            iArr[PaymentMethod$Type.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethod$Type.CARD.ordinal()] = 2;
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
        try {
            iArr[PaymentMethod$Type.PERSONAL_WALLET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentMethodType.values().length];
        try {
            iArr2[PaymentMethodType.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentMethodType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentMethodType.CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentMethodType.CORP.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentMethodType.PERSONAL_WALLET.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
