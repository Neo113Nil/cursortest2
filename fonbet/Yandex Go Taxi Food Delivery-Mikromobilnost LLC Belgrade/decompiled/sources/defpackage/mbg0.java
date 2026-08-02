package defpackage;

import com.ybsdk.feature.qr.payments.internal.network.common.QrcTypeDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mbg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrcTypeDto.values().length];
        try {
            iArr[QrcTypeDto.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrcTypeDto.SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
