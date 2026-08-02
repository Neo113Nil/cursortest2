package defpackage;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class afk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiCardNavigationAction.values().length];
        try {
            iArr[TaxiCardNavigationAction.OPEN_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiCardNavigationAction.OPEN_CUSTOM_TIPS_INPUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiCardNavigationAction.EXPAND_ORDER_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaxiCardNavigationAction.EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
