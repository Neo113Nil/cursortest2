package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class aw01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferDirection.values().length];
        try {
            iArr[TransferDirection.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferDirection.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferScenario.values().length];
        try {
            iArr2[TransferScenario.SELF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferScenario.FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransferScenario.PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransferScenario.REQUISITES.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransferScenario.MOBILE_PAYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TransferScenario.INTERNET_PAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TransferScenario.C2G.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TransferScenario.SAVERS_TOPUP.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TransferScenario.INVOICE_HCS.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TransferScenario.CROSS_BORDER.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[TransferScenario.B2C_TRANSFER.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[TransferScenario.TIPS.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TransferScenario.MKK_CASHOUT.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
