package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.GeneralTransferType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ni01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GeneralTransferType.values().length];
        try {
            iArr[GeneralTransferType.SBP_B2C_CREDLIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeneralTransferType.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GeneralTransferType.SELF_TOPUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GeneralTransferType.PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GeneralTransferType.REQUISITES_PERSON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GeneralTransferType.REQUISITES_LEGAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GeneralTransferType.ME2ME_TOPUP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[GeneralTransferType.AFT_TOPUP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[GeneralTransferType.REQUISITES_HCS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[GeneralTransferType.SBP_C2G_BY_UIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[GeneralTransferType.FUND_DEBIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[GeneralTransferType.FUND_CREDIT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[GeneralTransferType.INVOICE_HCS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[GeneralTransferType.CROSS_BORDER_BY_PHONE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[GeneralTransferType.INTERNET_PAYMENT.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[GeneralTransferType.MOBILE_PAYMENT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr;
    }
}
