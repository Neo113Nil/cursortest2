package defpackage;

import com.ybsdk.api.entities.YBCheckPaymentInfo$Condition;
import com.ybsdk.api.entities.YBPaymentMethodProductType;
import com.ybsdk.api.entities.YBTransaction$Type;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ow51 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[YBPaymentMethodProductType.values().length];
        try {
            iArr[YBPaymentMethodProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBPaymentMethodProductType.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YBPaymentMethodProductType.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[YBTransaction$Type.values().length];
        try {
            iArr2[YBTransaction$Type.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[YBTransaction$Type.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[YBCheckPaymentInfo$Condition.values().length];
        try {
            iArr3[YBCheckPaymentInfo$Condition.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[YBCheckPaymentInfo$Condition.IDENTIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[YBCheckPaymentInfo$Condition.KYC.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr3;
    }
}
