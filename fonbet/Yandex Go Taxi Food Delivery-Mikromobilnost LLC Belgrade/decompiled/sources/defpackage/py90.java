package defpackage;

import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class py90 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentIconType.values().length];
        try {
            iArr[PaymentIconType.ADD_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentIconType.VISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentIconType.TROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentIconType.MASTERCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentIconType.MAESTRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentIconType.MIR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentIconType.DISCOVER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PaymentIconType.AMERICAN_EXPRESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PaymentIconType.JCB.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PaymentIconType.DINERS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PaymentIconType.UNIONPAY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PaymentIconType.DINACARD.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PaymentIconType.HUMO.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PaymentIconType.UZCARD.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PaymentIconType.GENERIC_CARD.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[PaymentIconType.TRANSPORT_EXTERNAL.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[PaymentIconType.CASH.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[PaymentIconType.CORP.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[PaymentIconType.SHARED_FAMILY.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[PaymentIconType.SHARED_BUSINESS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[PaymentIconType.GOOGLE_PAY.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[PaymentIconType.PERSONAL_WALLET.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[PaymentIconType.SBP.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[PaymentIconType.MBANK_ACCOUNT.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[PaymentIconType.ELCART.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[PaymentIconType.BELKART.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[PaymentIconType.MAAL.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[PaymentIconType.TRANSPORT_CARD.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[PaymentIconType.TROYKA.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[PaymentIconType.TIPS.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[PaymentIconType.YAPE_TOKEN.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[PaymentIconType.NEQUI_TOKEN.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[PaymentIconType.SBP_BIND_TOKEN.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[PaymentIconType.KASPI.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[PaymentIconType.CLICK_WALLET.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[PaymentIconType.EASYPAISA_WALLET.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[PaymentIconType.FASTSHIFT_ACCOUNT.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[PaymentIconType.JAZZCASH_WALLET.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        a = iArr;
        int[] iArr2 = new int[CardType.values().length];
        try {
            iArr2[CardType.AMEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[CardType.DINERSCLUB.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[CardType.DISCOVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[CardType.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[CardType.MASTERCARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[CardType.VISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[CardType.MAESTRO.ordinal()] = 7;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[CardType.MIR.ordinal()] = 8;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[CardType.UNIONPAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[CardType.DINACARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[CardType.UZCARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[CardType.HUMO.ordinal()] = 12;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[CardType.TROY.ordinal()] = 13;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[CardType.ELCART.ordinal()] = 14;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[CardType.BELKART.ordinal()] = 15;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[CardType.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[CardType.INSUFFICIENT_DIGITS.ordinal()] = 17;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[CardType.MAAL.ordinal()] = 18;
        } catch (NoSuchFieldError unused56) {
        }
        b = iArr2;
    }
}
