package defpackage;

import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class f1a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedAccountType.values().length];
        try {
            iArr[SharedAccountType.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedAccountType.FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharedAccountType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[PaymentMethod$Type.values().length];
        try {
            iArr2[PaymentMethod$Type.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PaymentMethod$Type.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PaymentMethod$Type.CORP.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentMethod$Type.GOOGLE_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentMethod$Type.PERSONAL_WALLET.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentMethod$Type.CARGO_CORP.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentMethod$Type.SBP_TOKEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PaymentMethod$Type.YANGO_PAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PaymentMethod$Type.CASH_LIKE.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr2;
    }
}
