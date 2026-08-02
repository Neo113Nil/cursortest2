package defpackage;

import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentButtonType;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class chy0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TestPaymentStatus.values().length];
        try {
            iArr[TestPaymentStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TestPaymentStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TestPaymentStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TestPaymentButtonType.values().length];
        try {
            iArr2[TestPaymentButtonType.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TestPaymentButtonType.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TestPaymentButtonType.ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
