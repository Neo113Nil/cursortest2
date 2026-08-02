package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class l2c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckoutOrderStatusDto.values().length];
        try {
            iArr[CheckoutOrderStatusDto.FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckoutOrderStatusDto.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckoutOrderStatusDto.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
