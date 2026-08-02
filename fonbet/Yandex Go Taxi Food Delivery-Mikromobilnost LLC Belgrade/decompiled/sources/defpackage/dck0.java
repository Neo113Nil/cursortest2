package defpackage;

import com.yandex.go.taxi.order.details.v2.core.availability.RideCardAvailability$Fallback$Reason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class dck0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RideCardAvailability$Fallback$Reason.values().length];
        try {
            iArr[RideCardAvailability$Fallback$Reason.NO_STATUS_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.NO_RIDE_CARD_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.EMPTY_ITEMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.EMPTY_PRESENTATION_DETAILS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.EMPTY_PRESENTATION_COMPACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.CHECK_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RideCardAvailability$Fallback$Reason.A11Y.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[OrderScreen.values().length];
        try {
            iArr2[OrderScreen.ORDER_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[OrderScreen.ORDER_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[OrderScreen.ORDER_TRACKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
