package defpackage;

import com.yandex.go.chargers.domain.ChargersCompositePaymentInteractor$ChargersCompositePaymentState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fux0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersCompositePaymentInteractor$ChargersCompositePaymentState.values().length];
        try {
            iArr[ChargersCompositePaymentInteractor$ChargersCompositePaymentState.ENABLED_CHECKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersCompositePaymentInteractor$ChargersCompositePaymentState.ENABLED_UNCHECKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersCompositePaymentInteractor$ChargersCompositePaymentState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
