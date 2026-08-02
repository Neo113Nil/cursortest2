package defpackage;

import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositShimmerType;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class maf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CreditDepositShimmerType.values().length];
        try {
            iArr[CreditDepositShimmerType.FullScreenShimmer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditDepositShimmerType.AmountDescriptionShimmer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[OperationProgressView.StatusIcon.values().length];
        try {
            iArr2[OperationProgressView.StatusIcon.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[OperationProgressView.StatusIcon.BOOST_FUNDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[OperationProgressView.StatusIcon.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OperationProgressView.StatusIcon.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[OperationProgressView.StatusIcon.WARNING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[TooltipPosition.values().length];
        try {
            iArr3[TooltipPosition.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[TooltipPosition.PAYMENT_METHOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
