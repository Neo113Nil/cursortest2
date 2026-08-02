package defpackage;

import com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jfd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentSubmitResultDto.StatusDto.values().length];
        try {
            iArr[PaymentSubmitResultDto.StatusDto.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentSubmitResultDto.StatusDto.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentSubmitResultDto.StatusDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
