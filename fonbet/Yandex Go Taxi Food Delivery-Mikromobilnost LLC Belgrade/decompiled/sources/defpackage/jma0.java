package defpackage;

import com.yandex.go.places.impl.navigation.payments.processing.PaymentsProcessingNavigator$ErrorType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class jma0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentsProcessingNavigator$ErrorType.values().length];
        try {
            iArr[PaymentsProcessingNavigator$ErrorType.PAYMENT_FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
