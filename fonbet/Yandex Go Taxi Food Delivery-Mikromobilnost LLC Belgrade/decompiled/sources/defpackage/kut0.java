package defpackage;

import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kut0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentStatus.values().length];
        try {
            iArr[PaymentStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentStatus.CHALLENGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentStatus.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentStatus.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
