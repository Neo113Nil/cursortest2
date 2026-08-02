package defpackage;

import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dja0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BankName.values().length];
        try {
            iArr[BankName.AlfaBank.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BankName.SberBank.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BankName.Tinkoff.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BankName.Vtb.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BankName.GazpromBank.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BankName.OpenBank.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BankName.PromsvyazBank.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BankName.RosBank.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BankName.UnicreditBank.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BankName.RaiffeisenBank.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
        int[] iArr2 = new int[CardPaymentSystem.values().length];
        try {
            iArr2[CardPaymentSystem.AmericanExpress.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[CardPaymentSystem.DinersClub.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[CardPaymentSystem.DiscoverCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[CardPaymentSystem.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[CardPaymentSystem.HUMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[CardPaymentSystem.Maestro.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[CardPaymentSystem.MasterCard.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[CardPaymentSystem.MIR.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[CardPaymentSystem.UnionPay.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[CardPaymentSystem.Uzcard.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[CardPaymentSystem.Visa.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[CardPaymentSystem.VisaElectron.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[CardPaymentSystem.Unknown.ordinal()] = 13;
        } catch (NoSuchFieldError unused23) {
        }
        b = iArr2;
    }
}
