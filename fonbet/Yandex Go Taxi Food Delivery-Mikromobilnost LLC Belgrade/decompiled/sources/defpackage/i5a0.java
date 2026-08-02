package defpackage;

import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class i5a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodTypeDto.values().length];
        try {
            iArr[PaymentMethodTypeDto.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodTypeDto.ME2ME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodTypeDto.SAVINGS_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethodTypeDto.YANDEX_ACCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethodTypeDto.GOOGLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentMethodTypeDto.APPLE_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentMethodTypeDto.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
