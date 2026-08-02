package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class iag0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionStatus.values().length];
        try {
            iArr[SubscriptionStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionStatus.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionStatus.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionStatus.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
