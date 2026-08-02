package defpackage;

import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class lfd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubscriptionInfoDto.SubscriptionStatusDto.values().length];
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.FAIL_3DS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.HOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.PAYMENT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.REFUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.WAIT_FOR_PAYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SubscriptionInfoDto.SubscriptionStatusDto.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
