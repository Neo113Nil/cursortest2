package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class jyx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderScreen.values().length];
        try {
            iArr[OrderScreen.ORDER_DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderScreen.ORDER_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderScreen.BUNDLED_ORDER_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
