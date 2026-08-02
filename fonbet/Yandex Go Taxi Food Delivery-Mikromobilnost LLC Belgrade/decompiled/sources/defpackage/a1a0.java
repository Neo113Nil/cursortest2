package defpackage;

import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a1a0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CardType.values().length];
        try {
            iArr[CardType.JCB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardType.MIR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardType.AMEX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardType.VISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardType.MASTERCARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardType.MAESTRO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardType.DISCOVER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardType.DINERSCLUB.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardType.UNIONPAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CardType.DINACARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CardType.UZCARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[CardType.HUMO.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[CardType.ELCART.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[CardType.BELKART.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[CardType.MAAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[CardType.TROY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr;
        int[] iArr2 = new int[SharedAccountType.values().length];
        try {
            iArr2[SharedAccountType.FAMILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[SharedAccountType.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[SharedAccountType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        b = iArr2;
    }
}
