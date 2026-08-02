package defpackage;

import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ffi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RebindPaymentMethodStatusDto.values().length];
        try {
            iArr[RebindPaymentMethodStatusDto.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RebindPaymentMethodStatusDto.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RebindPaymentMethodStatusDto.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RebindPaymentMethodStatusDto.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
