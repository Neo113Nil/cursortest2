package defpackage;

import com.yandex.go.scooters.api.domain.ScootersCompositePaymentInteractor$ScootersCompositePaymentState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gux0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersCompositePaymentInteractor$ScootersCompositePaymentState.values().length];
        try {
            iArr[ScootersCompositePaymentInteractor$ScootersCompositePaymentState.ENABLED_CHECKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersCompositePaymentInteractor$ScootersCompositePaymentState.ENABLED_UNCHECKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersCompositePaymentInteractor$ScootersCompositePaymentState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
