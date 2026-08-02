package defpackage;

import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.YBCardType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i430 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CardPaymentSystem.values().length];
        try {
            iArr[CardPaymentSystem.AmericanExpress.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardPaymentSystem.DinersClub.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardPaymentSystem.DiscoverCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardPaymentSystem.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardPaymentSystem.HUMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardPaymentSystem.Maestro.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardPaymentSystem.MasterCard.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardPaymentSystem.MIR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardPaymentSystem.UnionPay.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CardPaymentSystem.Uzcard.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CardPaymentSystem.Visa.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[CardPaymentSystem.VisaElectron.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[CardPaymentSystem.Unknown.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[YBCardType.values().length];
        try {
            iArr2[YBCardType.ProCard.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[YBCardType.SplitCard.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[YBCardType.PlusCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        b = iArr2;
    }
}
