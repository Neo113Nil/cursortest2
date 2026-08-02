package defpackage;

import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ifi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RebindPaymentMethodStatusEntity.values().length];
        try {
            iArr[RebindPaymentMethodStatusEntity.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RebindPaymentMethodStatusEntity.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RebindPaymentMethodStatusEntity.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RebindPaymentMethodStatusEntity.REQUIRED_3DS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
