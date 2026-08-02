package defpackage;

import com.ybsdk.feature.qr.payments.internal.network.common.GetPaymentInfoStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n8g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GetPaymentInfoStatusDto.values().length];
        try {
            iArr[GetPaymentInfoStatusDto.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GetPaymentInfoStatusDto.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GetPaymentInfoStatusDto.TRY_TO_REFRESH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GetPaymentInfoStatusDto.REDIRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GetPaymentInfoStatusDto.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
