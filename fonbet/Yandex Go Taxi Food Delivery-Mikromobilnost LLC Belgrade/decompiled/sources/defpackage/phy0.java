package defpackage;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType;
import com.ybsdk.feature.testpayment.internal.domain.entities.TestPaymentStatusEntity$Failed$ErrorType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class phy0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TestPaymentStatusEntity$Failed$ErrorType.values().length];
        try {
            iArr[TestPaymentStatusEntity$Failed$ErrorType.FAIL_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TestPaymentStatusEntity$Failed$ErrorType.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.values().length];
        try {
            iArr2[AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
