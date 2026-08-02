package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c1v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionEntity$Status.values().length];
        try {
            iArr[SubscriptionEntity$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionEntity$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
