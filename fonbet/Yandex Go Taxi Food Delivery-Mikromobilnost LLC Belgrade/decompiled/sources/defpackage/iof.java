package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class iof {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentKitError.Kind.values().length];
        try {
            iArr[PaymentKitError.Kind.network.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
