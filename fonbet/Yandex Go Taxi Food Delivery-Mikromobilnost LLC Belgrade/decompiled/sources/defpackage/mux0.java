package defpackage;

import com.yandex.go.payments.api.composite.CompositePaymentState;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class mux0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CompositePaymentState.values().length];
        try {
            iArr[CompositePaymentState.ENABLED_CHECKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompositePaymentState.ENABLED_UNCHECKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CompositePaymentState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
